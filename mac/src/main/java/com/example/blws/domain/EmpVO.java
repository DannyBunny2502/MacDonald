package com.example.blws.domain;

import java.sql.Date;

public class EmpVO {
	private String emp_code;
	private String pstn_code;
	private String emp_name;
	private String emp_id;
	private String emp_passwd;
	private Date rgst_dt;
	private String rgst_user;
	private Date updt_dt;
	private String updt_user;
	
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public String getPstn_code() {
		return pstn_code;
	}
	public void setPstn_code(String pstn_code) {
		this.pstn_code = pstn_code;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_passwd() {
		return emp_passwd;
	}
	public void setEmp_passwd(String emp_passwd) {
		this.emp_passwd = emp_passwd;
	}
	public Date getRgst_dt() {
		return rgst_dt;
	}
	public void setRgst_dt(Date rgst_dt) {
		this.rgst_dt = rgst_dt;
	}
	public String getRgst_user() {
		return rgst_user;
	}
	public void setRgst_user(String rgst_user) {
		this.rgst_user = rgst_user;
	}
	public Date getUpdt_dt() {
		return updt_dt;
	}
	public void setUpdt_dt(Date updt_dt) {
		this.updt_dt = updt_dt;
	}
	public String getUpdt_user() {
		return updt_user;
	}
	public void setUpdt_user(String updt_user) {
		this.updt_user = updt_user;
	}
	
}
