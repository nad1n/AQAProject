package school.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

    }

    public static void printThreeWords() {

        System.out.println("Task 1");
        System.out.println("-----------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println(" ");
    }

    public static void checkSumSign() {

        System.out.println("Task 2");
        System.out.println("-----------------");

        int a = -8, b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println(" ");
    }

    public static void printColor() {

        System.out.println("Task 3");
        System.out.println("-----------------");

        int value = 156;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else{
            if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            }
            else {
                System.out.println("Зеленый");
            }
        }

        System.out.println(" ");
    }

    public static void compareNumbers() {

        System.out.println("Task 4");
        System.out.println("-----------------");

        int a = 0, b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

        System.out.println(" ");
    }
}
