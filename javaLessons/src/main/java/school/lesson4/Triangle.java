package school.lesson4;

import school.lesson4.Figure;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private String colorBorder;
    private String colorFill;

    public Triangle(double a, double b, double c, String colorBorder, String colorFill) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
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

    String getColorFill() {
        return colorFill;
    }

    String getColorBorder() {
        return colorBorder;
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
