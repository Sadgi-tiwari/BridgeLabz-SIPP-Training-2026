public class Car extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 8.0;
    }
}
