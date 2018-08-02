package com.framework.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;



/**
 * 
 * 
 * @author R & D
 * @email 908350381@qq.com
 * @date 2018-05-22 14:40:17
 */
public class TQuestionAnswerEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String question;
	//
	private String answer;
	//
	private Integer createBy;
	//
	private Integer updateBy;
	//
	private Timestamp createTime;
	//
	private Timestamp updateTime;
	
	private String typeCd;
	//
	private Integer flg;
	
	public String getTypeCd() {
		return typeCd;
	}
	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public Integer getCreateBy() {
		return createBy;
	}
	public Integer getUpdateBy() {
		return updateBy;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public Integer getFlg() {
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
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public void setFlg(Integer flg) {
		this.flg = flg;
	}

	
	
}
