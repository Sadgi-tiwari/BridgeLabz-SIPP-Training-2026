public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 20;

        for (Vehicle v : vehicles) {

            System.out.println("----------------------");

            if (v instanceof Car) {
                Car car = (Car) v;
                System.out.println("Vehicle : Car");
                System.out.println("Fuel Cost = " + car.fuelCost(km));
            }

            else if (v instanceof Bus) {
                Bus bus = (Bus) v;
                System.out.println("Vehicle : Bus");
                System.out.println("Fuel Cost = " + bus.fuelCost(km));
            }

            else if (v instanceof Bike) {
                Bike bike = (Bike) v;
                System.out.println("Vehicle : Bike");
                System.out.println("Fuel Cost = " + bike.fuelCost(km));
            }

            else if (v instanceof ElectricCar) {
                ElectricCar eCar = (ElectricCar) v;
                System.out.println("Vehicle : Electric Car");
                System.out.println("Fuel Cost = " + eCar.fuelCost(km));
            }
        }
    }
}