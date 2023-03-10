import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car {
    private String name;
    private String color;
    private int maxGuest;
    private int price;
    private List<Person> people;

    public abstract void stop();

    @Override
    public String toString() {
        return "Car = " +
                "| name : " + name +
                "| color : " + color +
                "| maxGuest : " + maxGuest +
                "| price : " + price;
    }
}
