package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

	public class Courses {
		String courseName;
		String profName;
		int year;
		List<Student> students;
	
	public Courses(String courseName, String profName, int year){
		this.courseName = courseName;
		this.profName = profName;
		this.year = year;
		this.students = new ArrayList<>();
	}//constructor - Course
	

	//metodo para inscribir a un estudiante
	public void enroll(Student student){
	      students.add(student);
	   }//enroll
	
	//sobrecarga del metodo inscribir para el array de estudiantes
	public void enroll(Student[] studentsArray) {
		for(Student student : studentsArray) {
			enroll(student);
		}//for
	}//enroll array
	
	//metodo para desmatricular a un estudiante
	public void unEnroll(Student student){
	       //TODO remove this student from the collection
	   // Hint: check if that really is this student
		students.removeIf(stud -> stud.registration == student.registration);
	}//metodo unEnroll
	
	
	//metodo para contar los estudiantes inscritos
	public int countStudents(){
	       return students.size();
	}//metodo countStudents
	
	
	//metodo para encontrar la mejor calificacion
	public int bestGrade(){
	       int mejorgrade = 0;
	       for (Student student : students) {
	    	   if(student.grade > mejorgrade) {
	    		   mejorgrade = student.grade;
	    	   }//if
	       }//for
	       return mejorgrade;
	}//metodo bestGrade
	
	
	//metodo para calcular la calificacion promedio
	public double averageGrade() {
		int totalGrade = 0;
		for (Student student : students) {
			totalGrade += student.grade;
		}
		return students.size() == 0 ? 0 : (double) totalGrade / students.size();
	}//metodo averangeGrade


	public void showRanking() {
		// TODO Auto-generated method stub
		students.sort((s1, s2) -> s2.grade - s1.grade);  //sort(); ordena de manera descendente la calificación
		for(Student student : students) {
			System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
		}//for
	}//metodo showRanking

	//metodo para comparar la calificacion de cada estudiante respecto al promedio
	public void compareWithAverage() {
		// TODO Auto-generated method stub
		double average = averageGrade();
		for(Student student : students) {
			String status = student.grade >= average ? "por encima " : "por debajo ";
			System.out.println(student.firstName + " " + student.lastName + " " + "está " + status + " del promedio. ");
		}//for
		
	}//metodo compareWithAverage
}//class courses
