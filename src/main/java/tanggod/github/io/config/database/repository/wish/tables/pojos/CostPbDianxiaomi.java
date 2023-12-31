/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class CostPbDianxiaomi implements Serializable {

    private static final long serialVersionUID = -253389193;

    private String  id;
    private String  活动id;
    private String  活动名称;
    private String  店铺;
    private Double  预算;
    private Double  费用;
    private Integer 付费流量;
    private Integer 订单;
    private Double  成交总额;
    private String  花费成交比;
    private String  费用预算比;
    private String  开始时间;
    private String  结束时间;
    private String  活动状态;
    private String  批次时间;

    public CostPbDianxiaomi() {}

    public CostPbDianxiaomi(CostPbDianxiaomi value) {
        this.id = value.id;
        this.活动id = value.活动id;
        this.活动名称 = value.活动名称;
        this.店铺 = value.店铺;
        this.预算 = value.预算;
        this.费用 = value.费用;
        this.付费流量 = value.付费流量;
        this.订单 = value.订单;
        this.成交总额 = value.成交总额;
        this.花费成交比 = value.花费成交比;
        this.费用预算比 = value.费用预算比;
        this.开始时间 = value.开始时间;
        this.结束时间 = value.结束时间;
        this.活动状态 = value.活动状态;
        this.批次时间 = value.批次时间;
    }

    public CostPbDianxiaomi(
        String  id,
        String  活动id,
        String  活动名称,
        String  店铺,
        Double  预算,
        Double  费用,
        Integer 付费流量,
        Integer 订单,
        Double  成交总额,
        String  花费成交比,
        String  费用预算比,
        String  开始时间,
        String  结束时间,
        String  活动状态,
        String  批次时间
    ) {
        this.id = id;
        this.活动id = 活动id;
        this.活动名称 = 活动名称;
        this.店铺 = 店铺;
        this.预算 = 预算;
        this.费用 = 费用;
        this.付费流量 = 付费流量;
        this.订单 = 订单;
        this.成交总额 = 成交总额;
        this.花费成交比 = 花费成交比;
        this.费用预算比 = 费用预算比;
        this.开始时间 = 开始时间;
        this.结束时间 = 结束时间;
        this.活动状态 = 活动状态;
        this.批次时间 = 批次时间;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get活动id() {
        return this.活动id;
    }

    public void set活动id(String 活动id) {
        this.活动id = 活动id;
    }

    public String get活动名称() {
        return this.活动名称;
    }

    public void set活动名称(String 活动名称) {
        this.活动名称 = 活动名称;
    }

    public String get店铺() {
        return this.店铺;
    }

    public void set店铺(String 店铺) {
        this.店铺 = 店铺;
    }

    public Double get预算() {
        return this.预算;
    }

    public void set预算(Double 预算) {
        this.预算 = 预算;
    }

    public Double get费用() {
        return this.费用;
    }

    public void set费用(Double 费用) {
        this.费用 = 费用;
    }

    public Integer get付费流量() {
        return this.付费流量;
    }

    public void set付费流量(Integer 付费流量) {
        this.付费流量 = 付费流量;
    }

    public Integer get订单() {
        return this.订单;
    }

    public void set订单(Integer 订单) {
        this.订单 = 订单;
    }

    public Double get成交总额() {
        return this.成交总额;
    }

    public void set成交总额(Double 成交总额) {
        this.成交总额 = 成交总额;
    }

    public String get花费成交比() {
        return this.花费成交比;
    }

    public void set花费成交比(String 花费成交比) {
        this.花费成交比 = 花费成交比;
    }

    public String get费用预算比() {
        return this.费用预算比;
    }

    public void set费用预算比(String 费用预算比) {
        this.费用预算比 = 费用预算比;
    }

    public String get开始时间() {
        return this.开始时间;
    }

    public void set开始时间(String 开始时间) {
        this.开始时间 = 开始时间;
    }

    public String get结束时间() {
        return this.结束时间;
    }

    public void set结束时间(String 结束时间) {
        this.结束时间 = 结束时间;
    }

    public String get活动状态() {
        return this.活动状态;
    }

    public void set活动状态(String 活动状态) {
        this.活动状态 = 活动状态;
    }

    public String get批次时间() {
        return this.批次时间;
    }

    public void set批次时间(String 批次时间) {
        this.批次时间 = 批次时间;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CostPbDianxiaomi (");

        sb.append(id);
        sb.append(", ").append(活动id);
        sb.append(", ").append(活动名称);
        sb.append(", ").append(店铺);
        sb.append(", ").append(预算);
        sb.append(", ").append(费用);
        sb.append(", ").append(付费流量);
        sb.append(", ").append(订单);
        sb.append(", ").append(成交总额);
        sb.append(", ").append(花费成交比);
        sb.append(", ").append(费用预算比);
        sb.append(", ").append(开始时间);
        sb.append(", ").append(结束时间);
        sb.append(", ").append(活动状态);
        sb.append(", ").append(批次时间);

        sb.append(")");
        return sb.toString();
    }
}
