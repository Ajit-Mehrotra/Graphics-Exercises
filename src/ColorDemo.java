import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorDemo implements ActionListener{

	JFrame frame;
	JPanel contentPane;
	JTextField name;
	JButton displayMessage;
	JLabel textFieldPrompt, hello;

	public ColorDemo() {
		frame = new JFrame("ColorDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new GridLayout( 0, 2, 5, 10));

		textFieldPrompt = new JLabel("Type your name: ");
		textFieldPrompt.setForeground(Color.red);
		contentPane.add(textFieldPrompt);

		name = new JTextField(10);
		name.setBackground(Color.BLACK);
		name.setForeground(Color.RED);
		contentPane.add(name);

		displayMessage = new JButton("Display Message");
		displayMessage.setBackground(Color.yellow);
		displayMessage.setForeground(Color.blue);
		displayMessage.addActionListener(this);
		contentPane.add(displayMessage);

		hello = new JLabel("  ");
		hello.setForeground(Color.green);
		contentPane.add(hello);

		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {

		String text = name.getText();
		hello.setText("Hello " + text);;


	}
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		ColorDemo myGrades = new ColorDemo();

	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}


}
