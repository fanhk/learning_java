package imooc.java.learning1;

/**
 * Created by fhk on 2015-01-10.
 */
public class Circle extends Shape {
    public double Radius = 10;
    final private double PI = 3.1415;
    public double getPerimeter() {
        return 2 * PI * Radius;
    }
    public double getArea() {
        return PI * Radius * Radius;
    }
}
