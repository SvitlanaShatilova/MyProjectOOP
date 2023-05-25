package Uspadkuvannya.EX1;

public class Main implements Met{
    public static void main(String[] args) {
        Animal.eat();
        Dog.eat();


    }

    @Override
    public void eat() {
        System.out.println("plankton");
    }

    @Override
    public void move() {

    }
}
