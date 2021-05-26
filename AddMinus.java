import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Add_Minus {

	private JFrame frame;
	private JTextField XField;
	private JTextField YField;
	private JTextField TotalField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Minus window = new Add_Minus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Minus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel XLabel = new JLabel("X");
		XLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		XLabel.setBounds(139, 87, 39, 35);
		frame.getContentPane().add(XLabel);
		
		JLabel YLabel = new JLabel("Y");
		YLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		YLabel.setBounds(515, 87, 39, 35);
		frame.getContentPane().add(YLabel);
		
		XField = new JTextField();
		XField.setBounds(93, 132, 123, 41);
		frame.getContentPane().add(XField);
		XField.setColumns(10);
		
		YField = new JTextField();
		YField.setText("");
		YField.setBounds(474, 132, 123, 41);
		frame.getContentPane().add(YField);
		YField.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setBackground(Color.BLUE);
		AddButton.setForeground(Color.CYAN);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int x = Integer.parseInt(XField.getText());
					int y = Integer.parseInt(YField.getText());
					int ans = x + y;
					
					TotalField.setText(Integer.toString(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter only integer number");
				}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		AddButton.setBounds(179, 254, 123, 38);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setBackground(Color.RED);
		MinusButton.setForeground(Color.PINK);
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int x = Integer.parseInt(XField.getText());
					int y = Integer.parseInt(YField.getText());
					int ans = x - y;
					
					TotalField.setText(Integer.toString(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter only integer number");
				}
			}
		});
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		MinusButton.setBounds(394, 254, 123, 38);
		frame.getContentPane().add(MinusButton);
		
		TotalField = new JTextField();
		TotalField.setBounds(318, 371, 163, 35);
		frame.getContentPane().add(TotalField);
		TotalField.setColumns(10);
		
		JLabel TotalLabel = new JLabel("TOTAL");
		TotalLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		TotalLabel.setBounds(205, 367, 123, 35);
		frame.getContentPane().add(TotalLabel);
	}
}
