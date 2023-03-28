package com.firstdemo3;

public class student3 {
int studentid;
String studentName;
int studentMarks;




public static void main(String[] args) {
	student3 s3=new student3();
s3.setStudentid(1);
s3.setStudentName("komal");
System.out.println("s3==="+s3);
System.out.println("Name===="+s3.getStudentName());
}




@Override
public String toString() {
	return "student3 [studentid=" + studentid + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
}




public int getStudentid() {
	return studentid;
}




public void setStudentid(int studentid) {
	this.studentid = studentid;
}




public String getStudentName() {
	return studentName;
}




public void setStudentName(String studentName) {
	this.studentName = studentName;
}




public int getStudentMarks() {
	return studentMarks;
}




public void setStudentMarks(int studentMarks) {
	this.studentMarks = studentMarks;
}






}
