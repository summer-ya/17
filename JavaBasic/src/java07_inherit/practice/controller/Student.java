package java07_inherit.practice.controller;

public class Student extends Person {
	private String studentID;
	private int grade;
	private double GPA;





	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Student() {

	}

	public Student(String studentID, int grade, int age, int height, int weight, String name) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;


	}
	public void show() {
		System.out.println("---------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학번 : " +  getStudentID());
		System.out.println("학년 : " +  getGrade());


	}


}
