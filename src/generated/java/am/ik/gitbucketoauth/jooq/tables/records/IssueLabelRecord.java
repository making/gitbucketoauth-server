/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables.records;


import am.ik.gitbucketoauth.jooq.tables.IssueLabel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class IssueLabelRecord extends UpdatableRecordImpl<IssueLabelRecord> implements Record4<String, String, Integer, Integer> {

	private static final long serialVersionUID = 107495057;

	/**
	 * Setter for <code>PUBLIC.ISSUE_LABEL.USER_NAME</code>.
	 */
	public void setUserName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE_LABEL.USER_NAME</code>.
	 */
	public String getUserName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE_LABEL.REPOSITORY_NAME</code>.
	 */
	public void setRepositoryName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE_LABEL.REPOSITORY_NAME</code>.
	 */
	public String getRepositoryName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE_LABEL.ISSUE_ID</code>.
	 */
	public void setIssueId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE_LABEL.ISSUE_ID</code>.
	 */
	public Integer getIssueId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.ISSUE_LABEL.LABEL_ID</code>.
	 */
	public void setLabelId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.ISSUE_LABEL.LABEL_ID</code>.
	 */
	public Integer getLabelId() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<String, String, Integer, Integer> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, Integer, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, Integer, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return IssueLabel.ISSUE_LABEL.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return IssueLabel.ISSUE_LABEL.REPOSITORY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return IssueLabel.ISSUE_LABEL.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return IssueLabel.ISSUE_LABEL.LABEL_ID;
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
	public Integer value4() {
		return getLabelId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabelRecord value1(String value) {
		setUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabelRecord value2(String value) {
		setRepositoryName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabelRecord value3(Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabelRecord value4(Integer value) {
		setLabelId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabelRecord values(String value1, String value2, Integer value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IssueLabelRecord
	 */
	public IssueLabelRecord() {
		super(IssueLabel.ISSUE_LABEL);
	}

	/**
	 * Create a detached, initialised IssueLabelRecord
	 */
	public IssueLabelRecord(String userName, String repositoryName, Integer issueId, Integer labelId) {
		super(IssueLabel.ISSUE_LABEL);

		setValue(0, userName);
		setValue(1, repositoryName);
		setValue(2, issueId);
		setValue(3, labelId);
	}
}
