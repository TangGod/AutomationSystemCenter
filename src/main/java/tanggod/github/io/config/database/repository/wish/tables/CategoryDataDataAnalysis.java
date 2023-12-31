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
import tanggod.github.io.config.database.repository.wish.tables.records.CategoryDataDataAnalysisRecord;


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
public class CategoryDataDataAnalysis extends TableImpl<CategoryDataDataAnalysisRecord> {

    private static final long serialVersionUID = -930672426;

    /**
     * The reference instance of <code>wish.category_data_data_analysis</code>
     */
    public static final CategoryDataDataAnalysis CATEGORY_DATA_DATA_ANALYSIS = new CategoryDataDataAnalysis();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryDataDataAnalysisRecord> getRecordType() {
        return CategoryDataDataAnalysisRecord.class;
    }

    /**
     * The column <code>wish.category_data_data_analysis.id</code>. ID
     */
    public final TableField<CategoryDataDataAnalysisRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "ID");

    /**
     * The column <code>wish.category_data_data_analysis.category_data_id</code>. 产品ID
     */
    public final TableField<CategoryDataDataAnalysisRecord, String> CATEGORY_DATA_ID = createField("category_data_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "产品ID");

    /**
     * The column <code>wish.category_data_data_analysis.wish_category_id</code>. 产品分类ID
     */
    public final TableField<CategoryDataDataAnalysisRecord, String> WISH_CATEGORY_ID = createField("wish_category_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "产品分类ID");

    /**
     * The column <code>wish.category_data_data_analysis.maximumSales</code>. 最大销售量
     */
    public final TableField<CategoryDataDataAnalysisRecord, Integer> MAXIMUMSALES = createField("maximumSales", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "最大销售量");

    /**
     * The column <code>wish.category_data_data_analysis.added_time</code>. 上架时间
     */
    public final TableField<CategoryDataDataAnalysisRecord, Timestamp> ADDED_TIME = createField("added_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "上架时间");

    /**
     * The column <code>wish.category_data_data_analysis.sync_code</code>.
     */
    public final TableField<CategoryDataDataAnalysisRecord, String> SYNC_CODE = createField("sync_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>wish.category_data_data_analysis.system_delete</code>.
     */
    public final TableField<CategoryDataDataAnalysisRecord, Boolean> SYSTEM_DELETE = createField("system_delete", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>wish.category_data_data_analysis.request_code</code>.
     */
    public final TableField<CategoryDataDataAnalysisRecord, String> REQUEST_CODE = createField("request_code", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>wish.category_data_data_analysis</code> table reference
     */
    public CategoryDataDataAnalysis() {
        this(DSL.name("category_data_data_analysis"), null);
    }

    /**
     * Create an aliased <code>wish.category_data_data_analysis</code> table reference
     */
    public CategoryDataDataAnalysis(String alias) {
        this(DSL.name(alias), CATEGORY_DATA_DATA_ANALYSIS);
    }

    /**
     * Create an aliased <code>wish.category_data_data_analysis</code> table reference
     */
    public CategoryDataDataAnalysis(Name alias) {
        this(alias, CATEGORY_DATA_DATA_ANALYSIS);
    }

    private CategoryDataDataAnalysis(Name alias, Table<CategoryDataDataAnalysisRecord> aliased) {
        this(alias, aliased, null);
    }

    private CategoryDataDataAnalysis(Name alias, Table<CategoryDataDataAnalysisRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CATEGORY_DATA_DATA_ANALYSIS__60ADDED_TIME_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60CATEGORY_DATA_ID_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60MAXIMUMSALES_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60REQUEST_CODE_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60SYNC_CODE_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60SYSTEM_DELETE_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS__60WISH_CATEGORY_ID_60, Indexes.CATEGORY_DATA_DATA_ANALYSIS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryDataDataAnalysisRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_DATA_DATA_ANALYSIS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryDataDataAnalysisRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryDataDataAnalysisRecord>>asList(Keys.KEY_CATEGORY_DATA_DATA_ANALYSIS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryDataDataAnalysis as(String alias) {
        return new CategoryDataDataAnalysis(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryDataDataAnalysis as(Name alias) {
        return new CategoryDataDataAnalysis(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryDataDataAnalysis rename(String name) {
        return new CategoryDataDataAnalysis(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryDataDataAnalysis rename(Name name) {
        return new CategoryDataDataAnalysis(name, null);
    }
}
