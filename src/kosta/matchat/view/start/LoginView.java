package kosta.matchat.view.start;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kosta.matchat.controller.UserController;
import kosta.matchat.view.manager.ManagerJTableView;
import kosta.matchat.view.user.UserMainView;

public class LoginView extends JFrame {
	
	public static JPanel contentPane;
	private JTextField txtId;
	private JPasswordField txtPwd;

	public static CardLayout cards = new CardLayout();
	public static String id =null;

	public LoginView() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 643);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(cards);

		JPanel panLogin = new JPanel();
		panLogin.setBackground(new Color(135, 206, 250));
		contentPane.add(panLogin, "login");
		panLogin.setLayout(null);

		JLabel labelLogin = new JLabel("로      그      인");
		labelLogin.setBounds(290, 80, 300, 41);
		panLogin.add(labelLogin);
		labelLogin.setFont(new Font("나눔고딕코딩", Font.BOLD, 25));

		JLabel labeId = new JLabel("아 이 디");
		labeId.setBounds(270, 180, 80, 30);
		panLogin.add(labeId);
		labeId.setFont(new Font("나눔고딕", Font.BOLD, 18));

		txtId = new JTextField();
		txtId.setBounds(350, 175, 200, 40);
		panLogin.add(txtId);
		txtId.setColumns(10);

		JLabel labelPwd = new JLabel("비 밀 번 호");
		labelPwd.setBounds(235, 260, 100, 28);
		panLogin.add(labelPwd);
		labelPwd.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));

		txtPwd = new JPasswordField();
		txtPwd.setBounds(350, 255, 200, 40);
		panLogin.add(txtPwd);

		JButton btnLogin = new JButton("로그인");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtId.getText().trim().equals("") && txtPwd.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"다시 입력해 주세요.");
				}
				else 
				{
					if (UserController.loginMember(txtId.getText(), new String(txtPwd.getPassword())))
					{
						id = txtId.getText();
						contentPane.add(new UserMainView(), "userMainView");
						cards.next(contentPane);
						JOptionPane.showMessageDialog(null,"환영합니다.");
					}else 
					{
						JOptionPane.showMessageDialog(null,"아이디 패스워드를 확인해주세요.");
					}
				}
			}
		});
		btnLogin.setBounds(380, 340, 70, 40);
		panLogin.add(btnLogin);
		btnLogin.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));

		JButton btnJoin = new JButton("회원가입");
		btnJoin.setBounds(460, 340, 80, 40);
		panLogin.add(btnJoin);
		btnJoin.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));
		btnJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				join_newmember frame = new join_newmember();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
				;

			}
		});

		JButton btnManagerMode = new JButton("관리자모드");
		btnManagerMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getContentPane().add("managerview", new ManagerJTableView());
				cards.next(contentPane);
			}
		});
		btnManagerMode.setBounds(350, 470, 110, 30);
		panLogin.add(btnManagerMode);
		btnManagerMode.setFont(new Font("나눔고딕코딩", Font.BOLD, 10));

		this.setVisible(true);

	}
}
