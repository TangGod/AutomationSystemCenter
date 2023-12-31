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
import tanggod.github.io.config.database.repository.wish.tables.records.WishCategoryRecord;


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
public class WishCategory extends TableImpl<WishCategoryRecord> {

    private static final long serialVersionUID = -1855749279;

    /**
     * The reference instance of <code>wish.wish_category</code>
     */
    public static final WishCategory WISH_CATEGORY = new WishCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WishCategoryRecord> getRecordType() {
        return WishCategoryRecord.class;
    }

    /**
     * The column <code>wish.wish_category.id</code>.
     */
    public final TableField<WishCategoryRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_category.categoryName</code>.
     */
    public final TableField<WishCategoryRecord, String> CATEGORYNAME = createField("categoryName", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.wish_category.search</code>.
     */
    public final TableField<WishCategoryRecord, String> SEARCH = createField("search", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>wish.wish_category.createDate</code>.
     */
    public final TableField<WishCategoryRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.wish_category.collection_switch</code>.
     */
    public final TableField<WishCategoryRecord, String> COLLECTION_SWITCH = createField("collection_switch", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>wish.wish_category</code> table reference
     */
    public WishCategory() {
        this(DSL.name("wish_category"), null);
    }

    /**
     * Create an aliased <code>wish.wish_category</code> table reference
     */
    public WishCategory(String alias) {
        this(DSL.name(alias), WISH_CATEGORY);
    }

    /**
     * Create an aliased <code>wish.wish_category</code> table reference
     */
    public WishCategory(Name alias) {
        this(alias, WISH_CATEGORY);
    }

    private WishCategory(Name alias, Table<WishCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private WishCategory(Name alias, Table<WishCategoryRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.WISH_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WishCategoryRecord> getPrimaryKey() {
        return Keys.KEY_WISH_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WishCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<WishCategoryRecord>>asList(Keys.KEY_WISH_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCategory as(String alias) {
        return new WishCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishCategory as(Name alias) {
        return new WishCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WishCategory rename(String name) {
        return new WishCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WishCategory rename(Name name) {
        return new WishCategory(name, null);
    }
}
