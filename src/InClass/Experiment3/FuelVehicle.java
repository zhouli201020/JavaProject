package InClass.Experiment3;

public class FuelVehicle extends RentedVehicle {
    private double nbKms;

    public FuelVehicle(double nbKms) {
        super(90);
        this.nbKms = nbKms;
    }

    public FuelVehicle() {
        this(0);
    }

    public double getNbKms() {
        return nbKms;
    }

    public void setNbKms(double nbKms) {
        this.nbKms = nbKms;
    }

    public double getMileageFees() {
        if (nbKms < 100)
            return 0.2 * nbKms;
        if (nbKms >= 100 && nbKms <= 400)
            return 0.3 * nbKms;
        if (nbKms > 400)
            return 0.4 * nbKms + 0.5 * (nbKms - 400);
        return 0;
    }
}
