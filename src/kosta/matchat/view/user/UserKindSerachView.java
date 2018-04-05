package kosta.matchat.view.user;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kosta.matchat.view.start.LoginView;

public class UserKindSerachView extends JPanel {
//	private CardLayout cards = new CardLayout();

	/**
	 * Create the panel.
	 */
	public UserKindSerachView() {
				setLayout(null);
				setBounds(0, 0, 394, 600);
				JPanel panel = new JPanel();
				panel.setLayout(null);
				panel.setBackground(new Color(135, 206, 250));
				panel.setBounds(0, 0, 797, 643);
				add(panel);
				
				
				JButton koBtn = new JButton("ÇÑ   ½Ä");
				koBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						removeAll();
						LoginView.contentPane.add("search",new UserKindSearchListView());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				koBtn.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 25));
				koBtn.setBounds(275, 100, 165, 60);
				panel.add(koBtn);
				
				JButton engBtn = new JButton("¾ç   ½Ä");
				engBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new UserKindSearchListView());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				engBtn.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 25));
				engBtn.setBounds(275, 200, 165, 60);
				panel.add(engBtn);
				
				JButton japanBtn = new JButton("ÀÏ   ½Ä");
				japanBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new UserKindSearchListView());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				japanBtn.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 25));
				japanBtn.setBounds(275, 300, 165, 60);
				panel.add(japanBtn);
				
				JButton chinaBtn = new JButton("Áß   ½Ä");
				chinaBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new UserKindSearchListView());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
					
				});
				chinaBtn.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 25));
				chinaBtn.setBounds(275, 400, 165, 60);
				panel.add(chinaBtn);
				
				JLabel logo = new JLabel("New label");
				logo.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/logo.png")));
				logo.setBounds(650, 500, 79, 60);
				panel.add(logo);
				
				JLabel preIcon = new JLabel("");
				preIcon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add(new UserMainView());
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				preIcon.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/previousIcon.png")));
				preIcon.setBounds(12, 10, 76, 52);
				panel.add(preIcon);


	}

}
