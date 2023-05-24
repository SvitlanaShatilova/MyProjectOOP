package Demo.Party;
/*Створити клас Event.
Має такі дані
title -- назва вечірки
visitors -- список відвідувачів
Реалізувати:
- створення обєкту
- закрити прямий доступ до даних
- заборонити змінювати title
- дати можливість отримувати дані
- дати можливість додавати відвідувача
- дати можливість видаляти відвідувача по name -- якщо в списку є не одне таке імʼя, видаляємо усіх з таким імʼям
- дати можливість видаляти відвідувача по room -- видаляєм всіх хто з цієї кімнати прийшов (вони на халяву прийшли )) )
- дати можливість вивести весь список у читабельному виді - Вечірка: Паті на Хаті, присутні: 120 відвідувачів*/
public class Event {
    public final static String title = "Паті на Хаті";
    private Vizitor[] visitors = new Vizitor[0];


    public Event(Vizitor[] visitors) {
        this.visitors = visitors;
    }

    public Event() {
    }

    public Vizitor[] getVisitors() {
        return visitors;
    }

    public void setVisitors(Vizitor[] visitors) {
        this.visitors = visitors;
    }

    public void addList(Vizitor vizitor) {
        visitors = increaseLength(visitors);
        visitors[visitors.length - 1] = vizitor;
    }


    public static Vizitor[] increaseLength(Vizitor[] visitors) {
        Vizitor[] temp = new Vizitor[visitors.length + 1];
        for (int i = 0; i <= visitors.length; i++) {
            if (i != visitors.length) {
                temp[i] = visitors[i];
            }
        }
        return temp;
    }

//    public static void deleteName(Vizitor[] visitors, String name) {
//        Vizitor[] temp;
//        Vizitor[] tempDel;
//        int n = 0;
//        for (int i = 0; i <= visitors.length; i++) {
//            if (visitors[i].getName().equals(name)) {
//               tempDel[i] = ;
//            }
//        }
//
//    }


    public static void printingInfo(Event event) {
        System.out.println("Вечірка: " + title + ", присутні: " + (event.visitors.length + 1) + " відвідувачів");
    }

    public static void printTitle(Event event) {
        System.out.println("Вечірка: " + title);


    }
}




