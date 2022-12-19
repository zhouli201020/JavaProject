package InClass.Chapter5;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 3);
        display(c1);
        Rectangle r1 = new Rectangle(1, 3);
        display(r1);
    }

    public static void display(ICalculator i) {
        if (i instanceof Circle)
            System.out.println("Circle:");
        if (i instanceof Rectangle)
            System.out.println("Rectangle:");
        System.out.println("The area is: " + i.getArea());
        System.out.println("The perimeter is: " + i.getPerimeter());
        System.out.println();
    }
}
