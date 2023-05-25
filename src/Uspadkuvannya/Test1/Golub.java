package Uspadkuvannya.Test1;

public class Golub extends Animals{




    public Golub(String color, String poroda, int mass, int rozmir, int vik) {
        super(color, poroda, mass, rozmir, vik);
    }

    public static void mouve(){
        System.out.println("I mouve - fly");
    }
    public static void eat(){
        System.out.println("I eat - treat");
    }
    public static void main(String[] args) {
        Animals GolubBiluj = new Animals("biluy", "dvorteriev", 1, 10, 1);
        mouve();

        System.out.println(GolubBiluj);

        eat();


    }

}

