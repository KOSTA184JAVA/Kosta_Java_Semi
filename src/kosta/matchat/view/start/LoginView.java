package kosta.matchat.view.start;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kosta.matchat.controller.UserController;
import kosta.matchat.view.manager.ManagerJTableView;
import kosta.matchat.view.user.SearchByKindFirstView;


public class LoginView extends JFrame {

	public static JPanel contentPane;
	private JTextField idTextField;
	private ImageIcon im;
	private JPasswordField pwTextField;

    public static CardLayout cards = new CardLayout();// ?ôîÎ©¥ÏùÑ ?†Ñ?ôî?ïòÍ∏∞Ïóê ?ïÑ?öî?ïú layout!


	
	public LoginView() {
		setTitle("\uB85C  \uADF8  \uC778  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		     im  = new ImageIcon("?ÑÖ?Ö©???Ö©_?Ñã?ÖÆ?ÑÖ?Öµ?Ñå?Ö©?Ñç?Ö°?Üº?Ñã?Öµ?Ñå?Ö≠.3png.png");
		     contentPane.setLayout(cards);
		     
		     JPanel login = new JPanel();
		     login.setBackground(new Color(135, 206, 250));
		     contentPane.add(login, "login");
		     login.setLayout(null);
		     
		     JLabel label = new JLabel("  \uB85C     \uADF8    \uC778  ");
		     label.setBounds(289, 79, 197, 41);
		     login.add(label);
		     label.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 28));
		     
		     JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514");
		     lblNewLabel.setBounds(272, 183, 74, 28);
		     login.add(lblNewLabel);
		     lblNewLabel.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 18));
		     
		     idTextField = new JTextField();
		     idTextField.setBounds(377, 176, 197, 41);
		     login.add(idTextField);
		     idTextField.setColumns(10);
		     
		     JLabel id = new JLabel("\uBE44\uBC00 \uBC88\uD638");
		     id.setBounds(252, 262, 94, 28);
		     login.add(id);
		     id.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 18));
		     
		     pwTextField = new JPasswordField();
		     pwTextField.setBounds(377, 255, 197, 41);
		     login.add(pwTextField);
		     
		     JButton btnLogin = new JButton("\uB85C  \uADF8  \uC778");
		     btnLogin.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) { 
		     		
		     		
		     		if(UserController.loginMember(idTextField.getText(), new String(pwTextField.getPassword()) )) {
		     			contentPane.add(new SearchByKindFirstView(),"searchbyKindFrist");
		     			cards.next(contentPane );
		     		}
		     	} 
		     });
		     btnLogin.setBounds(299, 336, 197, 60);
		     login.add(btnLogin);
		     btnLogin.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.PLAIN, 16));
		     
		     JButton btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		     btnJoin.setBounds(317, 411, 169, 41);
		     login.add(btnJoin);
		       btnJoin.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) {
		     		
		     		join_newmember frame = new join_newmember();
		     		frame.setVisible(true);
		     		frame.setDefaultCloseOperation(HIDE_ON_CLOSE);;
		     		
		     	}
		     });
		       
		     JLabel LogoIcon = new JLabel("");
		     LogoIcon.setBounds(289, 492, 79, 60);
		     login.add(LogoIcon);
		     LogoIcon.setIcon(new ImageIcon("C:\\Edu\\javaWorkSpace\\Project\\src\\Î°úÍ≥†.png"));
		     
		     JButton btnManagerMode = new JButton("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		     btnManagerMode.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) {
		     		getContentPane().add("managerview", new ManagerJTableView());
		     		cards.next(contentPane);
		     	}
		     });
		     btnManagerMode.setBounds(349, 467, 117, 29);
		     login.add(btnManagerMode);
		     
		   
		     this.setVisible(true);
		    
		
	}
}
