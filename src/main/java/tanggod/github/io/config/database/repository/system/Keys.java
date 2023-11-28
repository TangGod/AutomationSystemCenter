/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import tanggod.github.io.config.database.repository.system.tables.Binding;
import tanggod.github.io.config.database.repository.system.tables.Product;
import tanggod.github.io.config.database.repository.system.tables.Variation;
import tanggod.github.io.config.database.repository.system.tables.records.BindingRecord;
import tanggod.github.io.config.database.repository.system.tables.records.ProductRecord;
import tanggod.github.io.config.database.repository.system.tables.records.VariationRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>system</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BindingRecord> KEY_BINDING_PRIMARY = UniqueKeys0.KEY_BINDING_PRIMARY;
    public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = UniqueKeys0.KEY_PRODUCT_PRIMARY;
    public static final UniqueKey<VariationRecord> KEY_VARIATION_PRIMARY = UniqueKeys0.KEY_VARIATION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<BindingRecord> KEY_BINDING_PRIMARY = Internal.createUniqueKey(Binding.BINDING, "KEY_binding_PRIMARY", Binding.BINDING.SYSTEM_VARIATION_ID, Binding.BINDING.PLATFORM_VARIATION_ID);
        public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = Internal.createUniqueKey(Product.PRODUCT, "KEY_product_PRIMARY", Product.PRODUCT.PRODUCT_ID);
        public static final UniqueKey<VariationRecord> KEY_VARIATION_PRIMARY = Internal.createUniqueKey(Variation.VARIATION, "KEY_variation_PRIMARY", Variation.VARIATION.VARIATION_ID);
    }
}
