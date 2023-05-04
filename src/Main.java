public class Main {

    public static void main(String[] args) {

        Car car = new Car("2002 Blue F-150");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 White Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
