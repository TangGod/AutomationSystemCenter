/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import tanggod.github.io.config.database.repository.system.tables.Binding;
import tanggod.github.io.config.database.repository.system.tables.Product;
import tanggod.github.io.config.database.repository.system.tables.Variation;


/**
 * A class modelling indexes of tables of the <code>system</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index BINDING_1 = Indexes0.BINDING_1;
    public static final Index BINDING_10 = Indexes0.BINDING_10;
    public static final Index BINDING_2 = Indexes0.BINDING_2;
    public static final Index BINDING_3 = Indexes0.BINDING_3;
    public static final Index BINDING_4 = Indexes0.BINDING_4;
    public static final Index BINDING_5 = Indexes0.BINDING_5;
    public static final Index BINDING_6 = Indexes0.BINDING_6;
    public static final Index BINDING_7 = Indexes0.BINDING_7;
    public static final Index BINDING_8 = Indexes0.BINDING_8;
    public static final Index BINDING_9 = Indexes0.BINDING_9;
    public static final Index BINDING_PRIMARY = Indexes0.BINDING_PRIMARY;
    public static final Index PRODUCT_1 = Indexes0.PRODUCT_1;
    public static final Index PRODUCT_2 = Indexes0.PRODUCT_2;
    public static final Index PRODUCT_3 = Indexes0.PRODUCT_3;
    public static final Index PRODUCT_4 = Indexes0.PRODUCT_4;
    public static final Index PRODUCT_5 = Indexes0.PRODUCT_5;
    public static final Index PRODUCT_PRIMARY = Indexes0.PRODUCT_PRIMARY;
    public static final Index VARIATION_1 = Indexes0.VARIATION_1;
    public static final Index VARIATION_2 = Indexes0.VARIATION_2;
    public static final Index VARIATION_3 = Indexes0.VARIATION_3;
    public static final Index VARIATION_4 = Indexes0.VARIATION_4;
    public static final Index VARIATION_5 = Indexes0.VARIATION_5;
    public static final Index VARIATION_6 = Indexes0.VARIATION_6;
    public static final Index VARIATION_7 = Indexes0.VARIATION_7;
    public static final Index VARIATION_PRIMARY = Indexes0.VARIATION_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index BINDING_1 = Internal.createIndex("1", Binding.BINDING, new OrderField[] { Binding.BINDING.SYSTEM_PRODUCT_ID }, false);
        public static Index BINDING_10 = Internal.createIndex("10", Binding.BINDING, new OrderField[] { Binding.BINDING.AUTH_CODE }, false);
        public static Index BINDING_2 = Internal.createIndex("2", Binding.BINDING, new OrderField[] { Binding.BINDING.PLATFORM_PRODUCT_ID }, false);
        public static Index BINDING_3 = Internal.createIndex("3", Binding.BINDING, new OrderField[] { Binding.BINDING.SYSTEM_VARIATION_ID }, false);
        public static Index BINDING_4 = Internal.createIndex("4", Binding.BINDING, new OrderField[] { Binding.BINDING.PLATFORM_NAME }, false);
        public static Index BINDING_5 = Internal.createIndex("5", Binding.BINDING, new OrderField[] { Binding.BINDING.CREATE_DATE }, false);
        public static Index BINDING_6 = Internal.createIndex("6", Binding.BINDING, new OrderField[] { Binding.BINDING.UPDATE_DATE }, false);
        public static Index BINDING_7 = Internal.createIndex("7", Binding.BINDING, new OrderField[] { Binding.BINDING.PLATFORM_VARIATION_ID }, false);
        public static Index BINDING_8 = Internal.createIndex("8", Binding.BINDING, new OrderField[] { Binding.BINDING.SYSTEM_VARIATION_SKU_NAME }, false);
        public static Index BINDING_9 = Internal.createIndex("9", Binding.BINDING, new OrderField[] { Binding.BINDING.PLATFORM_VARIATION_SKU_NAME }, false);
        public static Index BINDING_PRIMARY = Internal.createIndex("PRIMARY", Binding.BINDING, new OrderField[] { Binding.BINDING.SYSTEM_VARIATION_ID, Binding.BINDING.PLATFORM_VARIATION_ID }, true);
        public static Index PRODUCT_1 = Internal.createIndex("1", Product.PRODUCT, new OrderField[] { Product.PRODUCT.SKU_NAME }, false);
        public static Index PRODUCT_2 = Internal.createIndex("2", Product.PRODUCT, new OrderField[] { Product.PRODUCT.CREATE_DATE }, false);
        public static Index PRODUCT_3 = Internal.createIndex("3", Product.PRODUCT, new OrderField[] { Product.PRODUCT.UPDATE_DATE }, false);
        public static Index PRODUCT_4 = Internal.createIndex("4", Product.PRODUCT, new OrderField[] { Product.PRODUCT.AUTH_CODE }, false);
        public static Index PRODUCT_5 = Internal.createIndex("5", Product.PRODUCT, new OrderField[] { Product.PRODUCT.ENABLE }, false);
        public static Index PRODUCT_PRIMARY = Internal.createIndex("PRIMARY", Product.PRODUCT, new OrderField[] { Product.PRODUCT.PRODUCT_ID }, true);
        public static Index VARIATION_1 = Internal.createIndex("1", Variation.VARIATION, new OrderField[] { Variation.VARIATION.PRODUCT_ID }, false);
        public static Index VARIATION_2 = Internal.createIndex("2", Variation.VARIATION, new OrderField[] { Variation.VARIATION.PARENT_SKU }, false);
        public static Index VARIATION_3 = Internal.createIndex("3", Variation.VARIATION, new OrderField[] { Variation.VARIATION.SKU_NAME }, false);
        public static Index VARIATION_4 = Internal.createIndex("4", Variation.VARIATION, new OrderField[] { Variation.VARIATION.AUTH_CODE }, false);
        public static Index VARIATION_5 = Internal.createIndex("5", Variation.VARIATION, new OrderField[] { Variation.VARIATION.CREATE_DATE }, false);
        public static Index VARIATION_6 = Internal.createIndex("6", Variation.VARIATION, new OrderField[] { Variation.VARIATION.UPDATE_DATE }, false);
        public static Index VARIATION_7 = Internal.createIndex("7", Variation.VARIATION, new OrderField[] { Variation.VARIATION.ENABLE }, false);
        public static Index VARIATION_PRIMARY = Internal.createIndex("PRIMARY", Variation.VARIATION, new OrderField[] { Variation.VARIATION.VARIATION_ID }, true);
    }
}
