package InClass.Experiment3;

public class RentedVehicle {
    private double baseFee;

    public RentedVehicle(double baseFee) {
        this.baseFee = baseFee;
    }

    public RentedVehicle() {
        this(0);
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double costToRent() {
        return 0;
    }
}
