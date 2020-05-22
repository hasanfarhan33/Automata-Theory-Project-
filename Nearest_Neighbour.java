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
	public static boolean LastElementRemoved = false;
	public static boolean BeenThere = false; 
	
	public static ArrayList<Float> LineX = new ArrayList<Float>();
	public static ArrayList<Float> LineY = new ArrayList<Float>();
	public static ArrayList<Float> DotX = new ArrayList<Float>();
	public static ArrayList<Float> DotY = new ArrayList<Float>();
	public static int CircleX = 0; 
	public static int CircleY = 0; 

	
	//float CurrentDistance = (float) Math.sqrt(Math.abs((X_Coordinates.get(j) - X_Coordinates.get(i)) * (X_Coordinates.get(j) - X_Coordinates.get(i))) + Math.abs((Y_Coordinates.get(j) - Y_Coordinates.get(i)) * (Y_Coordinates.get(j) - Y_Coordinates.get(i))));

	
	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		
		float[] XYCoordinates = readFile("C:\\Users\\hasan\\Downloads\\Bahcesehir University\\Year 3\\Semester 2\\Formal Languages and Automa Theory\\Project\\att48_xy.txt");
		
		for(int i = 0; i < XYCoordinates.length; i = i + 2)
		{
			//Use this loop to store X Coordinates 
			X_Coordinates.add(XYCoordinates[i]);
			DotX.add(XYCoordinates[i]);
		}
		
		for(int j = 1; j < XYCoordinates.length; j = j + 2)
		{
			//Use this loop to store Y Coordinates
			Y_Coordinates.add(XYCoordinates[j]);
			DotY.add(XYCoordinates[j]);
		}
		
		
		 
		
		long StartTime = System.nanoTime();
		Nearest_Neighbour_Algorithm();
		Nearest_Neighbour_Window();
		TotalDistance = TotalDistanceCalculator() + LastDistance;
		long EndTime = System.nanoTime(); 
		
		long TimeElapsed = EndTime - StartTime; 
		
		
		
		//SameNumberChecker();
		
		
		System.out.println("");
		System.out.println("_______________RESULTS______________");
		
		System.out.println("Time taken : " + TimeElapsed/1000000 + " milliseconds");
		
		System.out.println("Remaining X and Y Coordinates = " + X_Coordinates.size());
		System.out.println("Shortest distances : " + ShortestDistances);
		System.out.println("Remaining X Coordinates : " + X_Coordinates); 
		System.out.println("Remaining Y Coordinates : " + Y_Coordinates);
		System.out.println("First City : " + FirstCityX + ", " + FirstCityY);
		System.out.println("Last City : " + LastCityX + ", " + LastCityY);
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
	     canvas.setSize(1000, 1000);
	     canvas.setBackground(Color.white);
	     Main_Window.add(canvas);
	     Main_Window.pack();
	     Main_Window.setVisible(true);
	     Main_Window.setResizable(false);
	     
			
		
	}
	
	public void paint(Graphics g) //This is for the dots
    { 
       g.setColor(Color.BLACK);
       g.drawLine((int)FirstCityX % 1000, (int)FirstCityY % 1000, (int)LastCityX % 1000, (int)LastCityY % 1000);
       g.drawLine((int)FirstCityX % 1000, (int)FirstCityY % 1000, (int)(NextCityX.get(0) % 1000), (int)(NextCityY.get(0) % 1000));
       
       for(int i = 0; i < NextCityX.size(); i++)
       {
    	   g.setColor(Color.RED);
    	   g.drawLine((int)(NextCityX.get(i) % 1000), (int)(NextCityY.get(i) % 1000), (int)(NextCityX.get(i+1) % 1000), (int)(NextCityY.get(i+1) % 1000));
    	   
    	   if(NextCityX.get(i+1) == NextCityX.get(NextCityX.size() - 1))
    	   {
    		   break;
    	   }
    	   
       }
       
       
       
       g.setColor(Color.blue);
       for(int i = 0; i < DotX.size(); i++) //This looks at all the x and y coordinates at the same time in both arraylists
       {  
       	CircleX = (int) (DotX.get(i) - 5);
       	CircleY = (int)(DotY.get(i) - 5);
           g.fillOval(CircleX % 1000,CircleY % 1000, 10, 10);
           
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
					
					LineX.add(FirstCityX);
					LineY.add(FirstCityY);
					
					X_Coordinates.remove(i); //Remove the coordinates from the array after storing it in another variable
					Y_Coordinates.remove(i);	
		
					
				}
				else
				{
					if(CurrentDistance <= ShortestDistance && LastElementRemoved == false)
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
					LineX.add(CurrentShortestCoordinateX.peek());
					LineY.add(CurrentShortestCoordinateY.peek());
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
				
				System.out.println(NextCityX.get(i) + ", " + NextCityY.get(i) + "     " + X_Coordinates.get(j) + ", " + Y_Coordinates.get(j));
				
				
				if(CurrentDistance == 0 && j < X_Coordinates.size() - 1)
				{
					
					X_Coordinates.remove(j);
					Y_Coordinates.remove(j);
				}
				
				else if(CurrentDistance == 0 && j == X_Coordinates.size() - 1)
				{
					
					LastElementRemoved = true; 
					
				}
				
				if(LastElementRemoved == false)
				{
					if(CurrentDistance <= ShortestDistance && CurrentDistance != 0 && CurrentDistance != ShortestDistances.get(ShortestDistances.size() - 1))
					{
						
						ShortestDistance = CurrentDistance; 
						
						System.out.println("Shortest distance so far : " + ShortestDistance + " at " + X_Coordinates.get(j) + ", " + Y_Coordinates.get(j));
						
						CurrentShortestDistances.push(ShortestDistance);
						CurrentShortestCoordinateX.push(X_Coordinates.get(j));
						CurrentShortestCoordinateY.push(Y_Coordinates.get(j));	
					}
					
					if(j == X_Coordinates.size() - 1)
					{
						
						ShortestDistances.add(CurrentShortestDistances.peek());
						NextCityX.add(CurrentShortestCoordinateX.peek());
						NextCityY.add(CurrentShortestCoordinateY.peek());
						LineX.add(CurrentShortestCoordinateX.peek());
						LineY.add(CurrentShortestCoordinateY.peek());
						
						CurrentShortestDistances.clear();
						CurrentShortestCoordinateX.clear();
						CurrentShortestCoordinateY.clear();
						
						ShortestDistance = 1000000000;
						
					}
					
					
				}
				else
				{
					if(CurrentDistance <= ShortestDistance && CurrentDistance != 0 && CurrentDistance != ShortestDistances.get(ShortestDistances.size() - 1) && j != X_Coordinates.get(X_Coordinates.size() - 1) && j != X_Coordinates.size() - 1)
					{
						ShortestDistance = CurrentDistance; 
						
						System.out.println("Shortest distance so far : " + ShortestDistance + " at " + X_Coordinates.get(j) + ", " + Y_Coordinates.get(j));
						
						
						CurrentShortestDistances.push(ShortestDistance);
						CurrentShortestCoordinateX.push(X_Coordinates.get(j));
						CurrentShortestCoordinateY.push(Y_Coordinates.get(j));
					}
					if(j == X_Coordinates.size() - 1)
					{
						
						ShortestDistances.add(CurrentShortestDistances.peek());
						NextCityX.add(CurrentShortestCoordinateX.peek());
						NextCityY.add(CurrentShortestCoordinateY.peek());
						LineX.add(CurrentShortestCoordinateX.peek());
						LineY.add(CurrentShortestCoordinateY.peek());
						CurrentShortestDistances.clear();
						CurrentShortestCoordinateX.clear();
						CurrentShortestCoordinateY.clear();
						
						ShortestDistance = 1000000000;
					}
					
					
				}
					
				
			}
			
			if(X_Coordinates.size() == 2 && Y_Coordinates.size() == 2)
			{
				LastCityX = X_Coordinates.get(0);
				LastCityY = Y_Coordinates.get(0);	
				
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
	
	public static void SameNumberChecker()
	{
		for(int i =0; i < NextCityX.size(); i++)
		{
			for(int j = i + 1; j < NextCityX.size(); j ++)
			{
				if(NextCityX.get(i) == NextCityX.get(j))
				{
					System.out.println("There is something wrong with your algorithm");
					System.out.println("The same cities are : " + NextCityX.get(i) + ", " + NextCityY.get(i));
				}
			}
		}
	}
	
	
	
}
