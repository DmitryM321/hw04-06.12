public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 6"); // Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        int[] arr = generateRandomArray();
        int max = 0;
        int min = 0;
        for (final int current : arr) {
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        for (final int current : arr) {
            min = current;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }
}
