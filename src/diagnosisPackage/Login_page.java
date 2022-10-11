package diagnosisPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page frame = new Login_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(13,82,75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(366, 20, 262, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		lblNewLabel_1.setBounds(306, 221, 145, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(306, 300, 145, 44);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		textField.setBounds(518, 231, 234, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		passwordField.setBounds(518, 310, 234, 34);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				btnonclick(e,username,password);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 34));
		btnNewButton.setBackground(new Color(81,173,159));
		btnNewButton.setBounds(395, 464, 201, 55);
		contentPane.add(btnNewButton);
	}

	private void btnonclick(ActionEvent e, String username, String password) {
		// TODO Auto-generated method stub
		if (username.equals("admin") && password.equals("admin")) {
			patientrecord pr = new patientrecord();
			pr.setVisible(true);
			this.dispose();
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect Credentials");
		}
		
	}
}
