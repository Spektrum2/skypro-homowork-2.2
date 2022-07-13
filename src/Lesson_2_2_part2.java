public class Lesson_2_2_part2 {
    public static void main(String[] args) {
        Service car = new Car("car1",4);
        Service car2 = new Car("car2",4);
        Service truck = new Truck("truck1",6);
        Service truck2 = new Truck("truck2",8);
        Service bicycle = new Bicycle("bicycle1",2);
        Service bicycle2 = new Bicycle("bicycle2",2);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
    }
}
