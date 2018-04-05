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
		setTitle("회원 가입");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	setBounds(100, 100, 390, 340);
		pan_content = new JPanel();
		pan_content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pan_content);

		JLabel JidLabel = new JLabel("아  이  디   : ");
		JidLabel.setBounds(45, 55, 100, 15);
		JidLabel.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));

		txtId = new JTextField();
		txtId.setBounds(162, 52, 105, 23);
		txtId.setColumns(10);

		JLabel label = new JLabel("비 밀 번 호  : ");
		label.setBounds(45, 85, 105, 15);
		label.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));

		pan_content.setLayout(null);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("나눔고딕 코딩", Font.BOLD, 20));
		lblNewLabel.setBounds(150, 10, 135, 23);
		pan_content.add(lblNewLabel);
		pan_content.add(JidLabel);
		pan_content.add(txtId);
		pan_content.add(label);

		fieldPass = new JPasswordField();
		fieldPass.setBounds(162, 81, 156, 23);
		pan_content.add(fieldPass);
		labelPwCheck = new JLabel("비밀번호 확인  : ");
		labelPwCheck.setBounds(32, 118, 119, 15);
		labelPwCheck.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));
		pan_content.add(labelPwCheck);

		fieldPassCheck = new JPasswordField();
		fieldPassCheck.setBounds(162, 114, 156, 23);
		pan_content.add(fieldPassCheck);

		labelName = new JLabel("회원이름   : ");
		labelName.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));
		labelName.setBounds(45, 159, 105, 15);
		pan_content.add(labelName);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(162, 153, 156, 23);
		pan_content.add(txtName);

		labelPhone = new JLabel("연락처  : ");
		labelPhone.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));
		labelPhone.setBounds(45, 196, 105, 15);
		pan_content.add(labelPhone);

		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(162, 227, 156, 23);
		pan_content.add(txtPhone);

		labelAddr = new JLabel("회원주소  : ");
		labelAddr.setFont(new Font("나눔고딕 코딩", Font.BOLD, 14));
		labelAddr.setBounds(45, 227, 105, 15);
		pan_content.add(labelAddr);

		// 회원가입 버튼
		btnJoin = new JButton("회원가입");
		btnJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (txtId.equals("") && fieldPass.equals(fieldPassCheck) == false) {
					btnJoin.setEnabled(false);
				} else if (isValidate() == true) {
					JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
					dispose();
				}
			}
		});
		btnJoin.setFont(new Font("나눔고딕코딩", Font.BOLD, 15));

		txtAddr = new JTextField();
		txtAddr.setColumns(10);
		txtAddr.setBounds(162, 192, 156, 23);
		pan_content.add(txtAddr);
		btnJoin.setBounds(124, 260, 135, 32);
		pan_content.add(btnJoin);

		JButton btnNewButton = new JButton("중복체크");
		btnNewButton.setFont(new Font("나눔고딕코딩", Font.BOLD, 11));

		btnNewButton.setBounds(280, 44, 85, 32);
		pan_content.add(btnNewButton);
	}

	public boolean isValidate() {
		if (txtId.getText().trim().equals("")) {
			FailView.errorMessage("아이디를 입력해주세요.");
			txtId.requestFocus();
			return false;
		}

		if (fieldPass.getText().trim().equals("") && fieldPassCheck.getText().trim().equals("")) {
			FailView.errorMessage("비밀번호를 입력해주세요.");
			txtName.requestFocus();
			return false;
		}
		
		if (!fieldPass.getText().trim().equals(fieldPassCheck.getText().trim())) {
			FailView.errorMessage("입력하신 두 비밀번호가 다릅니다. 다시 입력해주세요.");
			txtName.requestFocus();
			return false;
		}

		if (txtName.getText().trim().equals("")) {
			FailView.errorMessage("이름을 입력해주세요");
			txtName.requestFocus();
			return false;
		}

		if (txtPhone.getText().trim().equals("")) {
			FailView.errorMessage("연락처를 입력해주세요");
			txtName.requestFocus();
			return false;
		}

		
		return true;
	}

}
