package com.example.sample001.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "app_orderlist") //テーブル名記載
public class AppOrderList {
	
	//発注フォーム
	//主キー
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long primary_id;
    @Column(name = "parts_id", nullable = false)
    private String parts_id;
    @Column(name = "parts_count", nullable = false)
    private int parts_count;
    @Column(name = "parts_day", nullable = false)
    private Date parts_day;
    @Column(name = "parts_comment", nullable = false)
    private String parts_comment;
    //--getとsetの定義
    public Long getPrimary_id() {
    	return primary_id;
    }
    public void setPrimary_id(Long primary_id) {
    	this.primary_id = primary_id;
    }
    public String getParts_id() {
    	return parts_id;
    }
    public void setParts_id(String parts_id) {
    	this.parts_id = parts_id;
    }
    public int getParts_count() {
    	return parts_count;
    }
    public void setParts_count(int parts_count) {
    	this.parts_count = parts_count;
    }
    public Date getParts_day() {
    	return parts_day;
    }
    public void setParts_day(Date parts_day) {
    	this.parts_day = parts_day;
    }
    public String getParts_comment() {
    	return parts_comment;
    }
    public void setParts_comment(String parts_comment) {
    	this.parts_comment = parts_comment;
    }
}
