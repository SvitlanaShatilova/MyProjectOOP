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
    final String title = "Паті на Хаті";
    private Vizitor[] visitors = new Vizitor[0];

    public Event() {
    }

    public Vizitor[] getVisitors() {
        return visitors;
    }

    public void setVisitors(Vizitor[] visitors) {
        this.visitors = visitors;
    }

    public void printVisitors(){
        System.out.println("Вечірка: " + title + ", присутні: " + (visitors.length+1) + " відвідувачів");
    }
}
