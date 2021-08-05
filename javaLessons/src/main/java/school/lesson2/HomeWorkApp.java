package school.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println(task1());

        System.out.println();

        System.out.println("Task 2");
        task2(3);

        System.out.println();

        System.out.println("Task 3");
        System.out.println(task3(-5));

        System.out.println();

        System.out.println("Task 3 с вводом данных");
        System.out.println(task3a());

        System.out.println();

        System.out.println("Task 4");
        System.out.println("Укажите количество повторений:");
        int d = sc.nextInt();
        task4("Я не повторяю)", d);

        System.out.println();

        System.out.println("Task 5");
        System.out.println(task5());

        System.out.println();

        System.out.println("Task 6");
        int[] arr6 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task6(arr6);

        System.out.println();

        System.out.println("Task 7");
        int[] arr7 = new int[100];
        task7(arr7);

        System.out.println();

        System.out.println("Task 8");
        int[] arr8 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task8(arr8);

        System.out.println();

        System.out.println("Task 9");
        System.out.println("Укажите размерность массива:");
        int w = sc.nextInt();
        int[][] arr9 = new int[w][w];
        task9(arr9);

        System.out.println();

        System.out.println("Task 10");
        System.out.println("Укажите размер массива и число для его значений в формате X Y:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Arrays.toString(task10(a, b)));

        System.out.println();

        /*
        Задать одномерный массив и найти в нем минимальный и максимальный элементы
        */

        System.out.println("Task 10a - MIN | MAX");
        int[] arr10a = {-5, 5, 12, 2, 11, 4, 55, 2, -5, 55, 9, 1};
        task10a(arr10a);

        System.out.println();

        /*
    Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
    вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */

        System.out.println("Task 10b");
        int[] arr10b = {5, 5, 5, 5, 1, 7, 7, 7};
        System.out.println(task10b(arr10b));

    }

    public static Scanner sc = new Scanner(System.in);


    public static boolean task1() {
        System.out.println("Введите 2 числа в формате X Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) > 10 && (x + y) < 20)
            return true;
        else return false;
    }

    public static void task2(int x) {
        if (x >= 0) {
            System.out.println("Задано положительное число");
        } else {
            System.out.println("Задано отрицательное число");
        }
        System.out.println();
    }

    public static boolean task3(int x) {
        if (x >= 0) return false;
        else return true;
    }

    public static boolean task3a() {
        System.out.println("Введите целое число (+ или -):");
        int x = sc.nextInt();
        if (x >= 0) return false;
        else return true;
    }

    public static void task4(String text, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(text);
        }

    }

    public static boolean task5() {
        System.out.println("Укажите год, чтоб узнать является ли он високосным:");
        int x = sc.nextInt();
        if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0)))
            return true;
        else return false;
    }

    public static void task6(int[] arr) {
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        }

        System.out.println("Обработанный массив: ");
        System.out.println(Arrays.toString(arr));

    }

    public static void task7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8(int[] arr) {
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        System.out.println("Обработанный массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void task9(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] task10(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    /*
    Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void task10a(int[] arr) {

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MIN значение: " + min);
        System.out.println("MAX значение: " + max);

    }

    /*
    Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
    вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    static boolean task10b(int[] arr) {

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }


}

