package Uspadkuvannya.Homework2205.Vehicle;
/*Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
 Для класу Ship – кількість пасажирів та порт приписки. Написати програму,
 яка виводить на екран інформацію про кожен засіб пересування.*/
public class Plane extends Vehicle{
    private int height = 1234;
    private int quantityPas = 456;

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", quantityPas=" + quantityPas +
                '}';
    }
}
