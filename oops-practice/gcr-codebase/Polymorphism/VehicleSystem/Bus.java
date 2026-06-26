public class Bus extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 15.0;
    }
}
