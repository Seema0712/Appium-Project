package OnticDemo;

import OnticDemo.Polygon;

import java.util.List;

public class Square extends Polygon {

    public Square(List<Double> sides) {
        super(sides);
    }

    @Override
    double area() {
        return getSides().get(0)*getSides().get(0);
    }
}
