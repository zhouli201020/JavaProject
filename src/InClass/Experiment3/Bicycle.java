package InClass.Experiment3;

/**
 * FILENAME:Bicycle.java
 */
public class Bicycle extends RentedVehicle {
    private double nbHours;

    public Bicycle(double nbHours) {
        super(20);
        this.nbHours = nbHours;
    }

    public double getNbHours() {
        return nbHours;
    }

    public void setNbHours(double nbHours) {
        this.nbHours = nbHours;
    }

    @Override
    public double costToRent() {
        return getBaseFee() * getNbHours();
    }

    @Override
    public String toString() {
        return "自行车";
    }
}
