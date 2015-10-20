/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables.records;


import am.ik.gitbucketoauth.jooq.tables.SshKey;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
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
public class SshKeyRecord extends UpdatableRecordImpl<SshKeyRecord> implements Record4<String, Integer, String, String> {

	private static final long serialVersionUID = 987994433;

	/**
	 * Setter for <code>PUBLIC.SSH_KEY.USER_NAME</code>.
	 */
	public void setUserName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.SSH_KEY.USER_NAME</code>.
	 */
	public String getUserName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.SSH_KEY.SSH_KEY_ID</code>.
	 */
	public void setSshKeyId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.SSH_KEY.SSH_KEY_ID</code>.
	 */
	public Integer getSshKeyId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.SSH_KEY.TITLE</code>.
	 */
	public void setTitle(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.SSH_KEY.TITLE</code>.
	 */
	public String getTitle() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.SSH_KEY.PUBLIC_KEY</code>.
	 */
	public void setPublicKey(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.SSH_KEY.PUBLIC_KEY</code>.
	 */
	public String getPublicKey() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, Integer, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, Integer, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SshKey.SSH_KEY.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return SshKey.SSH_KEY.SSH_KEY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SshKey.SSH_KEY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SshKey.SSH_KEY.PUBLIC_KEY;
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
	public Integer value2() {
		return getSshKeyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPublicKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SshKeyRecord value1(String value) {
		setUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SshKeyRecord value2(Integer value) {
		setSshKeyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SshKeyRecord value3(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SshKeyRecord value4(String value) {
		setPublicKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SshKeyRecord values(String value1, Integer value2, String value3, String value4) {
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
	 * Create a detached SshKeyRecord
	 */
	public SshKeyRecord() {
		super(SshKey.SSH_KEY);
	}

	/**
	 * Create a detached, initialised SshKeyRecord
	 */
	public SshKeyRecord(String userName, Integer sshKeyId, String title, String publicKey) {
		super(SshKey.SSH_KEY);

		setValue(0, userName);
		setValue(1, sshKeyId);
		setValue(2, title);
		setValue(3, publicKey);
	}
}