
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class NumClicked implements ActionListener {
	
	int timesClicked = 1;
	String str = " ";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;
	
	public NumClicked() {
		frame = new JFrame("NumClicks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		label = new JLabel(str);
		contentPane.add(label);
		
		button = new JButton("Click");
		button.setActionCommand("timesClickedButton");
		button.addActionListener(this);
		contentPane.add(button);
		
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		NumClicked greeting = new NumClicked();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		
			label.setText("  ");
			button.setText("You have clicked " + timesClicked + " times.");
			button.setActionCommand("numberOfTimesClicked");
			
		timesClicked++;
	}
	
	
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}


}
