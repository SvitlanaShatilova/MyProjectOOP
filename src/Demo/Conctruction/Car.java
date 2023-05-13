package Demo.Conctruction;

public class Car {
    static String mark;
    int price;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String mark, int price) {
        this.mark = mark;
        this.price = price;
    }

    public static void main(String[] args) {
        Car BMW = new Car();//obj without params
        BMW.mark = "BMW M5";
        BMW.price = 30000;
        System.out.println(BMW.mark + " " + BMW.price);
        Car Tavria = new Car("Tavria Nova");
        Tavria.price = 45000;
        System.out.println(Tavria.mark + " " + Tavria.price);
        Car Mers = new Car("Mers Gelik", 100000);
        System.out.println(Mers.mark + " " + Mers.price);


    }
}
