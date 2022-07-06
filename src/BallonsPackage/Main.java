package BallonsPackage;

import java.util.ArrayList;
import java.util.List;

import static BallonsPackage.Balloon.*;

public class Main {
    public static void main(String[] args) {
        Balloon balloon0 = new Balloon();
        System.out.println(balloon0);
        Balloon balloon1 = new Balloon("Red balloon", 30.0f, 0.25f);
        Balloon balloon2 = new Balloon(balloon1);
        System.out.println(balloon2);
        balloon2.setHeight(0.12f);
        System.out.println(balloon2);
        balloon2.setDiameter(40.0f);
        System.out.println(balloon2);
        pump(balloon2, 123.5f);
        System.out.println(balloon2);
        List<Balloon> balloonList = new ArrayList<>();

        balloonList.add(new Balloon("Red balloon", 30.0f, 0.5f));
        balloonList.add(new Balloon("Yellow balloon", 35.0f, 0.25f));
        balloonList.add(new Balloon("Green balloon", 40.0f, 0.1f));
        balloonList.add(new Balloon("Purple balloon", 57.0f, 0.3f));
        balloonList.add(new Balloon("Grey balloon", 44.0f, 0.11f));
        balloonList.add(new Balloon("White balloon", 10.0f, 0.22f));
        balloonList.add(new Balloon("Black balloon", 15.0f, 0.18f));
        balloonList.add(new Balloon("Pink balloon", 22.0f, 0.11f));
        balloonList.add(new Balloon("Blue balloon", 46.0f, 0.33f));
        balloonList.add(new Balloon("Golden balloon", 11.0f, 0.12f));

        Balloon largestDiameter = new Balloon();
        float totalHeight = 0;
        for (Balloon balloon : balloonList) {
            if (balloon.getDiameter() > largestDiameter.getDiameter())
                largestDiameter = balloon;
            totalHeight += balloon.getHeight();
        }
        System.out.println("Balloon with largest diameter: " + largestDiameter);
        System.out.println("Total height: " + totalHeight + " m.");

        balloon1.setDiameter(-2.0f);
    }
}
