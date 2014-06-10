import javax.swing.*;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame{
	public ShowFlowLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		add(new JLabel("First Name"));
		add(new JTextField("&"));
		add(new JLabel("MI"));
		add(new JTextField("1"));
		add(new JLabel("Last Name"));
		add(new JTextField("&"));
	}
	
	public static void main(String[] Args){
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("Show FlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}