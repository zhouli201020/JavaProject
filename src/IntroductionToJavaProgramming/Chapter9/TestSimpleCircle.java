package IntroductionToJavaProgramming.Chapter9;

//Main class to test class SimpleCircle
public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        circle2.setRadius(100);
        //or can be written as: circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

// Define the circle class with two constructors
class SimpleCircle {
    double radius;

    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
