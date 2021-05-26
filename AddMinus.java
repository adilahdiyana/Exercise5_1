import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddMinus {

	private JFrame frame;
	private JTextField AddTextField;
	private JTextField MinusTextField;
	private JTextField AnswerText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 102, 51));
		frame.setBounds(100, 100, 621, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AddTextField = new JTextField();
		AddTextField.setBackground(new Color(230, 230, 250));
		AddTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AddTextField.setBounds(113, 58, 143, 50);
		frame.getContentPane().add(AddTextField);
		AddTextField.setColumns(10);
		
		MinusTextField = new JTextField();
		MinusTextField.setBackground(new Color(230, 230, 250));
		MinusTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		MinusTextField.setBounds(358, 58, 152, 50);
		frame.getContentPane().add(MinusTextField);
		MinusTextField.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setForeground(Color.BLACK);
		AddButton.setBackground(new Color(255, 235, 205));
		AddButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int ans=0;
				int[] num = new int[2];
				try {
					num[0] = Integer.parseInt(AddTextField.getText());
					num[1] = Integer.parseInt(MinusTextField.getText());
					for(int i=0; i<num.length; i++) {
						ans = ans+num[i];
					}
					//answer = num1+num2;
					AnswerText.setText(Integer.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		
		AddButton.setBounds(130, 144, 102, 50);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setBackground(new Color(255, 239, 213));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans=0;
				int[] num = new int[2];
				try {num[0] = Integer.parseInt(AddTextField.getText());
					num[1] = Integer.parseInt(MinusTextField.getText());
					
					for(int i=0; i<num.length; i++) {
						ans = num[0]-num[1];
					}
					//answer = num1-num2-num3;
					AnswerText.setText(Integer.toString(ans));
			} catch(Exception e1) {
				JOptionPane.showMessageDialog(null,  "Please enter a valid number.");
						
				}
			}
		});
		MinusButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		MinusButton.setBounds(379, 144, 110, 50);
		frame.getContentPane().add(MinusButton);
		
		AnswerText = new JTextField();
		AnswerText.setBackground(new Color(230, 230, 250));
		AnswerText.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AnswerText.setBounds(258, 247, 158, 41);
		frame.getContentPane().add(AnswerText);
		AnswerText.setColumns(10);
		
		JLabel TheAnswerIsLabel = new JLabel("The answer is");
		TheAnswerIsLabel.setForeground(Color.BLACK);
		TheAnswerIsLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		TheAnswerIsLabel.setBounds(120, 247, 158, 33);
		frame.getContentPane().add(TheAnswerIsLabel);
	}

