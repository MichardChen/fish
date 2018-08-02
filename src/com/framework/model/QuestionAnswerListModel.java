package com.framework.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class QuestionAnswerListModel implements Serializable{

	private Integer id;
	//
	private String question;
	//
	private String answer;
	//
	private String createBy;
	//
	private String updateBy;
	//
	private String createTime;
	//
	private String updateTime;
	//
	private String type;
	private String flg;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public String getCreateBy() {
		return createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public String getCreateTime() {
		return createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public String getFlg() {
		return flg;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public void setFlg(String flg) {
		this.flg = flg;
	}
	
	
	
	
}
