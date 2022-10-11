package diagnosisPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PatienRecord.PatientRecord;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class patientrecord extends JFrame {

	private JPanel contentPane;
	private JTextField patientname;
	private JTextField Age;
	private JTextField Phonenumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientrecord frame = new patientrecord();
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
	public patientrecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876,745);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(161,210,205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient name");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 25));
		lblNewLabel.setBounds(157, 153, 158, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Malgun Gothic", Font.PLAIN, 25));
		lblAge.setBounds(157, 213, 158, 33);
		contentPane.add(lblAge);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Malgun Gothic", Font.PLAIN, 25));
		lblSex.setBounds(157, 287, 158, 33);
		contentPane.add(lblSex);
		
		JLabel lblMobileNumber = new JLabel("Mobile number");
		lblMobileNumber.setFont(new Font("Malgun Gothic", Font.PLAIN, 25));
		lblMobileNumber.setBounds(157, 351, 192, 33);
		contentPane.add(lblMobileNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Malgun Gothic", Font.PLAIN, 25));
		lblAddress.setBounds(157, 419, 158, 33);
		contentPane.add(lblAddress);
		
		patientname = new JTextField();
		patientname.setFont(new Font("Malgun Gothic", Font.PLAIN, 23));
		patientname.setBounds(439, 153, 242, 33);
		contentPane.add(patientname);
		patientname.setColumns(10);
		
		Age = new JTextField();
		Age.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Age.setColumns(10);
		Age.setBounds(439, 213, 242, 33);
		contentPane.add(Age);
		
		Phonenumber = new JTextField();
		Phonenumber.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 24));
		Phonenumber.setColumns(10);
		Phonenumber.setBounds(439, 351, 242, 33);
		contentPane.add(Phonenumber);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		comboBox.setBounds(439, 287, 242, 34);
		comboBox.addItem("Select Gender");
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		contentPane.add(comboBox);
		
		JTextArea Address = new JTextArea();
		Address.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		Address.setLineWrap(true);
		Address.setBounds(439, 430, 242, 127);
		contentPane.add(Address);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Record");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.BOLD, 39));
		lblNewLabel_1.setBounds(242, 35, 324, 53);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientRecord pr = new PatientRecord();
				pr.setName(patientname.getText());
				pr.setAddress(Address.getText());
				pr.setPhone(Phonenumber.getText());
				pr.setSex(comboBox.getSelectedItem().toString());
				pr.setAge(Age.getText());
				btnonclick(e,pr);
			}
		});
		btnNewButton.setBackground(new Color(33,84,78));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
		btnNewButton.setBounds(281, 588, 225, 53);
		contentPane.add(btnNewButton);

		JButton lnNewButton = new JButton("reset");



			lnNewButton.setBackground(new Color(33,84,78));
			lnNewButton.setForeground(Color.WHITE);
			lnNewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
			lnNewButton.setBounds(600, 588, 225, 53);
			contentPane.add(lnNewButton);
			lnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new patientrecord().setVisible(true);
				}
			});


	}

	private void btnonclick(ActionEvent e, PatientRecord pr) {
		DisplayPage dp = new DisplayPage(pr);
		dp.setVisible(true);
		this.dispose();

		
	}
	private void clear(){


	}
}
