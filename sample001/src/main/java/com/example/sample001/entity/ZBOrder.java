package com.example.sample001.entity;


public class ZBOrder {
	private int partsNumber;
	private String partsModel;
	private String deliveryDate;
	private String memo;
	private String orderedUser;
	private boolean deliveryStatus;
	
	public ZBOrder(int partsNumber, String partsModel, String deliveryDate, String memo, String orderedUser,
			boolean deliveryStatus) {
		this.partsNumber = partsNumber;
		this.partsModel = partsModel;
		this.deliveryDate = deliveryDate;
		this.memo = memo;
		this.orderedUser = orderedUser;
		this.deliveryStatus = deliveryStatus;
	}
	
	public int getPartsNumber() {
		return partsNumber;
	}
	public void setPartsNumber(int partsNumber) {
		this.partsNumber = partsNumber;
	}
	public String getPartsModel() {
		return partsModel;
	}
	public void setPartsModel(String partsModel) {
		this.partsModel = partsModel;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getOrderedUser() {
		return orderedUser;
	}
	public void setOrderedUser(String orderedUser) {
		this.orderedUser = orderedUser;
	}
	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	
}
