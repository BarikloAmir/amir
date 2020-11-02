package com.company;

public class Triangle extends Polygon{

    /**
     * constructor
     * @param sides_input
     */
    public Triangle(int... sides_input ){
        super(sides_input);
        setType("triangle");
    }

    @Override
    public void calculateArea() {
        calculatePerimeter();
        double p = getPerimeter()/2;
        for(int side : getSides())
            p*=(p-side);
        setArea(Math.sqrt(p));

    }

    @Override
    public String toString() {
        String output = getType()+"\n"
                +"side1 :"+getSides().get(0)+"\n"+
                "side2 :"+getSides().get(1)+"\n"+
                "side3 :"+getSides().get(2);
        return output;
    }

    /**
     *
     * @return true if triangle be equilateral
     */
    @Override
    public boolean isEquilateral(){
        if(getSides().get(0) == getSides().get(1) && getSides().get(2) == getSides().get(0)
            && getSides().get(2) == getSides().get(1))
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle) obj;
        if(!(other.getType().equals(this.getType())))
            return false;
        if(!(other.getArea() == this.getArea() && other.getPerimeter() == this.getPerimeter()))
            return false;

        return true;
    }
}
