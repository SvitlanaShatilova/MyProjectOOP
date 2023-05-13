package Homework0805;
/*Клас Person
Створити клас Person, який містить:
1. змінні fullName, age;
2. методи move() і talk(), у яких просто вивести на консоль повідомлення - "Який Person говорить".
3. Додайте два конструктори - Person() та Person(fullName, age).
4. Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person (), інший – Person (fullName, age).
5. Викличте методи move() та talk().*/

public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println("Який Person говорить");
    }
    static void talk(){
        System.out.println("Який Person говорить");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person student = new Person();
        student.fullName = "Kira Litva";
        student.age = 18;
        System.out.println(student.fullName + " " + student.age);
        Person student1 = new Person("Alona America", 28);
        System.out.println(student1.fullName + " " + student1.age);
        talk();
        Person person = new Person();
        person.move();
    }
}
