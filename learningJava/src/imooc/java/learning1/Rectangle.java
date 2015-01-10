package imooc.java.learning1;

/**
 * Created by fhk on 2015-01-10.
 */
public class Rectangle extends Shape {
    public double length = 20;
    public double width = 30;
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public double getArea() {
        return length * width;
    }
}
