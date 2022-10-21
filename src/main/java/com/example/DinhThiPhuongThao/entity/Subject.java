package com.example.DinhThiPhuongThao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject {
	@Id
	private String SubId;
	private String Name;
	private String Credit;
	public String getSubId() {
		return SubId;
	}
	public void setSubId(String subId) {
		SubId = subId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public Subject(String subId, String name, String credit) {
		super();
		SubId = subId;
		Name = name;
		Credit = credit;
	}
	public Subject() {
		super();
	}
	public Subject(String subId) {
		super();
		SubId = subId;
	}
	@Override
	public String toString() {
		return "Subject [SubId=" + SubId + ", Name=" + Name + ", Credit=" + Credit + "]";
	}
	
	

}
