

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

public class Name implements ActionListener {
	final static String str = "Ajit Mehrotra";
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;
	public Name() {

		frame =  new JFrame("Name Border");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout( new GridLayout(2,2,10,5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

		label = new JLabel(str);
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label.setBorder(BorderFactory.createEmptyBorder(10,50,20,50));
		contentPane.add(label);

		button = new JButton("Hide Me [O w O] ");
		button.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		button.setActionCommand("Hide");
		button.addActionListener(this);
		contentPane.add(button);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);

	}

	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		Name greeting = new Name();
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
			button.setText("Hide Me [O w O] ");
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
