import java.util.List;

public class StopAbleImpl implements StopAble {
    @Override
    public void cars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public List<Person> carName(List<Car> cars,String name) {
        for (Car car:cars) {
           if (car.getName().equals(name)){
               for (Person p: car.getPeople()) {
                   System.out.println(p.toString());
               }
           }
        }
        return null;
    }

    @Override
    public String carsName(List<Car> cars, String name) {
        for (Car v : cars) {
            if (v.getName().equals(name)) {
                System.out.println(v.toString());
            }
        }
        return name;
    }
}
