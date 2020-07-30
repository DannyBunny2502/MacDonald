package com.example.blws.domain;

import java.sql.Date;


public class EmpVO {
	private String ordrCode;
	private String ordrStatCode;
	private String ordrExptTime;
	private String ordrMenu;
	private String ordrPrice;
	private Date rgstDt;
	private String rgstUser;
	private Date updtDt;
	private String updtUser;
	public String getOrdrCode() {
		return ordrCode;
	}
	public void setOrdrCode(String ordrCode) {
		this.ordrCode = ordrCode;
	}
	public String getOrdrStatCode() {
		return ordrStatCode;
	}
	public void setOrdrStatCode(String ordrStatCode) {
		this.ordrStatCode = ordrStatCode;
	}
	public String getOrdrExptTime() {
		return ordrExptTime;
	}
	public void setOrdrExptTime(String ordrExptTime) {
		this.ordrExptTime = ordrExptTime;
	}
	public String getOrdrMenu() {
		return ordrMenu;
	}
	public void setOrdrMenu(String ordrMenu) {
		this.ordrMenu = ordrMenu;
	}
	public String getOrdrPrice() {
		return ordrPrice;
	}
	public void setOrdrPrice(String ordrPrice) {
		this.ordrPrice = ordrPrice;
	}
	public Date getRgstDt() {
		return rgstDt;
	}
	public void setRgstDt(Date rgstDt) {
		this.rgstDt = rgstDt;
	}
	public String getRgstUser() {
		return rgstUser;
	}
	public void setRgstUser(String rgstUser) {
		this.rgstUser = rgstUser;
	}
	public Date getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(Date updtDt) {
		this.updtDt = updtDt;
	}
	public String getUpdtUser() {
		return updtUser;
	}
	public void setUpdtUser(String updtUser) {
		this.updtUser = updtUser;
	}
	
}
