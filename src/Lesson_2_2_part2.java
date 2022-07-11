import javax.print.PrintService;

public class Lesson_2_2_part2 {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);
        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);
        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);
        ServiceStation serviceStation = new ServiceStationForTransport();
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);


    }
}
