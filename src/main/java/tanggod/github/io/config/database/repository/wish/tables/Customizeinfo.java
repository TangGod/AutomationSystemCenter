/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tanggod.github.io.config.database.repository.wish.Indexes;
import tanggod.github.io.config.database.repository.wish.Keys;
import tanggod.github.io.config.database.repository.wish.Wish;
import tanggod.github.io.config.database.repository.wish.tables.records.CustomizeinfoRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customizeinfo extends TableImpl<CustomizeinfoRecord> {

    private static final long serialVersionUID = -37512247;

    /**
     * The reference instance of <code>wish.customizeInfo</code>
     */
    public static final Customizeinfo CUSTOMIZEINFO = new Customizeinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomizeinfoRecord> getRecordType() {
        return CustomizeinfoRecord.class;
    }

    /**
     * The column <code>wish.customizeInfo.id</code>.
     */
    public final TableField<CustomizeinfoRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.productSize</code>.
     */
    public final TableField<CustomizeinfoRecord, String> PRODUCTSIZE = createField("productSize", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.count</code>.
     */
    public final TableField<CustomizeinfoRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.customizeProductId</code>.
     */
    public final TableField<CustomizeinfoRecord, String> CUSTOMIZEPRODUCTID = createField("customizeProductId", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.createTime</code>.
     */
    public final TableField<CustomizeinfoRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.searchDate</code>.
     */
    public final TableField<CustomizeinfoRecord, String> SEARCHDATE = createField("searchDate", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeInfo.mark</code>.
     */
    public final TableField<CustomizeinfoRecord, String> MARK = createField("mark", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * Create a <code>wish.customizeInfo</code> table reference
     */
    public Customizeinfo() {
        this(DSL.name("customizeInfo"), null);
    }

    /**
     * Create an aliased <code>wish.customizeInfo</code> table reference
     */
    public Customizeinfo(String alias) {
        this(DSL.name(alias), CUSTOMIZEINFO);
    }

    /**
     * Create an aliased <code>wish.customizeInfo</code> table reference
     */
    public Customizeinfo(Name alias) {
        this(alias, CUSTOMIZEINFO);
    }

    private Customizeinfo(Name alias, Table<CustomizeinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customizeinfo(Name alias, Table<CustomizeinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Wish.WISH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CUSTOMIZEINFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomizeinfoRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMIZEINFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomizeinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomizeinfoRecord>>asList(Keys.KEY_CUSTOMIZEINFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customizeinfo as(String alias) {
        return new Customizeinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customizeinfo as(Name alias) {
        return new Customizeinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customizeinfo rename(String name) {
        return new Customizeinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customizeinfo rename(Name name) {
        return new Customizeinfo(name, null);
    }
}