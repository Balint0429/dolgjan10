package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    public double calcArea(double side, double angle) {
        if (side <= 0 || angle <= 0) {
            throw new InputMismatchException();
        }
        double radians = Math.toRadians(angle);
        double area = Math.pow(side, 2) * Math.sin(radians);

        return area;
    }
}
