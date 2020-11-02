package com.company;

import java.util.ArrayList;

public class Paint {
    //list of shapes
    private ArrayList<Shape> shapes =new ArrayList<>();

    /**
     * adding shape to shapes list
     * @param shape
     */
    public void addShap(Shape shape){
        shapes.add(shape);
    }

    /**
     * removing shape from shapes list
     * @param shape
     */
    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    /**
     * draw all of shapes in paint
     */
    public void drawAll(){
        for (Shape shape: shapes)
            shape.draw();
    }
    /**
     *
     */
    public void printAll(){
        for (Shape shape : shapes)
            System.out.println(shape.toString());
    }

    public void describeEqualSides(){
        System.out.println("list of shape that have equal sides:");
        for (Shape shape : shapes)
            if(!shape.getType().equals("circle")){
                if(shape.getType().equals("triangle") && shape.isEquilateral())
                    System.out.println(shape.toString());
                if(shape.getType().equals("rectangle") && shape.isSquare())
                    System.out.println(shape.toString());}

    }
}
