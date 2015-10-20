/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables;


import am.ik.gitbucketoauth.jooq.Keys;
import am.ik.gitbucketoauth.jooq.Public;
import am.ik.gitbucketoauth.jooq.tables.records.IssueLabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class IssueLabel extends TableImpl<IssueLabelRecord> {

	private static final long serialVersionUID = 1942516340;

	/**
	 * The reference instance of <code>PUBLIC.ISSUE_LABEL</code>
	 */
	public static final IssueLabel ISSUE_LABEL = new IssueLabel();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IssueLabelRecord> getRecordType() {
		return IssueLabelRecord.class;
	}

	/**
	 * The column <code>PUBLIC.ISSUE_LABEL.USER_NAME</code>.
	 */
	public final TableField<IssueLabelRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.ISSUE_LABEL.REPOSITORY_NAME</code>.
	 */
	public final TableField<IssueLabelRecord, String> REPOSITORY_NAME = createField("REPOSITORY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.ISSUE_LABEL.ISSUE_ID</code>.
	 */
	public final TableField<IssueLabelRecord, Integer> ISSUE_ID = createField("ISSUE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.ISSUE_LABEL.LABEL_ID</code>.
	 */
	public final TableField<IssueLabelRecord, Integer> LABEL_ID = createField("LABEL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.ISSUE_LABEL</code> table reference
	 */
	public IssueLabel() {
		this("ISSUE_LABEL", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.ISSUE_LABEL</code> table reference
	 */
	public IssueLabel(String alias) {
		this(alias, ISSUE_LABEL);
	}

	private IssueLabel(String alias, Table<IssueLabelRecord> aliased) {
		this(alias, aliased, null);
	}

	private IssueLabel(String alias, Table<IssueLabelRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IssueLabelRecord> getPrimaryKey() {
		return Keys.IDX_ISSUE_LABEL_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IssueLabelRecord>> getKeys() {
		return Arrays.<UniqueKey<IssueLabelRecord>>asList(Keys.IDX_ISSUE_LABEL_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<IssueLabelRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<IssueLabelRecord, ?>>asList(Keys.IDX_ISSUE_LABEL_FK0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueLabel as(String alias) {
		return new IssueLabel(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IssueLabel rename(String name) {
		return new IssueLabel(name, null);
	}
}
