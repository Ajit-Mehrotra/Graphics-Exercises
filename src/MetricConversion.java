import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MetricConversion implements ActionListener{
	JFrame frame;
	JPanel contentPane;
	JComboBox conversion;
	JLabel conversionPrompt, conversionEquation;

	public MetricConversion () {

		frame = new JFrame("Metric Conversions ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));

		conversionPrompt = new JLabel("Select a conversion: ");
		conversionPrompt.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		contentPane.add(conversionPrompt);

		String[] conversionNames = {"inches to centimeters", "foot to meters" , "gallon to liters" , "pound to kilogram" };
		conversion = new JComboBox(conversionNames);
		conversion.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		conversion.setSelectedIndex(0);
		conversion.addActionListener(this);
		contentPane.add(conversion);

		conversionEquation = new JLabel("  ");
		conversionEquation.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));

		contentPane.add(conversionEquation);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);	


	}
	@Override
	public void actionPerformed(ActionEvent event) {
		JComboBox comboBox = (JComboBox)event.getSource();
		String plantName = (String)comboBox.getSelectedItem();

		if(plantName == "inches to centimeters" ) {
			conversionEquation.setText("1 inch = 2.54 centimeters");
		}else if(plantName == "foot to meters" ){
			conversionEquation.setText("1 foot = 0.3048");
		}else if(plantName == "gallon to liters" ) {
			conversionEquation.setText("1 gallon = 4.5461 liter");
		}else if(plantName == "pound to kilogram") {
			conversionEquation.setText("1 pound = 0.4536 kilogram");	
		}

	}

	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		MetricConversion myGrades = new MetricConversion();

	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}

}
