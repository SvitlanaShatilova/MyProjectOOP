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
        public Vizitor(String name, int room){
            this.name = name;
            this.room = room;
        }
        public Vizitor(){
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getRoom(){
            return room;
        }

        public void setRoom(int room){
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

        public static void main(String[] args) {
            int n = 0;
            n++;
            Vizitor vizitor1 = new Vizitor();
            vizitor1.setName("Abraham Smith");
            vizitor1.setRoom(2003);
            System.out.println(cutOff(vizitor1.getName()) + " із кімнати номер: " + assignRoom(vizitor1.getRoom()));
            n++;
            Vizitor vizitor2 = new Vizitor();
            vizitor2.setName("Alice Johnson");
            vizitor2.setRoom(15);
            System.out.println(cutOff(vizitor2.getName()) + " із кімнати номер: " + assignRoom(vizitor2.getRoom()));
            n++;
            Vizitor vizitor3 = new Vizitor();
            vizitor3.setName("Alan Bell ");
            vizitor3.setRoom(35);
            System.out.println(cutOff(vizitor3.getName()) + " із кімнати номер: " + assignRoom(vizitor3.getRoom()));
            n++;
            Vizitor vizitor4 = new Vizitor();
            vizitor4.setName("Delia Ward");
            vizitor4.setRoom(20);
            System.out.println(cutOff(vizitor4.getName()) + " із кімнати номер: " + assignRoom(vizitor4.getRoom()));
            n++;
            Vizitor vizitor5 = new Vizitor();
            vizitor5.setName("Felicia Cox");
            vizitor5.setRoom(12);
            System.out.println(cutOff(vizitor5.getName()) + " із кімнати номер: " + assignRoom(vizitor5.getRoom()));
            n++;
            Vizitor vizitor6 = new Vizitor();
            vizitor6.setName("Irwin Brooks");
            vizitor6.setRoom(14);
            System.out.println(cutOff(vizitor6.getName()) + " із кімнати номер: " + assignRoom(vizitor6.getRoom()));
            n++;
            Vizitor vizitor7 = new Vizitor();
            vizitor7.setName("Irwin Brooks");
            vizitor7.setRoom(21);
            System.out.println(cutOff(vizitor7.getName()) + " із кімнати номер: " + assignRoom(vizitor7.getRoom()));
            n++;
            Vizitor vizitor8 = new Vizitor();
            vizitor8.setName("Jill Ramirez");
            vizitor8.setRoom(26);
            System.out.println(cutOff(vizitor8.getName()) + " із кімнати номер: " + assignRoom(vizitor8.getRoom()));
            n++;
            Vizitor vizitor9 = new Vizitor();
            vizitor9.setName("Larry Sanders");
            vizitor9.setRoom(30);
            System.out.println(cutOff(vizitor9.getName()) + " із кімнати номер: " + assignRoom(vizitor9.getRoom()));
            n++;
            Vizitor vizitor10 = new Vizitor();
            vizitor10.setName("Marc Henderson");
            vizitor10.setRoom(40);
            System.out.println(cutOff(vizitor10.getName()) + " із кімнати номер: " + assignRoom(vizitor10.getRoom()));
            n++;
            Vizitor vizitor11 = new Vizitor();
            vizitor11.setName("Nicky Long");
            vizitor11.setRoom(45);
            System.out.println(cutOff(vizitor11.getName()) + " із кімнати номер: " + assignRoom(vizitor11.getRoom()));
            n++;
            Vizitor vizitor12 = new Vizitor();
            vizitor12.setName("Omar Butler");
            vizitor12.setRoom(49);
            System.out.println(cutOff(vizitor12.getName()) + " із кімнати номер: " + assignRoom(vizitor12.getRoom()));
            n++;
            Vizitor vizitor13 = new Vizitor();
            vizitor13.setName("Percy Bryant");
            vizitor13.setRoom(52);
            System.out.println(cutOff(vizitor13.getName()) + " із кімнати номер: " + assignRoom(vizitor13.getRoom()));
            n++;
            Vizitor vizitor14 = new Vizitor();
            vizitor14.setName("Rosa Diaz ");
            vizitor14.setRoom(83);
            System.out.println(cutOff(vizitor14.getName()) + " із кімнати номер: " + assignRoom(vizitor14.getRoom()));
            n++;
            Vizitor vizitor15 = new Vizitor();
            vizitor15.setName("Sally Collins");
            vizitor15.setRoom(87);
            System.out.println(cutOff(vizitor15.getName()) + " із кімнати номер: " + assignRoom(vizitor15.getRoom()));
            n++;
            Vizitor vizitor16 = new Vizitor();
            vizitor16.setName("Terry Carter");
            vizitor16.setRoom(93);
            System.out.println(cutOff(vizitor16.getName()) + " із кімнати номер: " + assignRoom(vizitor16.getRoom()));
            n++;
            Vizitor vizitor17 = new Vizitor();
            vizitor17.setName("Viola Scott");
            vizitor17.setRoom(95);
            System.out.println(cutOff(vizitor17.getName()) + " із кімнати номер: " + assignRoom(vizitor17.getRoom()));
            n++;
            Vizitor vizitor18 = new Vizitor();
            vizitor18.setName("Woody Hill");
            vizitor18.setRoom(90005);
            System.out.println(cutOff(vizitor18.getName()) + " із кімнати номер: " + assignRoom(vizitor18.getRoom()));
            n++;
            Vizitor vizitor19 = new Vizitor();
            vizitor19.setName("Yolanda Lee");
            vizitor19.setRoom(90005);
            System.out.println(cutOff(vizitor19.getName()) + " із кімнати номер: " + assignRoom(vizitor19.getRoom()));
            n++;
            Vizitor vizitor20 = new Vizitor();
            vizitor20.setName("Zoe Moore ");
            vizitor20.setRoom(99);
            System.out.println(cutOff(vizitor20.getName()) + " із кімнати номер: " + assignRoom(vizitor20.getRoom()));


            System.out.println("Загальна кількість зареєстрованих відвідувачів: " + n);
        }
    }