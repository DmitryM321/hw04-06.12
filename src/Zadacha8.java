public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 8"); //  В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}