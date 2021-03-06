/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables;


import am.ik.gitbucketoauth.jooq.Keys;
import am.ik.gitbucketoauth.jooq.Public;
import am.ik.gitbucketoauth.jooq.tables.records.MilestoneRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Milestone extends TableImpl<MilestoneRecord> {

	private static final long serialVersionUID = -551279955;

	/**
	 * The reference instance of <code>PUBLIC.MILESTONE</code>
	 */
	public static final Milestone MILESTONE = new Milestone();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MilestoneRecord> getRecordType() {
		return MilestoneRecord.class;
	}

	/**
	 * The column <code>PUBLIC.MILESTONE.USER_NAME</code>.
	 */
	public final TableField<MilestoneRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.REPOSITORY_NAME</code>.
	 */
	public final TableField<MilestoneRecord, String> REPOSITORY_NAME = createField("REPOSITORY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.MILESTONE_ID</code>.
	 */
	public final TableField<MilestoneRecord, Integer> MILESTONE_ID = createField("MILESTONE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.TITLE</code>.
	 */
	public final TableField<MilestoneRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.DESCRIPTION</code>.
	 */
	public final TableField<MilestoneRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.DUE_DATE</code>.
	 */
	public final TableField<MilestoneRecord, Timestamp> DUE_DATE = createField("DUE_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>PUBLIC.MILESTONE.CLOSED_DATE</code>.
	 */
	public final TableField<MilestoneRecord, Timestamp> CLOSED_DATE = createField("CLOSED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>PUBLIC.MILESTONE</code> table reference
	 */
	public Milestone() {
		this("MILESTONE", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.MILESTONE</code> table reference
	 */
	public Milestone(String alias) {
		this(alias, MILESTONE);
	}

	private Milestone(String alias, Table<MilestoneRecord> aliased) {
		this(alias, aliased, null);
	}

	private Milestone(String alias, Table<MilestoneRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<MilestoneRecord, Integer> getIdentity() {
		return Keys.IDENTITY_MILESTONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<MilestoneRecord> getPrimaryKey() {
		return Keys.IDX_MILESTONE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<MilestoneRecord>> getKeys() {
		return Arrays.<UniqueKey<MilestoneRecord>>asList(Keys.IDX_MILESTONE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<MilestoneRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<MilestoneRecord, ?>>asList(Keys.IDX_MILESTONE_FK0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Milestone as(String alias) {
		return new Milestone(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Milestone rename(String name) {
		return new Milestone(name, null);
	}
}
