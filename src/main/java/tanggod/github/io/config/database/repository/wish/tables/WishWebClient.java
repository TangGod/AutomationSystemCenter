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
import tanggod.github.io.config.database.repository.wish.tables.records.WishWebClientRecord;


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
public class WishWebClient extends TableImpl<WishWebClientRecord> {

    private static final long serialVersionUID = 1126364516;

    /**
     * The reference instance of <code>wish.wish_web_client</code>
     */
    public static final WishWebClient WISH_WEB_CLIENT = new WishWebClient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WishWebClientRecord> getRecordType() {
        return WishWebClientRecord.class;
    }

    /**
     * The column <code>wish.wish_web_client.cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> COOKIE = createField("cookie", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>wish.wish_web_client.price_cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> PRICE_COOKIE = createField("price_cookie", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>wish.wish_web_client.search_cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> SEARCH_COOKIE = createField("search_cookie", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>wish.wish_web_client.de_cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> DE_COOKIE = createField("de_cookie", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>wish.wish_web_client.gb_cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> GB_COOKIE = createField("gb_cookie", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>wish.wish_web_client.fr_cookie</code>.
     */
    public final TableField<WishWebClientRecord, String> FR_COOKIE = createField("fr_cookie", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>wish.wish_web_client</code> table reference
     */
    public WishWebClient() {
        this(DSL.name("wish_web_client"), null);
    }

    /**
     * Create an aliased <code>wish.wish_web_client</code> table reference
     */
    public WishWebClient(String alias) {
        this(DSL.name(alias), WISH_WEB_CLIENT);
    }

    /**
     * Create an aliased <code>wish.wish_web_client</code> table reference
     */
    public WishWebClient(Name alias) {
        this(alias, WISH_WEB_CLIENT);
    }

    private WishWebClient(Name alias, Table<WishWebClientRecord> aliased) {
        this(alias, aliased, null);
    }

    private WishWebClient(Name alias, Table<WishWebClientRecord> aliased, Field<?>[] parameters) {
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
    public WishWebClient as(String alias) {
        return new WishWebClient(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WishWebClient as(Name alias) {
        return new WishWebClient(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WishWebClient rename(String name) {
        return new WishWebClient(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WishWebClient rename(Name name) {
        return new WishWebClient(name, null);
    }
}