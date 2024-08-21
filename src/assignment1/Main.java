package assignment1;
abstract class Shape {
	 
	 abstract double calculateArea();
	 abstract double calculatePerimeter();
	}


	class Circle extends Shape {
	 private double radius;


	 public Circle(double radius) {
	     this.radius = radius;
	 }


	 public double getRadius() {
	     return radius;
	 }

	 public void setRadius(double radius) {
	     this.radius = radius;
	 }


	 @Override
	 double calculateArea() {
	     return Math.PI * radius * radius;
	 }


	 double calculatePerimeter() {
	     return 2 * Math.PI * radius;
	 }
	}


	class Rectangle extends Shape {
	 private double length;
	 private double width;


	 public Rectangle(double length, double width) {
	     this.length = length;
	     this.width = width;
	 }

	 
	 public double getLength() {
	     return length;
	 }

	 public void setLength(double length) {
	     this.length = length;
	 }

	 public double getWidth() {
	     return width;
	 }

	 public void setWidth(double width) {
	     this.width = width;
	 }


	 @Override
	 double calculateArea() {
	     return length * width;
	 }


	 @Override
	 double calculatePerimeter() {
	     return 2 * (length + width);
	 }
	}


	class Triangle extends Shape {
	 private double base;
	 private double height;


	 public Triangle(double base, double height) {
	     this.base = base;
	     this.height = height;
	 }

	 
	 public double getBase() {
	     return base;
	 }

	 public void setBase(double base) {
	     this.base = base;
	 }

	 public double getHeight() {
	     return height;
	 }

	 public void setHeight(double height) {
	     this.height = height;
	 }

	 
	 @Override
	 double calculateArea() {
	     return 0.5 * base * height;
	 }

	 
	 @Override
	 double calculatePerimeter() {
	   
	     return 3 * base;
	 }
	}


	public class Main {
	 public static void main(String[] args) {
	    
	     Circle circle = new Circle(8);
	     System.out.println("Circle Area: " + circle.calculateArea());
	     System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	    
	     Rectangle rectangle = new Rectangle(4, 8);
	     System.out.println("Rectangle Area: " + rectangle.calculateArea());
	     System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

	  
	     Triangle triangle = new Triangle(3, 6);
	     System.out.println("Triangle Area: " + triangle.calculateArea());
	     System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	 }
	}






