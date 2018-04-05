package kosta.matchat.view.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Member;
import kosta.matchat.view.start.LoginView;

public class UserMainView extends JPanel {
	static JPanel userMainView = new JPanel();
	/**
	 * Create the panel.
	 */
	public UserMainView() {
		setBounds(0, 0, 797, 643);

		userMainView.setLayout(null);
		userMainView.setBackground(new Color(135, 206, 250));
		LoginView.contentPane.add(userMainView);
		
		
		JButton btnKind = new JButton("À½½ÄÁ¾·ùº° °Ë»ö");
		btnKind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add("searchbykindsecond",new UserKindSerachView());
				revalidate();
				repaint();
				LoginView.cards.last(LoginView.contentPane);
			}
		});
		
		btnKind.setBounds(218, 48, 250, 85);
		btnKind.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		userMainView.add(btnKind);
		
		JButton btnName = new JButton("¸ÀÁý ÀÌ¸§ °Ë»ö");
		btnName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add(new UserNameSearchListView());
				revalidate();
				repaint();
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		btnName.setBounds(218, 198, 250, 85);
		btnName.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		userMainView.add(btnName);
		
		JButton uFravoriteList = new JButton("Áñ°ÜÃ£±â ¸ñ·Ï");
		uFravoriteList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add("Favorsearch",new UserFavoritesList());
				revalidate();
				repaint();
				
				LoginView.cards.next(LoginView.contentPane);

			}
		});
		uFravoriteList.setBounds(218, 348, 250, 85);
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
		
		JButton MemDelete = new JButton("\uBA64\uBC84 \uD0C8\uD1F4");
		MemDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserController.quitMember(LoginView.id);
				JOptionPane.showMessageDialog(null,"Å»Åð µÇ¾ú½À´Ï´Ù.");
				LoginView.cards.show(LoginView.contentPane, "login");
				

				
			}
		});
		MemDelete.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 25));
		MemDelete.setBounds(218, 493, 250, 85);
		userMainView.add(MemDelete);
	
		setVisible(true);
	}
}
