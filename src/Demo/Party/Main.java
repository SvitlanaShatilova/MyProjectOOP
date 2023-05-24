package Demo.Party;
/*Створити клас Main.
Реалізувати:
- створити любу кількість відвідувачів -- але не менше 20, щоб як мінімум було дві групи по 3 відвідувача із однієї кімнати
- створити вечірку(Event) з назвою на Ваш розсуд
- додати всіх відвідувачів на цю вечірку
- вивести загальну кількість відвідувачів -- Загальна кількість людей на вечірці: 42
- вивести всіх відвідувачів у форматі*
Вечірка: Паті на Хаті
Присутні:
John       із кімнати номер: 100
John Max   із кімнати номер:  42
WillSmo... із кімнати номер:   1
Capitan    із кімнати номер:  42
- видалити відвідувача за іменем -- наприклад John, і вивести на екран
Вечірка: Паті на Хаті
Вигнали: John
Присутні:
John Max   із кімнати номер:  42
WillSmo... із кімнати номер:   1
Capitan    із кімнати номер:  42
- видалити відвідувача за номером кімнати -- наприклад 42, і вивести на екран
Вечірка: Паті на Хаті
Вигнали: John Max, Capitan
Присутні:
WillSmo... із кімнати номер:   1
* зверніть увага на формат - список має бути красиво надрукований як табличка*/
public class Main {
    public static void main(String[] args) {

        Vizitor vizitor1 = new Vizitor("John Max  ", 2003);
        Vizitor vizitor2 = new Vizitor("Alice Johnson", 15);
        Vizitor vizitor3 = new Vizitor("Alan Bell ", 15);
        Vizitor vizitor4 = new Vizitor("Delia Ward", 15);
        Vizitor vizitor5 = new Vizitor("Felicia Cox", 12);
        Vizitor vizitor6 = new Vizitor("Irwin Brooks", 12);
        Vizitor vizitor7 = new Vizitor("Irwin Hok ", 26);
        Vizitor vizitor8 = new Vizitor("Jill Ramirez", 12);
        Vizitor vizitor9 = new Vizitor("Larry Sanders", 30);
        Vizitor vizitor10 = new Vizitor("Marc Henderson", 30);
        Vizitor vizitor11 = new Vizitor("Nicky Long", 30);
        Vizitor vizitor12 = new Vizitor("Omar Butler", 49);
        Vizitor vizitor13 = new Vizitor("Omar Bryant", 52);
        Vizitor vizitor14 = new Vizitor("Omar Diaz ", 83);
        Vizitor vizitor15 = new Vizitor("John      ", 87);
        Vizitor vizitor16 = new Vizitor("Terry Carter", 93);
        Vizitor vizitor17 = new Vizitor("Viola Scott", 95);
        Vizitor vizitor18 = new Vizitor("Capitan   ", 90005);
        Vizitor vizitor19 = new Vizitor("Yolanda Lee", 900005);
        Vizitor vizitor20 = new Vizitor("Zoe Moore ", 99);

        Event event = new Event( new Vizitor[] {vizitor1, vizitor2, vizitor3, vizitor4, vizitor5, vizitor6, vizitor7, vizitor8, vizitor9, vizitor10, vizitor11, vizitor12, vizitor13, vizitor14, vizitor15, vizitor16, vizitor17});
        event.addList(vizitor18);
        event.addList(vizitor19);
        event.addList(vizitor20);

        System.out.println("==================================================");
        Vizitor.addRegistered();
        System.out.println("==================================================");
        event.printingInfo(event);

        event.printVisitor(event.getVisitors());

        System.out.println("==================================================");
        event.printTitle(event);

        event.setVisitors(event.deleteName(event.getVisitors(), "John      "));

        event.printVisitor(event.getVisitors());


    }

}
