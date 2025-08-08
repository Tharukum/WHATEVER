package Services;

import model.Student;
import model.Course;

import java.util.Scanner;

public class EnrollmentManager {
	private Student[] student = new Student[100];
    private Course[] course = new Course[100];
    private int studentCount = 0;
    private Scanner scan = new Scanner(System.in);

	public void enrollStudent() {
			
		System.out.println("Enter Student ID");
		String id=scan.nextLine();
				
		System.out.println("Enter Student Name");
		String name=scan.nextLine();
				
		System.out.println("Enter Course Code");
		String code=scan.nextLine();
				
		System.out.println("Enter Course Title");
		String title=scan.nextLine();
				
		student[studentCount] = new Student(id, name);
		course[studentCount]= new Course(code,title);
				
		studentCount++;
		
		System.out.println("Student enrolled");
	}
	
	public void sortStudentsByName(Student[] student, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (student[j].getName().compareToIgnoreCase(student[j + 1].getName()) > 0) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
    }
	
	public void listStudents() {
		sortStudentsByName(students, studentCount);
		 
		for(int i=0;i<studentCount;i++) {
		
			System.out.println(student[i].toString() + " " + course[i].toString());
		}
	}
	
	
	public Student searchStudentById(String id) {
		
		for(int i=0;i<studentCount;i++) {
			if(student[i].getId().equals(id)) {
				return student[i];
			}
		}
		return null;
	}
	
	
}
