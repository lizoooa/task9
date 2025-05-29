import java.util.Scanner;

public class NumberReader {
    private Scanner scanner = new Scanner(System.in);

    public int readNumber() throws NegativeNumberException {
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("Liczby ujemne są niedozwolone");
        }

        return number;
    }

    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}