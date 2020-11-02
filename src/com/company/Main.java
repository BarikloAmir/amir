package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle(5, 5, 5);
	triangle.calculatePerimeter();
	triangle.calculateArea();
	triangle.draw();
	Polygon polygon = new Triangle(8,4,3);
	System.out.println(triangle.toString());
	System.out.println(triangle.equals(polygon));
	System.out.println(triangle.isEquilateral());
	Circle circle = new Circle(5);
	circle.calculatePerimeter();
	circle.calculateArea();
	circle.draw();
	System.out.println(circle.toString());


	Rectangle rectangle = new Rectangle(5,4);
	rectangle.calculatePerimeter();
	rectangle.calculateArea();
	rectangle.draw();
	System.out.println(rectangle.toString());
	Paint paint = new Paint();
	paint.addShap(triangle);
	paint.addShap(rectangle);
	paint.addShap(circle);
	paint.printAll();
	paint.drawAll();
	paint.describeEqualSides();

    }
}
