/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables;


import am.ik.gitbucketoauth.jooq.Keys;
import am.ik.gitbucketoauth.jooq.Public;
import am.ik.gitbucketoauth.jooq.tables.records.CollaboratorRecord;

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
public class Collaborator extends TableImpl<CollaboratorRecord> {

	private static final long serialVersionUID = -1103998032;

	/**
	 * The reference instance of <code>PUBLIC.COLLABORATOR</code>
	 */
	public static final Collaborator COLLABORATOR = new Collaborator();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CollaboratorRecord> getRecordType() {
		return CollaboratorRecord.class;
	}

	/**
	 * The column <code>PUBLIC.COLLABORATOR.USER_NAME</code>.
	 */
	public final TableField<CollaboratorRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.COLLABORATOR.REPOSITORY_NAME</code>.
	 */
	public final TableField<CollaboratorRecord, String> REPOSITORY_NAME = createField("REPOSITORY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.COLLABORATOR.COLLABORATOR_NAME</code>.
	 */
	public final TableField<CollaboratorRecord, String> COLLABORATOR_NAME = createField("COLLABORATOR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.COLLABORATOR</code> table reference
	 */
	public Collaborator() {
		this("COLLABORATOR", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.COLLABORATOR</code> table reference
	 */
	public Collaborator(String alias) {
		this(alias, COLLABORATOR);
	}

	private Collaborator(String alias, Table<CollaboratorRecord> aliased) {
		this(alias, aliased, null);
	}

	private Collaborator(String alias, Table<CollaboratorRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CollaboratorRecord> getPrimaryKey() {
		return Keys.IDX_COLLABORATOR_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CollaboratorRecord>> getKeys() {
		return Arrays.<UniqueKey<CollaboratorRecord>>asList(Keys.IDX_COLLABORATOR_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CollaboratorRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CollaboratorRecord, ?>>asList(Keys.IDX_COLLABORATOR_FK0, Keys.IDX_COLLABORATOR_FK1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collaborator as(String alias) {
		return new Collaborator(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Collaborator rename(String name) {
		return new Collaborator(name, null);
	}
}
