package Uspadkuvannya.Homework2205.Vehicle;
/*Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
 Для класу Ship – кількість пасажирів та порт приписки. Написати програму,
 яка виводить на екран інформацію про кожен засіб пересування.*/
public class Vehicle {
    private int price;
    private int speed;
    private int year;

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Ship ship = new Ship();
        System.out.println(ship);
        Plane plane = new Plane();
        System.out.println(plane);

    }
}
