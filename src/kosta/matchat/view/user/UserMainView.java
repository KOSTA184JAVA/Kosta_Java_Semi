package kosta.matchat.view.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kosta.matchat.view.start.LoginView;

public class UserMainView extends JPanel {
	static JPanel userMainView = new JPanel();
	/**
	 * Create the panel.
	 */
	public UserMainView() {
		setBounds(0, 0, 394, 600);

		userMainView.setLayout(null);
		userMainView.setBackground(new Color(135, 206, 250));
		LoginView.contentPane.add(userMainView);
		
		
		JButton btnKind = new JButton("À½½ÄÁ¾·ùº° °Ë»ö");
		btnKind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add("searchbykindsecond",new UserKindSerach());
				revalidate();
				repaint();
				LoginView.cards.last(LoginView.contentPane);
			}
		});
		
		btnKind.setBounds(275, 100, 250, 85);
		btnKind.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		userMainView.add(btnKind);
		
		JButton btnName = new JButton("¸ÀÁý ÀÌ¸§ °Ë»ö");
		btnName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add(new SearchStoreName());
				revalidate();
				repaint();
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		btnName.setBounds(275, 250, 250, 85);
		btnName.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		userMainView.add(btnName);
		
		JButton uFravoriteList = new JButton("Áñ°ÜÃ£±â ¸ñ·Ï");
		uFravoriteList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//LoginView.contentPane.removeAll();
				LoginView.contentPane.add(new search_Favorite(),"Favorsearch");
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		uFravoriteList.setBounds(275, 400, 250, 85);
		uFravoriteList.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		userMainView.add(uFravoriteList);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setBounds(650, 500, 79, 60);
		labelLogo.setIcon(new ImageIcon(UserMainView.class.getResource("/images/logo.png")));
		userMainView.add(labelLogo);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				LoginView.contentPane.add(new LoginView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		labelIcon.setIcon(new ImageIcon(UserMainView.class.getResource("/images/previousIcon.png")));
		labelIcon.setBounds(0, 0, 76, 52);
		userMainView.add(labelIcon);
	
		setVisible(true);
	}
}
