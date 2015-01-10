package imooc.java.learning1;

/**
 * Created by fhk on 2015-01-10.
 */
public class Initial {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Shape s2 = new Circle();
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
    }
}
