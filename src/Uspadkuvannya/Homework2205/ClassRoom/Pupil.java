package Uspadkuvannya.Homework2205.ClassRoom;

import java.util.PrimitiveIterator;

/* У тілі класу створіть методи void study(),
void read(), void write(), void relax().
 Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil
  від класу базового класу Pupil і перевизначте кожен із методів,
  залежно від успішності учня.
  Конструктор класу ClassRoom приймає
  аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може
  передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу
  ClassRoom вміють навчатися, читати, писати, відпочивати.*/
public class Pupil {
private String name;
private int id;
private String gender;

    public Pupil(String name, int id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Pupil(String name, int id) {
        this.name = name;
        this.id = id;
    }
   public void study(){
       System.out.println("The pupil is studying with excellent results");
   }
   public void read(){
       System.out.println("The pupil studies well and can read well");
   }
   public void write(){
       System.out.println("The pupil knows how to write correctly");
   }
   public void relax(){
       System.out.println("The student does not want to learn, relaxes in class");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
