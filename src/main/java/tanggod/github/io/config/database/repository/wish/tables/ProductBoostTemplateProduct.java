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
import tanggod.github.io.config.database.repository.wish.tables.records.ProductBoostTemplateProductRecord;


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
public class ProductBoostTemplateProduct extends TableImpl<ProductBoostTemplateProductRecord> {

    private static final long serialVersionUID = -1169623989;

    /**
     * The reference instance of <code>wish.product_boost_template_product</code>
     */
    public static final ProductBoostTemplateProduct PRODUCT_BOOST_TEMPLATE_PRODUCT = new ProductBoostTemplateProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductBoostTemplateProductRecord> getRecordType() {
        return ProductBoostTemplateProductRecord.class;
    }

    /**
     * The column <code>wish.product_boost_template_product.id</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.product_id</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.amount</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, Double> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.permanent_cycle</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, Boolean> PERMANENT_CYCLE = createField("permanent_cycle", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.auth_code</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.create_date</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.product_boost_template_product.enable</code>.
     */
    public final TableField<ProductBoostTemplateProductRecord, Boolean> ENABLE = createField("enable", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>wish.product_boost_template_product</code> table reference
     */
    public ProductBoostTemplateProduct() {
        this(DSL.name("product_boost_template_product"), null);
    }

    /**
     * Create an aliased <code>wish.product_boost_template_product</code> table reference
     */
    public ProductBoostTemplateProduct(String alias) {
        this(DSL.name(alias), PRODUCT_BOOST_TEMPLATE_PRODUCT);
    }

    /**
     * Create an aliased <code>wish.product_boost_template_product</code> table reference
     */
    public ProductBoostTemplateProduct(Name alias) {
        this(alias, PRODUCT_BOOST_TEMPLATE_PRODUCT);
    }

    private ProductBoostTemplateProduct(Name alias, Table<ProductBoostTemplateProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductBoostTemplateProduct(Name alias, Table<ProductBoostTemplateProductRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PRODUCT_BOOST_TEMPLATE_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductBoostTemplateProductRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_BOOST_TEMPLATE_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductBoostTemplateProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductBoostTemplateProductRecord>>asList(Keys.KEY_PRODUCT_BOOST_TEMPLATE_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateProduct as(String alias) {
        return new ProductBoostTemplateProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductBoostTemplateProduct as(Name alias) {
        return new ProductBoostTemplateProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductBoostTemplateProduct rename(String name) {
        return new ProductBoostTemplateProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductBoostTemplateProduct rename(Name name) {
        return new ProductBoostTemplateProduct(name, null);
    }
}
