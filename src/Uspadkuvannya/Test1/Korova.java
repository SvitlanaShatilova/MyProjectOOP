package Uspadkuvannya.Test1;

public class Korova extends Animals{

    public Korova(String color, String poroda, int mass, int rozmir, int vik) {
        super(color, poroda, mass, rozmir, vik);
    }
    public static void mouve(){
        System.out.println("I mouve - run");
    }
    public static void eat(){
        System.out.println("I eat - oves");
    }

    public static void main(String[] args) {
        Animals Caw = new Animals("Beg", "dro", 100, 20, 1);
        System.out.println(Caw);
        mouve();
        eat();

    }
}
