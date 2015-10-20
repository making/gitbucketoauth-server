/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables;


import am.ik.gitbucketoauth.jooq.Keys;
import am.ik.gitbucketoauth.jooq.Public;
import am.ik.gitbucketoauth.jooq.tables.records.GroupMemberRecord;

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
public class GroupMember extends TableImpl<GroupMemberRecord> {

	private static final long serialVersionUID = 695923059;

	/**
	 * The reference instance of <code>PUBLIC.GROUP_MEMBER</code>
	 */
	public static final GroupMember GROUP_MEMBER = new GroupMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GroupMemberRecord> getRecordType() {
		return GroupMemberRecord.class;
	}

	/**
	 * The column <code>PUBLIC.GROUP_MEMBER.GROUP_NAME</code>.
	 */
	public final TableField<GroupMemberRecord, String> GROUP_NAME = createField("GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.GROUP_MEMBER.USER_NAME</code>.
	 */
	public final TableField<GroupMemberRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.GROUP_MEMBER.MANAGER</code>.
	 */
	public final TableField<GroupMemberRecord, Boolean> MANAGER = createField("MANAGER", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * Create a <code>PUBLIC.GROUP_MEMBER</code> table reference
	 */
	public GroupMember() {
		this("GROUP_MEMBER", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.GROUP_MEMBER</code> table reference
	 */
	public GroupMember(String alias) {
		this(alias, GROUP_MEMBER);
	}

	private GroupMember(String alias, Table<GroupMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private GroupMember(String alias, Table<GroupMemberRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<GroupMemberRecord> getPrimaryKey() {
		return Keys.IDX_GROUP_MEMBER_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<GroupMemberRecord>> getKeys() {
		return Arrays.<UniqueKey<GroupMemberRecord>>asList(Keys.IDX_GROUP_MEMBER_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<GroupMemberRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<GroupMemberRecord, ?>>asList(Keys.IDX_GROUP_MEMBER_FK0, Keys.IDX_GROUP_MEMBER_FK1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupMember as(String alias) {
		return new GroupMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GroupMember rename(String name) {
		return new GroupMember(name, null);
	}
}