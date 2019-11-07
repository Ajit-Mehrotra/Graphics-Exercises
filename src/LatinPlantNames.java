import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LatinPlantNames implements ActionListener{
JFrame frame;
JPanel contentPane;
JComboBox plantNames;
JLabel plantListPrompt, latinName;

public LatinPlantNames() {
	
	frame = new JFrame("LatinPlantNames");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane = new JPanel();
	contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
	contentPane.setBorder(BorderFactory.createEmptyBorder( 10, 10, 10, 10));

	plantListPrompt = new JLabel("Select a plant name: ");
	plantListPrompt.setAlignmentX(JLabel.LEFT_ALIGNMENT);
	contentPane.add(plantListPrompt);
	
	String[] names = {"basil", "lavender" , "paresley" , "peppermint", "saffrom", "sage" };
	plantNames = new JComboBox(names);
	plantNames.setAlignmentX(JLabel.LEFT_ALIGNMENT);
	plantNames.setSelectedIndex(0);
	plantNames.addActionListener(this);
	contentPane.add(plantNames);
	
	latinName = new JLabel("Ocimum");
	latinName.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
	
	contentPane.add(latinName);
	
	frame.setContentPane(contentPane);
	
	frame.pack();
	frame.setVisible(true);	
	
	
}
	@Override
	public void actionPerformed(ActionEvent event) {
		JComboBox comboBox = (JComboBox)event.getSource();
		String plantName = (String)comboBox.getSelectedItem();
		
		if(plantName == "basil") {
			latinName.setText("Ocimim");
		}else if(plantName == "lavender"){
			latinName.setText("Lavandula spica");
		}else if(plantName == "parseley") {
			latinName.setText("Apium");
		}else if(plantName == "peppermint") {
			latinName.setText("Mentha piperita");	
		}else if(plantName == "saffron") {
			latinName.setText("Crocus");
		}else if (plantName ==  "sage" ) {
			latinName.setText("Salvia");
		}
		
	}
	
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		LatinPlantNames myGrades = new LatinPlantNames();
		
	}

	public static void main (String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}

}
