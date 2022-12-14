package InClass.Experiment3;

import org.jetbrains.annotations.NotNull;

/**
 * FILENAME:Test.java
 */
public class Test {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(4);
        Car c1 = new Car(6, 50);
        displayFee(b1);
        displayFee(c1);
    }

    public static void displayFee(@NotNull RentedVehicle r) {
        System.out.println(r.toString() + "的费用为：" + r.costToRent() + "元");
    }
}
