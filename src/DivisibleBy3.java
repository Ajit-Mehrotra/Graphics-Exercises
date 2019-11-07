import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisibleBy3 implements ActionListener{
	JFrame frame;
	JPanel contentPane;
	JLabel prompt1, divisibleLabel;
	JTextField integer;
	JButton divisibleButton;

	String divisible = " ";


	boolean isDivisible = false;

	public DivisibleBy3() {
		frame = new JFrame("DivisibleBy3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout( 2, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));

		prompt1 = new JLabel("Enter an Integer: ");
		prompt1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		prompt1.setAlignmentY(JLabel.TOP_ALIGNMENT);
		prompt1.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(prompt1);

		integer = new JTextField(10);
		integer.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		integer.setAlignmentY(JLabel.TOP_ALIGNMENT);
		integer.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(integer);


		divisibleButton = new JButton("Check");
		divisibleButton.setActionCommand("Check");
		divisibleButton.addActionListener(this);
		divisibleButton.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		divisibleButton.setAlignmentY(JLabel.BOTTOM_ALIGNMENT);
		divisibleButton.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(divisibleButton);

		divisibleLabel = new JLabel("  ");
		divisibleLabel.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		divisibleLabel.setAlignmentY(JLabel.BOTTOM_ALIGNMENT);
		divisibleLabel.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		contentPane.add(divisibleLabel);

		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);

	}





	@Override
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();

		if(eventName.equals("Check")) {
			double avgGrade;
			String enteredInteger  = integer.getText();

			avgGrade = (Double.parseDouble(enteredInteger) % 3);
			if(avgGrade == 0 ) {
				divisible = "Number is Divisible By 3.";

			}else {
				divisible = "Number is NOT Divisible By 3.";
			}

			divisibleLabel.setText(divisible);
			divisibleButton.setText("Check");
			divisibleButton.setActionCommand("Check");
			//average.setText(Double.toString(avgGrade));
		}
	}

	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		DivisibleBy3 myGrades = new DivisibleBy3();

	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}


}
