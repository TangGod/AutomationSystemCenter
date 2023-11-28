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
import tanggod.github.io.config.database.repository.wish.tables.records.DesktopApplicationRecord;


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
public class DesktopApplication extends TableImpl<DesktopApplicationRecord> {

    private static final long serialVersionUID = -1076947939;

    /**
     * The reference instance of <code>wish.desktop_application</code>
     */
    public static final DesktopApplication DESKTOP_APPLICATION = new DesktopApplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DesktopApplicationRecord> getRecordType() {
        return DesktopApplicationRecord.class;
    }

    /**
     * The column <code>wish.desktop_application.id</code>.
     */
    public final TableField<DesktopApplicationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.desktop_application.userName</code>.
     */
    public final TableField<DesktopApplicationRecord, String> USERNAME = createField("userName", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.desktop_application.permission</code>.
     */
    public final TableField<DesktopApplicationRecord, String> PERMISSION = createField("permission", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.desktop_application.create_date</code>.
     */
    public final TableField<DesktopApplicationRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>wish.desktop_application</code> table reference
     */
    public DesktopApplication() {
        this(DSL.name("desktop_application"), null);
    }

    /**
     * Create an aliased <code>wish.desktop_application</code> table reference
     */
    public DesktopApplication(String alias) {
        this(DSL.name(alias), DESKTOP_APPLICATION);
    }

    /**
     * Create an aliased <code>wish.desktop_application</code> table reference
     */
    public DesktopApplication(Name alias) {
        this(alias, DESKTOP_APPLICATION);
    }

    private DesktopApplication(Name alias, Table<DesktopApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DesktopApplication(Name alias, Table<DesktopApplicationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DESKTOP_APPLICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DesktopApplicationRecord> getPrimaryKey() {
        return Keys.KEY_DESKTOP_APPLICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DesktopApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<DesktopApplicationRecord>>asList(Keys.KEY_DESKTOP_APPLICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DesktopApplication as(String alias) {
        return new DesktopApplication(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DesktopApplication as(Name alias) {
        return new DesktopApplication(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DesktopApplication rename(String name) {
        return new DesktopApplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DesktopApplication rename(Name name) {
        return new DesktopApplication(name, null);
    }
}