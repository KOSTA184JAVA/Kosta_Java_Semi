package kosta.matchat.view.start;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import com.sun.xml.internal.bind.v2.model.core.ID;

import javafx.scene.control.TextInputDialog;
import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Member;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class join_newmember extends JDialog {

	private JPanel pan_content;

	private JLabel labelAddr;
	private JLabel labelPhone;
	private JLabel labelPwCheck;
	private JLabel labelName;
	private JTextField txtName;
	private JTextField txtAddr;
	private JTextField txtId;
	private JTextField txtPhone;
	private JButton btnJoin;
	private JPasswordField fieldPass;
	private JPasswordField fieldPassCheck;
	boolean check;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
					join_newmember frame = new join_
							newmember();
					frame.setVisible(true);
	
	}*/

	/**
	 * Create the frame.
	 */
	public join_newmember() {
		setTitle("ȸ�� ����");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	setBounds(100, 100, 390, 340);
		pan_content = new JPanel();
		pan_content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan_content);

		JLabel JidLabel = new JLabel("��  ��  ��   : ");
		JidLabel.setBounds(45, 55, 100, 15);
		JidLabel.setFont(new Font("������� �ڵ�", Font.BOLD, 14));

		txtId = new JTextField();
		txtId.setBounds(162, 52, 105, 23);
		txtId.setColumns(10);

		JLabel label = new JLabel("�� �� �� ȣ  : ");
		label.setBounds(45, 85, 105, 15);
		label.setFont(new Font("������� �ڵ�", Font.BOLD, 14));

		pan_content.setLayout(null);

		JLabel lblNewLabel = new JLabel("ȸ������");
		lblNewLabel.setFont(new Font("������� �ڵ�", Font.BOLD, 20));
		lblNewLabel.setBounds(150, 10, 135, 23);
		pan_content.add(lblNewLabel);
		pan_content.add(JidLabel);
		pan_content.add(txtId);
		pan_content.add(label);

		fieldPass = new JPasswordField();
		fieldPass.setBounds(162, 81, 156, 23);
		pan_content.add(fieldPass);
		labelPwCheck = new JLabel("��й�ȣ Ȯ��  : ");
		labelPwCheck.setBounds(32, 118, 119, 15);
		labelPwCheck.setFont(new Font("������� �ڵ�", Font.BOLD, 14));
		pan_content.add(labelPwCheck);

		fieldPassCheck = new JPasswordField();
		fieldPassCheck.setBounds(162, 114, 156, 23);
		pan_content.add(fieldPassCheck);

		labelName = new JLabel("ȸ���̸�   : ");
		labelName.setFont(new Font("������� �ڵ�", Font.BOLD, 14));
		labelName.setBounds(45, 159, 105, 15);
		pan_content.add(labelName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(162, 153, 156, 23);
		pan_content.add(txtName);

		labelPhone = new JLabel("����ó  : ");
		labelPhone.setFont(new Font("������� �ڵ�", Font.BOLD, 14));
		labelPhone.setBounds(45, 196, 105, 15);
		pan_content.add(labelPhone);

		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(162, 227, 156, 23);
		pan_content.add(txtPhone);

		labelAddr = new JLabel("ȸ���ּ�  : ");
		labelAddr.setFont(new Font("������� �ڵ�", Font.BOLD, 14));
		labelAddr.setBounds(45, 227, 105, 15);
		pan_content.add(labelAddr);

		// ȸ������ ��ư
				btnJoin = new JButton("ȸ������");
				btnJoin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnJoin = new JButton("ȸ������");
				btnJoin.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(isValidate()) {
							if(check!=true) {
								FailView.errorMessage("�ߺ� Ȯ���� ���ּ���");
								txtId.requestFocus();
							}else {
								UserController.joinMember(new Member(txtId.getText(),fieldPass.getText(),txtName.getText(), txtPhone.getText(), txtAddr.getText()));
								JOptionPane.showMessageDialog(null,"ȸ�����ԵǾ����ϴ�.");                                              
								
								dispose();
							}
						}
						}
					
				});
		btnJoin.setFont(new Font("��������ڵ�", Font.BOLD, 15));

		txtAddr = new JTextField();
		txtAddr.setColumns(10);
		txtAddr.setBounds(162, 192, 156, 23);
		pan_content.add(txtAddr);
		btnJoin.setBounds(124, 260, 135, 32);
		pan_content.add(btnJoin);

		
		//�ߺ���ư
		JButton btnNewButton = new JButton("�ߺ�Ȯ��");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Ŭ��");
				int i=UserController.checkDuplicateId(txtId.getText());
				System.out.println(i);
				if(i!=0) {
					JOptionPane.showMessageDialog(null,"�ߺ��� �Ǿ����ϴ�.");
					txtId.requestFocus();
					txtId.setText("");
				check=false;
				
				}else {
					JOptionPane.showMessageDialog(null,"��밡���� ���̵��Դϴ�.");
					check=true;
					
			}
				
			}
		});
		btnNewButton.setFont(new Font("��������ڵ�", Font.BOLD, 11));

		btnNewButton.setBounds(280, 44, 85, 32);
		pan_content.add(btnNewButton);
	}

	public boolean isValidate() {
		if (txtId.getText().trim().equals("")) {
			FailView.errorMessage("���̵� �Է����ּ���.");
			txtId.requestFocus();
			return false;
	}

		if (fieldPass.getText().trim().equals("") && fieldPassCheck.getText().trim().equals("")) {
			FailView.errorMessage("��й�ȣ�� �Է����ּ���.");
			fieldPass.requestFocus();
			return false;
		}
		
		if (!fieldPass.getText().trim().equals(fieldPassCheck.getText().trim())) {
			FailView.errorMessage("�Է��Ͻ� �� ��й�ȣ�� �ٸ��ϴ�. �ٽ� �Է����ּ���.");
			fieldPassCheck.requestFocus();
			return false;
		}

		if (txtName.getText().trim().equals("")) {
			FailView.errorMessage("�̸��� �Է����ּ���");
			txtName.requestFocus();
			return false;
		}

		if (txtPhone.getText().trim().equals("")) {
			FailView.errorMessage("����ó�� �Է����ּ���");
			txtPhone.requestFocus();
			return false;
		}
//		if(!check) {
//			FailView.errorMessage("�ߺ� Ȯ���� ���ּ���");
//			txtId.requestFocus();
//			return false;
//		}

		
		return true;
	}

}
