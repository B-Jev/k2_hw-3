public class ServiceStation {
    public void check(Bicycle bicycle) {
        bicycle.transportServise();
    }

    public void check(Car car) {
        car.transportServise();
    }

    public void check(Truck truck) {
        truck.transportServise();
    }
}