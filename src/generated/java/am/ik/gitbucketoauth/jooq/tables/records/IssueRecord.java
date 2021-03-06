/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables.records;


import am.ik.gitbucketoauth.jooq.tables.Issue;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record3;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IssueRecord extends UpdatableRecordImpl<IssueRecord> implements Record12<String, String, Integer, String, Integer, String, String, String, Boolean, Timestamp, Timestamp, Boolean> {

	private static final long serialVersionUID = 831834344;

	/**
	 * Setter for <code>PUBLIC.ISSUE.USER_NAME</code>.
	 */
	public void setUserName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.USER_NAME</code>.
	 */
	public String getUserName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.REPOSITORY_NAME</code>.
	 */
	public void setRepositoryName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.REPOSITORY_NAME</code>.
	 */
	public String getRepositoryName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.ISSUE_ID</code>.
	 */
	public void setIssueId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.ISSUE_ID</code>.
	 */
	public Integer getIssueId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.OPENED_USER_NAME</code>.
	 */
	public void setOpenedUserName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.OPENED_USER_NAME</code>.
	 */
	public String getOpenedUserName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.MILESTONE_ID</code>.
	 */
	public void setMilestoneId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.MILESTONE_ID</code>.
	 */
	public Integer getMilestoneId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.ASSIGNED_USER_NAME</code>.
	 */
	public void setAssignedUserName(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.ASSIGNED_USER_NAME</code>.
	 */
	public String getAssignedUserName() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.CONTENT</code>.
	 */
	public void setContent(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.CONTENT</code>.
	 */
	public String getContent() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.CLOSED</code>.
	 */
	public void setClosed(Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.CLOSED</code>.
	 */
	public Boolean getClosed() {
		return (Boolean) getValue(8);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.REGISTERED_DATE</code>.
	 */
	public void setRegisteredDate(Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.REGISTERED_DATE</code>.
	 */
	public Timestamp getRegisteredDate() {
		return (Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.UPDATED_DATE</code>.
	 */
	public void setUpdatedDate(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.UPDATED_DATE</code>.
	 */
	public Timestamp getUpdatedDate() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE.PULL_REQUEST</code>.
	 */
	public void setPullRequest(Boolean value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE.PULL_REQUEST</code>.
	 */
	public Boolean getPullRequest() {
		return (Boolean) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<Integer, String, String> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, Integer, String, Integer, String, String, String, Boolean, Timestamp, Timestamp, Boolean> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, Integer, String, Integer, String, String, String, Boolean, Timestamp, Timestamp, Boolean> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Issue.ISSUE.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Issue.ISSUE.REPOSITORY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Issue.ISSUE.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Issue.ISSUE.OPENED_USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Issue.ISSUE.MILESTONE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Issue.ISSUE.ASSIGNED_USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Issue.ISSUE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Issue.ISSUE.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field9() {
		return Issue.ISSUE.CLOSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field10() {
		return Issue.ISSUE.REGISTERED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return Issue.ISSUE.UPDATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field12() {
		return Issue.ISSUE.PULL_REQUEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getRepositoryName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getOpenedUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getMilestoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAssignedUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value9() {
		return getClosed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value10() {
		return getRegisteredDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getUpdatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value12() {
		return getPullRequest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value1(String value) {
		setUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value2(String value) {
		setRepositoryName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value3(Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value4(String value) {
		setOpenedUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value5(Integer value) {
		setMilestoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value6(String value) {
		setAssignedUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value7(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value8(String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value9(Boolean value) {
		setClosed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value10(Timestamp value) {
		setRegisteredDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value11(Timestamp value) {
		setUpdatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord value12(Boolean value) {
		setPullRequest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueRecord values(String value1, String value2, Integer value3, String value4, Integer value5, String value6, String value7, String value8, Boolean value9, Timestamp value10, Timestamp value11, Boolean value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IssueRecord
	 */
	public IssueRecord() {
		super(Issue.ISSUE);
	}

	/**
	 * Create a detached, initialised IssueRecord
	 */
	public IssueRecord(String userName, String repositoryName, Integer issueId, String openedUserName, Integer milestoneId, String assignedUserName, String title, String content, Boolean closed, Timestamp registeredDate, Timestamp updatedDate, Boolean pullRequest) {
		super(Issue.ISSUE);

		setValue(0, userName);
		setValue(1, repositoryName);
		setValue(2, issueId);
		setValue(3, openedUserName);
		setValue(4, milestoneId);
		setValue(5, assignedUserName);
		setValue(6, title);
		setValue(7, content);
		setValue(8, closed);
		setValue(9, registeredDate);
		setValue(10, updatedDate);
		setValue(11, pullRequest);
	}
}
