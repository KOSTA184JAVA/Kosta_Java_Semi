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

public class SearchByKindSecondView extends JPanel {
//	private CardLayout cards = new CardLayout();

	/**
	 * Create the panel.
	 */
	public SearchByKindSecondView() {
				setLayout(null);

				setBounds(0, 0, 394, 600);
				JPanel panel = new JPanel();
				panel.setLayout(null);
				panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel.setBackground(new Color(135, 206, 250));
				panel.setBounds(0, 0, 394, 600);
				add(panel);
				
				
				
				JButton koBtn = new JButton("\uD55C   \uC2DD");
				koBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						removeAll();
						LoginView.contentPane.add("search",new search());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				koBtn.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				koBtn.setBounds(55, 38, 165, 60);
				panel.add(koBtn);
				
				JButton engBtn = new JButton("\uC591   \uC2DD");
				engBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new search());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				engBtn.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				engBtn.setBounds(55, 170, 165, 60);
				panel.add(engBtn);
				
				JButton japanBtn = new JButton("\uC77C   \uC2DD");
				japanBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new search());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				japanBtn.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				japanBtn.setBounds(55, 302, 165, 60);
				panel.add(japanBtn);
				
				JButton chinaBtn = new JButton("\uC911   \uC2DD");
				chinaBtn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("search",new search());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
					
				});
				chinaBtn.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				chinaBtn.setBounds(55, 434, 165, 60);
				panel.add(chinaBtn);
				
				JLabel logo = new JLabel("New label");
				logo.setIcon(new ImageIcon(SearchByKindSecondView.class.getResource("/images/logo.png")));
				logo.setBounds(289, 492, 79, 60);
				panel.add(logo);
				
				JLabel preIcon = new JLabel("");
				preIcon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add(new SearchByKindFirstView());
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				preIcon.setIcon(new ImageIcon(SearchByKindSecondView.class.getResource("/images/previousIcon.png")));
				preIcon.setBounds(12, 10, 76, 52);
				panel.add(preIcon);


	}

}
