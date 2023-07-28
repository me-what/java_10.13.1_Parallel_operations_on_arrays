// Параллельные операции над массивами. Parallel operations on arrays

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = initializeArray(6);
        for(int i: numbers)
            System.out.println(i);
        System.out.println();
    }
    public static int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;
/*
0
10
20
30
40
50 */
    }
}