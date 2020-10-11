package com.company;

import java.util.ArrayList;

public class Lab {
    //list of students in lab
    private ArrayList<Student> students = new ArrayList<Student>();
    //average of student grade
    private float avg;
    //day of labClasses
    private String day;
    //capacity of labClass
    private int capacity;
    //number of labClass students
    private int currentSize;
    //name of teacher
    private String teacher;

    /**
     *
     * @param cap set the capacity of class (cap must be less than 15 and >0 )
     * @param d set the day of classDay
     */
    public Lab(int cap, String d,String teacher) {
        this.teacher=teacher;
        day=d;
        capacity=cap;
        currentSize=0;
        avg=0;
    }

    /**
     *
     * @param std add student (std) to students in labClass
     *            if currentSize less than or equal capacity
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students.add(std);
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * this method printing the inforamation of lab class , thats studens and
     * numbers of them
     */
    public void print() {
        System.out.println("name of teacher lab: "+teacher);
        System.out.println("    capacity:"+capacity+" and "+"CurrentSize:"+currentSize);
        System.out.println("    day:"+day);
        calculateAvg();
        System.out.println("    average:"+avg);
        System.out.println("    list of student (sorting with time of students register):");
        for(int i=0 ; i<students.size() ; i++){
            students.get(i).print(); }

    }

    /**
     * this method give us information ot lab students calss
     */
    public void getStudents() {
        for(int i=0 ; i<students.size() ; i++)
            students.get(i).print();
    }

    /**
     * this method can chaging the information of class student
     * @param student  change information of them
     * @param firstname new firstname
     * @param lastname new lastname
     * @param studentID new id
     * @param grade new grade
     */
    public void setStudents( Student student,String firstname ,String lastname,String studentID,float grade) {
        if(students.contains(student)){
            student.setLastName(lastname);
            student.setFirstName(firstname);
            student.setId(studentID);
            student.setGrade(grade);}
        else
            System.out.println("student is not for this class");
   }
   public void removeStudent(Student student){
        if(students.contains(student))
            students.remove(student);
        else
            System.out.println("student is not for this class");
   }

    /**
     *
     * @return average of lab students grades
     */
    public float getAvg() {
        calculateAvg();
        return avg;}

    /**
     * calculate the average of lab students grades
     */
    private void calculateAvg() {
        for (int i=0 ; i<students.size() ; i++)
            avg+=students.get(i).getGrade();
        avg/=students.size();
    }

    /**
     *
     * @return class day
     */
    public String getDay() {return  day;}

    /**
     *
     * @param day set the day of class
     */
    public void setDay(String day) { this.day=day;}
    /**
     * @return capacity of class
     */
    public int getCapacity() {return capacity;}

    /**
     *
     * @param capacity set the class capacity
     */
    public void setCapacity(int capacity) {this.capacity=capacity;}

    /**
     * @param teacher set the name of teacher
     */
    public void setTeacher(String teacher){this.teacher=teacher;}



}
