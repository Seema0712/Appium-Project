package OnticDemo;

import OnticDemo.Polygon;

import java.util.Arrays;
import java.util.List;

public class PolygonDemo {

    public static void main(String[] args) {
        List<Double> sidesRectangle = Arrays.asList(4.0,5.0,4.0,5.0);
        List<Double> sidesSquare = Arrays.asList(4.0,4.0,4.0,4.0);
        Polygon poly = new Rectangle(sidesRectangle);
        System.out.println(poly.area());
        poly = new Square(sidesSquare);
        System.out.println(poly.area());
    }
}
