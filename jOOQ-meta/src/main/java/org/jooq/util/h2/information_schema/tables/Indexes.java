/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes extends TableImpl<Record> {

	private static final long serialVersionUID = -277122397;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA.INDEXES</code>
	 */
	public static final Indexes INDEXES = new Indexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_CATALOG</code>.
	 */
	public static final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_SCHEMA</code>.
	 */
	public static final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_NAME</code>.
	 */
	public static final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.NON_UNIQUE</code>.
	 */
	public static final TableField<Record, Boolean> NON_UNIQUE = createField("NON_UNIQUE", org.jooq.impl.SQLDataType.BOOLEAN, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_NAME</code>.
	 */
	public static final TableField<Record, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ORDINAL_POSITION</code>.
	 */
	public static final TableField<Record, Short> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.SMALLINT, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.COLUMN_NAME</code>.
	 */
	public static final TableField<Record, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.CARDINALITY</code>.
	 */
	public static final TableField<Record, Integer> CARDINALITY = createField("CARDINALITY", org.jooq.impl.SQLDataType.INTEGER, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.PRIMARY_KEY</code>.
	 */
	public static final TableField<Record, Boolean> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.BOOLEAN, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE_NAME</code>.
	 */
	public static final TableField<Record, String> INDEX_TYPE_NAME = createField("INDEX_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.IS_GENERATED</code>.
	 */
	public static final TableField<Record, Boolean> IS_GENERATED = createField("IS_GENERATED", org.jooq.impl.SQLDataType.BOOLEAN, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE</code>.
	 */
	public static final TableField<Record, Short> INDEX_TYPE = createField("INDEX_TYPE", org.jooq.impl.SQLDataType.SMALLINT, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ASC_OR_DESC</code>.
	 */
	public static final TableField<Record, String> ASC_OR_DESC = createField("ASC_OR_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.PAGES</code>.
	 */
	public static final TableField<Record, Integer> PAGES = createField("PAGES", org.jooq.impl.SQLDataType.INTEGER, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.FILTER_CONDITION</code>.
	 */
	public static final TableField<Record, String> FILTER_CONDITION = createField("FILTER_CONDITION", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.REMARKS</code>.
	 */
	public static final TableField<Record, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.SQL</code>.
	 */
	public static final TableField<Record, String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ID</code>.
	 */
	public static final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.SORT_TYPE</code>.
	 */
	public static final TableField<Record, Integer> SORT_TYPE = createField("SORT_TYPE", org.jooq.impl.SQLDataType.INTEGER, INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.CONSTRAINT_NAME</code>.
	 */
	public static final TableField<Record, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_CLASS</code>.
	 */
	public static final TableField<Record, String> INDEX_CLASS = createField("INDEX_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), INDEXES, "");

	/**
	 * No further instances allowed
	 */
	private Indexes() {
		this("INDEXES", null);
	}

	private Indexes(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Indexes(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}
}