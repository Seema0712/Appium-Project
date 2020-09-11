package OnticDemo;

import java.util.List;

public abstract class Polygon {

    private List<Double> sides;

    public Polygon(List<Double> sides) {
        this.sides = sides;
    }

    public List<Double> getSides() {
        return sides;
    }

    public void setSides(List<Double> sides) {
        this.sides = sides;
    }

    abstract double area();
}
