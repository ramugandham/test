package com.rameshsoft.automation.seleniumcore;

public class PojoTest {
	
private int courseId;
private String instName;

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public void setInstName(String instName) {
	this.instName = instName;
}
public int getCourseId() {
	return courseId;
}
public String getInstName() {
	return instName;
}
public static void main(String[] args) {
	PojoTest t = new PojoTest();
	t.setCourseId(123);
	t.setInstName("RAMESHSOFT");	
	System.out.println(t.getCourseId());
	System.out.println(t.getInstName());
}
}








 