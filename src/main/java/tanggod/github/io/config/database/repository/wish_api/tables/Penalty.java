/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish_api.tables;


import java.math.BigDecimal;
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

import tanggod.github.io.config.database.repository.wish_api.Indexes;
import tanggod.github.io.config.database.repository.wish_api.Keys;
import tanggod.github.io.config.database.repository.wish_api.WishApi;
import tanggod.github.io.config.database.repository.wish_api.tables.records.PenaltyRecord;


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
public class Penalty extends TableImpl<PenaltyRecord> {

    private static final long serialVersionUID = -1346415138;

    /**
     * The reference instance of <code>wish_api.penalty</code>
     */
    public static final Penalty PENALTY = new Penalty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PenaltyRecord> getRecordType() {
        return PenaltyRecord.class;
    }

    /**
     * The column <code>wish_api.penalty.id</code>.
     */
    public final TableField<PenaltyRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish_api.penalty.auth_code</code>. 授权编码
     */
    public final TableField<PenaltyRecord, String> AUTH_CODE = createField("auth_code", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "授权编码");

    /**
     * The column <code>wish_api.penalty.penalty_reason</code>. 罚款原因
     */
    public final TableField<PenaltyRecord, String> PENALTY_REASON = createField("penalty_reason", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "罚款原因");

    /**
     * The column <code>wish_api.penalty.related_entity_type</code>. 罚款类型
     */
    public final TableField<PenaltyRecord, String> RELATED_ENTITY_TYPE = createField("related_entity_type", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "罚款类型");

    /**
     * The column <code>wish_api.penalty.related_entity_id</code>. 罚款相关的编号
     */
    public final TableField<PenaltyRecord, String> RELATED_ENTITY_ID = createField("related_entity_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "罚款相关的编号");

    /**
     * The column <code>wish_api.penalty.penalty_amount</code>. 罚款金额
     */
    public final TableField<PenaltyRecord, BigDecimal> PENALTY_AMOUNT = createField("penalty_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "罚款金额");

    /**
     * The column <code>wish_api.penalty.currency_code</code>. 罚款金额的货币类型
     */
    public final TableField<PenaltyRecord, String> CURRENCY_CODE = createField("currency_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "罚款金额的货币类型");

    /**
     * The column <code>wish_api.penalty.created_at</code>. 罚款创建时间
     */
    public final TableField<PenaltyRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "罚款创建时间");

    /**
     * The column <code>wish_api.penalty.reversed</code>. 罚款是否撤销
     */
    public final TableField<PenaltyRecord, Boolean> REVERSED = createField("reversed", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "罚款是否撤销");

    /**
     * Create a <code>wish_api.penalty</code> table reference
     */
    public Penalty() {
        this(DSL.name("penalty"), null);
    }

    /**
     * Create an aliased <code>wish_api.penalty</code> table reference
     */
    public Penalty(String alias) {
        this(DSL.name(alias), PENALTY);
    }

    /**
     * Create an aliased <code>wish_api.penalty</code> table reference
     */
    public Penalty(Name alias) {
        this(alias, PENALTY);
    }

    private Penalty(Name alias, Table<PenaltyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Penalty(Name alias, Table<PenaltyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return WishApi.WISH_API;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PENALTY_1, Indexes.PENALTY_2, Indexes.PENALTY_3, Indexes.PENALTY_4, Indexes.PENALTY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PenaltyRecord> getPrimaryKey() {
        return Keys.KEY_PENALTY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PenaltyRecord>> getKeys() {
        return Arrays.<UniqueKey<PenaltyRecord>>asList(Keys.KEY_PENALTY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Penalty as(String alias) {
        return new Penalty(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Penalty as(Name alias) {
        return new Penalty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Penalty rename(String name) {
        return new Penalty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Penalty rename(Name name) {
        return new Penalty(name, null);
    }
}