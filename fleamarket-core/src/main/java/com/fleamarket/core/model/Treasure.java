package com.fleamarket.core.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Treasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer uid;

    private String title;

    private String description;

    /**
     * 主图
     */
    private String picture;

    private Integer category;

    private String location;

    private Double price;

    private Double fare;

    private Double total;

    /**
     * 【售卖类型】1：正常、2：秒杀
     */
    @Column(name = "sell_type")
    private Integer sellType;

    /**
     * 【出售状态】0：下架、1：在售、2：已售出
     */
    private Integer status;
    /**
     * 交易方式
     */
    @Column(name = "trading_method")
    private String tradingMethod;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "star_count")
    private Integer starCount;

    @Column(name = "comment_count")
    private Integer commentCount;

    @Column(name = "view_count")
    private Integer viewCount;

    @Column(name = "new_degree")
    private String newDegree;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取主图
     *
     * @return picture - 主图
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置主图
     *
     * @param picture 主图
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return fare
     */
    public Double getFare() {
        return fare;
    }

    /**
     * @param fare
     */
    public void setFare(Double fare) {
        this.fare = fare;
    }

    /**
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * 获取【售卖类型】1：正常、2：秒杀
     *
     * @return sell_type - 【售卖类型】1：正常、2：秒杀
     */
    public Integer getSellType() {
        return sellType;
    }

    /**
     * 设置【售卖类型】1：正常、2：秒杀
     *
     * @param sellType 【售卖类型】1：正常、2：秒杀
     */
    public void setSellType(Integer sellType) {
        this.sellType = sellType;
    }

    /**
     * 获取【出售状态】0：下架、1：在售、2：已售出
     *
     * @return status - 【出售状态】0：下架、1：在售、2：已售出
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置【出售状态】0：下架、1：在售、2：已售出
     *
     * @param status 【出售状态】0：下架、1：在售、2：已售出
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(String tradingMethod) {
        this.tradingMethod = tradingMethod;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return like_count
     */
    public Integer getStarCount() {
        return starCount;
    }

    /**
     * @param starCount
     */
    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    /**
     * @return comment_count
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * @return new_degree
     */
    public String getNewDegree() {
        return newDegree;
    }

    /**
     * @param newDegree
     */
    public void setNewDegree(String newDegree) {
        this.newDegree = newDegree;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", fare=" + fare +
                ", total=" + total +
                ", sellType=" + sellType +
                ", status=" + status +
                ", tradingMethod=" + tradingMethod +
                ", createTime=" + createTime +
                ", starCount=" + starCount +
                ", commentCount=" + commentCount +
                ", newDegree='" + newDegree + '\'' +
                '}';
    }
}