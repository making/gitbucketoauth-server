package am.ik.gitbucketoauth.userdetails;

import am.ik.gitbucketoauth.account.AccountService;
import am.ik.gitbucketoauth.userdetails.GitBucketUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GitBucketUserDetailsService implements UserDetailsService {
	@Autowired
	AccountService accountService;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return new GitBucketUserDetails(
				accountService.findByUserNameOrMailAddress(username)
						.orElseThrow(() -> new UsernameNotFoundException(
								username + " is not found.")));
	}
}
