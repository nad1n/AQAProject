package school.lesson4;

public class Plate {
    public int food;

    public Plate(int food) {

        this.food = food;
    }

    public int decreaseFood(int n) {
        this.food = food - n;
        return food;
    }

    protected int getFood() {
        return food;
    }

    void increaseFood(int n) {
        this.food += n;
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
