public class Zadacha3 {
    public static void main(String[] args) {
        System.out.println("Задача 3.1"); // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        System.out.print(first[2] + ", ");
        System.out.print(first[1] + ", ");
        System.out.print(first[0]);

        System.out.println();
        System.out.println("Задача 3.2");
        double[] second = {1.57, 7.654, 9.986};
        System.out.print(second[2] + ", ");
        System.out.print(second[1] + ", ");
        System.out.print(second[0]);

        System.out.println();
        System.out.println("Задача 3.3");
        String[] third = {"D", "Road", "9.986"};
        System.out.print(third[2] + ", ");
        System.out.print(third[1] + ", ");
        System.out.print(third[0]);

    }
}


