package org.generation;

import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		//estudiantes   
		Student student01 = new Student("Cesar","Coronado", 001, 78, 2);
		Student student02 = new Student("Arturo", "Salas", 002, 85, 3);
		Student student03 = new Student("Zaira", "López", 003, 96, 2);
		Student student04 = new Student("Francisco", "González", 004, 59, 3);
		Student student05 = new Student("Ximena", "Ortega", 005, 69, 2);
		
		//cursos
		Courses course = new Courses("Biology", "Dr.Enrique", 2024);
		
		//inscribir estudiantes de manera individual
		course.enroll(student01);
		course.enroll(student02);
		
		//inscribir un array de estudiantes
		Student[] studentsArray = {student03, student05};
		course.enroll(studentsArray);
		
		//imprime el nuemro de estudiantes
		System.out.println("Total de estudiantes: "+ course.countStudents());
		
		
		//imprime la mejor calificacion 
		System.out.println("Mejor calificación: " + course.bestGrade());
		
		//imprime el rankinf de estudiantes
		System.out.println("Ranking de estudiante: ");
		course.showRanking();
		
		//comparar a cada estudiante con su promedio de las calificaciones
		System.out.println("Comparación con el promedio de las calificaciones; ");
		course.compareWithAverage();
		
		
		
		
	}//main

}//class Main
