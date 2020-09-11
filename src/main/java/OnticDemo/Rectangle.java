package OnticDemo;

import OnticDemo.Polygon;

import java.util.List;

public class Rectangle extends Polygon {

    public Rectangle(List<Double> sides) {
        super(sides);
    }

    @Override
    double area() {
       return getSides().get(0)*getSides().get(1);
    }
}
