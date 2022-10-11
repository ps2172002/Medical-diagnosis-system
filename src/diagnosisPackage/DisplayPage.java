package diagnosisPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PatienRecord.PatientRecord;
import diagonisePackage.DiagoniseDisease;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class DisplayPage extends JFrame {

	private JPanel contentPane;
	JLayeredPane layeredPane;
	String disease = "";

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DisplayPage frame = new DisplayPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	
	public void switchPanels(JPanel jPanel)
	{
		layeredPane.removeAll();
		layeredPane.add(jPanel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}

	/**
	 * Create the frame.
	 */
	public DisplayPage(PatientRecord pr) {
		ArrayList<String> sym = new ArrayList<String>();
		JPanel Body_panel = new JPanel();
		JPanel Feel_panel = new JPanel();
		JPanel skin_panel = new JPanel();
		JPanel Head_panel = new JPanel();
		DiagoniseDisease dd = new DiagoniseDisease(sym);
//
//		JButton lnNewButton = new JButton("close");
//
//
//
//		lnNewButton.setBackground(new Color(33,84,78));
//		lnNewButton.setForeground(Color.WHITE);
//		lnNewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 30));
//		lnNewButton.setBounds(10, 500, 225, 53);
//		contentPane.add(lnNewButton);
		
		
		setBackground(new Color(52,155,145));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1395, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(161,210,205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);







		JPanel panel = new JPanel();
		panel.setBackground(new Color(52,155,145));
		panel.setBounds(0, 100, 356, 632);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categories");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 45));
		lblNewLabel.setBounds(43, 22, 268, 64);
		panel.add(lblNewLabel);
		
		JButton bodybtn = new JButton("Body / Muscles / Bones");
		JButton Feel_btn = new JButton("Feel");
		JButton skin_btn = new JButton("Skin");
		JButton head_btn = new JButton("Head");
		JButton close = new JButton("close");
		
		bodybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Body_panel);
				bodybtn.setBackground(new Color(33,84,78));
				Feel_btn.setBackground(new Color(35,120,111));
				skin_btn.setBackground(new Color(35,120,111));
				head_btn.setBackground(new Color(35,120,111));
				close.setBackground(new Color(34,25,46));
			}
		});
		bodybtn.setForeground(Color.WHITE);
		bodybtn.setBackground(new Color(33,84,78));
		bodybtn.setFont(new Font("Malgun Gothic", Font.PLAIN, 21));
		bodybtn.setBounds(43, 186, 268, 48);
		panel.add(bodybtn);
		
		
		Feel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Feel_panel);
				bodybtn.setBackground(new Color(35,120,111));
				Feel_btn.setBackground(new Color(33,84,78));
				skin_btn.setBackground(new Color(35,120,111));
				head_btn.setBackground(new Color(35,120,111));
			}
		});
		Feel_btn.setForeground(Color.WHITE);
		Feel_btn.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Feel_btn.setBackground(new Color(35, 120, 111));
		Feel_btn.setBounds(43, 269, 268, 48);
		panel.add(Feel_btn);
		
		
		skin_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(skin_panel);
				bodybtn.setBackground(new Color(35,120,111));
				Feel_btn.setBackground(new Color(35,120,111));
				skin_btn.setBackground(new Color(33,84,78));
				head_btn.setBackground(new Color(35,120,111));
			}
		});
		skin_btn.setForeground(Color.WHITE);
		skin_btn.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		skin_btn.setBackground(new Color(35, 120, 111));
		skin_btn.setBounds(43, 353, 268, 48);
		panel.add(skin_btn);
		
		
		head_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Head_panel);
				bodybtn.setBackground(new Color(35,120,111));
				Feel_btn.setBackground(new Color(35,120,111));
				skin_btn.setBackground(new Color(35,120,111));
				head_btn.setBackground(new Color(33,84,78));
			}
		});
		head_btn.setForeground(Color.WHITE);
		head_btn.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		head_btn.setBackground(new Color(35, 120, 111));
		head_btn.setBounds(43, 429, 268, 48);
		panel.add(head_btn);

		close.setForeground(Color.WHITE);
		close.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		close.setBackground(Color.red);
		close.setBounds(43, 505, 268, 48);
		panel.add(close);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(52, 155, 145));
		panel_1.setBounds(878, 100, 503, 632);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiagnosis.setForeground(Color.WHITE);
		lblDiagnosis.setFont(new Font("Malgun Gothic", Font.BOLD, 43));
		lblDiagnosis.setBounds(125, 10, 268, 64);
		panel_1.add(lblDiagnosis);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 96, 513, 451);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(new Color(52, 155, 145));
		textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		
		JButton Diaognise_btn_1 = new JButton("Get Report");
		
		Diaognise_btn_1.setForeground(Color.WHITE);
		Diaognise_btn_1.setFont(new Font("Malgun Gothic", Font.BOLD, 26));
		Diaognise_btn_1.setBackground(new Color(35, 120, 111));
		Diaognise_btn_1.setBounds(153, 558, 246, 64);
		panel_1.add(Diaognise_btn_1);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(354, 178, 524, 430);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		Body_panel.setBackground(new Color(161,210,205));
		layeredPane.add(Body_panel, "name_2456481903000");
		Body_panel.setLayout(null);
		
		JCheckBox jointpain = new JCheckBox("Joint pain");
		jointpain.setHorizontalAlignment(SwingConstants.LEFT);
		jointpain.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		jointpain.setBackground(new Color(161,210,205));
		jointpain.setBounds(275, 225, 124, 37);
		Body_panel.add(jointpain);
		
		JCheckBox backpain = new JCheckBox("back pain");
		backpain.setHorizontalAlignment(SwingConstants.LEFT);
		backpain.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		backpain.setBackground(new Color(161, 210, 205));
		backpain.setBounds(68, 225, 124, 37);
		Body_panel.add(backpain);
		
		JCheckBox Musclepain = new JCheckBox("Muscle pain");
		Musclepain.setHorizontalAlignment(SwingConstants.LEFT);
		Musclepain.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		Musclepain.setBackground(new Color(161, 210, 205));
		Musclepain.setBounds(275, 279, 165, 37);
		Body_panel.add(Musclepain);
		
		JCheckBox numbeness = new JCheckBox("Numbness");
		numbeness.setHorizontalAlignment(SwingConstants.LEFT);
		numbeness.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		numbeness.setBackground(new Color(161, 210, 205));
		numbeness.setBounds(68, 333, 124, 37);
		Body_panel.add(numbeness);
		
		JCheckBox stmachcrmp = new JCheckBox("Stomach ache/ cramps");
		stmachcrmp.setHorizontalAlignment(SwingConstants.LEFT);
		stmachcrmp.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		stmachcrmp.setBackground(new Color(161, 210, 205));
		stmachcrmp.setBounds(275, 333, 243, 37);
		Body_panel.add(stmachcrmp);
		
		JCheckBox stmachblt = new JCheckBox("Stomach bloating");
		stmachblt.setHorizontalAlignment(SwingConstants.LEFT);
		stmachblt.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		stmachblt.setBackground(new Color(161, 210, 205));
		stmachblt.setBounds(68, 279, 195, 37);
		Body_panel.add(stmachblt);
		
		JLabel lblSymptoms_1 = new JLabel("Body/Muscles/Bones");
		lblSymptoms_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSymptoms_1.setForeground(Color.BLACK);
		lblSymptoms_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 23));
		lblSymptoms_1.setBounds(32, 72, 268, 64);
		Body_panel.add(lblSymptoms_1);
		
		
		Feel_panel.setLayout(null);
		Feel_panel.setBackground(new Color(161, 210, 205));
		layeredPane.add(Feel_panel, "name_2514510284700");
		
		JCheckBox fatigue = new JCheckBox("fatigue");
		fatigue.setHorizontalAlignment(SwingConstants.LEFT);
		fatigue.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		fatigue.setBackground(new Color(161, 210, 205));
		fatigue.setBounds(70, 228, 124, 37);
		Feel_panel.add(fatigue);
		
		JCheckBox lowape = new JCheckBox("low apetite");
		lowape.setHorizontalAlignment(SwingConstants.LEFT);
		lowape.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		lowape.setBackground(new Color(161, 210, 205));
		lowape.setBounds(70, 273, 155, 37);
		Feel_panel.add(lowape);
		
		JCheckBox weakness = new JCheckBox("weakness");
		weakness.setHorizontalAlignment(SwingConstants.LEFT);
		weakness.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		weakness.setBackground(new Color(161, 210, 205));
		weakness.setBounds(70, 318, 124, 37);
		Feel_panel.add(weakness);
		
		JCheckBox nausea = new JCheckBox("nausea");
		nausea.setHorizontalAlignment(SwingConstants.LEFT);
		nausea.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		nausea.setBackground(new Color(161, 210, 205));
		nausea.setBounds(273, 228, 124, 37);
		Feel_panel.add(nausea);
		
		JCheckBox tongtast = new JCheckBox("unusual taste in tongue");
		tongtast.setHorizontalAlignment(SwingConstants.LEFT);
		tongtast.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		tongtast.setBackground(new Color(161, 210, 205));
		tongtast.setBounds(273, 273, 245, 37);
		Feel_panel.add(tongtast);
		
		JCheckBox sensitivity = new JCheckBox("sensititvity");
		sensitivity.setHorizontalAlignment(SwingConstants.LEFT);
		sensitivity.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		sensitivity.setBackground(new Color(161, 210, 205));
		sensitivity.setBounds(273, 318, 124, 37);
		Feel_panel.add(sensitivity);
		
		JLabel lblSymptoms_1_1 = new JLabel("Feel");
		lblSymptoms_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSymptoms_1_1.setForeground(Color.BLACK);
		lblSymptoms_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 29));
		lblSymptoms_1_1.setBounds(10, 69, 193, 64);
		Feel_panel.add(lblSymptoms_1_1);
		
		JCheckBox fever = new JCheckBox("fever");
		fever.setHorizontalAlignment(SwingConstants.LEFT);
		fever.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		fever.setBackground(new Color(161, 210, 205));
		fever.setBounds(70, 370, 124, 37);
		Feel_panel.add(fever);
		
		
		skin_panel.setLayout(null);
		skin_panel.setBackground(new Color(161, 210, 205));
		layeredPane.add(skin_panel, "name_2524236666600");
		
		JCheckBox paleskin = new JCheckBox("Pale skin");
		paleskin.setHorizontalAlignment(SwingConstants.LEFT);
		paleskin.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		paleskin.setBackground(new Color(161, 210, 205));
		paleskin.setBounds(75, 244, 124, 37);
		skin_panel.add(paleskin);
		
		JCheckBox redthroat = new JCheckBox("red Throat");
		redthroat.setHorizontalAlignment(SwingConstants.LEFT);
		redthroat.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		redthroat.setBackground(new Color(161, 210, 205));
		redthroat.setBounds(75, 291, 124, 37);
		skin_panel.add(redthroat);
		
		JCheckBox rashes = new JCheckBox("rashes");
		rashes.setHorizontalAlignment(SwingConstants.LEFT);
		rashes.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		rashes.setBackground(new Color(161, 210, 205));
		rashes.setBounds(246, 244, 124, 37);
		skin_panel.add(rashes);
		
		JLabel lblSymptoms_1_2 = new JLabel("Skin");
		lblSymptoms_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSymptoms_1_2.setForeground(Color.BLACK);
		lblSymptoms_1_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 29));
		lblSymptoms_1_2.setBounds(10, 79, 209, 64);
		skin_panel.add(lblSymptoms_1_2);
		
		
		Head_panel.setLayout(null);
		Head_panel.setBackground(new Color(161, 210, 205));
		layeredPane.add(Head_panel, "name_2528062410000");
		
		JCheckBox dryeyes = new JCheckBox("dry eyes");
		dryeyes.setHorizontalAlignment(SwingConstants.LEFT);
		dryeyes.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		dryeyes.setBackground(new Color(161, 210, 205));
		dryeyes.setBounds(54, 247, 124, 37);
		Head_panel.add(dryeyes);
		
		JCheckBox eyepain = new JCheckBox("eyepain");
		eyepain.setHorizontalAlignment(SwingConstants.LEFT);
		eyepain.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		eyepain.setBackground(new Color(161, 210, 205));
		eyepain.setBounds(54, 310, 124, 37);
		Head_panel.add(eyepain);
		
		JCheckBox stuffynose = new JCheckBox("Stuffy nose");
		stuffynose.setHorizontalAlignment(SwingConstants.LEFT);
		stuffynose.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		stuffynose.setBackground(new Color(161, 210, 205));
		stuffynose.setBounds(284, 247, 184, 37);
		Head_panel.add(stuffynose);
		
		JCheckBox headache = new JCheckBox("headache");
		headache.setHorizontalAlignment(SwingConstants.LEFT);
		headache.setFont(new Font("Malgun Gothic", Font.BOLD, 19));
		headache.setBackground(new Color(161, 210, 205));
		headache.setBounds(284, 310, 124, 37);
		Head_panel.add(headache);
		
		JLabel lblSymptoms_1_3 = new JLabel("Head");
		lblSymptoms_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSymptoms_1_3.setForeground(Color.BLACK);
		lblSymptoms_1_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 38));
		lblSymptoms_1_3.setBounds(21, 75, 184, 64);
		Head_panel.add(lblSymptoms_1_3);
		
		JLabel lblSymptoms = new JLabel("Symptoms");
		lblSymptoms.setHorizontalAlignment(SwingConstants.CENTER);
		lblSymptoms.setForeground(Color.BLACK);
		lblSymptoms.setFont(new Font("Malgun Gothic", Font.BOLD, 39));
		lblSymptoms.setBounds(467, 100, 268, 64);
		contentPane.add(lblSymptoms);
		
		JButton Diaognise_btn = new JButton("Diagonise");
		Diaognise_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				sym.clear();
				
//				textArea.append("           Patient Details\n");
//				textArea.append("===========================\n");
//				textArea.append("   NAME                 : "+pr.getName()+"\n");
//				textArea.append("   AGE                    : "+pr.getAge()+"\n");
//				textArea.append("   SEX                     : "+pr.getSex()+"\n");
//				textArea.append("   PHONENUMBER     : "+pr.getPhone()+"\n");
//				textArea.append("   ADDRESS              : "+pr.getAddress()+"\n");
				
				
				
				
				if(jointpain.isSelected()) {
					sym.add(jointpain.getText());
				}
				if(backpain.isSelected()) {
					sym.add(backpain.getText());
				}
				if(jointpain.isSelected()) {
					sym.add(jointpain.getText());
				}
				if(Musclepain.isSelected()) {
					sym.add(Musclepain.getText());
				}
				if(numbeness.isSelected()) {
					sym.add(numbeness.getText());
				}
				if(stmachcrmp.isSelected()) {
					sym.add(stmachcrmp.getText());
				}
				if(stmachblt.isSelected()) {
					sym.add(stmachblt.getText());
				}
				if(fatigue.isSelected()) {
					sym.add(fatigue.getText());
				}
				if(lowape.isSelected()) {
					sym.add(lowape.getText());
				}
				if(weakness.isSelected()) {
					sym.add(weakness.getText());
				}
				if(nausea.isSelected()) {
					sym.add(nausea.getText());
				}
				if(tongtast.isSelected()) {
					sym.add(tongtast.getText());
				}
				if(sensitivity.isSelected()) {
					sym.add(sensitivity.getText());
				}
				if(paleskin.isSelected()) {
					sym.add(paleskin.getText());
				}
				if(redthroat.isSelected()) {
					sym.add(redthroat.getText());
				}
				if(rashes.isSelected()) {
					sym.add(rashes.getText());
				}
				if(dryeyes.isSelected()) {
					sym.add(dryeyes.getText());
				}
				if(eyepain.isSelected()) {
					sym.add(eyepain.getText());
				}
				if(stuffynose.isSelected()) {
					sym.add(stuffynose.getText());
				}
				if(headache.isSelected()) {
					sym.add(headache.getText());
				}
				if(fever.isSelected()) {
					sym.add(fever.getText());
				}
				textArea.append("  ===========================\n");
				textArea.append("           Symptoms \n");
				textArea.append("  ===========================\n");
				for (int i = 0; i < sym.size(); i++) {
					textArea.append("   "+sym.get(i)+"\n");
					
				}
				
				textArea.append("  ===========================\n");
				disease = dd.getDisease();
				
				textArea.append("    Diagnosis  :   "+dd.getDisease()+"\n");
				
			}
		});
		Diaognise_btn.setForeground(Color.WHITE);
		Diaognise_btn.setFont(new Font("Malgun Gothic", Font.BOLD, 36));
		Diaognise_btn.setBackground(new Color(35, 120, 111));
		Diaognise_btn.setBounds(410, 638, 408, 64);
		contentPane.add(Diaognise_btn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50,106,100));
		panel_2.setBounds(0, 0, 1381, 98);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name    :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.BOLD, 28));
		lblNewLabel_1.setBounds(92, 32, 146, 41);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(pr.getName());
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(248, 32, 369, 41);
		panel_2.add(lblNewLabel_1_1);
		
		Diaognise_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gotoReport(e,sym,pr,disease);
			}
		});
		
		
	}



	private void gotoReport(ActionEvent e, ArrayList<String> sym, PatientRecord pr, String disease) {
		// TODO Auto-generated method stub
		Report r = new Report(sym, pr, disease);
		r.setVisible(true);
		this.dispose();

		
	}
}
