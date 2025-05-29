import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1: Sortowanie samochodów według roku produkcji");
        CarService carService = new CarService();
        ArrayList<Car> cars = carService.createCarList();
        carService.sortCarsByYear(cars);
        carService.printCars(cars);

        System.out.println("Zadanie 4: Wczytywanie liczb całkowitych do tablicy (brak liczb ujemnych)");
        int[] numbers = new int[10];
        NumberReader numberReader = new NumberReader();
        numberReader.fillArray(numbers);

        System.out.println("Zawartość tablicy po wczytaniu danych:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}