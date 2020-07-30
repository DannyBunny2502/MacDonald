package com.example.blws.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
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
}
