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
import tanggod.github.io.config.database.repository.wish.tables.records.TaskrecordRecord;


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
public class Taskrecord extends TableImpl<TaskrecordRecord> {

    private static final long serialVersionUID = 1593611625;

    /**
     * The reference instance of <code>wish.taskRecord</code>
     */
    public static final Taskrecord TASKRECORD = new Taskrecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskrecordRecord> getRecordType() {
        return TaskrecordRecord.class;
    }

    /**
     * The column <code>wish.taskRecord.id</code>.
     */
    public final TableField<TaskrecordRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>wish.taskRecord.fiileName</code>.
     */
    public final TableField<TaskrecordRecord, String> FIILENAME = createField("fiileName", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>wish.taskRecord.newFileName</code>.
     */
    public final TableField<TaskrecordRecord, String> NEWFILENAME = createField("newFileName", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>wish.taskRecord.createData</code>.
     */
    public final TableField<TaskrecordRecord, Timestamp> CREATEDATA = createField("createData", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>wish.taskRecord.userId</code>.
     */
    public final TableField<TaskrecordRecord, String> USERID = createField("userId", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * Create a <code>wish.taskRecord</code> table reference
     */
    public Taskrecord() {
        this(DSL.name("taskRecord"), null);
    }

    /**
     * Create an aliased <code>wish.taskRecord</code> table reference
     */
    public Taskrecord(String alias) {
        this(DSL.name(alias), TASKRECORD);
    }

    /**
     * Create an aliased <code>wish.taskRecord</code> table reference
     */
    public Taskrecord(Name alias) {
        this(alias, TASKRECORD);
    }

    private Taskrecord(Name alias, Table<TaskrecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private Taskrecord(Name alias, Table<TaskrecordRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.TASKRECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TaskrecordRecord> getPrimaryKey() {
        return Keys.KEY_TASKRECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TaskrecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskrecordRecord>>asList(Keys.KEY_TASKRECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Taskrecord as(String alias) {
        return new Taskrecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Taskrecord as(Name alias) {
        return new Taskrecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Taskrecord rename(String name) {
        return new Taskrecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Taskrecord rename(Name name) {
        return new Taskrecord(name, null);
    }
}
