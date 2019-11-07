import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BloodDrive {
	JFrame graphFrame;

	JFrame inputFrame;
	JPanel inputPanel;

	JLabel dept1Label,dept2Label,  dept3Label, dept4Label, dept5Label ;


	JTextField dept1, dept2 , dept3, dept4,dept5 ;



	public BloodDrive() {
		inputFrame = new JFrame("Input Data");
		inputPanel = new JPanel(new GridLayout(0, 2, 10, 10));
		inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inputFrame.setContentPane(inputPanel);

		dept1Label = new JLabel("Department 1:");
		dept2Label = new JLabel("Department 2:");
		dept3Label = new JLabel("Department 3:");
		dept4Label = new JLabel("Department 4:");
		dept5Label = new JLabel("Department 5:");

		dept1 = new JTextField();
		dept2 = new JTextField();
		dept3 = new JTextField();
		dept4 = new JTextField();
		dept5 = new JTextField();
		dept5.addKeyListener(new keyListener());

		inputPanel.add(dept1Label);
		inputPanel.add(dept1);
		inputPanel.add(dept2Label);
		inputPanel.add(dept2);
		inputPanel.add(dept3Label);
		inputPanel.add(dept3);
		inputPanel.add(dept4Label);
		inputPanel.add(dept4);
		inputPanel.add(dept5Label);
		inputPanel.add(dept5);

		inputFrame.setVisible(true);
		inputFrame.pack();
	}

	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new BloodDrive();
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}

	class Graph extends JPanel {
		double dim1, dim2, dim3, dim4, dim5;
		double maxPints;
		//		double[] points;
		public Graph(double d1, double d2, double d3, double d4, double d5) {
			dim1 = d1;
			dim2 = d2;
			dim3 = d3;
			dim4 = d4;
			dim5 = d5;
			maxPints = Math.max(dim1, Math.max(dim2, Math.max(dim3, Math.max(dim4, dim5))));
		}

		@Override
		public Dimension preferredSize() {
			return new Dimension(800, 600);
		}

		public double getScale() {
			return 100;
		}

		private double scaled(double pints) {
			return pints / maxPints;
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			double scale = getScale();
			g.setColor(Color.BLACK);

			int baseline = 50;
			g.drawLine(baseline, 0, baseline, getHeight());
			g.setColor(Color.RED);


			g.fillRect(baseline + 1, 0, (int) (748 / maxPints * (dim1 )), 104);
			g.fillRect(baseline + 1, 124, (int) (748 / maxPints * (dim2 )), 104);
			g.fillRect(baseline + 1, 248, (int) (748 / maxPints * (dim3)), 104);
			g.fillRect(baseline + 1, 372, (int) (748 / maxPints * (dim4 )), 104);
			g.fillRect(baseline + 1, 496, (int) (748 / maxPints * (dim5 )), 104);

			g.setColor(Color.BLACK);
			int middle = 50;
			g.drawString("dept1", 0, middle);
			g.drawString(dim1 + "", 0, middle + 12);
			middle += 130;
			g.drawString("dept2", 0, middle);
			g.drawString(dim2 + "", 0, middle + 12);
			middle += 130;
			g.drawString("dept3", 0, middle);
			g.drawString(dim3 + "", 0, middle + 12);
			middle += 130;
			g.drawString("dept4", 0, middle);
			g.drawString(dim4 + "", 0, middle + 12);
			middle += 130;
			g.drawString("dept5", 0, middle);
			g.drawString(dim5 + "", 0, middle + 12);
		}  
	}
	class keyListener implements KeyListener {

		@Override
	
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
				inputFrame.dispose();
				graphFrame = new JFrame("Graph");
				graphFrame.add(new Graph(Double.parseDouble(dept1.getText()), Double.parseDouble(dept2.getText()), Double.parseDouble(dept3.getText()),
						Double.parseDouble(dept4.getText()), Double.parseDouble(dept5.getText())));
				graphFrame.setVisible(true);
				graphFrame.pack();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}
}