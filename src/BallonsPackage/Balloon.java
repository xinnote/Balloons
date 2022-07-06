package BallonsPackage;

import static java.lang.Math.*;
public class Balloon {

    private String name;
    private float diameter;
    private float height;

    public Balloon() {
    }

    public Balloon(String name, float diameter, float height) {
        this.name = name;
        setDiameter(diameter);
        setHeight(height);
    }

    public Balloon(Balloon balloon) {
        this.name = balloon.name;
        this.diameter = balloon.diameter;
        this.height = balloon.height;
    }

    public void setDiameter(float diameter) {
        if (IsNumberNegative(diameter))
            throw new NegativeNumberException("It is not allowed to use negative value of diameter.");
        else
            this.diameter = diameter;
    }

    public void setHeight(float height) {
        if (IsNumberNegative(height))
            throw new NegativeNumberException("It is not allowed to use negative value of height.");
        else
            this.height += height;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "This is " + this.name + ". This balloon is "
                + this.diameter + " cm in diameter and "
                + this.height + " m in height.";
    }

    public static void pump(Balloon balloon, float area) {
        float diameter = 2 * (float) sqrt(area/PI);
        balloon.setDiameter(diameter);
    }
    private boolean IsNumberNegative(float number) {
        return number < 0;
    }

    private static class NegativeNumberException extends IllegalArgumentException {
        NegativeNumberException(String error) {
            super(error);
        }
    }
}
