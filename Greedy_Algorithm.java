import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Greedy_Algorithm extends Canvas {

    public static float sD1 = 1000000000;
    public static float sD2 = 1000000000;
    public static float sD3 = 1000000000;
    public static float sD4 = 1000000000;
    public static float sD5 = 1000000000;
    public static float sD6 = 1000000000;
    public static float sD7 = 1000000000;
    public static float sD8 = 1000000000;
    public static float sD9 = 1000000000;
    public static float sD10 = 1000000000;
    public static float sD11 = 1000000000;
    public static float sD12 = 1000000000;
    public static float sD13 = 1000000000;
    public static float sD14 = 1000000000;
    public static float sD15 = 1000000000;
    public static float sD16 = 1000000000;
    public static float sD17 = 1000000000;
    public static float sD18 = 1000000000;
    public static float sD19 = 1000000000;
    public static float sD20 = 1000000000;
    public static float sD21 = 1000000000;
    public static float sD22 = 1000000000;
    public static float sD23 = 1000000000;
    public static float sD24 = 1000000000;
    public static float sD25 = 1000000000;
    public static float sD26 = 1000000000;
    public static float sD27 = 1000000000;
    public static float sD28 = 1000000000;
    public static float sD29 = 1000000000;
    public static float sD30 = 1000000000;
    public static float sD31 = 1000000000;
    public static float sD32 = 1000000000;
    public static float sD33 = 1000000000;
    public static float sD34 = 1000000000;
    public static float sD35 = 1000000000;
    public static float sD36 = 1000000000;
    public static float sD37 = 1000000000;
    public static float sD38 = 1000000000;
    public static float sD39 = 1000000000;
    public static float sD40 = 1000000000;
    public static float sD41 = 1000000000;
    public static float sD42 = 1000000000;
    public static float sD43 = 1000000000;
    public static float sD44 = 1000000000;
    public static float sD45 = 1000000000;
    public static float sD46 = 1000000000;

    public static float currentCityX1 = 1000000000;
    public static float currentCityY1 = 1000000000;

    public static float currentCityX2 = 1000000000;
    public static float currentCityY2 = 1000000000;

    public static float currentCityX3 = 1000000000;
    public static float currentCityY3 = 1000000000;

    public static float currentCityX4 = 1000000000;
    public static float currentCityY4 = 1000000000;

    public static float currentCityX5 = 1000000000;
    public static float currentCityY5 = 1000000000;

    public static float currentCityX6 = 1000000000;
    public static float currentCityY6 = 1000000000;

    public static float currentCityX7 = 1000000000;
    public static float currentCityY7 = 1000000000;

    public static float currentCityX8 = 1000000000;
    public static float currentCityY8 = 1000000000;

    public static float currentCityX9 = 1000000000;
    public static float currentCityY9 = 1000000000;

    public static float currentCityX10 = 1000000000;
    public static float currentCityY10 = 1000000000;

    public static float currentCityX11 = 1000000000;
    public static float currentCityY11 = 1000000000;

    public static float currentCityX12 = 1000000000;
    public static float currentCityY12 = 1000000000;

    public static float currentCityX13 = 1000000000;
    public static float currentCityY13 = 1000000000;

    public static float currentCityX14 = 1000000000;
    public static float currentCityY14 = 1000000000;

    public static float currentCityX15 = 1000000000;
    public static float currentCityY15 = 1000000000;

    public static float currentCityX16 = 1000000000;
    public static float currentCityY16 = 1000000000;

    public static float currentCityX17 = 1000000000;
    public static float currentCityY17 = 1000000000;

    public static float currentCityX18 = 1000000000;
    public static float currentCityY18 = 1000000000;

    public static float currentCityX19 = 1000000000;
    public static float currentCityY19 = 1000000000;

    public static float currentCityX20 = 1000000000;
    public static float currentCityY20 = 1000000000;

    public static float currentCityX21 = 1000000000;
    public static float currentCityY21 = 1000000000;

    public static float currentCityX22 = 1000000000;
    public static float currentCityY22 = 1000000000;

    public static float currentCityX23 = 1000000000;
    public static float currentCityY23 = 1000000000;

    public static float currentCityX24 = 1000000000;
    public static float currentCityY24 = 1000000000;

    public static float currentCityX25 = 1000000000;
    public static float currentCityY25 = 1000000000;

    public static float currentCityX26 = 1000000000;
    public static float currentCityY26 = 1000000000;

    public static float currentCityX27 = 1000000000;
    public static float currentCityY27 = 1000000000;

    public static float currentCityX28 = 1000000000;
    public static float currentCityY28 = 1000000000;

    public static float currentCityX29 = 1000000000;
    public static float currentCityY29 = 1000000000;

    public static float currentCityX30 = 1000000000;
    public static float currentCityY30 = 1000000000;

    public static float currentCityX31 = 1000000000;
    public static float currentCityY31 = 1000000000;

    public static float currentCityX32 = 1000000000;
    public static float currentCityY32 = 1000000000;

    public static float currentCityX33 = 1000000000;
    public static float currentCityY33 = 1000000000;

    public static float currentCityX34 = 1000000000;
    public static float currentCityY34 = 1000000000;

    public static float currentCityX35 = 1000000000;
    public static float currentCityY35 = 1000000000;

    public static float currentCityX36 = 1000000000;
    public static float currentCityY36 = 1000000000;

    public static float currentCityX37 = 1000000000;
    public static float currentCityY37 = 1000000000;

    public static float currentCityX38 = 1000000000;
    public static float currentCityY38 = 1000000000;

    public static float currentCityX39 = 1000000000;
    public static float currentCityY39 = 1000000000;

    public static float currentCityX40 = 1000000000;
    public static float currentCityY40 = 1000000000;

    public static float currentCityX41 = 1000000000;
    public static float currentCityY41 = 1000000000;

    public static float currentCityX42 = 1000000000;
    public static float currentCityY42 = 1000000000;

    public static float currentCityX43 = 1000000000;
    public static float currentCityY43 = 1000000000;

    public static float currentCityX44 = 1000000000;
    public static float currentCityY44 = 1000000000;

    public static float currentCityX45 = 1000000000;
    public static float currentCityY45 = 1000000000;

    public static float currentCityX46 = 1000000000;
    public static float currentCityY46 = 1000000000;

    public static float lastElementOnTheListX = 1000000000;
    public static float lastElementOnTheListY = 1000000000;

    public static ArrayList<Float> xC = new ArrayList<Float>();                  // Creating an ArrayList for keep x coordinates
    public static ArrayList<Float> yC = new ArrayList<Float>();                  // Creating an ArrayList for keep y coordinates

    public static ArrayList<Float> paintX = new ArrayList<Float>();                  // Creating an ArrayList for keep x coordinates
    public static ArrayList<Float> paintY = new ArrayList<Float>();                  // Creating an ArrayList for keep y coordinates

    public static ArrayList<Float> shortingDistances = new ArrayList<Float>();


    public static void main(String[] args) throws FileNotFoundException {

        float[] xyC = readFile("C:\\Users\\yasin\\IdeaProjects\\FormalLanguagesProject\\data\\att48_xy.txt");

        float[] paintXYC = readFile("C:\\Users\\yasin\\IdeaProjects\\FormalLanguagesProject\\data\\att48_xy.txt");

        for (int x = 0; x < xyC.length; x = x + 2) {
            xC.add(xyC[x]);                                                      // Adding x coordinates to the x Coordinates ArrayList
        }
        for (int y = 1; y < xyC.length; y = y + 2) {
            yC.add(xyC[y]);                                                      // Adding y coordinates to the y Coordinates ArrayList
        }
        for (int pX = 0; pX < xyC.length; pX = pX + 2) {
            paintX.add(xyC[pX]);                                                      // Adding x coordinates to the x Coordinates ArrayList
        }
        for (int pY = 1; pY < xyC.length; pY = pY + 2) {
            paintY.add(xyC[pY]);                                                      // Adding x coordinates to the x Coordinates ArrayList
        }

        Date startDate = new Date();
        greedyAlgorithm();
        Date endDate = new Date();

        mainWindow();

        int numSeconds = (int)((endDate.getTime() - startDate.getTime()));
        System.out.println("The algorithm needs " + numSeconds + " milli seconds.");
    }


    public void paint(Graphics g) {

        g.setColor(Color.blue);
        for (int i = 0; i < paintX.size(); i++) {  //This looks at all the x and y coordinates at the same time in both arraylists
            g.fillOval((Math.round(paintX.get(i)) % 800), (Math.round(paintY.get(i)) % 500), 10, 10);
        }
        //
//        for (int counter = 0; counter < paintX.size(); counter++) {
//            System.out.println("Xs: " + paintX.get(counter));
//        }

//        System.out.println("Paint X: " + paintX.get(0) + " Paint Y: " + paintY.get(0));
//        System.out.println("Paint currentCityX1: " + currentCityX1 + "Paint currentCityY1: " + currentCityY1);
//        System.out.println("Paint currentCityX1: " + currentCityX2 + "Paint currentCityY1: " + currentCityY2);

        g.drawLine(Math.round(paintX.get(0)) % 800 + 5, Math.round(paintY.get(0)) % 500 + 5, Math.round(currentCityX1) % 800 + 5, Math.round(currentCityY1) % 500 + 5);
        g.drawLine(Math.round(currentCityX1) % 800 + 5, Math.round(currentCityY1) % 500 + 5, Math.round(currentCityX2) % 800 + 5, Math.round(currentCityY2) % 500 + 5);
        g.drawLine(Math.round(currentCityX2) % 800 + 5, Math.round(currentCityY2) % 500 + 5, Math.round(currentCityX3) % 800 + 5, Math.round(currentCityY3) % 500 + 5);
        g.drawLine(Math.round(currentCityX3) % 800 + 5, Math.round(currentCityY3) % 500 + 5, Math.round(currentCityX4) % 800 + 5, Math.round(currentCityY4) % 500 + 5);
        g.drawLine(Math.round(currentCityX4) % 800 + 5, Math.round(currentCityY4) % 500 + 5, Math.round(currentCityX5) % 800 + 5, Math.round(currentCityY5) % 500 + 5);
        g.drawLine(Math.round(currentCityX5) % 800 + 5, Math.round(currentCityY5) % 500 + 5, Math.round(currentCityX6) % 800 + 5, Math.round(currentCityY6) % 500 + 5);
        g.drawLine(Math.round(currentCityX6) % 800 + 5, Math.round(currentCityY6) % 500 + 5, Math.round(currentCityX7) % 800 + 5, Math.round(currentCityY7) % 500 + 5);
        g.drawLine(Math.round(currentCityX7) % 800 + 5, Math.round(currentCityY7) % 500 + 5, Math.round(currentCityX8) % 800 + 5, Math.round(currentCityY8) % 500 + 5);
        g.drawLine(Math.round(currentCityX8) % 800 + 5, Math.round(currentCityY8) % 500 + 5, Math.round(currentCityX9) % 800 + 5, Math.round(currentCityY9) % 500 + 5);
        g.drawLine(Math.round(currentCityX9) % 800 + 5, Math.round(currentCityY9) % 500 + 5, Math.round(currentCityX10) % 800 + 5, Math.round(currentCityY10) % 500 + 5);
        g.drawLine(Math.round(currentCityX10) % 800 + 5, Math.round(currentCityY10) % 500 + 5, Math.round(currentCityX11) % 800 + 5, Math.round(currentCityY11) % 500 + 5);
        g.drawLine(Math.round(currentCityX11) % 800 + 5, Math.round(currentCityY11) % 500 + 5, Math.round(currentCityX12) % 800 + 5, Math.round(currentCityY12) % 500 + 5);
        g.drawLine(Math.round(currentCityX12) % 800 + 5, Math.round(currentCityY12) % 500 + 5, Math.round(currentCityX13) % 800 + 5, Math.round(currentCityY13) % 500 + 5);
        g.drawLine(Math.round(currentCityX13) % 800 + 5, Math.round(currentCityY13) % 500 + 5, Math.round(currentCityX14) % 800 + 5, Math.round(currentCityY14) % 500 + 5);
        g.drawLine(Math.round(currentCityX14) % 800 + 5, Math.round(currentCityY14) % 500 + 5, Math.round(currentCityX15) % 800 + 5, Math.round(currentCityY15) % 500 + 5);
        g.drawLine(Math.round(currentCityX15) % 800 + 5, Math.round(currentCityY15) % 500 + 5, Math.round(currentCityX16) % 800 + 5, Math.round(currentCityY16) % 500 + 5);
        g.drawLine(Math.round(currentCityX16) % 800 + 5, Math.round(currentCityY16) % 500 + 5, Math.round(currentCityX17) % 800 + 5, Math.round(currentCityY17) % 500 + 5);
        g.drawLine(Math.round(currentCityX17) % 800 + 5, Math.round(currentCityY17) % 500 + 5, Math.round(currentCityX18) % 800 + 5, Math.round(currentCityY18) % 500 + 5);
        g.drawLine(Math.round(currentCityX18) % 800 + 5, Math.round(currentCityY18) % 500 + 5, Math.round(currentCityX19) % 800 + 5, Math.round(currentCityY19) % 500 + 5);
        g.drawLine(Math.round(currentCityX19) % 800 + 5, Math.round(currentCityY19) % 500 + 5, Math.round(currentCityX20) % 800 + 5, Math.round(currentCityY20) % 500 + 5);
        g.drawLine(Math.round(currentCityX20) % 800 + 5, Math.round(currentCityY20) % 500 + 5, Math.round(currentCityX21) % 800 + 5, Math.round(currentCityY21) % 500 + 5);
        g.drawLine(Math.round(currentCityX21) % 800 + 5, Math.round(currentCityY21) % 500 + 5, Math.round(currentCityX22) % 800 + 5, Math.round(currentCityY22) % 500 + 5);
        g.drawLine(Math.round(currentCityX22) % 800 + 5, Math.round(currentCityY22) % 500 + 5, Math.round(currentCityX23) % 800 + 5, Math.round(currentCityY23) % 500 + 5);
        g.drawLine(Math.round(currentCityX23) % 800 + 5, Math.round(currentCityY23) % 500 + 5, Math.round(currentCityX24) % 800 + 5, Math.round(currentCityY24) % 500 + 5);
        g.drawLine(Math.round(currentCityX24) % 800 + 5, Math.round(currentCityY24) % 500 + 5, Math.round(currentCityX25) % 800 + 5, Math.round(currentCityY25) % 500 + 5);
        g.drawLine(Math.round(currentCityX25) % 800 + 5, Math.round(currentCityY25) % 500 + 5, Math.round(currentCityX26) % 800 + 5, Math.round(currentCityY26) % 500 + 5);
        g.drawLine(Math.round(currentCityX26) % 800 + 5, Math.round(currentCityY26) % 500 + 5, Math.round(currentCityX27) % 800 + 5, Math.round(currentCityY27) % 500 + 5);
        g.drawLine(Math.round(currentCityX27) % 800 + 5, Math.round(currentCityY27) % 500 + 5, Math.round(currentCityX28) % 800 + 5, Math.round(currentCityY28) % 500 + 5);
        g.drawLine(Math.round(currentCityX28) % 800 + 5, Math.round(currentCityY28) % 500 + 5, Math.round(currentCityX29) % 800 + 5, Math.round(currentCityY29) % 500 + 5);
        g.drawLine(Math.round(currentCityX29) % 800 + 5, Math.round(currentCityY29) % 500 + 5, Math.round(currentCityX30) % 800 + 5, Math.round(currentCityY30) % 500 + 5);
        g.drawLine(Math.round(currentCityX30) % 800 + 5, Math.round(currentCityY30) % 500 + 5, Math.round(currentCityX31) % 800 + 5, Math.round(currentCityY31) % 500 + 5);
        g.drawLine(Math.round(currentCityX31) % 800 + 5, Math.round(currentCityY31) % 500 + 5, Math.round(currentCityX32) % 800 + 5, Math.round(currentCityY32) % 500 + 5);
        g.drawLine(Math.round(currentCityX32) % 800 + 5, Math.round(currentCityY32) % 500 + 5, Math.round(currentCityX33) % 800 + 5, Math.round(currentCityY33) % 500 + 5);
        g.drawLine(Math.round(currentCityX33) % 800 + 5, Math.round(currentCityY33) % 500 + 5, Math.round(currentCityX34) % 800 + 5, Math.round(currentCityY34) % 500 + 5);
        g.drawLine(Math.round(currentCityX34) % 800 + 5, Math.round(currentCityY34) % 500 + 5, Math.round(currentCityX35) % 800 + 5, Math.round(currentCityY35) % 500 + 5);
        g.drawLine(Math.round(currentCityX35) % 800 + 5, Math.round(currentCityY35) % 500 + 5, Math.round(currentCityX36) % 800 + 5, Math.round(currentCityY36) % 500 + 5);
        g.drawLine(Math.round(currentCityX36) % 800 + 5, Math.round(currentCityY36) % 500 + 5, Math.round(currentCityX37) % 800 + 5, Math.round(currentCityY37) % 500 + 5);
        g.drawLine(Math.round(currentCityX37) % 800 + 5, Math.round(currentCityY37) % 500 + 5, Math.round(currentCityX38) % 800 + 5, Math.round(currentCityY38) % 500 + 5);
        g.drawLine(Math.round(currentCityX38) % 800 + 5, Math.round(currentCityY38) % 500 + 5, Math.round(currentCityX39) % 800 + 5, Math.round(currentCityY39) % 500 + 5);
        g.drawLine(Math.round(currentCityX39) % 800 + 5, Math.round(currentCityY39) % 500 + 5, Math.round(currentCityX40) % 800 + 5, Math.round(currentCityY40) % 500 + 5);
        g.drawLine(Math.round(currentCityX40) % 800 + 5, Math.round(currentCityY40) % 500 + 5, Math.round(currentCityX41) % 800 + 5, Math.round(currentCityY41) % 500 + 5);
        g.drawLine(Math.round(currentCityX41) % 800 + 5, Math.round(currentCityY41) % 500 + 5, Math.round(currentCityX42) % 800 + 5, Math.round(currentCityY42) % 500 + 5);
        g.drawLine(Math.round(currentCityX42) % 800 + 5, Math.round(currentCityY42) % 500 + 5, Math.round(currentCityX43) % 800 + 5, Math.round(currentCityY43) % 500 + 5);
        g.drawLine(Math.round(currentCityX43) % 800 + 5, Math.round(currentCityY43) % 500 + 5, Math.round(currentCityX44) % 800 + 5, Math.round(currentCityY44) % 500 + 5);
        g.drawLine(Math.round(currentCityX44) % 800 + 5, Math.round(currentCityY44) % 500 + 5, Math.round(currentCityX45) % 800 + 5, Math.round(currentCityY45) % 500 + 5);
        g.drawLine(Math.round(currentCityX45) % 800 + 5, Math.round(currentCityY45) % 500 + 5, Math.round(currentCityX46) % 800 + 5, Math.round(currentCityY46) % 500 + 5);
        g.drawLine(Math.round(currentCityX46) % 800 + 5, Math.round(currentCityY46) % 500 + 5, Math.round(lastElementOnTheListX) % 800 + 5, Math.round(lastElementOnTheListY) % 500 + 5);
        g.drawLine(Math.round(paintX.get(0)) % 800 + 5, Math.round(paintY.get(0)) % 500 + 5, Math.round(lastElementOnTheListX) % 800 + 5, Math.round(lastElementOnTheListY) % 500 + 5);




//        System.out.println("paintX.get(0): " + paintX.get(0) + " paintY.get(0): " + paintY.get(0));
//        System.out.println("currentCityX1: " + currentCityX1 + " currentCityY1: " + currentCityY1);
//        System.out.println("currentCityX2: " + currentCityX2 + " currentCityY2: " + currentCityY2);
//        System.out.println("currentCityX3: " + currentCityX3 + " currentCityY4: " + currentCityY3);
//        System.out.println("currentCityX4: " + currentCityX4 + " currentCityY5: " + currentCityY4);
//        System.out.println("currentCityX5: " + currentCityX5 + " currentCityY6: " + currentCityY5);
//        System.out.println("currentCityX6: " + currentCityX6 + " currentCityY7: " + currentCityY6);
//        System.out.println("currentCityX7: " + currentCityX7 + " currentCityY8: " + currentCityY7);
//        System.out.println("currentCityX8: " + currentCityX8 + " currentCityY9: " + currentCityY8);
//        System.out.println("currentCityX9: " + currentCityX9 + " currentCityY10: " + currentCityY9);
//        System.out.println("currentCityX10: " + currentCityX10 + " currentCityY11: " + currentCityY10);
//        System.out.println("currentCityX11: " + currentCityX11 + " currentCityY12: " + currentCityY11);
//        System.out.println("currentCityX12: " + currentCityX12 + " currentCityY13: " + currentCityY12);
//        System.out.println("currentCityX13: " + currentCityX13 + " currentCityY14: " + currentCityY13);
//        System.out.println("currentCityX14: " + currentCityX14 + " currentCityY15: " + currentCityY14);
//        System.out.println("currentCityX15: " + currentCityX15 + " currentCityY16: " + currentCityY15);
//        System.out.println("currentCityX16: " + currentCityX16 + " currentCityY17: " + currentCityY16);
//        System.out.println("currentCityX17: " + currentCityX17 + " currentCityY18: " + currentCityY17);
//        System.out.println("currentCityX18: " + currentCityX18 + " currentCityY19: " + currentCityY18);
//        System.out.println("currentCityX19: " + currentCityX19 + " currentCityY10: " + currentCityY19);
//        System.out.println("currentCityX20: " + currentCityX20 + " currentCityY20: " + currentCityY20);
//        System.out.println("currentCityX21: " + currentCityX21 + " currentCityY21: " + currentCityY21);
//        System.out.println("currentCityX22: " + currentCityX22 + " currentCityY22: " + currentCityY22);
//        System.out.println("currentCityX23: " + currentCityX23 + " currentCityY23: " + currentCityY23);
//        System.out.println("currentCityX24: " + currentCityX24 + " currentCityY24: " + currentCityY24);
//        System.out.println("currentCityX25: " + currentCityX25 + " currentCityY25: " + currentCityY25);
//        System.out.println("currentCityX26: " + currentCityX26 + " currentCityY26: " + currentCityY26);
//        System.out.println("currentCityX27: " + currentCityX27 + " currentCityY27: " + currentCityY27);
//        System.out.println("currentCityX28: " + currentCityX28 + " currentCityY28: " + currentCityY28);
//        System.out.println("currentCityX29: " + currentCityX29 + " currentCityY29: " + currentCityY29);
//        System.out.println("currentCityX30: " + currentCityX30 + " currentCityY30: " + currentCityY30);
//        System.out.println("currentCityX31: " + currentCityX31 + " currentCityY31: " + currentCityY31);
//        System.out.println("currentCityX32: " + currentCityX32 + " currentCityY32: " + currentCityY32);
//        System.out.println("currentCityX33: " + currentCityX33 + " currentCityY33: " + currentCityY33);
//        System.out.println("currentCityX34: " + currentCityX34 + " currentCityY34: " + currentCityY34);
//        System.out.println("currentCityX35: " + currentCityX35 + " currentCityY35: " + currentCityY35);
//        System.out.println("currentCityX36: " + currentCityX36 + " currentCityY36: " + currentCityY36);
//        System.out.println("currentCityX37: " + currentCityX37 + " currentCityY37: " + currentCityY37);
//        System.out.println("currentCityX38: " + currentCityX38 + " currentCityY38: " + currentCityY38);
//        System.out.println("currentCityX39: " + currentCityX39 + " currentCityY39: " + currentCityY39);
//        System.out.println("currentCityX40: " + currentCityX40 + " currentCityY40: " + currentCityY40);
//        System.out.println("currentCityX41: " + currentCityX41 + " currentCityY41: " + currentCityY41);
//        System.out.println("currentCityX42: " + currentCityX42 + " currentCityY41: " + currentCityY42);
//        System.out.println("currentCityX43: " + currentCityX43 + " currentCityY42: " + currentCityY43);
//        System.out.println("currentCityX44: " + currentCityX44 + " currentCityY43: " + currentCityY44);
//        System.out.println("currentCityX45: " + currentCityX45 + " currentCityY44: " + currentCityY45);
//        System.out.println("currentCityX46: " + currentCityX46 + " currentCityY45: " + currentCityY46);

    }

    public static void greedyAlgorithm() {

        for (int y1 = 1; y1 < yC.size(); y1++) {
            float currentDistance = (float) Math.sqrt(Math.abs((xC.get(0) - xC.get(y1)) * (xC.get(0) - xC.get(y1))) +
                    Math.abs((yC.get(0) - yC.get(y1)) * (yC.get(0) - yC.get(y1))));
            if (currentDistance <= sD1) {
                sD1 = currentDistance;
                currentCityX1 = xC.get(y1);                                         // Find the last X coordinate for shortest way
                currentCityY1 = yC.get(y1);                                         // Find the last Y coordinate for shortes way
            }
//            System.out.println("Current CityX: " + xC.get(0));
//            System.out.println("Current CityY: " + yC.get(0));
//            System.out.println("Compare cityX: " + xC.get(y1));
//            System.out.println("Compare cityY: " + yC.get(y1));
//            System.out.println("Shortest distance so far: ["+y1+"] "  + sD1);
        }
        xC.remove(xC.get(0));
        yC.remove(yC.get(0));
        xC.remove(currentCityX1);
        yC.remove(currentCityY1);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

//        System.out.println("1. shortest path so far: " + sD1);
//
        for (int y2 = 1; y2 < yC.size(); y2++) {
            float currentDistance2 = (float) Math.sqrt(Math.abs((currentCityX1 - xC.get(y2)) * (currentCityX1 - xC.get(y2))) +
                    Math.abs(currentCityY1 - yC.get(y2)) * (currentCityY1 - yC.get(y2)));
            if (currentDistance2 <= sD2) {
                sD2 = currentDistance2;
                currentCityX2 = xC.get(y2);
                currentCityY2 = yC.get(y2);
            }
//            System.out.println("Current CityX: " + currentCityX1);
//            System.out.println("Current CityY: " + currentCityY1);
//            System.out.println("Compare cityX: " + xC.get(y2));
//            System.out.println("Compare cityY: " + yC.get(y2));
//            System.out.println("Shortest distance so far: ["+y2+"] "  + sD1);
        }
        xC.remove(currentCityX2);
        yC.remove(currentCityY2);
//      System.out.println("2. shortest path so far: " + sD2);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y3 = 1; y3 < yC.size(); y3++) {
            float currentDistance3 = (float) Math.sqrt(Math.abs((currentCityX2 - xC.get(y3)) * (currentCityX2 - xC.get(y3))) +
                    Math.abs(currentCityY2 - yC.get(y3)) * (currentCityY2 - yC.get(y3)));
            if (currentDistance3 <= sD3) {
                sD3 = currentDistance3;
                currentCityX3 = xC.get(y3);
                currentCityY3 = yC.get(y3);
            }
//            System.out.println("Current CityX: " + currentCityX2);
//            System.out.println("Current CityY: " + currentCityY2);
//            System.out.println("Compare cityX: " + xC.get(y3));
//            System.out.println("Compare cityY: " + yC.get(y3));
//            System.out.println("Shortest distance so far: [" + y3 + "] " + sD3);
        }
//        System.out.println("3. shortest path so far: " + sD3);

        xC.remove(currentCityX3);
        yC.remove(currentCityY3);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y4 = 1; y4 < yC.size(); y4++) {
            float currentDistance4 = (float) Math.sqrt(Math.abs((currentCityX3 - xC.get(y4)) * (currentCityX3 - xC.get(y4))) +
                    Math.abs(currentCityY3 - yC.get(y4)) * (currentCityY3 - yC.get(y4)));
            if (currentDistance4 <= sD4) {
                sD4 = currentDistance4;
                currentCityX4 = xC.get(y4);
                currentCityY4 = yC.get(y4);
            }
//            System.out.println("Current CityX: " + currentCityX3);
//            System.out.println("Current CityY: " + currentCityY3);
//            System.out.println("Compare cityX: " + xC.get(y4));
//            System.out.println("Compare cityY: " + yC.get(y4));
//            System.out.println("Shortest distance so far: ["+ y4 +"] "  + sD4);
        }
//            System.out.println("4. shortest path so far: " + sD4);

        xC.remove(currentCityX4);
        yC.remove(currentCityY4);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y5 = 1; y5 < yC.size(); y5++) {
            float currentDistance5 = (float) Math.sqrt(Math.abs((currentCityX4 - xC.get(y5)) * (currentCityX4 - xC.get(y5))) +
                    Math.abs(currentCityY4 - yC.get(y5)) * (currentCityY4 - yC.get(y5)));
            if (currentDistance5 <= sD5) {
                sD5 = currentDistance5;
                currentCityX5 = xC.get(y5);
                currentCityY5 = yC.get(y5);
            }
//            System.out.println("Current CityX: " + currentCityX4);
//            System.out.println("Current CityY: " + currentCityY4);
//            System.out.println("Compare cityX: " + xC.get(y5));
//            System.out.println("Compare cityY: " + yC.get(y5));
//            System.out.println("Shortest distance so far: ["+ y5 +"] "  + sD5);
        }
//        System.out.println("5. shortest path so far: " + sD5);

        xC.remove(currentCityX5);
        yC.remove(currentCityY5);

//        for (int counter = 0; counter < xC.size(); counter++) { // Bir sonraki 41
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y6 = 1; y6 < yC.size(); y6++) {
            float currentDistance6 = (float) Math.sqrt(Math.abs((currentCityX5 - xC.get(y6)) * (currentCityX5 - xC.get(y6))) +
                    Math.abs(currentCityY5 - yC.get(y6)) * (currentCityY5 - yC.get(y6)));
            if (currentDistance6 <= sD6) {
                sD6 = currentDistance6;
                currentCityX6 = xC.get(y6);
                currentCityY6 = yC.get(y6);
            }
//            System.out.println("Current CityX: " + currentCityX5);
//            System.out.println("Current CityY: " + currentCityY5);
//            System.out.println("Compare cityX: " + xC.get(y6));
//            System.out.println("Compare cityY: " + yC.get(y6));
//            System.out.println("Shortest distance so far: ["+ y6 +"] "  + sD6);
        }
//            System.out.println("6. shortest path so far: " + sD6);

        xC.remove(currentCityX6);
        yC.remove(currentCityY6);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y7 = 1; y7 < yC.size(); y7++) {
            float currentDistance7 = (float) Math.sqrt(Math.abs((currentCityX6 - xC.get(y7)) * (currentCityX6 - xC.get(y7))) +
                    Math.abs(currentCityY6 - yC.get(y7)) * (currentCityY6 - yC.get(y7)));
            if (currentDistance7 <= sD7) {
                sD7 = currentDistance7;
                currentCityX7 = xC.get(y7);
                currentCityY7 = yC.get(y7);
            }
//            System.out.println("Current CityX: " + currentCityX6);
//            System.out.println("Current CityY: " + currentCityY6);
//            System.out.println("Compare cityX: " + xC.get(y7));
//            System.out.println("Compare cityY: " + yC.get(y7));
//            System.out.println("Shortest distance so far: ["+ y7 +"] "  + sD7);
        }
//             System.out.println("7. shortest path so far: " + sD7);

        xC.remove(currentCityX7);
        yC.remove(currentCityY7);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y8 = 1; y8 < yC.size(); y8++) {
            float currentDistance8 = (float) Math.sqrt(Math.abs((currentCityX7 - xC.get(y8)) * (currentCityX7 - xC.get(y8))) +
                    Math.abs(currentCityY7 - yC.get(y8)) * (currentCityY7 - yC.get(y8)));
            if (currentDistance8 <= sD8) {
                sD8 = currentDistance8;
                currentCityX8 = xC.get(y8);
                currentCityY8 = yC.get(y8);
            }
//            System.out.println("Current CityX: " + currentCityX7);
//            System.out.println("Current CityY: " + currentCityY7);
//            System.out.println("Compare cityX: " + xC.get(y8));
//            System.out.println("Compare cityY: " + yC.get(y8));
//            System.out.println("Shortest distance so far: ["+ y8 +"] "  + sD8);
        }
//            System.out.println("8. shortest path so far: " + sD8);

        xC.remove(currentCityX8);
        yC.remove(currentCityY8);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y9 = 1; y9 < yC.size(); y9++) {
            float currentDistance9 = (float) Math.sqrt(Math.abs((currentCityX8 - xC.get(y9)) * (currentCityX8 - xC.get(y9))) +
                    Math.abs(currentCityY8 - yC.get(y9)) * (currentCityY8 - yC.get(y9)));
            if (currentDistance9 <= sD9) {
                sD9 = currentDistance9;
                currentCityX9 = xC.get(y9);
                currentCityY9 = yC.get(y9);
            }
//            System.out.println("Current CityX: " + currentCityX8);
//            System.out.println("Current CityY: " + currentCityY8);
//            System.out.println("Compare cityX: " + xC.get(y9));
//            System.out.println("Compare cityY: " + yC.get(y9));
//            System.out.println("Shortest distance so far: ["+ y9 +"] "  + sD9);
        }
//             System.out.println("9. shortest path so far: " + sD9);

        xC.remove(currentCityX9);
        yC.remove(currentCityY9);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y10 = 1; y10 < yC.size(); y10++) {
            float currentDistance10 = (float) Math.sqrt(Math.abs((currentCityX9 - xC.get(y10)) * (currentCityX9 - xC.get(y10))) +
                    Math.abs(currentCityY9 - yC.get(y10)) * (currentCityY9 - yC.get(y10)));
            if (currentDistance10 <= sD10) {
                sD10 = currentDistance10;
                currentCityX10 = xC.get(y10);
                currentCityY10 = yC.get(y10);
            }
//            System.out.println("Current CityX: " + currentCityX9);
//            System.out.println("Current CityY: " + currentCityY9);
//            System.out.println("Compare cityX: " + xC.get(y10));
//            System.out.println("Compare cityY: " + yC.get(y10));
//            System.out.println("Shortest distance so far: ["+ y10 +"] "  + sD10);
        }
//            System.out.println("10. shortest path so far: " + sD10);

        xC.remove(currentCityX10);
        yC.remove(currentCityY10);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y11 = 1; y11 < yC.size(); y11++) {
            float currentDistance11 = (float) Math.sqrt(Math.abs((currentCityX10 - xC.get(y11)) * (currentCityX10 - xC.get(y11))) +
                    Math.abs(currentCityY10 - yC.get(y11)) * (currentCityY10 - yC.get(y11)));
            if (currentDistance11 <= sD11) {
                sD11 = currentDistance11;
                currentCityX11 = xC.get(y11);
                currentCityY11 = yC.get(y11);
            }
//            System.out.println("Current CityX: " + currentCityX10);
//            System.out.println("Current CityY: " + currentCityY10);
//            System.out.println("Compare cityX: " + xC.get(y11));
//            System.out.println("Compare cityY: " + yC.get(y11));
//            System.out.println("Shortest distance so far: ["+ y11 +"] "  + sD11);
        }
//           System.out.println("11. shortest path so far: " + sD11);

        xC.remove(currentCityX11);
        yC.remove(currentCityY11);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y12 = 1; y12 < yC.size(); y12++) {
            float currentDistance12 = (float) Math.sqrt(Math.abs((currentCityX11 - xC.get(y12)) * (currentCityX11 - xC.get(y12))) +
                    Math.abs(currentCityY11 - yC.get(y12)) * (currentCityY11 - yC.get(y12)));
            if (currentDistance12 <= sD12) {
                sD12 = currentDistance12;
                currentCityX12 = xC.get(y12);
                currentCityY12 = yC.get(y12);
            }
//            System.out.println("Current CityX: " + currentCityX11);
//            System.out.println("Current CityY: " + currentCityY11);
//            System.out.println("Compare cityX: " + xC.get(y12));
//            System.out.println("Compare cityY: " + yC.get(y12));
//            System.out.println("Shortest distance so far: ["+ y12 +"] "  + sD12);
        }
//            System.out.println("12. shortest path so far: " + sD12);

        xC.remove(currentCityX12);
        yC.remove(currentCityY12);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y13 = 1; y13 < yC.size(); y13++) {
            float currentDistance13 = (float) Math.sqrt(Math.abs((currentCityX12 - xC.get(y13)) * (currentCityX12 - xC.get(y13))) +
                    Math.abs(currentCityY12 - yC.get(y13)) * (currentCityY12 - yC.get(y13)));
            if (currentDistance13 <= sD13) {
                sD13 = currentDistance13;
                currentCityX13 = xC.get(y13);
                currentCityY13 = yC.get(y13);
            }
//            System.out.println("Current CityX: " + currentCityX12);
//            System.out.println("Current CityY: " + currentCityY12);
//            System.out.println("Compare cityX: " + xC.get(y13));
//            System.out.println("Compare cityY: " + yC.get(y13));
//            System.out.println("Shortest distance so far: ["+ y13 +"] "  + sD13);
        }
//             System.out.println("13. shortest path so far: " + sD13);

        xC.remove(currentCityX13);
        yC.remove(currentCityY13);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y14 = 1; y14 < yC.size(); y14++) {
            float currentDistance14 = (float) Math.sqrt(Math.abs((currentCityX13 - xC.get(y14)) * (currentCityX13 - xC.get(y14))) +
                    Math.abs(currentCityY13 - yC.get(y14)) * (currentCityY13 - yC.get(y14)));
            if (currentDistance14 <= sD14) {
                sD14 = currentDistance14;
                currentCityX14 = xC.get(y14);
                currentCityY14 = yC.get(y14);
            }
//            System.out.println("Current CityX: " + currentCityX13);
//            System.out.println("Current CityY: " + currentCityY13);
//            System.out.println("Compare cityX: " + xC.get(y14));
//            System.out.println("Compare cityY: " + yC.get(y14));
//            System.out.println("Shortest distance so far: ["+ y14 +"] "  + sD14);
        }
//           System.out.println("14. shortest path so far: " + sD14);

        xC.remove(currentCityX14);
        yC.remove(currentCityY14);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y15 = 1; y15 < yC.size(); y15++) {
            float currentDistance15 = (float) Math.sqrt(Math.abs((currentCityX14 - xC.get(y15)) * (currentCityX14 - xC.get(y15))) +
                    Math.abs(currentCityY14 - yC.get(y15)) * (currentCityY14 - yC.get(y15)));
            if (currentDistance15 <= sD15) {
                sD15 = currentDistance15;
                currentCityX15 = xC.get(y15);
                currentCityY15 = yC.get(y15);
            }
//            System.out.println("Current CityX: " + currentCityX14);
//            System.out.println("Current CityY: " + currentCityY14);
//            System.out.println("Compare cityX: " + xC.get(y15));
//            System.out.println("Compare cityY: " + yC.get(y15));
//            System.out.println("Shortest distance so far: ["+ y15 +"] "  + sD15);
        }
//             System.out.println("15. shortest path so far: " + sD15);

        xC.remove(currentCityX15);
        yC.remove(currentCityY15);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y16 = 1; y16 < yC.size(); y16++) {
            float currentDistance16 = (float) Math.sqrt(Math.abs((currentCityX15 - xC.get(y16)) * (currentCityX15 - xC.get(y16))) +
                    Math.abs(currentCityY15 - yC.get(y16)) * (currentCityY15 - yC.get(y16)));
            if (currentDistance16 <= sD16) {
                sD16 = currentDistance16;
                currentCityX16 = xC.get(y16);
                currentCityY16 = yC.get(y16);
            }
//            System.out.println("Current CityX: " + currentCityX15);
//            System.out.println("Current CityY: " + currentCityY15);
//            System.out.println("Compare cityX: " + xC.get(y16));
//            System.out.println("Compare cityY: " + yC.get(y16));
//            System.out.println("Shortest distance so far: ["+ y16 +"] "  + sD16);
        }
//           System.out.println("16. shortest path so far: " + sD16);

        xC.remove(currentCityX16);
        yC.remove(currentCityY16);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y17 = 1; y17 < yC.size(); y17++) {
            float currentDistance17 = (float) Math.sqrt(Math.abs((currentCityX16 - xC.get(y17)) * (currentCityX16 - xC.get(y17))) +
                    Math.abs(currentCityY16 - yC.get(y17)) * (currentCityY16 - yC.get(y17)));
            if (currentDistance17 <= sD17) {
                sD17 = currentDistance17;
                currentCityX17 = xC.get(y17);
                currentCityY17 = yC.get(y17);
            }
//            System.out.println("Current CityX: " + currentCityX16);
//            System.out.println("Current CityY: " + currentCityY16);
//            System.out.println("Compare cityX: " + xC.get(y17));
//            System.out.println("Compare cityY: " + yC.get(y17));
//            System.out.println("Shortest distance so far: ["+ y17 +"] "  + sD17);
        }
//           System.out.println("17. shortest path so far: " + sD17);

        xC.remove(currentCityX17);
        yC.remove(currentCityY17);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y18 = 1; y18 < yC.size(); y18++) {
            float currentDistance18 = (float) Math.sqrt(Math.abs((currentCityX17 - xC.get(y18)) * (currentCityX17 - xC.get(y18))) +
                    Math.abs(currentCityY17 - yC.get(y18)) * (currentCityY17 - yC.get(y18)));
            if (currentDistance18 <= sD18) {
                sD18 = currentDistance18;
                currentCityX18 = xC.get(y18);
                currentCityY18 = yC.get(y18);
            }
//            System.out.println("Current CityX: " + currentCityX17);
//            System.out.println("Current CityY: " + currentCityY17);
//            System.out.println("Compare cityX: " + xC.get(y18));
//            System.out.println("Compare cityY: " + yC.get(y18));
//            System.out.println("Shortest distance so far: ["+ y18 +"] "  + sD18);
        }
//          System.out.println("18. shortest path so far: " + sD18);

        xC.remove(currentCityX18);
        yC.remove(currentCityY18);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y19 = 1; y19 < yC.size(); y19++) {
            float currentDistance19 = (float) Math.sqrt(Math.abs((currentCityX18 - xC.get(y19)) * (currentCityX18 - xC.get(y19))) +
                    Math.abs(currentCityY18 - yC.get(y19)) * (currentCityY18 - yC.get(y19)));
            if (currentDistance19 <= sD19) {
                sD19 = currentDistance19;
                currentCityX19 = xC.get(y19);
                currentCityY19 = yC.get(y19);
            }
//            System.out.println("Current CityX: " + currentCityX18);
//            System.out.println("Current CityY: " + currentCityY18);
//            System.out.println("Compare cityX: " + xC.get(y19));
//            System.out.println("Compare cityY: " + yC.get(y19));
//            System.out.println("Shortest distance so far: ["+ y19 +"] "  + sD19);
        }
//          System.out.println("19. shortest path so far: " + sD19);

        xC.remove(currentCityX19);
        yC.remove(currentCityY19);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y20 = 1; y20 < yC.size(); y20++) {
            float currentDistance20 = (float) Math.sqrt(Math.abs((currentCityX19 - xC.get(y20)) * (currentCityX19 - xC.get(y20))) +
                    Math.abs(currentCityY19 - yC.get(y20)) * (currentCityY19 - yC.get(y20)));
            if (currentDistance20 <= sD20) {
                sD20 = currentDistance20;
                currentCityX20 = xC.get(y20);
                currentCityY20 = yC.get(y20);
            }
//            System.out.println("Current CityX: " + currentCityX19);
//            System.out.println("Current CityY: " + currentCityY19);
//            System.out.println("Compare cityX: " + xC.get(y20));
//            System.out.println("Compare cityY: " + yC.get(y20));
//            System.out.println("Shortest distance so far: ["+ y20 +"] "  + sD20);
        }
//         System.out.println("20. shortest path so far: " + sD20);

        xC.remove(currentCityX20);
        yC.remove(currentCityY20);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y21 = 1; y21 < yC.size(); y21++) {
            float currentDistance21 = (float) Math.sqrt(Math.abs((currentCityX20 - xC.get(y21)) * (currentCityX20 - xC.get(y21))) +
                    Math.abs(currentCityY20 - yC.get(y21)) * (currentCityY20 - yC.get(y21)));
            if (currentDistance21 <= sD21) {
                sD21 = currentDistance21;
                currentCityX21 = xC.get(y21);
                currentCityY21 = yC.get(y21);
            }
//            System.out.println("Current CityX: " + currentCityX20);
//            System.out.println("Current CityY: " + currentCityY20);
//            System.out.println("Compare cityX: " + xC.get(y21));
//            System.out.println("Compare cityY: " + yC.get(y21));
//            System.out.println("Shortest distance so far: ["+ y21 +"] "  + sD21);
        }
//         System.out.println("21. shortest path so far: " + sD21);

        xC.remove(currentCityX21);
        yC.remove(currentCityY21);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y22 = 1; y22 < yC.size(); y22++) {
            float currentDistance22 = (float) Math.sqrt(Math.abs((currentCityX21 - xC.get(y22)) * (currentCityX21 - xC.get(y22))) +
                    Math.abs(currentCityY21 - yC.get(y22)) * (currentCityY21 - yC.get(y22)));
            if (currentDistance22 <= sD22) {
                sD22 = currentDistance22;
                currentCityX22 = xC.get(y22);
                currentCityY22 = yC.get(y22);
            }
//            System.out.println("Current CityX: " + currentCityX21);
//            System.out.println("Current CityY: " + currentCityY21);
//            System.out.println("Compare cityX: " + xC.get(y22));
//            System.out.println("Compare cityY: " + yC.get(y22));
//            System.out.println("Shortest distance so far: ["+ y22 +"] "  + sD22);
        }
//          System.out.println("22. shortest path so far: " + sD22);

        xC.remove(currentCityX22);
        yC.remove(currentCityY22);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y23 = 1; y23 < yC.size(); y23++) {
            float currentDistance23 = (float) Math.sqrt(Math.abs((currentCityX22 - xC.get(y23)) * (currentCityX22 - xC.get(y23))) +
                    Math.abs(currentCityY22 - yC.get(y23)) * (currentCityY22 - yC.get(y23)));
            if (currentDistance23 <= sD23) {
                sD23 = currentDistance23;
                currentCityX23 = xC.get(y23);
                currentCityY23 = yC.get(y23);
            }
//            System.out.println("Current CityX: " + currentCityX22);
//            System.out.println("Current CityY: " + currentCityY22);
//            System.out.println("Compare cityX: " + xC.get(y23));
//            System.out.println("Compare cityY: " + yC.get(y23));
//            System.out.println("Shortest distance so far: ["+ y23 +"] "  + sD23);
        }
//         System.out.println("23. shortest path so far: " + sD23);

        xC.remove(currentCityX23);
        yC.remove(currentCityY23);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y24 = 1; y24 < yC.size(); y24++) {
            float currentDistance24 = (float) Math.sqrt(Math.abs((currentCityX23 - xC.get(y24)) * (currentCityX23 - xC.get(y24))) +
                    Math.abs(currentCityY23 - yC.get(y24)) * (currentCityY23 - yC.get(y24)));
            if (currentDistance24 <= sD24) {
                sD24 = currentDistance24;
                currentCityX24 = xC.get(y24);
                currentCityY24 = yC.get(y24);
            }
//            System.out.println("Current CityX: " + currentCityX23);
//            System.out.println("Current CityY: " + currentCityY23);
//            System.out.println("Compare cityX: " + xC.get(y24));
//            System.out.println("Compare cityY: " + yC.get(y24));
//            System.out.println("Shortest distance so far: ["+ y24 +"] "  + sD24);
        }
//          System.out.println("24. shortest path so far: " + sD24);

        xC.remove(currentCityX24);
        yC.remove(currentCityY24);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y25 = 1; y25 < yC.size(); y25++) {
            float currentDistance25 = (float) Math.sqrt(Math.abs((currentCityX24 - xC.get(y25)) * (currentCityX24 - xC.get(y25))) +
                    Math.abs(currentCityY24 - yC.get(y25)) * (currentCityY24 - yC.get(y25)));
            if (currentDistance25 <= sD25) {
                sD25 = currentDistance25;
                currentCityX25 = xC.get(y25);
                currentCityY25 = yC.get(y25);
            }
//            System.out.println("Current CityX: " + currentCityX24);
//            System.out.println("Current CityY: " + currentCityY24);
//            System.out.println("Compare cityX: " + xC.get(y25));
//            System.out.println("Compare cityY: " + yC.get(y25));
//            System.out.println("Shortest distance so far: ["+ y25 +"] "  + sD25);
        }
//         System.out.println("25. shortest path so far: " + sD25);

        xC.remove(currentCityX25);
        yC.remove(currentCityY25);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y26 = 1; y26 < yC.size(); y26++) {
            float currentDistance26 = (float) Math.sqrt(Math.abs((currentCityX25 - xC.get(y26)) * (currentCityX25 - xC.get(y26))) +
                    Math.abs(currentCityY25 - yC.get(y26)) * (currentCityY25 - yC.get(y26)));
            if (currentDistance26 <= sD26) {
                sD26 = currentDistance26;
                currentCityX26 = xC.get(y26);
                currentCityY26 = yC.get(y26);
            }
//            System.out.println("Current CityX: " + currentCityX25);
//            System.out.println("Current CityY: " + currentCityY25);
//            System.out.println("Compare cityX: " + xC.get(y26));
//            System.out.println("Compare cityY: " + yC.get(y26));
//            System.out.println("Shortest distance so far: [" + y26 + "] " + sD26);
        }
//          System.out.println("26. shortest path so far: " + sD26);

        xC.remove(currentCityX26);
        yC.remove(currentCityY26);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y27 = 1; y27 < yC.size(); y27++) {
            float currentDistance27 = (float) Math.sqrt(Math.abs((currentCityX26 - xC.get(y27)) * (currentCityX26 - xC.get(y27))) +
                    Math.abs(currentCityY26 - yC.get(y27)) * (currentCityY26 - yC.get(y27)));
            if (currentDistance27 <= sD27) {
                sD27 = currentDistance27;
                currentCityX27 = xC.get(y27);
                currentCityY27 = yC.get(y27);
            }
//            System.out.println("Current CityX: " + currentCityX26);
//            System.out.println("Current CityY: " + currentCityY26);
//            System.out.println("Compare cityX: " + xC.get(y27));
//            System.out.println("Compare cityY: " + yC.get(y27));
//            System.out.println("Shortest distance so far: [" + y27 + "] " + sD27);
        }
//          System.out.println("27. shortest path so far: " + sD27);

        xC.remove(currentCityX27);
        yC.remove(currentCityY27);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y28 = 1; y28 < yC.size(); y28++) {
            float currentDistance28 = (float) Math.sqrt(Math.abs((currentCityX27 - xC.get(y28)) * (currentCityX27 - xC.get(y28))) +
                    Math.abs(currentCityY27 - yC.get(y28)) * (currentCityY27 - yC.get(y28)));
            if (currentDistance28 <= sD28) {
                sD28 = currentDistance28;
                currentCityX28 = xC.get(y28);
                currentCityY28 = yC.get(y28);
            }
//            System.out.println("Current CityX: " + currentCityX27);
//            System.out.println("Current CityY: " + currentCityY27);
//            System.out.println("Compare cityX: " + xC.get(y28));
//            System.out.println("Compare cityY: " + yC.get(y28));
//            System.out.println("Shortest distance so far: [" + y28 + "] " + sD28);
        }
//          System.out.println("28. shortest path so far: " + sD28);

        xC.remove(currentCityX28);
        yC.remove(currentCityY28);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y29 = 1; y29 < yC.size(); y29++) {
            float currentDistance29 = (float) Math.sqrt(Math.abs((currentCityX28 - xC.get(y29)) * (currentCityX28 - xC.get(y29))) +
                    Math.abs(currentCityY28 - yC.get(y29)) * (currentCityY28 - yC.get(y29)));
            if (currentDistance29 <= sD29) {
                sD29 = currentDistance29;
                currentCityX29 = xC.get(y29);
                currentCityY29 = yC.get(y29);
            }
//            System.out.println("Current CityX: " + currentCityX28);
//            System.out.println("Current CityY: " + currentCityY28);
//            System.out.println("Compare cityX: " + xC.get(y29));
//            System.out.println("Compare cityY: " + yC.get(y29));
//            System.out.println("Shortest distance so far: [" + y29 + "] " + sD29);
        }
//         System.out.println("29. shortest path so far: " + sD29);

        xC.remove(currentCityX29);
        yC.remove(currentCityY29);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y30 = 1; y30 < yC.size(); y30++) {
            float currentDistance30 = (float) Math.sqrt(Math.abs((currentCityX29 - xC.get(y30)) * (currentCityX29 - xC.get(y30))) +
                    Math.abs(currentCityY29 - yC.get(y30)) * (currentCityY29 - yC.get(y30)));
            if (currentDistance30 <= sD30) {
                sD30 = currentDistance30;
                currentCityX30 = xC.get(y30);
                currentCityY30 = yC.get(y30);
            }
//            System.out.println("Current CityX: " + currentCityX29);
//            System.out.println("Current CityY: " + currentCityY29);
//            System.out.println("Compare cityX: " + xC.get(y30));
//            System.out.println("Compare cityY: " + yC.get(y30));
//            System.out.println("Shortest distance so far: [" + y30 + "] " + sD30);
        }
//         System.out.println("30. shortest path so far: " + sD30);

        xC.remove(currentCityX30);
        yC.remove(currentCityY30);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y31 = 1; y31 < yC.size(); y31++) {
            float currentDistance31 = (float) Math.sqrt(Math.abs((currentCityX30 - xC.get(y31)) * (currentCityX30 - xC.get(y31))) +
                    Math.abs(currentCityY30 - yC.get(y31)) * (currentCityY30 - yC.get(y31)));
            if (currentDistance31 <= sD31) {
                sD31 = currentDistance31;
                currentCityX31 = xC.get(y31);
                currentCityY31 = yC.get(y31);
            }
//            System.out.println("Current CityX: " + currentCityX30);
//            System.out.println("Current CityY: " + currentCityY30);
//            System.out.println("Compare cityX: " + xC.get(y31));
//            System.out.println("Compare cityY: " + yC.get(y31));
//            System.out.println("Shortest distance so far: [" + y31 + "] " + sD31);
        }
//         System.out.println("31. shortest path so far: " + sD31);

        xC.remove(currentCityX31);
        yC.remove(currentCityY31);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y32 = 1; y32 < yC.size(); y32++) {
            float currentDistance32 = (float) Math.sqrt(Math.abs((currentCityX31 - xC.get(y32)) * (currentCityX31 - xC.get(y32))) +
                    Math.abs(currentCityY31 - yC.get(y32)) * (currentCityY31 - yC.get(y32)));
            if (currentDistance32 <= sD32) {
                sD32 = currentDistance32;
                currentCityX32 = xC.get(y32);
                currentCityY32 = yC.get(y32);
            }
//            System.out.println("Current CityX: " + currentCityX31);
//            System.out.println("Current CityY: " + currentCityY31);
//            System.out.println("Compare cityX: " + xC.get(y32));
//            System.out.println("Compare cityY: " + yC.get(y32));
//            System.out.println("Shortest distance so far: [" + y32 + "] " + sD32);
        }
//         System.out.println("32. shortest path so far: " + sD32);

        xC.remove(currentCityX32);
        yC.remove(currentCityY32);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y33 = 1; y33 < yC.size(); y33++) {
            float currentDistance33 = (float) Math.sqrt(Math.abs((currentCityX32 - xC.get(y33)) * (currentCityX32 - xC.get(y33))) +
                    Math.abs(currentCityY32 - yC.get(y33)) * (currentCityY32 - yC.get(y33)));
            if (currentDistance33 <= sD33) {
                sD33 = currentDistance33;
                currentCityX33 = xC.get(y33);
                currentCityY33 = yC.get(y33);
            }
//            System.out.println("Current CityX: " + currentCityX32);
//            System.out.println("Current CityY: " + currentCityY32);
//            System.out.println("Compare cityX: " + xC.get(y33));
//            System.out.println("Compare cityY: " + yC.get(y33));
//            System.out.println("Shortest distance so far: [" + y33 + "] " + sD33);
        }
//        System.out.println("33. shortest path so far: " + sD33);

        xC.remove(currentCityX33);
        yC.remove(currentCityY33);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y34 = 1; y34 < yC.size(); y34++) {
            float currentDistance34 = (float) Math.sqrt(Math.abs((currentCityX33 - xC.get(y34)) * (currentCityX33 - xC.get(y34))) +
                    Math.abs(currentCityY33 - yC.get(y34)) * (currentCityY33 - yC.get(y34)));
            if (currentDistance34 <= sD34) {
                sD34 = currentDistance34;
                currentCityX34 = xC.get(y34);
                currentCityY34 = yC.get(y34);
            }
//            System.out.println("Current CityX: " + currentCityX33);
//            System.out.println("Current CityY: " + currentCityY33);
//            System.out.println("Compare cityX: " + xC.get(y34));
//            System.out.println("Compare cityY: " + yC.get(y34));
//            System.out.println("Shortest distance so far: [" + y34 + "] " + sD34);
        }
//        System.out.println("34. shortest path so far: " + sD34);

        xC.remove(currentCityX34);
        yC.remove(currentCityY34);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y35 = 1; y35 < yC.size(); y35++) {
            float currentDistance35 = (float) Math.sqrt(Math.abs((currentCityX34 - xC.get(y35)) * (currentCityX34 - xC.get(y35))) +
                    Math.abs(currentCityY34 - yC.get(y35)) * (currentCityY34 - yC.get(y35)));
            if (currentDistance35 <= sD35) {
                sD35 = currentDistance35;
                currentCityX35 = xC.get(y35);
                currentCityY35 = yC.get(y35);
            }
//            System.out.println("Current CityX: " + currentCityX34);
//            System.out.println("Current CityY: " + currentCityY34);
//            System.out.println("Compare cityX: " + xC.get(y35));
//            System.out.println("Compare cityY: " + yC.get(y35));
//            System.out.println("Shortest distance so far: [" + y35 + "] " + sD35);
        }
//         System.out.println("35. shortest path so far: " + sD35);

        xC.remove(currentCityX35);
        yC.remove(currentCityY35);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y36 = 1; y36 < yC.size(); y36++) {
            float currentDistance36 = (float) Math.sqrt(Math.abs((currentCityX35 - xC.get(y36)) * (currentCityX35 - xC.get(y36))) +
                    Math.abs(currentCityY35 - yC.get(y36)) * (currentCityY35 - yC.get(y36)));
            if (currentDistance36 <= sD36) {
                sD36 = currentDistance36;
                currentCityX36 = xC.get(y36);
                currentCityY36 = yC.get(y36);
            }
//            System.out.println("Current CityX: " + currentCityX35);
//            System.out.println("Current CityY: " + currentCityY35);
//            System.out.println("Compare cityX: " + xC.get(y36));
//            System.out.println("Compare cityY: " + yC.get(y36));
//            System.out.println("Shortest distance so far: [" + y36 + "] " + sD36);
        }
//        System.out.println("36. shortest path so far: " + sD36);

        xC.remove(currentCityX36);
        yC.remove(currentCityY36);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y37 = 1; y37 < yC.size(); y37++) {
            float currentDistance37 = (float) Math.sqrt(Math.abs((currentCityX36 - xC.get(y37)) * (currentCityX36 - xC.get(y37))) +
                    Math.abs(currentCityY36 - yC.get(y37)) * (currentCityY36 - yC.get(y37)));
            if (currentDistance37 <= sD37) {
                sD37 = currentDistance37;
                currentCityX37 = xC.get(y37);
                currentCityY37 = yC.get(y37);
            }
//            System.out.println("Current CityX: " + currentCityX36);
//            System.out.println("Current CityY: " + currentCityY36);
//            System.out.println("Compare cityX: " + xC.get(y37));
//            System.out.println("Compare cityY: " + yC.get(y37));
//            System.out.println("Shortest distance so far: [" + y37 + "] " + sD37);
        }
//        System.out.println("37. shortest path so far: " + sD37);

        xC.remove(currentCityX37);
        yC.remove(currentCityY37);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

        for (int y38 = 1; y38 < yC.size(); y38++) {
            float currentDistance38 = (float) Math.sqrt(Math.abs((currentCityX37 - xC.get(y38)) * (currentCityX37 - xC.get(y38))) +
                    Math.abs(currentCityY37 - yC.get(y38)) * (currentCityY37 - yC.get(y38)));
            if (currentDistance38 <= sD38) {
                sD38 = currentDistance38;
                currentCityX38 = xC.get(y38);
                currentCityY38 = yC.get(y38);
            }
//            System.out.println("Current CityX: " + currentCityX37);
//            System.out.println("Current CityY: " + currentCityY37);
//            System.out.println("Compare cityX: " + xC.get(y38));
//            System.out.println("Compare cityY: " + yC.get(y38));
//            System.out.println("Shortest distance so far: [" + y38 + "] " + sD38);
        }
//        System.out.println("38. shortest path so far: " + sD38);

        xC.remove(currentCityX38);
        yC.remove(currentCityY38);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y39 = 1; y39 < yC.size(); y39++) {
            float currentDistance39 = (float) Math.sqrt(Math.abs((currentCityX38 - xC.get(y39)) * (currentCityX38 - xC.get(y39))) +
                    Math.abs(currentCityY38 - yC.get(y39)) * (currentCityY38 - yC.get(y39)));
            if (currentDistance39 <= sD39) {
                sD39 = currentDistance39;
                currentCityX39 = xC.get(y39);
                currentCityY39 = yC.get(y39);
            }
//            System.out.println("Current CityX: " + currentCityX38);
//            System.out.println("Current CityY: " + currentCityY38);
//            System.out.println("Compare cityX: " + xC.get(y39));
//            System.out.println("Compare cityY: " + yC.get(y39));
//            System.out.println("Shortest distance so far: [" + y39 + "] " + sD39);
        }
//        System.out.println("39. shortest path so far: " + sD39);

        xC.remove(currentCityX39);
        yC.remove(currentCityY39);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y40 = 1; y40 < yC.size(); y40++) {
            float currentDistance40 = (float) Math.sqrt(Math.abs((currentCityX39 - xC.get(y40)) * (currentCityX39 - xC.get(y40))) +
                    Math.abs(currentCityY39 - yC.get(y40)) * (currentCityY39 - yC.get(y40)));
            if (currentDistance40 <= sD40) {
                sD40 = currentDistance40;
                currentCityX40 = xC.get(y40);
                currentCityY40 = yC.get(y40);
            }
//            System.out.println("Current CityX: " + currentCityX39);
//            System.out.println("Current CityY: " + currentCityY39);
//            System.out.println("Compare cityX: " + xC.get(y40));
//            System.out.println("Compare cityY: " + yC.get(y40));
//            System.out.println("Shortest distance so far: [" + y40 + "] " + sD40);
        }
//        System.out.println("40. shortest path so far: " + sD40);

        xC.remove(currentCityX40);
        yC.remove(currentCityY40);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y41 = 1; y41 < yC.size(); y41++) {
            float currentDistance41 = (float) Math.sqrt(Math.abs((currentCityX40 - xC.get(y41)) * (currentCityX40 - xC.get(y41))) +
                    Math.abs(currentCityY40 - yC.get(y41)) * (currentCityY40 - yC.get(y41)));
            if (currentDistance41 <= sD41) {
                sD41 = currentDistance41;
                currentCityX41 = xC.get(y41);
                currentCityY41 = yC.get(y41);
            }
//            System.out.println("Current CityX: " + currentCityX40);
//            System.out.println("Current CityY: " + currentCityY40);
//            System.out.println("Compare cityX: " + xC.get(y41));
//            System.out.println("Compare cityY: " + yC.get(y41));
//            System.out.println("Shortest distance so far: [" + y41 + "] " + sD41);
        }
//        System.out.println("41. shortest path so far: " + sD41);

        xC.remove(currentCityX41);
        yC.remove(currentCityY41);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y42 = 1; y42 < yC.size(); y42++) {
            float currentDistance42 = (float) Math.sqrt(Math.abs((currentCityX41 - xC.get(y42)) * (currentCityX41 - xC.get(y42))) +
                    Math.abs(currentCityY41 - yC.get(y42)) * (currentCityY41 - yC.get(y42)));
            if (currentDistance42 <= sD42) {
                sD42 = currentDistance42;
                currentCityX42 = xC.get(y42);
                currentCityY42 = yC.get(y42);
            }
//            System.out.println("Current CityX: " + currentCityX41);
//            System.out.println("Current CityY: " + currentCityY41);
//            System.out.println("Compare cityX: " + xC.get(y42));
//            System.out.println("Compare cityY: " + yC.get(y42));
//            System.out.println("Shortest distance so far: [" + y42 + "] " + sD42);
        }
//        System.out.println("42. shortest path so far: " + sD42);

        xC.remove(currentCityX42);
        yC.remove(currentCityY42);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y43 = 1; y43 < yC.size(); y43++) {
            float currentDistance43 = (float) Math.sqrt(Math.abs((currentCityX42 - xC.get(y43)) * (currentCityX42 - xC.get(y43))) +
                    Math.abs(currentCityY42 - yC.get(y43)) * (currentCityY42 - yC.get(y43)));
            if (currentDistance43 <= sD43) {
                sD43 = currentDistance43;
                currentCityX43 = xC.get(y43);
                currentCityY43 = yC.get(y43);
            }
//            System.out.println("Current CityX: " + currentCityX42);
//            System.out.println("Current CityY: " + currentCityY42);
//            System.out.println("Compare cityX: " + xC.get(y43));
//            System.out.println("Compare cityY: " + yC.get(y43));
//            System.out.println("Shortest distance so far: [" + y43 + "] " + sD43);
        }
//        System.out.println("43. shortest path so far: " + sD43);

        xC.remove(currentCityX43);
        yC.remove(currentCityY43);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y44 = 1; y44 < yC.size(); y44++) {
            float currentDistance44 = (float) Math.sqrt(Math.abs((currentCityX43 - xC.get(y44)) * (currentCityX43 - xC.get(y44))) +
                    Math.abs(currentCityY43 - yC.get(y44)) * (currentCityY43 - yC.get(y44)));
            if (currentDistance44 <= sD44) {
                sD44 = currentDistance44;
                currentCityX44 = xC.get(y44);
                currentCityY44 = yC.get(y44);
            }
//            System.out.println("Current CityX: " + currentCityX43);
//            System.out.println("Current CityY: " + currentCityY43);
//            System.out.println("Compare cityX: " + xC.get(y44));
//            System.out.println("Compare cityY: " + yC.get(y44));
//            System.out.println("Shortest distance so far: [" + y44 + "] " + sD44);
        }
//        System.out.println("44. shortest path so far: " + sD44);

        xC.remove(currentCityX44);
        yC.remove(currentCityY44);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y45 = 1; y45 < yC.size(); y45++) {
            float currentDistance45 = (float) Math.sqrt(Math.abs((currentCityX44 - xC.get(y45)) * (currentCityX44 - xC.get(y45))) +
                    Math.abs(currentCityY44 - yC.get(y45)) * (currentCityY44 - yC.get(y45)));
            if (currentDistance45 <= sD45) {
                sD45 = currentDistance45;
                currentCityX45 = xC.get(y45);
                currentCityY45 = yC.get(y45);
            }
//            System.out.println("Current CityX: " + currentCityX44);
//            System.out.println("Current CityY: " + currentCityY44);
//            System.out.println("Compare cityX: " + xC.get(y45));
//            System.out.println("Compare cityY: " + yC.get(y45));
//            System.out.println("Shortest distance so far: [" + y45 + "] " + sD45);
        }
//        System.out.println("45. shortest path so far: " + sD45);

        xC.remove(currentCityX45);
        yC.remove(currentCityY45);

//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }
        for (int y46 = 1; y46 < yC.size(); y46++) {
            float currentDistance46 = (float) Math.sqrt(Math.abs((currentCityX45 - xC.get(y46)) * (currentCityX45 - xC.get(y46))) +
                    Math.abs(currentCityY45 - yC.get(y46)) * (currentCityY45 - yC.get(y46)));
            if (currentDistance46 <= sD46) {
                sD46 = currentDistance46;
                currentCityX46 = xC.get(y46);
                currentCityY46 = yC.get(y46);
            }
//            System.out.println("Current CityX: " + currentCityX45);
//            System.out.println("Current CityY: " + currentCityY45);
//            System.out.println("Compare cityX: " + xC.get(y46));
//            System.out.println("Compare cityY: " + yC.get(y46));
//            System.out.println("Shortest distance so far: [" + y46 + "] " + sD46);
        }
        //System.out.println("46. shortest path so far: " + sD46);

//        xC.remove(currentCityX46);
//        yC.remove(currentCityY46);
//
//        for (int counter = 0; counter < xC.size(); counter++) {
//            System.out.println("Xs: " + xC.get(counter));
//        }

//        System.out.println("Check the last element 1 : " + xC.get(1));
//        System.out.println("Check the last element 0 : " + xC.get(0));

        lastElementOnTheListX = xC.get(0);
        lastElementOnTheListY = yC.get(0);

//        System.out.println("Last element on the list X: " + lastElementOnTheListX);
//        System.out.println("Last element on the list Y: " + lastElementOnTheListY);


        float lastDistance = (float) Math.sqrt(Math.abs((xC.get(1) - xC.get(0)) * (xC.get(1) - xC.get(0))) +
                Math.abs(yC.get(1) - yC.get(0)) * (yC.get(1) - yC.get(0)));
//        System.out.println("47. shortest path so far:: " + lastDistance);
//
//        System.out.println("Last element on the list: " + xC.get(0));

        float firstCoordinateX = 6734;
        float firstCoordinateY = 2233;

        float travelSalesManBack = (float) Math.sqrt(Math.abs((firstCoordinateX - xC.get(0)) * (firstCoordinateX - xC.get(0))) +
                Math.abs(firstCoordinateY - yC.get(0)) * (firstCoordinateY - yC.get(0)));

//        System.out.println("travelSalesManBack's distance: " + travelSalesManBack);

        float totalDistance = sD1 + sD2 + sD3 + sD4 + sD5 + sD6 + sD7 + sD8 + sD9 + sD10 + sD11 + sD12 + sD13 + sD14 + sD15 + sD16 + sD17 + sD18 + sD19 + sD20 +
                sD21 + sD22 + sD23 + sD24 + sD25 + sD26 + sD27 + sD28 + sD29 + sD30 + sD31 + sD32 + sD33 + sD34 + sD35 + sD36 + sD37 + sD38 + sD39 + sD40 + sD41 +
                sD42 + sD43 + sD44 + sD45 + sD46 + lastDistance + travelSalesManBack;


        shortingDistances.addAll(Arrays.asList(sD1, sD2, sD3, sD4, sD5, sD6, sD7, sD8, sD9, sD10, sD11, sD12, sD13, sD14, sD15, sD16, sD17, sD18, sD19, sD20,
                sD21, sD22, sD23, sD24, sD25, sD26, sD27, sD28, sD29, sD30, sD31, sD32, sD33, sD34, sD35, sD36, sD37, sD38, sD39, sD40, sD41,
                sD42, sD43, sD44, sD45, sD46, lastDistance, travelSalesManBack));
        Collections.sort(shortingDistances);

        int index = 1;
        for (float counter : shortingDistances) {
            System.out.println(index + ". shortest path so far: " + counter);
            index++;
        }

        System.out.println("Total Distance: " + totalDistance);


    }


    public static void mainWindow() {
        JFrame mainWindow = new JFrame("Greedy Algorithm");
        Canvas canvas = new Greedy_Algorithm();
        canvas.setSize(800, 500);
        canvas.setBackground(Color.white);
        mainWindow.add(canvas);
        mainWindow.pack();
        mainWindow.setVisible(true);

    }


    public static float[] readFile(String file) throws FileNotFoundException {
        File coordinatesFile = new File("C:\\Users\\yasin\\IdeaProjects\\FormalLanguagesProject\\data\\att48_xy.txt");
        Scanner ScanFile = new Scanner(coordinatesFile);
        int ctr = 0;
        while (ScanFile.hasNextInt()) {
            ctr++;
            ScanFile.nextInt();
        }
        float[] coordinates = new float[ctr];

        Scanner getNumbers = new Scanner(coordinatesFile);
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = getNumbers.nextFloat();
        }
        return coordinates;
    }


}
