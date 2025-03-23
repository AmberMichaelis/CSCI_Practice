public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("The rectangle with width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " has an area of " + rectangle1.getArea() + " and a perimeter of " + rectangle1.getPerimeter() + ".");

        Rectangle rectangle2 = new Rectangle(4, 40);
        System.out.println("The rectangle with width " + rectangle2.getWidth() + " and height " + rectangle2.getHeight() + " has an area of " + rectangle2.getArea() + " and a perimeter of " + rectangle2.getPerimeter() + ".");
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
