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
    private String visitors;

    public Event(String visitors) {
        this.visitors = visitors;
    }

    public String getVisitors() {
        return visitors;
    }

    public void setVisitors(String visitors) {
        this.visitors = visitors;
    }
    public static String[] deleteName(String... args) {
        String[] arrayName = new String[args.length];

        for (int i = 0; i < args.length; i++) {
            int n = 0;
            int b = 0;
            for (int j = 1; j < args.length; j++) {
                if (args[i] == args[j]) {
                    n++;
                }
            }
            if (n==0){
                arrayName[b] = args[i];
                b++;
                }else{
                n=0;
                }
            }
        return arrayName;
    }

    public static void main(String[] args) {


    }

}
