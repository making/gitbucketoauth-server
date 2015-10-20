/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables.records;


import am.ik.gitbucketoauth.jooq.tables.Label;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class LabelRecord extends UpdatableRecordImpl<LabelRecord> implements Record5<String, String, Integer, String, String> {

	private static final long serialVersionUID = 1458622407;

	/**
	 * Setter for <code>PUBLIC.LABEL.USER_NAME</code>.
	 */
	public void setUserName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.LABEL.USER_NAME</code>.
	 */
	public String getUserName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.LABEL.REPOSITORY_NAME</code>.
	 */
	public void setRepositoryName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.LABEL.REPOSITORY_NAME</code>.
	 */
	public String getRepositoryName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.LABEL.LABEL_ID</code>.
	 */
	public void setLabelId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.LABEL.LABEL_ID</code>.
	 */
	public Integer getLabelId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.LABEL.LABEL_NAME</code>.
	 */
	public void setLabelName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.LABEL.LABEL_NAME</code>.
	 */
	public String getLabelName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.LABEL.COLOR</code>.
	 */
	public void setColor(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.LABEL.COLOR</code>.
	 */
	public String getColor() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record3<String, String, Integer> key() {
		return (Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, Integer, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, Integer, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Label.LABEL.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Label.LABEL.REPOSITORY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Label.LABEL.LABEL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Label.LABEL.LABEL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Label.LABEL.COLOR;
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
		return getLabelId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLabelName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getColor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord value1(String value) {
		setUserName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord value2(String value) {
		setRepositoryName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord value3(Integer value) {
		setLabelId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord value4(String value) {
		setLabelName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord value5(String value) {
		setColor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LabelRecord values(String value1, String value2, Integer value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LabelRecord
	 */
	public LabelRecord() {
		super(Label.LABEL);
	}

	/**
	 * Create a detached, initialised LabelRecord
	 */
	public LabelRecord(String userName, String repositoryName, Integer labelId, String labelName, String color) {
		super(Label.LABEL);

		setValue(0, userName);
		setValue(1, repositoryName);
		setValue(2, labelId);
		setValue(3, labelName);
		setValue(4, color);
	}
}
