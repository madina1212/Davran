import java.util.List;

public class Bus extends Car {
    private List<Person> people;

    public Bus(String name, String color, int maxGuest, int price, List<Person> people) {
        super(name, color, maxGuest, price,people);
        this.people = people;
    }


    @Override
    public void stop() {
        int num = people.size();
        if (num != 20) {
            System.out.println("There are no seats");

        } else {
            System.out.println("There are empty seats");
        }
    }
}
