import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private byte age;
    private Gender gender;

    @Override
    public String toString() {
        return "Person = " +
                "| fullName : " + name +
                "| age : " + age +
                "| gender : " + gender;
    }
}
