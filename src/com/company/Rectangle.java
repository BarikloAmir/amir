package com.company;

public class Rectangle extends Polygon {


































































    /**
     * constructor
     * @param sides_input
     */
    public Rectangle(int... sides_input ){
        super(sides_input);
        setType("rectangle");
    }

    @Override
    public void calculateArea(){
        double area = getSides().get(0)*getSides().get(1);
        setArea(area);}


    @Override
    public String toString() {
        String output = getType()+"\n"
                +"side1 :"+getSides().get(0)+"\n"+
                "side2 :"+getSides().get(1);
        return output;
    }

    /**
     *
     * @return true if triangle be equilateral
     */
    @Override
    public boolean isSquare(){
        if(getSides().get(0) == getSides().get(1))
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        if(!(other.getType().equals(this.getType())))
            return false;
        if(!(other.getArea() == this.getArea() && other.getPerimeter() == this.getPerimeter()))
            return false;

        return true;
    }
}
