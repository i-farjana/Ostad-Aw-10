package Assignment02;


	class Triangle extends Shape {
	    private double base;
	    private double height;

	    Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing a Triangle");
	    }

	    @Override
	    double calculateArea() {
	        return 0.5 * base * height;
	    }
	}

