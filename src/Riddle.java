

// Same as the other HelloWorld Program except it is now modified to include a border, layout manager, and alignment

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Riddle implements ActionListener {
	final static String str = "Hello World";
	final static String riddle = "What has hands but cannot clap";
	final static String answerToRiddle = "A clock";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JLabel label2;
	JButton button;
	public Riddle() {

		frame =  new JFrame("Riddle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout( new GridLayout(2,2,10,5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));


		label = new JLabel(riddle);
		label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		label.setAlignmentY(JLabel.BOTTOM_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));


		label2 = new JLabel("");
		label2.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		label2.setAlignmentY(JLabel.TOP_ALIGNMENT);
		label2.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));
		//contentPane.add(label2);

		button = new JButton("Answer");
		button.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		button.setAlignmentY(JLabel.BOTTOM_ALIGNMENT);
		button.setActionCommand("Answer");
		button.addActionListener(this);


		contentPane.add(label);
		contentPane.add(label2);
		contentPane.add(button);

		//contentPane.add(label2);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);

	}

	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		Riddle greeting = new Riddle();
	}



	@Override
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		if(eventName.equals("Answer")) {


			label2.setText(answerToRiddle);

			button.setText("Hide");
			button.setActionCommand("Hide");


		}else  {
			label2.setText("");
			//label2.setText("  ");
			//label.setText(riddle);
			button.setText("Answer");
			button.setActionCommand("Answer");
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
