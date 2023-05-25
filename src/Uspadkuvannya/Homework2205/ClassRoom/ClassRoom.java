package Uspadkuvannya.Homework2205.ClassRoom;
/*Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
У тілі класу створіть методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу
ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно
від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні
екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.*/
public class ClassRoom extends Pupil{
    public ClassRoom(String name, int id, String gender) {
        super(name, id, gender);
    }

    public ClassRoom(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {

        Pupil pupil1 = new Pupil("Elis", 012345, "girl");
        Pupil pupil2 = new Pupil("Jon", 123456, "boy");
        Pupil pupil3 = new Pupil("Kris", 345678);
        Pupil pupil4 = new Pupil("Tom", 456789);

        pupil1.study();
        pupil2.write();
        pupil3.read();
        pupil4.relax();
    }
}



