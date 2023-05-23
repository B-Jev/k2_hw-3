public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car1",4);
        Car car2 = new Car("Car2",4);

        Truck truck = new Truck("Truck1",6);
        Truck truck2 = new Truck("Truck2",8);

        Bicycle bicycle = new Bicycle("Bicycle1",2);
        Bicycle bicycle2 = new Bicycle("Bicycle2",2);

        ServiceStation station = new ServiceStation();

        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
        System.out.println();

        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();


        station.check(truck);
        System.out.println();
        station.check(truck2);
    }
}