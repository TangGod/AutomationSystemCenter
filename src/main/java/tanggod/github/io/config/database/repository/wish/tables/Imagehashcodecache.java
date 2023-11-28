/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tanggod.github.io.config.database.repository.wish.Wish;
import tanggod.github.io.config.database.repository.wish.tables.records.ImagehashcodecacheRecord;


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
public class Imagehashcodecache extends TableImpl<ImagehashcodecacheRecord> {

    private static final long serialVersionUID = -2129812759;

    /**
     * The reference instance of <code>wish.ImageHashCodeCache</code>
     */
    public static final Imagehashcodecache IMAGEHASHCODECACHE = new Imagehashcodecache();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImagehashcodecacheRecord> getRecordType() {
        return ImagehashcodecacheRecord.class;
    }

    /**
     * The column <code>wish.ImageHashCodeCache.hashCode</code>.
     */
    public final TableField<ImagehashcodecacheRecord, String> HASHCODE = createField("hashCode", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>wish.ImageHashCodeCache.productId</code>.
     */
    public final TableField<ImagehashcodecacheRecord, String> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.ImageHashCodeCache.category_id</code>.
     */
    public final TableField<ImagehashcodecacheRecord, String> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * Create a <code>wish.ImageHashCodeCache</code> table reference
     */
    public Imagehashcodecache() {
        this(DSL.name("ImageHashCodeCache"), null);
    }

    /**
     * Create an aliased <code>wish.ImageHashCodeCache</code> table reference
     */
    public Imagehashcodecache(String alias) {
        this(DSL.name(alias), IMAGEHASHCODECACHE);
    }

    /**
     * Create an aliased <code>wish.ImageHashCodeCache</code> table reference
     */
    public Imagehashcodecache(Name alias) {
        this(alias, IMAGEHASHCODECACHE);
    }

    private Imagehashcodecache(Name alias, Table<ImagehashcodecacheRecord> aliased) {
        this(alias, aliased, null);
    }

    private Imagehashcodecache(Name alias, Table<ImagehashcodecacheRecord> aliased, Field<?>[] parameters) {
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
    public Imagehashcodecache as(String alias) {
        return new Imagehashcodecache(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Imagehashcodecache as(Name alias) {
        return new Imagehashcodecache(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Imagehashcodecache rename(String name) {
        return new Imagehashcodecache(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Imagehashcodecache rename(Name name) {
        return new Imagehashcodecache(name, null);
    }
}