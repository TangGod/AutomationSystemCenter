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
import tanggod.github.io.config.database.repository.wish.tables.records.CustomizeproductRecord;


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
public class Customizeproduct extends TableImpl<CustomizeproductRecord> {

    private static final long serialVersionUID = -1887524471;

    /**
     * The reference instance of <code>wish.customizeProduct</code>
     */
    public static final Customizeproduct CUSTOMIZEPRODUCT = new Customizeproduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomizeproductRecord> getRecordType() {
        return CustomizeproductRecord.class;
    }

    /**
     * The column <code>wish.customizeProduct.id</code>.
     */
    public final TableField<CustomizeproductRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.backImageUrl</code>.
     */
    public final TableField<CustomizeproductRecord, String> BACKIMAGEURL = createField("backImageUrl", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.imageUrl</code>.
     */
    public final TableField<CustomizeproductRecord, String> IMAGEURL = createField("imageUrl", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.productSku</code>.
     */
    public final TableField<CustomizeproductRecord, String> PRODUCTSKU = createField("productSku", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.productId</code>.
     */
    public final TableField<CustomizeproductRecord, String> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.createTime</code>.
     */
    public final TableField<CustomizeproductRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.provider</code>.
     */
    public final TableField<CustomizeproductRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.customizeProduct.mark</code>.
     */
    public final TableField<CustomizeproductRecord, String> MARK = createField("mark", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * Create a <code>wish.customizeProduct</code> table reference
     */
    public Customizeproduct() {
        this(DSL.name("customizeProduct"), null);
    }

    /**
     * Create an aliased <code>wish.customizeProduct</code> table reference
     */
    public Customizeproduct(String alias) {
        this(DSL.name(alias), CUSTOMIZEPRODUCT);
    }

    /**
     * Create an aliased <code>wish.customizeProduct</code> table reference
     */
    public Customizeproduct(Name alias) {
        this(alias, CUSTOMIZEPRODUCT);
    }

    private Customizeproduct(Name alias, Table<CustomizeproductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customizeproduct(Name alias, Table<CustomizeproductRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CUSTOMIZEPRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomizeproductRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMIZEPRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomizeproductRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomizeproductRecord>>asList(Keys.KEY_CUSTOMIZEPRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customizeproduct as(String alias) {
        return new Customizeproduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customizeproduct as(Name alias) {
        return new Customizeproduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customizeproduct rename(String name) {
        return new Customizeproduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customizeproduct rename(Name name) {
        return new Customizeproduct(name, null);
    }
}
