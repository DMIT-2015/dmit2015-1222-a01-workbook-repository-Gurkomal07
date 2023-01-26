package ca.nait.dmit.demo2;

public class Rectangles {
    private double theLength;
    private double breadth;

    public double getLength() {
        return theLength;
    }

    public void setLength(double length) {
        this.theLength = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return breadth * theLength;
    }
}
