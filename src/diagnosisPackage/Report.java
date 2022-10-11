package diagnosisPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PatienRecord.PatientRecord;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class Report extends JFrame {

	private JPanel contentPane;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Report frame = new Report();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
	public Report(ArrayList<String> symptoms, PatientRecord pr, String disease) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 766);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REPORT");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(289, 10, 240, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(204, 121, 156, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(204, 166, 156, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sex");
		lblNewLabel_1_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(204, 217, 156, 35);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone number");
		lblNewLabel_1_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(204, 262, 156, 35);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Address");
		lblNewLabel_1_3_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_1_3_1.setBounds(204, 309, 156, 35);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(421, 129, 45, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(421, 174, 45, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(":");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(421, 225, 45, 22);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel(":");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(421, 270, 45, 22);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(":");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(421, 317, 45, 22);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel name = new JLabel(pr.getName());
		name.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		name.setBounds(529, 124, 321, 29);
		contentPane.add(name);
		
		JLabel age = new JLabel(pr.getAge());
		age.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		age.setBounds(529, 166, 321, 29);
		contentPane.add(age);
		
		JLabel sex = new JLabel(pr.getSex());
		sex.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		sex.setBounds(529, 217, 321, 29);
		contentPane.add(sex);
		
		JLabel phonenumber = new JLabel(pr.getPhone());
		phonenumber.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		phonenumber.setBounds(529, 265, 321, 29);
		contentPane.add(phonenumber);
		
		JLabel address = new JLabel(pr.getAddress());
		address.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		address.setBounds(529, 315, 321, 29);
		contentPane.add(address);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		textArea.setBackground(Color.white);
		textArea.append("Symptoms            :   " );
		for (int i = 0; i < symptoms.size(); i++) {
			textArea.append(" "+symptoms.get(i)+"  ");
		}
		
		textArea.setBounds(204, 433, 541, 261);
		contentPane.add(textArea);
		
		JLabel diseases = new JLabel("Disease");
		diseases.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
		diseases.setBounds(204, 364, 156, 35);
		contentPane.add(diseases);
		
		JLabel lblNewLabel_2_4_1 = new JLabel(":");
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_4_1.setBounds(421, 372, 45, 22);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel address_1 = new JLabel(disease);
		address_1.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		address_1.setBounds(529, 367, 321, 29);
		contentPane.add(address_1);
	}

}
