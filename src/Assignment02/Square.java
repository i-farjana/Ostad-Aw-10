package Assignment02;


	class Square extends Shape {
	    private double side;

	    Square(double side) {
	        this.side = side;
	    }

	    @Override
	    void draw() {
	        System.out.println("Drawing a Square");
	    }

	    @Override
	    double calculateArea() {
	        return side * side;
	    }
	}


