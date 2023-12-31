/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.oauth.tables;


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

import tanggod.github.io.config.database.repository.oauth.Indexes;
import tanggod.github.io.config.database.repository.oauth.Keys;
import tanggod.github.io.config.database.repository.oauth.Oauth;
import tanggod.github.io.config.database.repository.oauth.tables.records.WishRecord;


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
public class Wish extends TableImpl<WishRecord> {

    private static final long serialVersionUID = 126291163;

    /**
     * The reference instance of <code>OAuth.wish</code>
     */
    public static final Wish WISH = new Wish();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WishRecord> getRecordType() {
        return WishRecord.class;
    }

    /**
     * The column <code>OAuth.wish.id</code>.
     */
    public final TableField<WishRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>OAuth.wish.client_id</code>.
     */
    public final TableField<WishRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>OAuth.wish.client_secret</code>.
     */
    public final TableField<WishRecord, String> CLIENT_SECRET = createField("client_secret", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>OAuth.wish.access_token</code>.
     */
    public final TableField<WishRecord, String> ACCESS_TOKEN = createField("access_token", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>OAuth.wish.merchant_id</code>.
     */
    public final TableField<WishRecord, String> MERCHANT_ID = createField("merchant_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>OAuth.wish.expiry_time</code>.
     */
    public final TableField<WishRecord, Timestamp> EXPIRY_TIME = createField("expiry_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>OAuth.wish.refresh_token</code>.
     */
    public final TableField<WishRecord, String> REFRESH_TOKEN = createField("refresh_token", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>OAuth.wish.auth_code</code>.
     */
    public final TableField<WishRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>OAuth.wish.enable_mail_notify</code>.
     */
    public final TableField<WishRecord, Boolean> ENABLE_MAIL_NOTIFY = createField("enable_mail_notify", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>OAuth.wish.wishpost_auth_code</code>.
     */
    public final TableField<WishRecord, String> WISHPOST_AUTH_CODE = createField("wishpost_auth_code", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * Create a <code>OAuth.wish</code> table reference
     */
    public Wish() {
        this(DSL.name("wish"), null);
    }

    /**
     * Create an aliased <code>OAuth.wish</code> table reference
     */
    public Wish(String alias) {
        this(DSL.name(alias), WISH);
    }

    /**
     * Create an aliased <code>OAuth.wish</code> table reference
     */
    public Wish(Name alias) {
        this(alias, WISH);
    }

    private Wish(Name alias, Table<WishRecord> aliased) {
        this(alias, aliased, null);
    }

    private Wish(Name alias, Table<WishRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Oauth.OAUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WISH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WishRecord> getPrimaryKey() {
        return Keys.KEY_WISH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WishRecord>> getKeys() {
        return Arrays.<UniqueKey<WishRecord>>asList(Keys.KEY_WISH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Wish as(String alias) {
        return new Wish(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Wish as(Name alias) {
        return new Wish(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Wish rename(String name) {
        return new Wish(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Wish rename(Name name) {
        return new Wish(name, null);
    }
}
