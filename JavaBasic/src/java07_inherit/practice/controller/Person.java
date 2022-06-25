package java07_inherit.practice.controller;

public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weitght;


	public Person() {

	}
	public Person(String name, int age, int height, int weitght) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weitght = weitght;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeitght() {
		return weitght;
	}
	public void setWeitght(int weitght) {
		this.weitght = weitght;
	}


}