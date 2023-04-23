package EX_2;

import java.util.ArrayList;

public class EX_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(11);
        numbers.add(13);
        numbers.add(19);
        numbers.add(3);
        numbers.add(8);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных: " + numbers);
    }
}
