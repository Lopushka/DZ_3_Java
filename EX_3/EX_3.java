package EX_3;

import java.util.ArrayList;
import java.util.Collections;


public class EX_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(35);
        list.add(23);
        list.add(6);
        list.add(13);
        list.add(98);
        list.add(89);
        list.add(-19);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
}
}