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

        Vizitor vizitor1 = new Vizitor();
        vizitor1.setName("John Max  ");
        vizitor1.setRoom(2003);

        Vizitor vizitor2 = new Vizitor();
        vizitor2.setName("Alice Johnson");
        vizitor2.setRoom(15);

        Vizitor vizitor3 = new Vizitor();
        vizitor3.setName("Alan Bell ");
        vizitor3.setRoom(15);

        Vizitor vizitor4 = new Vizitor();
        vizitor4.setName("Delia Ward");
        vizitor4.setRoom(15);

        Vizitor vizitor5 = new Vizitor();
        vizitor5.setName("Felicia Cox");
        vizitor5.setRoom(12);

        Vizitor vizitor6 = new Vizitor();
        vizitor6.setName("Irwin Brooks");
        vizitor6.setRoom(12);

        Vizitor vizitor7 = new Vizitor();
        vizitor7.setName("Irwin Brooks");
        vizitor7.setRoom(12);

        Vizitor vizitor8 = new Vizitor();
        vizitor8.setName("Jill Ramirez");
        vizitor8.setRoom(26);

        Vizitor vizitor9 = new Vizitor();
        vizitor9.setName("Larry Sanders");
        vizitor9.setRoom(30);

        Vizitor vizitor10 = new Vizitor();
        vizitor10.setName("Marc Henderson");
        vizitor10.setRoom(30);

        Vizitor vizitor11 = new Vizitor();
        vizitor11.setName("Nicky Long");
        vizitor11.setRoom(30);

        Vizitor vizitor12 = new Vizitor();
        vizitor12.setName("Omar Butler");
        vizitor12.setRoom(49);

        Vizitor vizitor13 = new Vizitor();
        vizitor13.setName("Omar Bryant");
        vizitor13.setRoom(52);

        Vizitor vizitor14 = new Vizitor();
        vizitor14.setName("Omar Diaz ");
        vizitor14.setRoom(83);

        Vizitor vizitor15 = new Vizitor();
        vizitor15.setName("John      ");
        vizitor15.setRoom(87);

        Vizitor vizitor16 = new Vizitor();
        vizitor16.setName("Terry Carter");
        vizitor16.setRoom(93);

        Vizitor vizitor17 = new Vizitor();
        vizitor17.setName("Viola Scott");
        vizitor17.setRoom(95);

        Vizitor vizitor18 = new Vizitor();
        vizitor18.setName("Capitan   ");
        vizitor18.setRoom(90005);

        Vizitor vizitor19 = new Vizitor();
        vizitor19.setName("Yolanda Lee");
        vizitor19.setRoom(90005);

        Vizitor vizitor20 = new Vizitor();
        vizitor20.setName("Zoe Moore ");
        vizitor20.setRoom(99);

        Event event = new Event();
        event.setVisitors(new Vizitor[] {vizitor1, vizitor2, vizitor3, vizitor4, vizitor5, vizitor6, vizitor7, vizitor8, vizitor9, vizitor10, vizitor11, vizitor12, vizitor13, vizitor14, vizitor15, vizitor16, vizitor18, vizitor19, vizitor20});
        System.out.println();
        event.printVisitors();

        System.out.println();


        vizitor1.printVizitor();
        vizitor2.printVizitor();
        vizitor3.printVizitor();
        vizitor4.printVizitor();
        vizitor5.printVizitor();
        vizitor6.printVizitor();
        vizitor7.printVizitor();
        vizitor8.printVizitor();
        vizitor9.printVizitor();
        vizitor10.printVizitor();
        vizitor11.printVizitor();
        vizitor12.printVizitor();
        vizitor13.printVizitor();
        vizitor14.printVizitor();
        vizitor15.printVizitor();
        vizitor16.printVizitor();
        vizitor17.printVizitor();
        vizitor18.printVizitor();
        vizitor19.printVizitor();
        vizitor20.printVizitor();

    }

}
