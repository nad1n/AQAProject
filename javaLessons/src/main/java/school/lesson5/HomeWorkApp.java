package school.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1 ");

        String[] arrS = new String[]{"One", "Two", "Three", "Four", "Five", "Six"};
        Integer[] arrI = new Integer[]{1, 5, 3, 4, 2, 6, 7, 8};

        System.out.println("Исходный массив" + Arrays.toString(arrS));
        reflectItems(arrS, 2, 5);
        System.out.println("Измененный массив" + Arrays.toString(arrS));


        System.out.println("Исходный массив" + Arrays.toString(arrI));
        reflectItems(arrI, 1, 4);
        System.out.println("Измененный массив" + Arrays.toString(arrI));


        //Task 2
        System.out.println(" \nTask 2 ");
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Orange> boxOrange1 = new Box();
        Box<Orange> boxOrange2 = new Box();
        Box<Apple> boxApple1 = new Box();

        boxOrange1.fillBox(orange);
        boxOrange2.fillBox(orange);
        boxApple1.fillBox(apple);

        boxApple1.info();
        boxOrange1.info();
        boxOrange2.info();

        boxApple1.infoWeight();
        boxOrange1.infoWeight();
        boxOrange2.infoWeight();

        System.out.println(" \nNow Compare Boxes:");

        System.out.println("BoxApple1 is equal to BoxOrange1? :" + boxApple1.compare(boxOrange1));
        System.out.println("BoxOrange1 is equal to BoxOrange2? :" + boxOrange1.compare(boxOrange2));
        System.out.println("BoxOrange2 is equal to BoxApple1? :" + boxOrange2.compare(boxApple1));

        System.out.println(" \nNow Move Orange from 2 to 1 Box:");

        boxOrange2.moveTo(boxOrange1);
        boxOrange1.info();
        boxOrange2.info();
        boxOrange1.infoWeight();
        boxOrange2.infoWeight();

    }

    private static <T> void reflectItems(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
