package school.lesson5;

public class Fruit {

    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

}

class Apple extends Fruit{

    private final float weightApple = 1.0f;

    public Apple(){
        super(1.0f);
    }

}

class Orange extends Fruit{

    private final float weightOrange = 1.5f;

    public Orange(){
        super(1.5f);
    }

}