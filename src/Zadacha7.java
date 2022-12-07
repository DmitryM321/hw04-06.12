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
        System.out.println("Задача 7"); // Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        int[] arr = generateRandomArray();
        int sum = 0;
        double sumDay = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sumDay = sum / 30;
        }
        System.out.println(sumDay);
    }

}

