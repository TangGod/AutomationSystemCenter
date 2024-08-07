/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import tanggod.github.io.config.database.repository.dummy_data.DummyData;
import tanggod.github.io.config.database.repository.independent_website.IndependentWebsite;
import tanggod.github.io.config.database.repository.oauth.Oauth;
import tanggod.github.io.config.database.repository.system.System;
import tanggod.github.io.config.database.repository.system_log.SystemLog;
import tanggod.github.io.config.database.repository.user.User;
import tanggod.github.io.config.database.repository.wish.Wish;
import tanggod.github.io.config.database.repository.wish_api.WishApi;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -460457188;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>wish</code>.
     */
    public final Wish WISH = tanggod.github.io.config.database.repository.wish.Wish.WISH;

    /**
     * The schema <code>wish_api</code>.
     */
    public final WishApi WISH_API = tanggod.github.io.config.database.repository.wish_api.WishApi.WISH_API;

    /**
     * The schema <code>user</code>.
     */
    public final User USER = tanggod.github.io.config.database.repository.user.User.USER;

    /**
     * The schema <code>system_log</code>.
     */
    public final SystemLog SYSTEM_LOG = tanggod.github.io.config.database.repository.system_log.SystemLog.SYSTEM_LOG;

    /**
     * The schema <code>system</code>.
     */
    public final System SYSTEM = tanggod.github.io.config.database.repository.system.System.SYSTEM;

    /**
     * The schema <code>OAuth</code>.
     */
    public final Oauth OAUTH = tanggod.github.io.config.database.repository.oauth.Oauth.OAUTH;

    /**
     * The schema <code>dummy_data</code>.
     */
    public final DummyData DUMMY_DATA = tanggod.github.io.config.database.repository.dummy_data.DummyData.DUMMY_DATA;

    /**
     * The schema <code>independent_website</code>.
     */
    public final IndependentWebsite INDEPENDENT_WEBSITE = tanggod.github.io.config.database.repository.independent_website.IndependentWebsite.INDEPENDENT_WEBSITE;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            Wish.WISH,
            WishApi.WISH_API,
            User.USER,
            SystemLog.SYSTEM_LOG,
            System.SYSTEM,
            Oauth.OAUTH,
            DummyData.DUMMY_DATA,
            IndependentWebsite.INDEPENDENT_WEBSITE);
    }
}
