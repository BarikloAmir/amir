package com.company;

public class Run{

    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std0 = new Student("Ehsan0", "Edalat0", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        //std1.print();
        std1.setGrade(15);
        //std1.print();
        //std2.print();
        std2.setGrade(11);
        //std2.print();
        //std3.print();
        std3.setFirstName("HamidReza");
        //System.out.println(std3.getFirstName());
        std3.setLastName("bariklo");
        //std3.print();
        Lab lab0=new Lab(5,"sunday","amiry");
        lab0.enrollStudent(std3);
        lab0.enrollStudent(std1);
       // lab0.print();
        //lab0.setStudents(std1,"amir","zand","909090",5);
        //lab0.removeStudent(std1);
        //lab0.getStudents();
/**
        System.out.println(lab0.getAvg());
        lab0.setDay("monday");
        lab0.setCapacity(6);
        System.out.println(lab0.getDay());
        System.out.println(lab0.getCapacity());
 */
        Lab lab1 = new Lab(6,"monday","assadi");
        lab1.enrollStudent(std2);
        CAgroup group1= new CAgroup(3,"zarandi");
        group1.enrollLabs(lab0);
        group1.enrollLabs(lab1);
        group1.print();
    }
}
