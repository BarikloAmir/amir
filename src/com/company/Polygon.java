package com.company;

import java.util.ArrayList;

public class Polygon extends Shape {

    //sides of Polygon
    private ArrayList<Integer> sides = new ArrayList<>();
    /**
     * constructor
     * @param sides_input is sides of Polygon
     */
    public Polygon( int... sides_input) {
       super();
        for(Integer side : sides_input)
            sides.add(side);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 0;
        for(Integer side : sides)
            perimeter += side;
        setPerimeter(perimeter);
    }

    //getter and setter of sides

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Integer> sides) {
        this.sides = sides;
    }
}
