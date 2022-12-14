package InClass.Experiment3;

/**
 * FILENAME:Car.java
 */
public class Car extends FuelVehicle {
    private int nbSeats;

    public Car(int nbSeats, double nbKms) {
        super(nbKms);
        this.nbSeats = nbSeats;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(int nbSeats) {
        this.nbSeats = nbSeats;
    }

    @Override
    public double costToRent() {
        return getBaseFee() * nbSeats + getMileageFees();
    }

    @Override
    public String toString() {
        return "汽车";
    }
}
