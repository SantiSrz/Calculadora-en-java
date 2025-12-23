package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CalGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalGUI window = new CalGUI();
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
	public CalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(249, 245, 210));
		frame.setBounds(100, 100, 378, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(145, 11, 79, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel TextBox = new JLabel("");
		TextBox.setBackground(new Color(192, 192, 192));
		TextBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		TextBox.setBounds(10, 48, 347, 72);
		frame.getContentPane().add(TextBox);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "1";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton.setBounds(10, 165, 79, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "2";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_1.setBounds(99, 165, 79, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "3";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_2.setBounds(189, 165, 79, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "4";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_3.setBounds(10, 199, 79, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "5";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_1_1.setBounds(99, 199, 79, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "6";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_2_1.setBounds(189, 199, 79, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("7");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "7";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_3_1.setBounds(10, 233, 79, 23);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_1_1 = new JButton("8");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "8";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_1_1_1.setBounds(99, 233, 79, 23);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("9");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "9";
				TextBox.setText("");
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_2_1_1.setBounds(189, 233, 79, 23);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("0");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberTxt = TextBox.getText() + "0";
				TextBox.setText(NumberTxt);
			}
		});
		btnNewButton_3_1_1.setBounds(99, 267, 79, 23);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("DEL");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1_1_1.setBackground(new Color(255, 220, 98));
		btnNewButton_1_1_1_1.setBounds(10, 131, 79, 23);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("BORR");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_1_1.setBackground(new Color(255, 220, 98));
		btnNewButton_2_1_1_1.setBounds(99, 131, 79, 23);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("+");
		btnNewButton_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3_1_1_1.setBackground(new Color(255, 220, 98));
		btnNewButton_3_1_1_1.setBounds(278, 165, 79, 23);
		frame.getContentPane().add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("-");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1_1_1_1.setBackground(new Color(255, 220, 98));
		btnNewButton_1_1_1_1_1.setBounds(278, 199, 79, 23);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("*");
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_1_1_1.setBackground(new Color(255, 220, 98));
		btnNewButton_2_1_1_1_1.setBounds(278, 131, 79, 23);
		frame.getContentPane().add(btnNewButton_2_1_1_1_1);
		
		JButton btnNewButton_3_1_1_2 = new JButton("/");
		btnNewButton_3_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3_1_1_2.setBackground(new Color(255, 220, 98));
		btnNewButton_3_1_1_2.setBounds(189, 131, 79, 23);
		frame.getContentPane().add(btnNewButton_3_1_1_2);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("=");
		btnNewButton_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1_1_1_2.setBackground(new Color(255, 220, 98));
		btnNewButton_1_1_1_1_2.setBounds(278, 233, 79, 23);
		frame.getContentPane().add(btnNewButton_1_1_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("Creado por Santiago Suarez Lorenzo");
		lblNewLabel_1.setBounds(172, 104, 185, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
