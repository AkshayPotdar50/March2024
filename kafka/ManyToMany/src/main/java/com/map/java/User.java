package com.map.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name="User_Name")
	private String name;
	@Column(name="User_Email")
	private String email;
	
	//Mapping of user to Nominee pojo
	@ManyToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
	private List<Nominee> nomineeList = new ArrayList<Nominee>();
	
	public List<Nominee> getNomineeList() {
		return nomineeList;
	}
	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}