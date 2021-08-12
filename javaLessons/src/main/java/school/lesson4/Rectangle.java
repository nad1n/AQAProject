package school.lesson4;

import school.lesson4.Figure;

public class Rectangle implements Figure{

    private double a;
    private double b;
    private String colorBorder;
    private String colorFill;

    public Rectangle (double a, double b, String colorBorder, String colorFill){
        this.a = a;
        this.b = b;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    double getA(){
        return a;
    }
    double getB(){
        return b;
    }

    String getColorFill(){
        return colorFill;
    }

    String getColorBorder(){
        return colorBorder;
    }


    public double doSquare() {
        double square = getA() * getB();
        return square;
    }

    public double doPerimetr(){
        double perimetr = (getA() + getB())*2;
        return perimetr;
    }


    public String info(){
        return "Rectangle with size " + getA() + " x " + getB() +
                " \n has P=" + doPerimetr() + " S=" + doSquare() +
                " \n and colors fill:" + getColorFill() + " and border:" + getColorBorder();
    }

}
