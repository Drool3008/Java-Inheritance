public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        System.out.println("Changing values");
        car.setCarColor("black");
        car.setCarName(null);
        car.setCarDoor(3);
        car.setCarConvertible(true);
        car.describeCar();
    }
}
