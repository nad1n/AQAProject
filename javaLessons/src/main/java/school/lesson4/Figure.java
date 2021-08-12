package school.lesson4;

interface FigureAction {

    double doSquare();

    double doPerimetr();

}

public class Figure {
    protected String colorBorder;
    protected String colorFill;

    public Figure(String colorBorder, String colorFill){
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    protected String getColorFill() {
        return colorFill;
    }

    protected String getColorBorder() {
        return colorBorder;
    }
}

class Rectangle extends Figure implements FigureAction {

    private double a;
    private double b;

    public Rectangle(String colorBorder, String colorFill, double a, double b) {
        super(colorBorder, colorFill);
        this.a = a;
        this.b = b;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    public double doSquare() {
        double square = getA() * getB();
        return square;
    }


    public double doPerimetr() {
        double perimetr = (getA() + getB()) * 2;
        return perimetr;
    }


    public String info() {
        return "Rectangle with size " + getA() + " x " + getB() +
                " \n has P=" + doPerimetr() + " S=" + doSquare() +
                " \n and colors fill:" + getColorFill() + " and border:" + getColorBorder();
    }

}

class Round extends Figure implements FigureAction {
    double r;

    public Round(String colorBorder, String colorFill, double r) {
        super(colorBorder, colorFill);
        this.r = r;

    }

    double getR() {
        return r;
    }


    public double doPerimetr() {
        double perimetr = Math.PI * 2 * getR();
        return perimetr;
    }


    public double doSquare() {
        double square = Math.PI * (getR() * getR());
        return square;
    }

    public String info(){
        return "Round with radius " + getR() +
                " \n has P=" + doPerimetr() + " S=" + doSquare() +
                " \n and colors fill:" + getColorFill() + " and border:" + getColorBorder();
    }

}

class Triangle extends Figure implements FigureAction {
    private double a;
    private double b;
    private double c;

    public Triangle(String colorBorder, String colorFill, double a, double b, double c) {
        super(colorBorder, colorFill);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }


    public double doPerimetr() {
        double perimetr = getA() + getB() + getC();
        return perimetr;
    }

    public double doSquare() {
        double p = doPerimetr() / 2;
        double square = Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
        return square;
    }

    public String info(){
        return "Triangle with size " + getA() + " x " + getB() + " x " + getC() +
                " \n has P=" + doPerimetr() + " S=" + doSquare() +
                " \n and colors fill:" + getColorFill() + " and border:" + getColorBorder();
    }

}