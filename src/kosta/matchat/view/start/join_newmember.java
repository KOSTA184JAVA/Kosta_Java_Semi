package kosta.matchat.view.start;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class join_newmember extends JDialog{

	private JPanel contentPane;
	private JTextField Jid;
	private JTextField textField_3;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField JName;
	private JTextField JAddress;
	private JLabel JNameLabel;
	private JButton JoinCheckButton;
	private JLabel JpwCheckLabel;
	private JPasswordField Jpw1;
	private JPasswordField Jpw2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					join_newmember frame = new join_newmember();
					frame.setVisible(true);
	
	}

	/**
	 * Create the frame.
	 */
	public join_newmember() {
		setTitle("ΘΈΏψ°‘ΐΤ");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 393, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel Jsubject = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
		Jsubject.setBounds(124, 20, 81, 19);
		Jsubject.setFont(new Font("??κ³ λμ½λ©", Font.BOLD, 18));
		
		JLabel JidLabel = new JLabel("\uC544  \uC774  \uB514   : ");
		JidLabel.setBounds(45, 52, 105, 15);
		JidLabel.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		
		Jid = new JTextField();
		Jid.setBounds(162, 52, 105, 23);
		Jid.setColumns(10);
		
		JLabel label = new JLabel("\uD328 \uC2A4 \uC6CC \uB4DC  : ");
		label.setBounds(45, 85, 105, 15);
		label.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("? ?    κ°? ?");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(124, 10, 135, 23);
		contentPane.add(lblNewLabel);
		contentPane.add(JidLabel);
		contentPane.add(Jid);
		contentPane.add(label);
		
		Jpw1 = new JPasswordField();
		Jpw1.setBounds(162, 81, 156, 23);
		contentPane.add(Jpw1);
		JpwCheckLabel = new JLabel("\uD328\uC2A4\uC6CC\uB4DC \uD655\uC778  : ");
		JpwCheckLabel.setBounds(32, 118, 119, 15);
		JpwCheckLabel.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		contentPane.add(JpwCheckLabel);
		
		Jpw2 = new JPasswordField();
		Jpw2.setBounds(162, 114, 156, 23);
		contentPane.add(Jpw2);
		
		JNameLabel = new JLabel("\uD68C\uC6D0 \uC774\uB984   : ");
		JNameLabel.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		JNameLabel.setBounds(45, 159, 105, 15);
		contentPane.add(JNameLabel);
		
		JName = new JTextField();
		JName.setColumns(10);
		JName.setBounds(162, 153, 156, 23);
		contentPane.add(JName);
		
		label_3 = new JLabel("?°  ?½  μ²?  : ");
		label_3.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		label_3.setBounds(45, 196, 105, 15);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 227, 156, 23);
		contentPane.add(textField_3);
		
		label_2 = new JLabel("\uD68C \uC6D0 \uC8FC \uC18C  : ");
		label_2.setFont(new Font("??κ³ λμ½λ©", Font.PLAIN, 14));
		label_2.setBounds(45, 227, 105, 15);
		contentPane.add(label_2);
		
		//·Ξ±ΧΐΞΉφΖ°
		JoinCheckButton = new JButton("\uD655 \uC778");
		JoinCheckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Jid.equals("") && Jpw1.equals(Jpw2)==false){
					JoinCheckButton.setEnabled(false);
				}else if(isValidate()==true) {
				JOptionPane.showMessageDialog(null,"??κ°?? ???΅??€.");
				dispose();
				}
			}
		});
		
		JAddress = new JTextField();
		JAddress.setColumns(10);
		JAddress.setBounds(162, 192, 156, 23);
		contentPane.add(JAddress);
		JoinCheckButton.setBounds(124, 260, 135, 32);
		contentPane.add(JoinCheckButton);

		JButton btnNewButton = new JButton("μ€λ³΅κ²??¬");
		btnNewButton.setFont(new Font("κ΅΄λ¦Ό", Font.PLAIN, 11));
		
		btnNewButton.setBounds(280, 44, 85, 32);
		contentPane.add(btnNewButton);
	}
	
	/**
	 * ? ?¨?± μ²΄ν¬ λ©μ?
	 * @return : true?΄λ©? ?±κ³?, false?΄λ©? ?€?¨
	 **/
	
	public boolean isValidate() {
		//??΄?μ²΄ν¬
		if(Jid.getText().trim().equals("")) { //TRIM: λ¬Έμ?΄? ?μͺ? κ³΅λ°±? ? κ±?
			FailView.errorMessage("IDλ₯? ?? ₯?΄μ£ΌμΈ?");
			Jid.requestFocus();
			return false;
		}
		
		if(Jpw1.getText().trim().equals("") && Jpw2.getText().trim().equals("")) {
			FailView.errorMessage("PASSWORDλ₯? ?? ₯?΄μ£ΌμΈ?");
			JName.requestFocus();
			return false;
		}
		//λΉλ²?΄ κ°μ?μ§? ??Έ 
		if(!Jpw1.getText().trim().equals(Jpw2.getText().trim())) {
			FailView.errorMessage("λΉλ?λ²νΈκ°? κ°μ? ??΅??€. ?€? ?? ₯?΄μ£ΌμΈ?");
			JName.requestFocus();
			return false;
		}
		return true;
	}
	
}
