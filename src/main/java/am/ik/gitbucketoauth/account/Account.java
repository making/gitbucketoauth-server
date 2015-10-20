package am.ik.gitbucketoauth.account;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Account implements Serializable {
	private String userName;
	private String mailAddress;
	private String password;
	private boolean administrator;
	private String url;
	private LocalDateTime registeredDate;
	private LocalDateTime updatedDate;
	private LocalDateTime lastLoginDate;
	private String image;
	private String fullName;
	private List<GroupMember> groupMembers;
}
