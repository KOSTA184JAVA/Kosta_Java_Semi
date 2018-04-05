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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				panel.setBounds(0, 0,  797, 643);
				add(panel);
				
				
				
				JButton btnKo = new JButton("\uD55C   \uC2DD");
				btnKo.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						removeAll();
						LoginView.contentPane.add("searchKo",new search("�ѽ�"));
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				btnKo.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				btnKo.setBounds(55, 38, 165, 60);
				panel.add(btnKo);
				
				JButton btnEng = new JButton("\uC591   \uC2DD");
				btnEng.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("searchEng",new search("���"));
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				btnEng.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				btnEng.setBounds(55, 170, 165, 60);
				panel.add(btnEng);
				
				JButton btnJap = new JButton("\uC77C   \uC2DD");
				btnJap.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("searchJap",new search("�Ͻ�"));
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
				});
				btnJap.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				btnJap.setBounds(55, 302, 165, 60);
				panel.add(btnJap);
				
				JButton btnChina = new JButton("\uC911   \uC2DD");
				btnChina.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						LoginView.contentPane.add("searchChina",new search("�߽�"));
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
					}
					
				});
				btnChina.setFont(new Font("�?짧쨈짰째챠쨉챰��쨉�?", Font.PLAIN, 25));
				btnChina.setBounds(55, 434, 165, 60);
				panel.add(btnChina);
				
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
