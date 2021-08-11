package school.lesson4;

public class Animal {
    protected String name;
    protected String color;
    protected int appetite;
    private static int count = 0;

    protected static boolean satiety;

    public Animal() {
        count++;
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public Animal(String name, String color, int appetite) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        count++;
    }

    /*
    public Animal(String name, String color, int appetite, boolean satiety) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        this.satiety = satiety;
        count++;
    }*/

    protected String getName() {
        return name;
    }

    protected String getColor() {
        return color;
    }

    protected int getAppetite() {
        return appetite;
    }

    /*public static boolean getSatiety() {
        return satiety;
    }*/

    private static int getCount() {
        return count;
    }


    public void info() {

        System.out.println("Animal: " + getName());
    }

    public void run(int dist) {

        System.out.println(getName() + " runs " + dist + "m");
    }

    public void swim(int dist) {

        System.out.println(getName() + " swims " + dist + "m");
    }

    public static void calc() {
        System.out.println();
        System.out.println("You created " + getCount() + " animals");
    }



    /*void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }*/

    public void eat(Plate p) {
        int c = p.decreaseFood(getAppetite());
        if (c == 0) {
            System.out.println(getName() + " has eaten, leaving nothing of food");
            //setSatiety(true);
        } else {
            if (c > 0) {
                System.out.println(getName() + " has eaten, leaving " + c + " of food");
                //setSatiety(true);
            } else {
                System.out.println("Warning! " + getName() + " is hungry, add food!");
                //setSatiety(false);
            }
        }
    }
}




