import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class barGraph extends JPanel{
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	
	 JFrame frame;
	 JPanel contentPane;
	 JLabel prompt1, prompt2, prompt3,prompt4, prompt5, average;
	 JTextField grade1, grade2, grade3, grade4, grade5;
	 JButton avgButton;

	 
	 
	 
	public void paintComponent(Graphics g) {
		int spacer = 20;
		int diffInPos = (getHeight() -60 )/5; // might want to include the spacers used
		
		
		int YPos1 = 0;
		int YPos2 =  spacer + diffInPos ;
		int YPos3 =  2*spacer + diffInPos*2 ;
		int YPos4 =   3*spacer +diffInPos*3;
		int YPos5 =  4*spacer +diffInPos*4;
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.fillRect(0, YPos1, 
				getWidth()/2, getHeight()/4); //getWidth changes left to right && getHeight changed top to Bottom
		
		g.fillRect(0,  YPos2, 
				getWidth()/2, getHeight()/4);
		g.fillRect(0,  YPos3, 
				getWidth()/2, getHeight()/4);
		g.fillRect(0,  YPos4, 
				getWidth()/2, getHeight()/4);
		
		
		
	}
	/**
	 * 
	 */
	 
	 
	
	 class yolo extends JPanel implements ActionListener{

	

	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;





	public yolo() {
	 	frame = new JFrame("Semester Average");
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	
	 	contentPane = new JPanel();
	 	contentPane.setLayout(new GridLayout( 0, 2, 10, 5));
	 	contentPane.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));
	 	
	 	prompt1 = new JLabel("Enter the first grade: ");
	 	contentPane.add(prompt1);
	 	
	 	grade1 = new JTextField(10);
	 	contentPane.add(grade1);
	 	
	 	prompt2 = new JLabel("Enter the second grade: ");
	 	contentPane.add(prompt2);
	 	
	 	grade2 = new JTextField(10);
	 	contentPane.add(grade2);
	 	
	 	prompt3 = new JLabel("Enter the third grade: ");
	 	contentPane.add(prompt3);
	 	
	 	grade3 = new JTextField(10);
	 	contentPane.add(grade3);
	 	
	 	prompt4 = new JLabel("Enter the fourth grade: ");
	 	contentPane.add(prompt4);
	 	
	 	grade5 = new JTextField(10);
	 	contentPane.add(grade5);
	 	
	 	prompt5 = new JLabel("Enter the fifth grade: ");
	 	contentPane.add(prompt5);
	 	
	 	
	 	
	 	grade2 = new JTextField(10);
	 	contentPane.add(grade2);
	 	
	 	
	 	avgButton = new JButton("Average");
	 	avgButton.setActionCommand("Average");
	 	avgButton.addActionListener(this);
	 	contentPane.add(avgButton);
	 	
	 	average = new JLabel("  ");
	 	contentPane.add(average);
	 	
	 	frame.setContentPane(contentPane);
	 	frame.pack();
	 	frame.setVisible(true);
	 	
	 }





	 public void actionPerformed(ActionEvent event) {
	 	String eventName = event.getActionCommand();
	 	
	 	if(eventName.equals("Average")) {
	 		double avgGrade;
	 		String g1 = grade1.getText();
	 		String g2 = grade2.getText();
	 		String g3 = grade3.getText();
	 		
	 		avgGrade = ((Double.parseDouble(g1) + Double.parseDouble(g2) + Double.parseDouble(g3)) / 3 );
	 		average.setText(Double.toString(avgGrade));
	 	}
	 }

	
	








	 }
	 class BBWListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				String input1 = prompt1.getText();
				String input2 = prompt2.getText();
				String input3 = prompt3.getText();
				String input4 = prompt4.getText();
				String input5 = prompt5.getText();
				
				
				
				repaint();
				
				
				
			}
		
		
	}
	 public static void main (String args[]) {
		 JFrame test = new JFrame("Test Try");
		 JFrame test2 = new JFrame("Test T");
		 test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 barGraph a = new barGraph();
		barGraph y  = new barGraph();
		
		 
		 test.add(a);
		 test2.add(y);
		 test.setSize(300,300);
		 test.setVisible(true);

	 }
	 
		 
}
