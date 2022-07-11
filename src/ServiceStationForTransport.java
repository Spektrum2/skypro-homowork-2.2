public class ServiceStationForTransport implements ServiceStation {
    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.updateTyre();
        car.checkEngine();
    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        bicycle.updateTyre();
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }
}
