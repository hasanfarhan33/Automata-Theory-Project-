import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Nearest_Neighbour extends Canvas {
	
	public static int x_Coordinates = 0; 
	public static int y_Coordinates = 0; 
	public static ArrayList<Float> X_Coordinates = new ArrayList<Float>();
	public static ArrayList<Float> Y_Coordinates = new ArrayList<Float>(); 
	public static float ShortestDistance = 1000000000; 
	public static float CurrentDistance = 0; 
	public static int CurrentIndex = 0;
	public static float NextCity_X = 0; 
	public static float NextCity_Y = 0; 
	public static ArrayList<Float> NextCityX = new ArrayList<Float>();  //Store the X locations of the next city 
	public static ArrayList<Float> NextCityY = new ArrayList<Float>();  //Store the Y locations of the next city
	
	public static ArrayList<Float> ShortestDistances = new ArrayList<Float>();  //Stores the calculated shortest distances in the array 
	public static Stack<Float> CurrentShortestDistances = new Stack<Float>(); 
	public static Stack<Float> CurrentShortestCoordinateX = new Stack<Float>(); 
	public static Stack<Float> CurrentShortestCoordinateY = new Stack<Float>(); 
	public static Random RandomCity = new Random(); 
	
	//float CurrentDistance = (float) Math.sqrt(Math.abs((X_Coordinates.get(j) - X_Coordinates.get(i)) * (X_Coordinates.get(j) - X_Coordinates.get(i))) + Math.abs((Y_Coordinates.get(j) - Y_Coordinates.get(i)) * (Y_Coordinates.get(j) - Y_Coordinates.get(i))));

	
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
		
		
		System.out.println("");
		System.out.println("Next City X: " + NextCityX);
		System.out.println("");
		System.out.println("Next City Y: " + NextCityY);
		System.out.println("");
		System.out.println("Shortest Distances : " + ShortestDistances);
		System.out.println("");
		System.out.println("Total distance so far : " + TotalDistanceCalculator());
		System.out.println("");
		System.out.println("Remaining X Coordinates = " + X_Coordinates.size());
		System.out.println("");
		System.out.println("Remaining Y Coordinates = " + Y_Coordinates.size());
		
	

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
            g.fillOval((Math.round(X_Coordinates.get(i)) % 800),(Math.round(Y_Coordinates.get(i)) % 500), 10, 10);
            
        }
    }
	
	public static void Nearest_Neighbour_Algorithm()
	{
		int RandomIndex = RandomCity.nextInt(X_Coordinates.size());
		System.out.println("Random Index = " + RandomIndex);
		
		for(int i = 0; i < X_Coordinates.size(); i++) //Calculate the shortest distance from the first city 
		{
			CurrentDistance = (float) Math.sqrt(Math.abs((X_Coordinates.get(RandomIndex) - X_Coordinates.get(i)) * (X_Coordinates.get(RandomIndex) - X_Coordinates.get(i))) + Math.abs((Y_Coordinates.get(RandomIndex) - Y_Coordinates.get(i)) * (Y_Coordinates.get(RandomIndex) - Y_Coordinates.get(i))));
			if(CurrentDistance <= ShortestDistance && CurrentDistance != 0)
			{
				ShortestDistance = CurrentDistance; 
				NextCity_X = X_Coordinates.get(i); 
				NextCity_Y = Y_Coordinates.get(i);
			}
			
			
		}
		
		System.out.println("Shortest distance so far : " + ShortestDistance); 
		System.out.println("Next City X: " + NextCity_X); 
		System.out.println("Next City Y: " + NextCity_Y);
		
		NextCityX.add(NextCity_X); 
		NextCityY.add(NextCity_Y); 
		ShortestDistances.add(ShortestDistance);
		
		ShortestDistance = 1000000000;
		
		for(int i = 0; i < NextCityX.size(); i++)
		{
			
			for(int j = 0; j < X_Coordinates.size(); j++)
			{
				
				//System.out.println(j);
				
					CurrentDistance = (float) Math.sqrt(Math.abs((NextCityX.get(i) - X_Coordinates.get(j)) * (NextCityX.get(i) - X_Coordinates.get(j))) + Math.abs((NextCityY.get(i) - Y_Coordinates.get(j)) * (NextCityY.get(i) - Y_Coordinates.get(j))));
					
					if(CurrentDistance == 0) //Remove the previous city
					{
						//System.out.println(" ");
						//System.out.println("You are in the same city");
						X_Coordinates.remove(j);
						Y_Coordinates.remove(j);
					}
				
				if(CurrentDistance <= ShortestDistance && CurrentDistance != 0 && CurrentDistance != ShortestDistances.get(i))
				{
					ShortestDistance = CurrentDistance;
					//System.out.println("Shortest Distance: " + ShortestDistance);
					CurrentShortestDistances.push(ShortestDistance);
					
					
					CurrentShortestCoordinateX.push(X_Coordinates.get(j));
					CurrentShortestCoordinateY.push(Y_Coordinates.get(j));
				}
				
				if(j == X_Coordinates.size() - 1)
				{
					//System.out.println("We are in here");
					//System.out.println("Shortest Distance = " + CurrentShortestDistances.peek());
					ShortestDistances.add(CurrentShortestDistances.peek());
					//System.out.println(ShortestDistances);
					CurrentShortestDistances.clear(); 
					ShortestDistance = 1000000000;
					
					NextCityX.add(CurrentShortestCoordinateX.peek());
					NextCityY.add(CurrentShortestCoordinateY.peek());
				}
				
				
				
			}
			
			if(X_Coordinates.size() == 2 && Y_Coordinates.size() == 2)
			{
				break;
			}
			
		
			
			
		}	
	}
	
	
	
	
	public static float TotalDistanceCalculator()
	{
		float TotalDistance = 0; 
		for(int i = 0; i < ShortestDistances.size(); i++)
		{
			TotalDistance = TotalDistance + ShortestDistances.get(i);
		}
		
		return TotalDistance;
	}
}
