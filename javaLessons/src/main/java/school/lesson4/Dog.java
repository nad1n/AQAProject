package school.lesson4;

public class Dog extends Animal {

    private static int dcount = 0;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        dcount++;
    }

    public Dog(String name, String color, int appetite) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        dcount++;
    }

    private static int getDcount(){return dcount;}

    @Override
    public void info() {
        System.out.println("Dog name: " + getName() + "; color: " + getColor());
    }

   @Override
    public void run(int dist) {
        if (dist < 0) System.out.println(getName() + " can't run inversely " + dist + "m");
        else {
            if (dist > 500) System.out.println(getName() + " is tired, he/she runs over " + dist + "m");
            else System.out.println(getName() + " runs " + dist + "m");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist < 0) System.out.println(getName() + " can't swim inversely " + dist + "m");
        else {
            if (dist > 0 && dist < 10) System.out.println(getName() + " swims " + dist + "m");
            else System.out.println(getName() + " is tired, he/she runs over " + dist + "m");
        }
    }

    public static void dogCalc() {
        System.out.println();
        System.out.println("You created " + getDcount() + " dogs");
    }

}