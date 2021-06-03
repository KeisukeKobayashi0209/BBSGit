package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Threads {
	
	private Integer id;
	private String title;
	private Date now_date;
	private Integer user_id;

}
