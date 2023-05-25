package Uspadkuvannya.Test2;

public class Car {
    private String marka;
    private String model;
    private String colir;
    private String date;
    private String vin;
    private int count_wheels;
    private String typeKuzov;
    private int price;
    private int doors;
    private String tupePalivo;

    public String getTupePalivo() {
        return tupePalivo;
    }

    public void setTupePalivo(String tupePalivo) {
        this.tupePalivo = tupePalivo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColir() {
        return colir;
    }

    public void setColir(String colir) {
        this.colir = colir;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getCount_wheels() {
        return count_wheels;
    }

    public void setCount_wheels(int count_wheels) {
        this.count_wheels = count_wheels;
    }

    public String getTypeKuzov() {
        return typeKuzov;
    }

    public void setTypeKuzov(String typeKuzov) {
        this.typeKuzov = typeKuzov;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка = " + marka + '\'' +
                ", Модель = " + model + '\'' +
                ", Колір = " + colir + '\'' +
                '}';
    }
}
