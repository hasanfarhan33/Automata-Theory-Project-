import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Nearest_Neighbour extends Canvas {
	
	public static int x_Coordinates = 0; 
	public static int y_Coordinates = 0; 
	public static ArrayList<Float> X_Coordinates = new ArrayList<Float>();
	public static ArrayList<Float> Y_Coordinates = new ArrayList<Float>(); 
	public static float ShortestDistance = 1000000000; 
	public static float CurrentDistance = 0; 
	public static int CurrentIndex = 0; 
	
	 
	
	
	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		
		float[] XYCoordinates = readFile("C:\\Users\\hasan\\Downloads\\Bahcesehir University\\Year 3\\Semester 2\\Formal Languages and Automa Theory\\Project\\att48_xy.txt");
		
		for(int i = 0; i < XYCoordinates.length; i = i + 2)
		{
			//Use this loop to store X Coordinates 
			X_Coordinates.add(XYCoordinates[i]);
		}
		
		for(int j = 1; j < XYCoordinates.length; j = j + 2)
		{
			//Use this loop to store Y Coordinates
			Y_Coordinates.add(XYCoordinates[j]);
		}
		
		for(int i = 0; i < X_Coordinates.size(); i++) //This looks at all the x and y coordinates at the same time in both arraylists 
		{
			//System.out.println("X: " + X_Coordinates.get(i) + " Y: " + Y_Coordinates.get(i));
		}
		
		 //Nearest_Neighbour_Window();
		
		Nearest_Neighbour_Algorithm();
	

	}
	
	public static float[] readFile(String file) throws FileNotFoundException
	{
		File Coordinate_File = new File("C:\\Users\\hasan\\Downloads\\Bahcesehir University\\Year 3\\Semester 2\\Formal Languages and Automa Theory\\Project\\att48_xy.txt");
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
	
	
	
	
	public static void Nearest_Neighbour_Window()
	{
		
		 JFrame Main_Window = new JFrame("Nearest_Neighbour");
		 Canvas canvas = new Nearest_Neighbour();
	     canvas.setSize(800, 500);
	     canvas.setBackground(Color.white);
	     Main_Window.add(canvas);
	     Main_Window.pack();
	     Main_Window.setVisible(true);
			
		
	}
	
	public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        for(int i = 0; i < X_Coordinates.size(); i++){  //This looks at all the x and y coordinates at the same time in both arraylists
            g.fillOval((Math.round(X_Coordinates.get(i))%800),(Math.round(Y_Coordinates.get(i))%500), 10, 10);
        }
    }
	
	public static void Nearest_Neighbour_Algorithm()
	{
		
		for(int i = 0; i < X_Coordinates.size(); i++)
		{
			for(int j = 0; j < Y_Coordinates.size(); j++)
			{
				if(i == j) //We don't want the same coordinates again 
				{
					j++; 
				}
				
				//float Xdistance = Math.abs(X_Coordinates.get(j) - X_Coordinates.get(i));
				//System.out.println(X_Coordinates.get(j) + " - " + X_Coordinates.get(i) + " = " +  Xdistance); 
				
				float CurrentDistance = (float) Math.sqrt(Math.abs((X_Coordinates.get(j) - X_Coordinates.get(i)) * (X_Coordinates.get(j) - X_Coordinates.get(i))) + Math.abs((Y_Coordinates.get(j) - Y_Coordinates.get(i)) * (Y_Coordinates.get(j) - Y_Coordinates.get(i))));
				System.out.println("X Coordinate 1 : " + X_Coordinates.get(i)  + "  X Coordinate 2 : " + X_Coordinates.get(j));
				System.out.println("Y Coordinate 1 : " + Y_Coordinates.get(i) + "  Y Coordinate 2 : " + Y_Coordinates.get(j)); 
				System.out.println(CurrentDistance); 
				
				if(CurrentDistance <= ShortestDistance)
				{
					ShortestDistance = CurrentDistance; 
				}
				
				System.out.println("Shortest Distance so far: " + ShortestDistance); 
			}
			
			break; 
		}
		
	}
	
	

}
