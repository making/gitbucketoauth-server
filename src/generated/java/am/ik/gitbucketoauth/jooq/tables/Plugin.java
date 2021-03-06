/**
 * This class is generated by jOOQ
 */
package am.ik.gitbucketoauth.jooq.tables;


import am.ik.gitbucketoauth.jooq.Keys;
import am.ik.gitbucketoauth.jooq.Public;
import am.ik.gitbucketoauth.jooq.tables.records.PluginRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Plugin extends TableImpl<PluginRecord> {

	private static final long serialVersionUID = 1933584220;

	/**
	 * The reference instance of <code>PUBLIC.PLUGIN</code>
	 */
	public static final Plugin PLUGIN = new Plugin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PluginRecord> getRecordType() {
		return PluginRecord.class;
	}

	/**
	 * The column <code>PUBLIC.PLUGIN.PLUGIN_ID</code>.
	 */
	public final TableField<PluginRecord, String> PLUGIN_ID = createField("PLUGIN_ID", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.PLUGIN.VERSION</code>.
	 */
	public final TableField<PluginRecord, String> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.PLUGIN</code> table reference
	 */
	public Plugin() {
		this("PLUGIN", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.PLUGIN</code> table reference
	 */
	public Plugin(String alias) {
		this(alias, PLUGIN);
	}

	private Plugin(String alias, Table<PluginRecord> aliased) {
		this(alias, aliased, null);
	}

	private Plugin(String alias, Table<PluginRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PluginRecord> getPrimaryKey() {
		return Keys.IDX_PLUGIN_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PluginRecord>> getKeys() {
		return Arrays.<UniqueKey<PluginRecord>>asList(Keys.IDX_PLUGIN_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Plugin as(String alias) {
		return new Plugin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Plugin rename(String name) {
		return new Plugin(name, null);
	}
}
