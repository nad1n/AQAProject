package school.lesson4;

import school.lesson4.Figure;

public class Round implements Figure {
    double r;
    private String colorBorder;
    private String colorFill;

    public Round(double r, String colorBorder, String colorFill) {
        this.r = r;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    double getR() {
        return r;
    }

    String getColorFill() {
        return colorFill;
    }

    String getColorBorder() {
        return colorBorder;
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
