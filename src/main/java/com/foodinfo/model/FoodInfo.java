package com.foodinfo.model;

import java.io.Serializable;
import java.util.Date;

public class FoodInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String imageId;

    private String foodDescribe;

    private String foodAddress;

    private Byte foodStatus;

    private Byte dataState;

    private String userId;

    private String procurementUserId;

    private Date createDate;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    public String getFoodDescribe() {
        return foodDescribe;
    }

    public void setFoodDescribe(String foodDescribe) {
        this.foodDescribe = foodDescribe == null ? null : foodDescribe.trim();
    }

    public String getFoodAddress() {
        return foodAddress;
    }

    public void setFoodAddress(String foodAddress) {
        this.foodAddress = foodAddress == null ? null : foodAddress.trim();
    }

    public Byte getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(Byte foodStatus) {
        this.foodStatus = foodStatus;
    }

    public Byte getDataState() {
        return dataState;
    }

    public void setDataState(Byte dataState) {
        this.dataState = dataState;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProcurementUserId() {
        return procurementUserId;
    }

    public void setProcurementUserId(String procurementUserId) {
        this.procurementUserId = procurementUserId == null ? null : procurementUserId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
