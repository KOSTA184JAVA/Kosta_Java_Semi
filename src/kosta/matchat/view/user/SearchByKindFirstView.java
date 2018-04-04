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

public class SearchByKindFirstView extends JPanel {
	static JPanel searchbykindfirst = new JPanel();
	/**
	 * Create the panel.
	 */
	public SearchByKindFirstView() {
		setBounds(0, 0, 394, 600);
		
		searchbykindfirst.setLayout(null);
		searchbykindfirst.setBackground(new Color(135, 206, 250));
		LoginView.contentPane.add(searchbykindfirst);
		
		
		JButton btnKind = new JButton("\uC885   \uB958");
		btnKind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.removeAll();
				LoginView.contentPane.add("searchbykindsecond",new SearchByKindSecondView());
				revalidate();
				repaint();
				LoginView.cards.last(LoginView.contentPane);
			}
		});
		
		btnKind.setBounds(33, 52, 185, 85);
		btnKind.setFont(new Font("?†«ï¿?   ?‘œï¿? ", Font.PLAIN, 25));
		searchbykindfirst.add(btnKind);
		
		JButton btnName = new JButton("\uC774   \uB984");
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
		btnName.setBounds(33, 238, 185, 85);
		btnName.setFont(new Font("ï¿½ï¿½   ?”±ï¿? ", Font.PLAIN, 25));
		searchbykindfirst.add(btnName);
		
		JButton uFravoriteList = new JButton("\uC990\uACA8\uCC3E\uAE30 \uBAA9\uB85D");
		uFravoriteList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//LoginView.contentPane.removeAll();
				LoginView.contentPane.add(new search_Favorite(),"Favorsearch");
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		uFravoriteList.setBounds(325, 51, 185, 87);
		uFravoriteList.setFont(new Font("ï¿½ï¿½   ?”±ï¿? ", Font.PLAIN, 25));
		searchbykindfirst.add(uFravoriteList);
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(437, 319, 79, 60);
		logo.setIcon(new ImageIcon(SearchByKindFirstView.class.getResource("/images/logo.png")));
		searchbykindfirst.add(logo);
		
		JLabel preIcon = new JLabel("");
		preIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				LoginView.contentPane.add(new LoginView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		preIcon.setIcon(new ImageIcon(SearchByKindFirstView.class.getResource("/images/previousIcon.png")));
		preIcon.setBounds(0, 0, 76, 52);
		searchbykindfirst.add(preIcon);
	
		setVisible(true);
	}
}
