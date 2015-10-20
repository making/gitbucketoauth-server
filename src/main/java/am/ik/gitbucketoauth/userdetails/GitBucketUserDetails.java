package am.ik.gitbucketoauth.userdetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import am.ik.gitbucketoauth.account.Account;

public class GitBucketUserDetails extends User {
	private final Account account;

	public GitBucketUserDetails(Account account) {
		super(account.getUserName(), account.getPassword(), createAuthorities(account));
		this.account = account;
	}

	static List<? extends GrantedAuthority> createAuthorities(Account account) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_NORMAL"));
		if (account.isAdministrator()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMINISTRATOR"));
		}
		account.getGroupMembers().stream().flatMap(gm -> {
			if (gm.isManager()) {
				return Stream.of(gm.getGroupName() + "_MANAGER", gm.getGroupName());
			}
			else {
				return Stream.of(gm.getGroupName());
			}
		}).forEach(name -> authorities
				.add(new SimpleGrantedAuthority("ROLE_G_" + name.toUpperCase())));
		return authorities;
	}
}
