import java.util.List;

public class Taxi extends Car {
    private List<Person> client;

    public Taxi(String name, String color, int maxGuest, int price, List<Person> client) {
        super(name, color, maxGuest, price, client);
        this.client = client;
    }

    @Override
    public void stop() {
        int a = client.size();
        if (a != 4) {
            System.out.println("There are no seats");
        } else {
            System.out.println("There are empty seats");
        }
    }
}
