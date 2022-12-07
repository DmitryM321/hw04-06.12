import java.util.Arrays;

public class Zadacha4 {
    public static void main(String[] args) {
        System.out.println("Задача 4"); //  Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        int[] first = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(first));
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                i = i + 1;
                System.out.print(i + " ");

            }
        }
    }
}


