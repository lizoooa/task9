import java.util.ArrayList;
import java.util.Collections;

public class CarService {

    public ArrayList<Car> createCarList() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 2010));
        cars.add(new Car("Honda", 2002));
        cars.add(new Car("Ford", 2004));
        cars.add(new Car("BMW 3", 2019));
        cars.add(new Car("Audi", 2012));
        cars.add(new Car("Mazda", 2011));
        cars.add(new Car("Volkswagen", 2009));
        cars.add(new Car("Hyundai", 2013));
        cars.add(new Car("Kia", 2016));
        cars.add(new Car("Renault", 2007));

        return cars;
    }

    public void sortCarsByYear(ArrayList<Car> cars) {
        Collections.sort(cars);
    }

    public void printCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}