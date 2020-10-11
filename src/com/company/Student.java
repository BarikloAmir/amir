package com.company;
/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author AmirHoseinBariklo
 * @version 0.0
 */

public class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    //the grade
    private float grade;


    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lname last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    /**
     * get the first name of student
     *
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param newName  set first name of a student
     */
    public void setFirstName(String newName) { firstName = newName; }

    /**
     * get the lastName of student
     * @return lastName field
     */
    public String getLastName(){ return lastName; }

    /**
     * @param lname set lastName of a student
     */
    public void setLastName(String lname) { lastName = lname; }

    /**
     * get the id of student
     * @return id field
     */
    public String getId() { return id; }

    /**
     * @param newid set Id of student
     */
    public void setId(String newid) { id= newid; }

    /**
     * get the grade of student
     * @return grade field
     */
    public float getGrade(){return grade;}

    /**
     * @param newGrade set the grade of student
     */
    public void setGrade(float newGrade) {
        grade = newGrade;
    }


    /**
     * Print the student’s last name and ID number to the
     * output terminal.
     */
    public void print() {
        System.out.println("        "+firstName+" "+lastName + ", student ID: "
                + id + ", grade: " + grade);
    }
}
