package CurrencyConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Start1 {
	
	Convert con = new Convert();

	private JFrame frame;
	 JTextField textField_input;
	private JLabel lblAmount;
	private JLabel lblNewLabel;
	private JComboBox startBox;
	private JLabel lblTo;
	private JComboBox endBox;
	private JButton btnConvert;
	private JButton btnReset;
	private JButton btnExit;
	private JLabel lblResult;
	double result = 0.0;
	double input ;
	private JTextField textField_ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start1 window = new Start1();
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
	public Start1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAmount.setBounds(10, 22, 60, 14);
		frame.getContentPane().add(lblAmount);
		
		lblNewLabel = new JLabel("From");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblTo = new JLabel("To");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTo.setBounds(10, 102, 46, 14);
		frame.getContentPane().add(lblTo);
		
		startBox = new JComboBox();
		startBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		startBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "USD", "Euro", "Rupee", "Taka"}));
		startBox.setBounds(102, 60, 133, 20);
		frame.getContentPane().add(startBox);
		
		endBox = new JComboBox();
		endBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		endBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Taka", "USD", "Euro", "Rupee"}));
		endBox.setBounds(102, 101, 133, 20);
		frame.getContentPane().add(endBox);
		
		lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResult.setBounds(10, 158, 118, 20);
		frame.getContentPane().add(lblResult);
		
		btnConvert = new JButton("Convert");
		btnConvert.setBackground(Color.GREEN);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					input = Double.parseDouble(textField_input.getText());
					if(startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("Taka")) {
						result = con.USDtoTAKA(input);
						textField_ans.setText(Double.toString(result));
					}
					if(startBox.getSelectedItem().equals("Euro") && endBox.getSelectedItem().equals("Taka")) {
						result = con.EUROtoTAKA(input);
						textField_ans.setText(Double.toString(result));
					}
					if(startBox.getSelectedItem().equals("Rupee") && endBox.getSelectedItem().equals("Taka")) {
						result = con.RUPEEtoTAKA(input);
						textField_ans.setText(Double.toString(result));
					}
					if(startBox.getSelectedItem().equals("Taka") && endBox.getSelectedItem().equals("USD")) {
						result = con.TAKAtoUSD(input);
						textField_ans.setText(Double.toString(result));
					}
					if(startBox.getSelectedItem().equals("Taka") && endBox.getSelectedItem().equals("Euro")) {
						result = con.TAKAtoEURO(input);
						textField_ans.setText(Double.toString(result));
					}
					if(startBox.getSelectedItem().equals("Taka") && endBox.getSelectedItem().equals("Rupee")) {
						result = con.TAKAtoRUPEE(input);
						textField_ans.setText(Double.toString(result));
					}
					
					//For same input**
					
					if(startBox.getSelectedItem().equals("Taka") && endBox.getSelectedItem().equals("Taka")) {
						con.InvalidInput();
					}
					
					if(startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("USD")) {
						con.InvalidInput();
					}
					
					if(startBox.getSelectedItem().equals("Euro") && endBox.getSelectedItem().equals("Euro")) {
						con.InvalidInput();
					}
					
					if(startBox.getSelectedItem().equals("Rupee") && endBox.getSelectedItem().equals("Rupee")) {
						con.InvalidInput();
					}
					
					
					if (input < 0) {
						 
						    con.InvalidInput();
						  
					} 

			
				}catch(Exception e) {
					con.InvalidInput();
				}
			}
		});
		btnConvert.setBounds(10, 213, 89, 23);
		frame.getContentPane().add(btnConvert);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startBox.setSelectedIndex(0);
				endBox.setSelectedIndex(0);
				textField_ans.setText("0.00");
				textField_input.setText("");
			}
		});
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(146, 213, 89, 23);
		frame.getContentPane().add(btnReset);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.GREEN);
		btnExit.setBounds(297, 213, 89, 23);
		frame.getContentPane().add(btnExit);
		
		textField_input = new JTextField();
		textField_input.setBounds(102, 21, 133, 20);
		frame.getContentPane().add(textField_input);
		textField_input.setColumns(10);
		
		textField_ans = new JTextField();
		textField_ans.setBounds(102, 161, 133, 20);
		frame.getContentPane().add(textField_ans);
		textField_ans.setColumns(10);
	}

}
