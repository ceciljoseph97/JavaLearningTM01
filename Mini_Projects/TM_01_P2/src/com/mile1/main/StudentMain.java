/*You need to implement a Student grade calculation system 
 * in Java. Here, data is available in an array of objects. 
 * If the given object has any data errors, then, the program has 
 * to return appropriate error messages. On the other hand, 
 * if given object has no validation errors, then, 
 * we need to find the grade and print the same.*/
package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student sData[] = new Student[10];
	
	static {
		for (int i = 0; i < sData.length; i++) 
			sData [i]= new Student(); 
		
		sData [0] = new Student("Sekar", new int[] {35, 35, 35});
		sData [1] = new Student(null, new int[] {11, 22, 33});
		sData [2] = null;
		sData [3] = new Student("Manoj", null);
		sData [4] = new Student("John", new int[] {90, 92, 80}); 
		sData [5] = new Student("Bob", new int[] {35, 40, 50}); 
		sData [6] = new Student("Alice", new int[] {25, 29, 28}); 
		sData [7] = null; // TC4
		sData [8] = new Student(null, new int[] {25, 29, 28}); 
		sData [9] = new Student("Arnold", null); 
	}
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		System.out.println("Grade Calculation:");
		String x = null;
		
		for (int i = 0; i < sData.length; i++)  {
			try {
				x = studentReport.validate(sData[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentException e) {
				x = "NullStudentException occured";
			}
			System.out.println("GRADE = " + x);
		}
		System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfNullMarks(sData));
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(sData));
		System.out.println("number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(sData));
		System.out.println("number of Objects with Name as null = " +
				studentService.findNumberOfNullNames(sData));		
		System.out.println("Number of Objects that are entierly null = " +
				studentService.findNumberOfNullObjects(sData));
		System.out.println("number of Objects with Marks array as null = " +
				studentService.findNumberOfNullMarks(sData));
	}

}
