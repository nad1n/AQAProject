package school.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


class Box<T extends Fruit> {



    ArrayList<T> list = new ArrayList();

    public Box() {
        list = new ArrayList<T>();
    }

    public Box(T... fruits) {
        list = new ArrayList(Arrays.asList(fruits));
    }

    public List<T> getList() {
        return list;
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public void fillBox(T fruit){
        System.out.println("How many Fruits put in Box? :" );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            this.add(fruit);
        }
    }

    public void info() {
        if (list.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("In Box there are " + list.size() + " of " + list.get(0).toString());
        }
    }

    public double getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else return list.size() * list.get(0).getWeight();

    }

    public void infoWeight() {
        if (getWeight() == 0) {
            System.out.println("Box is empty");
        } else {
            System.out.println("Weight of Box: " + getWeight());
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void moveTo(Box<T> box) {

        box.list.addAll(this.list);
        this.list.clear();
    }
}