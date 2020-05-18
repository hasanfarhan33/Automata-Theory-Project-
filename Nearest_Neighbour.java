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
	public static float FirstCityX = 0; 
	public static float FirstCityY = 0; 
	public static float LastCityX = 0; 
	public static float LastCityY = 0; 
	public static float LastDistance = 0; 
	public static float TotalDistance = 0; 

	public static float LastElementX = 0; 
	public static float LastElementY = 0; 
	public static boolean LastElementsRemoved = false;

	
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
		
		
		 //Nearest_Neighbour_Window();
		
		
		Nearest_Neighbour_Algorithm();
		TotalDistance = TotalDistanceCalculator() + LastDistance;
		
		
		System.out.println("");
		System.out.println("_______________RESULTS______________");
		System.out.println("Remaining X and Y Coordinates = " + X_Coordinates.size());
		System.out.println("Shortest distances : " + ShortestDistances);
		System.out.println("Remaining X Coordinates : " + X_Coordinates); 
		System.out.println("Remaining Y Coordinates : " + Y_Coordinates);
		
		System.out.println("Next City X : " + NextCityX);
		System.out.println("Next City Y : " + NextCityY);
		
		System.out.println("Final Distance : " + LastDistance);
		System.out.println("Total Distance : " + TotalDistance);
		
		
		
		
	

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
		
		System.out.println("The first random city is : " + X_Coordinates.get(RandomIndex) + ", " + Y_Coordinates.get(RandomIndex));
		
		if(NextCityX.isEmpty())
		{
			for(int i = 0; i < X_Coordinates.size(); i++) //Calculate the shortest distance for the first city
			{
				float CurrentDistance = (float) Math.sqrt(Math.abs((X_Coordinates.get(RandomIndex) - X_Coordinates.get(i)) * (X_Coordinates.get(RandomIndex) - X_Coordinates.get(i))) + Math.abs((Y_Coordinates.get(RandomIndex) - Y_Coordinates.get(i)) * (Y_Coordinates.get(RandomIndex) - Y_Coordinates.get(i))));
				
				if(CurrentDistance == 0)
				{
					FirstCityX = X_Coordinates.get(i); 
					FirstCityY = Y_Coordinates.get(i);
					
					X_Coordinates.remove(i); //Remove the coordinates from the array after storing it in another variable
					Y_Coordinates.remove(i);	
					
				}
				else
				{
					if(CurrentDistance <= ShortestDistance && LastElementsRemoved == false)
					{
						ShortestDistance = CurrentDistance; 
						
						System.out.println("Shortest Distance so far : " + ShortestDistance + ", at " + X_Coordinates.get(i) + ", " + Y_Coordinates.get(i));
						
						CurrentShortestDistances.push(ShortestDistance);
						CurrentShortestCoordinateX.push(X_Coordinates.get(i));
						CurrentShortestCoordinateY.push(Y_Coordinates.get(i));
					}
				}
				
				
				
				if(i == X_Coordinates.size() - 1)
				{
					ShortestDistances.add(CurrentShortestDistances.peek());
					NextCityX.add(CurrentShortestCoordinateX.peek());
					NextCityY.add(CurrentShortestCoordinateY.peek());
					
					CurrentShortestDistances.clear(); 
					CurrentShortestCoordinateX.clear();
					CurrentShortestCoordinateY.clear();
					
					ShortestDistance = 1000000000;
				}
			}
		}
		
		
		
		for(int i = 0; i < NextCityX.size(); i++)
		{
			for(int j = 0; j < X_Coordinates.size(); j++)
			{
				float CurrentDistance = (float) Math.sqrt(Math.abs((NextCityX.get(i) - X_Coordinates.get(j)) * (NextCityX.get(i) - X_Coordinates.get(j))) + Math.abs((NextCityY.get(i) - Y_Coordinates.get(j)) * (NextCityY.get(i) - Y_Coordinates.get(j))));
				
				
				System.out.println( NextCityX.get(i) + ", " + NextCityY.get(i) + "   " + X_Coordinates.get(j) + ", " + Y_Coordinates.get(j) + "     " + CurrentDistance);
				
				if(CurrentDistance == 0 && j < X_Coordinates.size() - 1)
				{
					
					X_Coordinates.remove(j);
					Y_Coordinates.remove(j);
				}
				
				else if(CurrentDistance == 0 && j == X_Coordinates.size() - 1)
				{
					
					LastElementsRemoved = true; 
					
				}
				
				if(LastElementsRemoved == false)
				{
					if(CurrentDistance <= ShortestDistance && CurrentDistance != 0 && CurrentDistance != ShortestDistances.get(ShortestDistances.size() - 1))
					{
						
						ShortestDistance = CurrentDistance; 
						System.out.println("Smallest Distance : " + ShortestDistance);
						CurrentShortestDistances.push(ShortestDistance);
						CurrentShortestCoordinateX.push(X_Coordinates.get(j));
						CurrentShortestCoordinateY.push(Y_Coordinates.get(j));	
					}
					
					if(j == X_Coordinates.size() - 1)
					{
						
						ShortestDistances.add(CurrentShortestDistances.peek());
						NextCityX.add(CurrentShortestCoordinateX.peek());
						NextCityY.add(CurrentShortestCoordinateY.peek());
						
						ShortestDistance = 1000000000;
						
					}
				}
				else
				{
					if(CurrentDistance <= ShortestDistance && CurrentDistance != 0 && CurrentDistance != ShortestDistances.get(ShortestDistances.size() - 1) && j != X_Coordinates.get(X_Coordinates.size() - 1))
					{
						ShortestDistance = CurrentDistance; 
						System.out.println("Smallest Distance : " + ShortestDistance);
						CurrentShortestDistances.push(ShortestDistance);
						CurrentShortestCoordinateX.push(X_Coordinates.get(j));
						CurrentShortestCoordinateY.push(Y_Coordinates.get(j));
					}
					if(j == X_Coordinates.size() - 1)
					{
						
						ShortestDistances.add(CurrentShortestDistances.peek());
						NextCityX.add(CurrentShortestCoordinateX.peek());
						NextCityY.add(CurrentShortestCoordinateY.peek());
						
						ShortestDistance = 1000000000;
					}
				}
					
				
			}
			
			if(X_Coordinates.size() == 2 && Y_Coordinates.size() == 2)
			{
				LastCityX = X_Coordinates.get(1);
				LastCityY = Y_Coordinates.get(1);
				
				LastDistance = (float) Math.sqrt(Math.abs((LastCityX - FirstCityX) * (LastCityX - FirstCityX)) + Math.abs((LastCityY - FirstCityY) * (LastCityY - FirstCityY)));
				
				
				
				break;
			}
				
		}
		
		
	}
	
	
	
	
	public static float TotalDistanceCalculator()
	{
		float SemiTotalDistance = 0; 
		for(int i = 0; i < ShortestDistances.size(); i++)
		{
			SemiTotalDistance = SemiTotalDistance + ShortestDistances.get(i);
		}
		
		
		
		return SemiTotalDistance;
	}
}
