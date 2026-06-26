public class Bike extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 3.0;
    }
}
