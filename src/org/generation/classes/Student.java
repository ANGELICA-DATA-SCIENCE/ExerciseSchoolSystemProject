package org.generation.classes;

public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       public Student(String firstName, String lastName, int registration, int grade, int year) {
    	   this.firstName = firstName.toUpperCase();
    	   this.lastName = lastName.toUpperCase();
    	   this.registration = registration;
    	   this.grade = grade;
    	   this.year = year;
       }//Student - constructor1:imprime todos los parametros dados
       
       public Student(String firstName, String lastName, int registration) {
    	   this(firstName, lastName,registration, 1, 1);
       }//Student - constructor2: imprimer solo nombre, apellido y matricula
       
       public Student() {
    	   this("Alan", "Castillo", 106,93,2);
       }//Student - constructor3 - sin parametros cuyos valores son por default
       
       
       //metodo para imprimir el nombre completo
       public void printFullName() {
    	   System.out.println(this.firstName + " " + this.lastName);
       }//metodo printFullName
       
       
       //metodo para indicar si el estudiante esta aprobado
	   	public boolean isApproved() {
			// TODO Auto-generated method stub
			return this.grade >=60;
		}
       
       //metodo para avanzar de año si está aprobado
       public int changeYearIfApproved() {
    	 //TODO implement: the student should advance to the next year if he/she grade is >= 60
           // Make year = year + 1, and print "Congragulations" if the student has been approved
    	   if(isApproved()) {
    		   this.year += 1;
    		   System.out.println("¡Felicidades, pasaste al siguiente grado!");
    	   }//if
    	   return this.year;
       }


       
}//class student
