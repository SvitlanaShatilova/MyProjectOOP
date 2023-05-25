package Uspadkuvannya.Test1;

public class Animals {
    private String color;
    private String poroda;
    private int mass;
    private int rozmir;
    private int vik;


    public static void mouve(){
        System.out.println("I run");
    }

    public static void eat(){
        System.out.println("I eat");
    }

    public Animals(String color, String poroda, int mass, int rozmir, int vik) {
        this.color = color;
        this.poroda = poroda;
        this.mass = mass;
        this.rozmir = rozmir;
        this.vik = vik;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getRozmir() {
        return rozmir;
    }

    public void setRozmir(int rozmir) {
        this.rozmir = rozmir;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "color='" + color + '\'' +
                ", poroda='" + poroda + '\'' +
                ", mass=" + mass +
                ", rozmir=" + rozmir +
                ", vik=" + vik +
                '}';
    }
}
