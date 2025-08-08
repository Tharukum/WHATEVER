package mainapp;

import model.Student;
import model.Course;
import services.EnrollmentManager;

import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		EnrollmentManager enrollmentManager = new EnrollmentManager();
		
		
		do {
		System.out.println("Menu");
		System.out.println("1.Enroll");
		System.out.println("2.List");
		System.out.println("3.Search");
		System.out.println("4.Exit");
		System.out.print("Enter no of your choice and -1 to Exit ");
		
		int n=scan.nextInt();
		scan.nextLine();
		
		switch(n) {
			case 1: 
			enrollmentManager.enrollStudent();
			break;
			
			case 2:
			enrollmentManager.listStudents();
			break;
			
			case 3:
			System.out.println("Enter Student ID to search for");
			String id=scan.nextLine();
			Student found=enrollmentManager.searchStudentById(id);
			if (found != null) {
				System.out.println("Student found: " + found);
			} 
			else {
				System.out.println("Student not found.");
			}
			break;
			
			case 4:return;
			
			default:
                    System.out.println("Invalid choice");
					break;
            }
		} while(n!=-1);
		}
}