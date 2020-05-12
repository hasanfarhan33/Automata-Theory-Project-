import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Nearest_Neighbour extends Canvas{
    public static float x_Coordinates = 0;
    public static float y_Coordinates = 0;
    public static ArrayList<Float> X_Coordinates = new ArrayList<Float>();
    public static ArrayList<Float> Y_Coordinates = new ArrayList<Float>();

    public static void main(String[] args) throws FileNotFoundException  {
        float[] XYCoordinates = readFile("C:\\Users\\yasin\\IdeaProjects\\AutomataTheoryProject\\data\\att48_xy.txt");

        for(int i = 0; i < XYCoordinates.length; i = i + 2) {
            X_Coordinates.add(XYCoordinates[i]);                    //Use this loop to store X Coordinates
        }

        for(int j = 1; j < XYCoordinates.length; j = j + 2) {
            Y_Coordinates.add(XYCoordinates[j]);                   //Use this loop to store Y Coordinates
        }

        for(int i = 0; i < X_Coordinates.size(); i++){  //This looks at all the x and y coordinates at the same time in both arraylists
            System.out.println("X: " + X_Coordinates.get(i) + " Y: " + Y_Coordinates.get(i));
        }

        System.out.println("X_Coordinates.get(0): " + Math.round(X_Coordinates.get(0)));
        System.out.println("Y_Coordinates.get(0): " + Math.round(Y_Coordinates.get(0)));

        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Nearest_Neighbour();
        canvas.setSize(800, 500);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        for(int i = 0; i < X_Coordinates.size(); i++){  //This looks at all the x and y coordinates at the same time in both arraylists
            g.fillOval((Math.round(X_Coordinates.get(i))%800),(Math.round(Y_Coordinates.get(i))%500), 10, 10);
        }
    }

    public static float[] readFile(String file) throws FileNotFoundException
    {
        File Coordinate_File = new File("C:\\Users\\yasin\\IdeaProjects\\AutomataTheoryProject\\data\\att48_xy.txt");
        Scanner ScanFile = new Scanner(Coordinate_File);
        int ctr = 0;
        while(ScanFile.hasNextInt())
        {
            ctr++;
            ScanFile.nextInt();
        }
        float[] Coordinates = new float [ctr];

        Scanner Get_Numbers = new Scanner(Coordinate_File);
        for(int i = 0; i < Coordinates.length; i++)
        {
            Coordinates[i] = Get_Numbers.nextFloat();
        }
        return Coordinates;
    }
}
