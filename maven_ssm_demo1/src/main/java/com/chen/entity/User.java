package com.chen.entity;

public class User {
	private String name;
	private String password;
	private int id;
	public User(String name,String password) {
		// TODO Auto-generated constructor stub
		setName(name);
		setPassword(password);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "user [id:"+id+",name:"+name+",password:"+password+"]";
	}
}
