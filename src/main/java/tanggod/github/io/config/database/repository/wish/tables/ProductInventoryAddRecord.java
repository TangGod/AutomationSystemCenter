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
import tanggod.github.io.config.database.repository.wish.tables.records.ProductInventoryAddRecordRecord;


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
public class ProductInventoryAddRecord extends TableImpl<ProductInventoryAddRecordRecord> {

    private static final long serialVersionUID = 26241852;

    /**
     * The reference instance of <code>wish.product_inventory_add_record</code>
     */
    public static final ProductInventoryAddRecord PRODUCT_INVENTORY_ADD_RECORD = new ProductInventoryAddRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductInventoryAddRecordRecord> getRecordType() {
        return ProductInventoryAddRecordRecord.class;
    }

    /**
     * The column <code>wish.product_inventory_add_record.id</code>.
     */
    public final TableField<ProductInventoryAddRecordRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.product_inventory_add_record.create_date</code>.
     */
    public final TableField<ProductInventoryAddRecordRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.product_inventory_add_record.main_image</code>.
     */
    public final TableField<ProductInventoryAddRecordRecord, String> MAIN_IMAGE = createField("main_image", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>wish.product_inventory_add_record.add_inventory</code>.
     */
    public final TableField<ProductInventoryAddRecordRecord, Integer> ADD_INVENTORY = createField("add_inventory", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>wish.product_inventory_add_record.variantSkuName</code>.
     */
    public final TableField<ProductInventoryAddRecordRecord, String> VARIANTSKUNAME = createField("variantSkuName", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * Create a <code>wish.product_inventory_add_record</code> table reference
     */
    public ProductInventoryAddRecord() {
        this(DSL.name("product_inventory_add_record"), null);
    }

    /**
     * Create an aliased <code>wish.product_inventory_add_record</code> table reference
     */
    public ProductInventoryAddRecord(String alias) {
        this(DSL.name(alias), PRODUCT_INVENTORY_ADD_RECORD);
    }

    /**
     * Create an aliased <code>wish.product_inventory_add_record</code> table reference
     */
    public ProductInventoryAddRecord(Name alias) {
        this(alias, PRODUCT_INVENTORY_ADD_RECORD);
    }

    private ProductInventoryAddRecord(Name alias, Table<ProductInventoryAddRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductInventoryAddRecord(Name alias, Table<ProductInventoryAddRecordRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PRODUCT_INVENTORY_ADD_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductInventoryAddRecordRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_INVENTORY_ADD_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductInventoryAddRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductInventoryAddRecordRecord>>asList(Keys.KEY_PRODUCT_INVENTORY_ADD_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductInventoryAddRecord as(String alias) {
        return new ProductInventoryAddRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductInventoryAddRecord as(Name alias) {
        return new ProductInventoryAddRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductInventoryAddRecord rename(String name) {
        return new ProductInventoryAddRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductInventoryAddRecord rename(Name name) {
        return new ProductInventoryAddRecord(name, null);
    }
}
