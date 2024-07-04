package Assignment02;

public class Main {
	 public static void main(String[] args) {
	        Shape circle = new Circle(5);
	        circle.draw();
	        System.out.println("Area of Circle: " + circle.calculateArea());

	        Shape square = new Square(4);
	        square.draw();
	        System.out.println("Area of Square: " + square.calculateArea());

	        Shape triangle = new Triangle(3, 6);
	        triangle.draw();
	        System.out.println("Area of Triangle: " + triangle.calculateArea());
	    }
	}



