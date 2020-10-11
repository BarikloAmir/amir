package com.company;

import java.util.ArrayList;

public class CAgroup {
    //labs is list of lab class in CAgroup
    private ArrayList <Lab> labs =new ArrayList <Lab>();
    //numbers of lab class
    private int n_labs;
    //now number of labs
    private int now_n_labs;
    //name of CAgroup teacher
    private String teacher;

    /**
     *
     * @param n_labs is number of labs and must be less than 7 and >=0
     */
    public CAgroup (int n_labs,String teacher) {
        this.teacher=teacher;
        this.n_labs=n_labs;
        now_n_labs=0;
    }

    /**
     *
     * @param lab adding to group of CAgorup if we have capacity
     */

    public void enrollLabs(Lab lab) {
        if (now_n_labs < n_labs) {
            labs.add(lab);
            now_n_labs++;
        } else {
            System.out.println("groups Lab is full!!!");
        }
    }

    /**
     * printin the iformation of CAgorup(Labs)
     */
    public void print() {
        System.out.println("name of CAgroup teacher: "+teacher);
        System.out.println("labs capacity:"+n_labs+" and "+"now number of labs:"+now_n_labs);
        System.out.println("list of lab class :");
        for(int i=0 ; i<labs.size() ; i++){
            labs.get(i).print();
            System.out.println();}

    }

    /**
     *
     * @param n_labs set the number of
     */
    public void setN_labs(int n_labs) {
        this.n_labs = n_labs;
    }

    /**
     *
     * @return number of labs
     */
    public int getN_labs (){return  n_labs;}

    /**
     *
     * @param teacher set name of teacher
     */
    public void setTeacher(String teacher){this.teacher=teacher; }

    /**
     *
     * @return name of teacher
     */
    public String getTeacher(){return  teacher;}

    /**
     * printing labs iformation
     */
    public void getLabs(){
        for(int i=0 ; i<labs.size() ; i++)
            labs.get(i).print();
    }

    /**
     *
     * @param lab is the lab that we want to set it or change thats information
     * @param day is the lab class day
     * @param capacity is the capacity of class
     * @param teacher is the teacher of class
     */
    public void setLabs(Lab lab,String day,int capacity,String teacher){
        if(labs.contains(lab)){
            lab.setCapacity(capacity);
            lab.setDay(day);
            lab.setTeacher(teacher);}
        else
            System.out.println("lab is not in CAgroup");
        }
}


