package school.lesson4;

public class Cat extends Animal {

    private static int ccount = 0;

    public Cat(String name, String color) {
        super(name, color);
        ccount++;
    }

    public Cat(String name, String color, int appetite) {
        super(name, color, appetite);
        ccount++;
    }

    public Cat(String name, String color, int appetite, boolean satiety) {
        super(name, color, appetite, satiety);
        ccount++;
    }

    private static int getCcount() {
        return ccount;
    }

    @Override
    public void info() {
        System.out.println("Cat name: " + getName() + "; color: " + getColor() +
                "; appetite: " + getAppetite());
    }


    @Override
    public void run(int dist) {
        if (dist < 0) System.out.println(getName() + " can't run inversely " + dist + "m");
        else {
            if (dist > 200) System.out.println(getName() + " is tired, he/she runs over " + dist + "m");
            else System.out.println(getName() + " runs " + dist + "m");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist != 0) System.out.println("Note: cats don't like swim!");
        else System.out.println("Right! " + getName() + " don't like swim!");
    }

    public static void catCalc() {
        System.out.println();
        System.out.println("You created " + getCcount() + " cats");
    }


}