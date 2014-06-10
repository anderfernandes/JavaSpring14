import java.awt.Color;
import javax.swing.JFrame;

public class TestFrame{
	public static void main(String [] Args){
		JFrame frame1 = new JFrame();
		frame1.setTitle("Window 1");
		frame1.setSize(320, 240);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBackground(Color.BLACK);
		frame1.setForeground(Color.BLACK);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame();
		frame2.setTitle("Window 2");
		frame2.setSize(320, 240);
		frame2.setLocation(600, 100);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		
	}
}