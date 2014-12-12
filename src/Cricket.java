import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cricket extends JPanel {
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		//Pitch
		g2d.fillRect(190, 100, 50, 200);
		//Bowler
		g2d.drawOval(190, 350, 20, 20);
		//WicketKeeper
		g2d.drawOval(195, 50, 20, 20);
		//1Slip
		g2d.drawOval(170, 45, 20, 20);
		;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cricket");
		frame.add(new Cricket());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	}
