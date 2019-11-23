package com.ilaiyaraja.datastructure;

public class Student {
	
	private int id = 0;
	private int age = 0;
	private String name = null;
	
	public Student() {
		
	}
	
	public Student(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}
