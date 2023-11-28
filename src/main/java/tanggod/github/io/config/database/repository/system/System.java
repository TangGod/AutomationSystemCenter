/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.system;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import tanggod.github.io.config.database.repository.DefaultCatalog;
import tanggod.github.io.config.database.repository.system.tables.Binding;
import tanggod.github.io.config.database.repository.system.tables.Product;
import tanggod.github.io.config.database.repository.system.tables.Variation;


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
public class System extends SchemaImpl {

    private static final long serialVersionUID = 53890987;

    /**
     * The reference instance of <code>system</code>
     */
    public static final System SYSTEM = new System();

    /**
     * The table <code>system.binding</code>.
     */
    public final Binding BINDING = tanggod.github.io.config.database.repository.system.tables.Binding.BINDING;

    /**
     * The table <code>system.product</code>.
     */
    public final Product PRODUCT = tanggod.github.io.config.database.repository.system.tables.Product.PRODUCT;

    /**
     * The table <code>system.variation</code>.
     */
    public final Variation VARIATION = tanggod.github.io.config.database.repository.system.tables.Variation.VARIATION;

    /**
     * No further instances allowed
     */
    private System() {
        super("system", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Binding.BINDING,
            Product.PRODUCT,
            Variation.VARIATION);
    }
}