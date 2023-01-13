package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        if (radius <= 0)
        {
            throw new Exception("Radius should be positive non zero number");
        }
        this.radius = radius;
    }

    public Circle() throws Exception {
        setRadius(1);
    }

    public Circle(double radius) throws Exception {
        setRadius((radius));
    }

    public double Area() {
        return 3.14 * radius * radius;
    }

    public void PrintArea()
    {
         System.out.printf("Area of circle is %.2f", Area());
    }


}
