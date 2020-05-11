import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Nearest_Neighbour extends JPanel {
	
	public static int x_Coordinates = 0; 
	public static int y_Coordinates = 0; 
	public static ArrayList<Float> X_Coordinates = new ArrayList<Float>();
	public static ArrayList<Float> Y_Coordinates = new ArrayList<Float>(); 
	 
	
	
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
			System.out.println("X: " + X_Coordinates.get(i) + " Y: " + Y_Coordinates.get(i));
		}
		
		//Nearest_Neighbour_Window(); 
	

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
		Main_Window.setLayout(new FlowLayout());
		JLabel title = new JLabel("Nearest Neighbour Algorithm");
		title.setFont(title.getFont().deriveFont(32.0f));
		title.setForeground(Color.WHITE);
		title.setBounds(150, 40, 100, 30);
		
		
		Main_Window.setSize(800, 800);
		Main_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main_Window.setVisible(true);
		Main_Window.setResizable(false);
		Main_Window.getContentPane().setBackground(Color.BLACK);
		Main_Window.getContentPane().add(title);
			
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.WHITE);
		g.fillOval(x_Coordinates, y_Coordinates, 20, 20);
		
	}
	
	

}
