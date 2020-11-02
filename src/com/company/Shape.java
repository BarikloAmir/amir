package com.company;

public class Shape {
    //perimeter of shape
    private double perimeter;
    //area of shape
    private double area;
    //type of shape
    private String type;

    /**
     * constructor
     */
    public Shape(){ }

    /**
     * this method calculate perimeter of shape
     */
    public void calculatePerimeter(){ }

    /**
     * this method calculate area of shape
     */
    public void calculateArea(){ }


    /**
     * printing type and perimeter and area of shape
     */
    public void draw(){
        System.out.println("type : "+type+"\n"+"    perimeter : "+perimeter+"\n"+
                "    area :"+area);
    }

    /**
     *
     * @return type and sides or radius of in the string
     */
    public String toString(){
        return null;
    }

    //setters and getters

    public void setType(String type) {
        this.type = type;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String getType() {
        return type;
    }

    public boolean isEquilateral(){
        return false;
    }

    public boolean isSquare(){
        return false;
    }
}
