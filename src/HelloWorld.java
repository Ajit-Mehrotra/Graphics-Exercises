//Hello World but with a GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class HelloWorld implements ActionListener {
	final static String str = "Hello World";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;
	public HelloWorld() {
		frame = new JFrame("This is the Hello World Program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		label = new JLabel(str);
		contentPane.add(label);
		
		button = new JButton("Hide");
		button.setActionCommand("Hide");
		button.addActionListener(this);
		contentPane.add(button);
		
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		HelloWorld greeting = new HelloWorld();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		if(eventName.equals("Hide")) {
			label.setText("  ");
			button.setText("Show");
			button.setActionCommand("Show");
			
		}else {
			label.setText(str);
			button.setText("hella yeet");
			button.setActionCommand("Hide");
		}
		
	}
	
	
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}


}
