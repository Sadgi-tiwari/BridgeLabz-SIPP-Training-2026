public class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 2.0;
    }
}
