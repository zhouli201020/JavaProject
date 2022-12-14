package IntroductionToJavaProgramming.Chapter11;

public class PolymorphismDemo {
    /**
     * Main method
     */
    public static void main(String[] args) {
        /**
         * Display circle and rectangle properties
         */
        displayObjects(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObjects(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    public static void displayObjects(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
