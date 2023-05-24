package Demo.Party;

/*і дані
name -- маскимальна довжина імʼя 10, при створенні коли імʼя довше відрізаємо хвіст і додаємо три крапки: GreatAkynaMatata --> GreatAk...
room -- маскимальне значення 100, при вводі якоїсь єресі, наприклад: 100500, назначаємо кімнату 42: 34 -- ок --> 34, 123 -- fail --> 42
Реалізувати:
- створення обєкту
- закрити прямий доступ до даних
- заборонити змінювати дані
- під час створення об’єкта підраховувати, скільки всього об’єктів було створено
- дати можливість отримувати дані
- дати можливість вивести весь обʼєкт у читабельному виді - John Doe із кімнати номер: 100
- дати можливість отримувати загальну кількість створених обʼєктів - Загальна кількість зареєстрованих відвідувачів: 42*/
public class Vizitor {
        private String name;
        private int room;
        public static int registered = 0;

    public Vizitor(String name, int room) {
        this.name = cutOff(name);
        this.room = assignRoom(room);
        registered ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public static String cutOff(String name){
            String nameTemp;
            String str = "...";
            if (name.length() > 10){
                nameTemp = name.substring(0,7);
                name = nameTemp.concat(str);
                return name;
            }else{
                return name;
            }
        }

        public static int assignRoom(int room){
            if (room > 100){
                return 42;
            }else{
                return room;
            }
        }

        public static void printPerson(Vizitor vizitor){
            System.out.println(vizitor.getName()+ " із кімнати номер: " + vizitor.getRoom());
        }

        public static void addRegistered(){
            System.out.println("Загальна кількість зареєстрованих відвідувачів: " + registered);
        }



}