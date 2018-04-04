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

import kosta.matchat.view.manager.ManagerJTableView;
import kosta.matchat.view.user.SearchByKindFirstView;


public class LoginView extends JFrame {

	public static JPanel contentPane;
	private JTextField textField;
	private ImageIcon im;
	private JPasswordField passwordField;

    public static CardLayout cards = new CardLayout();// ?ôîÎ©¥ÏùÑ ?†Ñ?ôî?ïòÍ∏∞Ïóê ?ïÑ?öî?ïú layout!


	
	public LoginView() {
		setTitle("\uB85C  \uADF8  \uC778  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 600);
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
		     label.setBounds(79, 81, 197, 41);
		     login.add(label);
		     label.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 28));
		     
		     JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514");
		     lblNewLabel.setBounds(47, 183, 74, 28);
		     login.add(lblNewLabel);
		     lblNewLabel.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 18));
		     
		     textField = new JTextField();
		     textField.setBounds(149, 176, 197, 41);
		     login.add(textField);
		     textField.setColumns(10);
		     
		     JLabel id = new JLabel("\uBE44\uBC00 \uBC88\uD638");
		     id.setBounds(47, 262, 94, 28);
		     login.add(id);
		     id.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.BOLD, 18));
		     
		     passwordField = new JPasswordField();
		     passwordField.setBounds(149, 258, 197, 41);
		     login.add(passwordField);
		     
		     JButton btnNewButton = new JButton("\uB85C  \uADF8  \uC778");
		     btnNewButton.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) { 
		     		
		     		contentPane.add(new SearchByKindFirstView(),"searchbyKindFrist");
					cards.next(contentPane );
		     	} 
		     });
		     btnNewButton.setBounds(93, 349, 197, 60);
		     login.add(btnNewButton);
		     btnNewButton.setFont(new Font("?Çò?àîÍ≥†ÎîïÏΩîÎî©", Font.PLAIN, 16));
		     
		     JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		     btnNewButton_1.setBounds(107, 423, 169, 41);
		     login.add(btnNewButton_1);
		       btnNewButton_1.addMouseListener(new MouseAdapter() {
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
		     
		     JButton managerMode = new JButton("\uAD00\uB9AC\uC790\uBAA8\uB4DC");
		     managerMode.addMouseListener(new MouseAdapter() {
		     	@Override
		     	public void mouseClicked(MouseEvent e) {
		     		getContentPane().add("managerview", new ManagerJTableView());
		     		cards.next(contentPane);
		     	}
		     });
		     managerMode.setBounds(132, 476, 117, 29);
		     login.add(managerMode);
		     
		   
		     this.setVisible(true);
		    
		
	}
}
