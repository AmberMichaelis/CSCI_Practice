public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("The area of the circle with radius " + circle1.getRadius() + " is " + circle1.getArea());

		Circle circle2 = new Circle(25);
		System.out.println("The area of the cicle with radius " + circle2.getRadius() + " is " + circle2.getArea());

	}
}

class Circle {
	private double radius;

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double newRadius) {
		this.radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math. PI;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}


}
