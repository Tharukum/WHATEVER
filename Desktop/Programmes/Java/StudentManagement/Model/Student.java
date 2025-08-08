package model;

public class Student {
	
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
	/**
 * Returns the ID of the student.
 */
    public String getId() {
		
		return id;
	}
		/**
 * Returns the ID of the student.
 */

	public String getName() {
		
		return name;
	}
	
	public String toString() {
		return "Student " + name + ",Student ID " +id;
	}
	
	
}