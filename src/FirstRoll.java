import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FirstRoll implements ActionListener {
	JFrame frame;
	JPanel contentPane;
	JButton rollDie;
	JLabel dieFace;

	public FirstRoll() {
		frame = new JFrame("Roll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		dieFace =  new JLabel(new ImageIcon ("die3.gif"));
		dieFace.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace.setBorder(BorderFactory.createEmptyBorder( 0, 0, 10, 0));
		
		contentPane.add(dieFace);
		rollDie = new JButton("Roll Die");
		rollDie.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rollDie.addActionListener(this);
		contentPane.add(rollDie);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Random rand = new Random();
		int newRoll;
		
		newRoll = rand.nextInt(6) + 1;
		if(newRoll == 1) {
			dieFace.setIcon(new ImageIcon("die1.gif"));
			
		}else if(newRoll == 2) {
			dieFace.setIcon(new ImageIcon("die2.gif"));
			
		}else if(newRoll == 3) {
			dieFace.setIcon(new ImageIcon("die3.gif"));
			
		}else if(newRoll == 4) {
			dieFace.setIcon(new ImageIcon("die4.gif"));
			
		}else if(newRoll == 5) {
			dieFace.setIcon(new ImageIcon("die5.gif"));
			
		}else if(newRoll == 6) {
			dieFace.setIcon(new ImageIcon("die6.gif"));
			
		}
		
	}
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		FirstRoll myGrades = new FirstRoll();
		

	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}
}
