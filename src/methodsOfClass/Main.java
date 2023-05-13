package methodsOfClass;

import static methodsOfClass.Car.MessagePrice;

public class Main {
    public static void main(String[] args) {
        MessagePrice(); //static method
        Car car = new Car();
        car.msgSpeed(); //public method
        car.a = 7;
    }
}
