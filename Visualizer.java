import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Visualizer extends JPanel {
	
	//Nearest_Neighbour Variables = new Nearest_Neighbour(); 
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.WHITE);
		g.fillOval(Nearest_Neighbour.x_Coordinates, Nearest_Neighbour.y_Coordinates, 20, 20);
		
	}

}
