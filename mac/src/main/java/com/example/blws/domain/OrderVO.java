package com.example.blws.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data

public class OrderVO {

	private String ordrCode; 
	private String ordrStatCode; 
	private String ordrExptTime; 
	private String ordrMenu; 
	private String ordrPrice;
	private Date rgstDt; 
	private String rgstUser; 
	private Date updtDt; 
	private String updtUser;
	
}



