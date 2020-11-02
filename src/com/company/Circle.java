package com.company;

public class Circle extends Shape{
    //radius of circle
    private int radius;

    /**
     * constructor
     * @param radius
     */
    public Circle(int radius){
        this.radius = radius;
        setType("circle");
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 6.28*radius;
        setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double area = 3.14*radius*radius;
        setArea(area);
    }

    @Override
    public String toString() {
        String output =getType()+"\n"+
        "radius: "+radius;
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        if(other.getRadius() == this.getRadius())
            return true;
        else
            return false;
    }

    /**
     *getter of radius
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * setter of radius
     * @param radius set radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
