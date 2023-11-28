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
import tanggod.github.io.config.database.repository.wish.tables.records.CategoryDataRecord;


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
public class CategoryData extends TableImpl<CategoryDataRecord> {

    private static final long serialVersionUID = 1124577438;

    /**
     * The reference instance of <code>wish.category_data</code>
     */
    public static final CategoryData CATEGORY_DATA = new CategoryData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryDataRecord> getRecordType() {
        return CategoryDataRecord.class;
    }

    /**
     * The column <code>wish.category_data.id</code>.
     */
    public final TableField<CategoryDataRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.category_data.productId</code>.
     */
    public final TableField<CategoryDataRecord, String> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.category_data.imageUrl</code>.
     */
    public final TableField<CategoryDataRecord, String> IMAGEURL = createField("imageUrl", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>wish.category_data.createDate</code>.
     */
    public final TableField<CategoryDataRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.category_data.state</code>.
     */
    public final TableField<CategoryDataRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>wish.category_data.parentProductId</code>.
     */
    public final TableField<CategoryDataRecord, String> PARENTPRODUCTID = createField("parentProductId", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>wish.category_data.search</code>.
     */
    public final TableField<CategoryDataRecord, String> SEARCH = createField("search", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.category_data.updateDate</code>.
     */
    public final TableField<CategoryDataRecord, Timestamp> UPDATEDATE = createField("updateDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>wish.category_data.with</code>.
     */
    public final TableField<CategoryDataRecord, Integer> WITH = createField("with", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>wish.category_data.shelf</code>.
     */
    public final TableField<CategoryDataRecord, Integer> SHELF = createField("shelf", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>wish.category_data.flow</code>.
     */
    public final TableField<CategoryDataRecord, Long> FLOW = createField("flow", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>wish.category_data.category_id</code>.
     */
    public final TableField<CategoryDataRecord, String> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>wish.category_data.maijiawang_genTime</code>.
     */
    public final TableField<CategoryDataRecord, String> MAIJIAWANG_GENTIME = createField("maijiawang_genTime", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>wish.category_data.platform_delete</code>.
     */
    public final TableField<CategoryDataRecord, Boolean> PLATFORM_DELETE = createField("platform_delete", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>wish.category_data</code> table reference
     */
    public CategoryData() {
        this(DSL.name("category_data"), null);
    }

    /**
     * Create an aliased <code>wish.category_data</code> table reference
     */
    public CategoryData(String alias) {
        this(DSL.name(alias), CATEGORY_DATA);
    }

    /**
     * Create an aliased <code>wish.category_data</code> table reference
     */
    public CategoryData(Name alias) {
        this(alias, CATEGORY_DATA);
    }

    private CategoryData(Name alias, Table<CategoryDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private CategoryData(Name alias, Table<CategoryDataRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CATEGORY_DATA_$_CATEGORY_ID, Indexes.CATEGORY_DATA_$_CREATEDATE, Indexes.CATEGORY_DATA_$_MAIJIAWANG_GENTIME, Indexes.CATEGORY_DATA_$_PRODUCTID, Indexes.CATEGORY_DATA_$_SEARCH, Indexes.CATEGORY_DATA_$_STATE, Indexes.CATEGORY_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryDataRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_DATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryDataRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryDataRecord>>asList(Keys.KEY_CATEGORY_DATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryData as(String alias) {
        return new CategoryData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryData as(Name alias) {
        return new CategoryData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryData rename(String name) {
        return new CategoryData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryData rename(Name name) {
        return new CategoryData(name, null);
    }
}