package Assignment02;

	class Circle extends Shape {
	    private double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing a Circle");
	    }

	    @Override
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}


