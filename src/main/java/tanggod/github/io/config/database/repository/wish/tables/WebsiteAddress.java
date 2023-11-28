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
import tanggod.github.io.config.database.repository.wish.tables.records.WebsiteAddressRecord;


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
public class WebsiteAddress extends TableImpl<WebsiteAddressRecord> {

    private static final long serialVersionUID = -17596228;

    /**
     * The reference instance of <code>wish.website_address</code>
     */
    public static final WebsiteAddress WEBSITE_ADDRESS = new WebsiteAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WebsiteAddressRecord> getRecordType() {
        return WebsiteAddressRecord.class;
    }

    /**
     * The column <code>wish.website_address.id</code>.
     */
    public final TableField<WebsiteAddressRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.website_address.domainNname</code>.
     */
    public final TableField<WebsiteAddressRecord, String> DOMAINNNAME = createField("domainNname", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.website_address.type</code>.
     */
    public final TableField<WebsiteAddressRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.website_address.remark</code>.
     */
    public final TableField<WebsiteAddressRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>wish.website_address.createDate</code>.
     */
    public final TableField<WebsiteAddressRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>wish.website_address</code> table reference
     */
    public WebsiteAddress() {
        this(DSL.name("website_address"), null);
    }

    /**
     * Create an aliased <code>wish.website_address</code> table reference
     */
    public WebsiteAddress(String alias) {
        this(DSL.name(alias), WEBSITE_ADDRESS);
    }

    /**
     * Create an aliased <code>wish.website_address</code> table reference
     */
    public WebsiteAddress(Name alias) {
        this(alias, WEBSITE_ADDRESS);
    }

    private WebsiteAddress(Name alias, Table<WebsiteAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private WebsiteAddress(Name alias, Table<WebsiteAddressRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.WEBSITE_ADDRESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WebsiteAddressRecord> getPrimaryKey() {
        return Keys.KEY_WEBSITE_ADDRESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WebsiteAddressRecord>> getKeys() {
        return Arrays.<UniqueKey<WebsiteAddressRecord>>asList(Keys.KEY_WEBSITE_ADDRESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebsiteAddress as(String alias) {
        return new WebsiteAddress(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebsiteAddress as(Name alias) {
        return new WebsiteAddress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WebsiteAddress rename(String name) {
        return new WebsiteAddress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WebsiteAddress rename(Name name) {
        return new WebsiteAddress(name, null);
    }
}