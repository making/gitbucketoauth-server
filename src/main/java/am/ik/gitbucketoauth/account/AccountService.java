package am.ik.gitbucketoauth.account;

import static am.ik.gitbucketoauth.jooq.tables.Account.ACCOUNT;
import static am.ik.gitbucketoauth.jooq.tables.GroupMember.GROUP_MEMBER;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AccountService {

	@Autowired
	DSLContext dslContext;

	public List<Account> findOrderByUpdatedDateAsc() {
		return dslContext.selectDistinct().from(ACCOUNT).leftJoin(GROUP_MEMBER)
				.on(GROUP_MEMBER.USER_NAME.eq(ACCOUNT.USER_NAME))
				.where(ACCOUNT.REMOVED.eq(false).and(ACCOUNT.GROUP_ACCOUNT.eq(false)))
				.orderBy(ACCOUNT.UPDATED_DATE.asc()).fetch().intoGroups(ACCOUNT.fields())
				.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getKey,
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
				.entrySet().stream().map(x -> {
					Account account = x.getKey().into(Account.class);
					account.setGroupMembers(x.getValue().stream()
							.flatMap(r -> r.into(GroupMember.class).stream())
							.filter(g -> g.getGroupName() != null)
							.collect(Collectors.toList()));
					return account;
				}).collect(Collectors.toList());
	}

	public Optional<Account> findByUserNameOrMailAddress(String userName) {
		return dslContext.selectDistinct().from(ACCOUNT).leftJoin(GROUP_MEMBER)
				.on(GROUP_MEMBER.USER_NAME.eq(ACCOUNT.USER_NAME))
				.where(ACCOUNT.REMOVED.eq(false)
						.and(ACCOUNT.USER_NAME.eq(userName)
								.or(ACCOUNT.MAIL_ADDRESS.eq(userName)))
						.and(ACCOUNT.GROUP_ACCOUNT.eq(false)))
				.fetch().intoGroups(ACCOUNT.fields()).entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getKey,
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
				.entrySet().stream().map(x -> {
					Account account = x.getKey().into(Account.class);
					account.setGroupMembers(x.getValue().stream()
							.flatMap(r -> r.into(GroupMember.class).stream())
							.filter(g -> g.getGroupName() != null)
							.collect(Collectors.toList()));
					return account;
				}).findAny();
	}
}
