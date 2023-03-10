import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*.Car деген абстракт класс тузунуз поляларын толтурунуз.(name, color, maxGuest, price)
        public abstract void stop() бул метод машинада места барбы ошону
        текшеруучу метод болот эгер стоп методун иштетсек эгер места бар болсо токтоду деп чыгат
        места жок болсо места жок деп чыгат. sub класстар реализация кылат ушул методду
        2.Person класс тузунуз полелерин озунуз жазыныз
        3.Car классын мурастаган 2 класс тузунуз.
        Bus(private List<Person> people)   max people 20
        Taxi(private List<Person> client). max people 4
        4.StopAble деген interface ачыныз.
        1-баардык машиналарды кайтаруучу метод жазыныз!
        2-Ошол машинанын атын жазсак ошондо отурган адамдарды чыгарып беруучу метод жазыныз.
        3-Машинанын аты менен тапчуу метод жазыныз.
        5.StopAble интерфейсин StopAbleImpl деген
        класс implements кылсын жана логикасын ошол класста жазыныз.
        6.Баардык методдорду Main класста иштетиниз.*/
        Person person1 = new Person("Sanjar", (byte) 19, Gender.MALE);
        Person person2 = new Person("Aizat", (byte) 19, Gender.FEMALE);
        Person person3 = new Person("Madina", (byte) 17, Gender.FEMALE);
        Person person4 = new Person("Erjan", (byte) 18, Gender.MALE);
        Person person5 = new Person("Adilet", (byte) 19, Gender.MALE);
        Person person6 = new Person("Oksana", (byte) 25, Gender.FEMALE);
        Person person7 = new Person("Samat", (byte) 40, Gender.MALE);
        Person person8 = new Person("Gulmira", (byte) 30, Gender.FEMALE);
        Person person9 = new Person("Ali", (byte) 18, Gender.MALE);
        Person person10 = new Person("Ruslan", (byte) 18, Gender.MALE);
        Person person11 = new Person("Aibek", (byte) 17, Gender.MALE);
        Person person12 = new Person("Daniel", (byte) 18, Gender.MALE);
        Person person13 = new Person("Nagima", (byte) 17, Gender.FEMALE);
        Person person14 = new Person("Nuriza", (byte) 17, Gender.FEMALE);
        Person person15 = new Person("Nazik", (byte) 18, Gender.FEMALE);
        Person person16 = new Person("Malika", (byte) 18, Gender.FEMALE);
        Person person17 = new Person("Argen", (byte) 19, Gender.MALE);
        Person person18 = new Person("Kutman", (byte) 18, Gender.MALE);
        Person person19 = new Person("Khafiz", (byte) 18, Gender.MALE);
        Person person20 = new Person("Asylbek", (byte) 19, Gender.MALE);
        List<Person> people1 = List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11,
                person12, person13, person14, person15, person16, person17, person18, person19, person20);

        Car bus = new Bus("Mers", "Red", 20, 2000, people1);
        //bus.stop();
       // System.out.println(bus);
        Person person21=new Person("Elmir", (byte) 14,Gender.MALE);
        Person person22=new Person("Ademi", (byte) 13,Gender.FEMALE);
        Person person23=new Person("Atay", (byte) 18,Gender.MALE);
        Person person24=new Person("Mairam", (byte) 19,Gender.FEMALE);
        Person person25=new Person("Aidan", (byte) 16,Gender.FEMALE);

        List<Person>people2=List.of(person21,person22,person23,person24,person25);

        Car taxi = new Taxi("BWM","blue",4,1000,people2);
        //System.out.println(taxi);
       // taxi.stop();
        List<Car> cars=List.of(taxi,bus);


        StopAbleImpl stopAble = new StopAbleImpl();
        while (true){
            System.out.println("""
                    1.get all car
                    2.person
                    3.car
                    """);
            int a = new Scanner(System.in).nextInt();
            switch (a){
                case 1 -> stopAble.cars(cars);
                case  2 -> {
                    System.out.println("NAME");
                    String name = new Scanner(System.in).nextLine();
                    stopAble.carName(cars,name);
                }
                case 3 -> {
                    System.out.println("NAME");
                    String name = new Scanner(System.in).nextLine();
                    stopAble.carsName(cars,name);
                }
            }
        }

    }
}