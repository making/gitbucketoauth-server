package am.ik.gitbucketoauth.account;

import java.io.Serializable;

import lombok.Data;

@Data
public class GroupMember implements Serializable {
	private String groupName;
	private String userName;
	private boolean manager;
}
