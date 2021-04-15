package com.callor.score.domain;
/*
 * model이 아니라 domain이라고 쓰기도 함
 */
public class StudentVO {

	private String num;
	private String name;
	private String grade;
	private String dept;
	private String address;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentInfo [학번=" + num + ", 이름=" + name + ", 학년=" + grade + ", 학과=" + dept + ", 주소="
				+ address + "]"; // toString을 출력했을 때 보기 편함
	}
	
	
}
