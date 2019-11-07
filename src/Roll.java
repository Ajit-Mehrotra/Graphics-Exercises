import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Roll implements ActionListener {
	JFrame frame;
	JPanel contentPane;
	JButton rollDie;
	JLabel dieFace1, dieFace2;

	public Roll() {
		frame = new JFrame("Roll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		dieFace1 =  new JLabel(new ImageIcon ("die3.gif"));
		dieFace1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		dieFace1.setAlignmentY(JLabel.TOP_ALIGNMENT);

		dieFace1.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));

		dieFace2 =  new JLabel(new ImageIcon ("die3.gif"));
		dieFace2.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		dieFace2.setAlignmentY(JLabel.TOP_ALIGNMENT);
		/*		dieFace2.setBackground(Color.WHITE);
		dieFace2.setForeground(Color.YELLOW);*/
		dieFace2.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));

		contentPane.add(dieFace1);
		contentPane.add(dieFace2);

		rollDie = new JButton("Roll Die");
		rollDie.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		rollDie.setBackground(Color.yellow);
		rollDie.setForeground(Color.red);

		rollDie.addActionListener(this);
		contentPane.add(rollDie);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);




	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Random rand = new Random();
		int newRoll1, newRoll2;

		newRoll1 = rand.nextInt(6) + 1;
		newRoll2 = rand.nextInt(6) + 1;

		if(newRoll1 == 1) {
			dieFace1.setIcon(new ImageIcon("die1.gif"));

		}else if(newRoll1 == 2) {
			dieFace1.setIcon(new ImageIcon("die2.gif"));

		}else if(newRoll1 == 3) {
			dieFace1.setIcon(new ImageIcon("die3.gif"));

		}else if(newRoll1 == 4) {
			dieFace1.setIcon(new ImageIcon("die4.gif"));

		}else if(newRoll1 == 5) {
			dieFace1.setIcon(new ImageIcon("die5.gif"));

		}else if(newRoll1 == 6) {
			dieFace1.setIcon(new ImageIcon("die6.gif"));

		}

		if(newRoll2 == 1) {
			dieFace2.setIcon(new ImageIcon("die1.gif"));

		}else if(newRoll2 == 2) {
			dieFace2.setIcon(new ImageIcon("die2.gif"));

		}else if(newRoll2 == 3) {
			dieFace2.setIcon(new ImageIcon("die3.gif"));

		}else if(newRoll2 == 4) {
			dieFace2.setIcon(new ImageIcon("die4.gif"));

		}else if(newRoll2 == 5) {
			dieFace2.setIcon(new ImageIcon("die5.gif"));

		}else if(newRoll2 == 6) {
			dieFace2.setIcon(new ImageIcon("die6.gif"));

		}

	}
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		Roll myGrades = new Roll();


	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}
}
