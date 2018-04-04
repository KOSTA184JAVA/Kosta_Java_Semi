package kosta.matchat.view.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kosta.matchat.view.start.LoginView;

public class search extends JPanel {

	//private CardLayout cards = new CardLayout();
	private JTable table;
	
	Vector<String> userColumn = new Vector<String>();
	DefaultTableModel model;
	Vector<String> userRow;

	/**
	 * Create the panel.
	 */
	public search() {
		setLayout(null);

		setBounds(0,0, 394, 600);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 394, 600);
		add(panel);
		
		JLabel subject = new JLabel(""); //? œëª? ?“¤?–´ê°?ê¸?
		subject.setFont(new Font("êµ´ë¦¼", Font.PLAIN, 20));
		subject.setBounds(104, 10, 167, 33);
		panel.add(subject);
		
		JLabel LogoIcon = new JLabel("");
	     LogoIcon.setBounds(289, 492, 79, 60);
	     panel.add(LogoIcon);
	     LogoIcon.setIcon(new ImageIcon(search.class.getResource("/images/logo.png")));
		
		JLabel preIcon = new JLabel("");
		preIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LoginView.contentPane.add(new SearchByKindSecondView());
				LoginView.cards.next(LoginView.contentPane);
				
			}
		});
		preIcon.setIcon(new ImageIcon(search.class.getResource("/images/previousIcon.png")));
		preIcon.setBounds(6, 6, 54, 35);
		panel.add(preIcon);
		userColumn.addElement("no");
		userColumn.addElement("ï§Žï¿½ï¿½ï¿½ ï¿½ë?ï¿?");
		userColumn.addElement("åª›ï¿½ å¯ƒï¿½");
		userColumn.addElement("ç§»ì‡°ï¿½ç”±ï¿?");
		userColumn.addElement("ï¿½ã…»ï¿?");
		model = new DefaultTableModel(userColumn, 0);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 53, 353, 436);
		panel.add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		userRow= new Vector<String>();
		userRow.addElement("1");
		userRow.addElement("ï¿½ï¿½?Œ·ï¿?"	);
		userRow.addElement("9000"	);
		userRow.addElement("800"	);
		userRow.addElement("ï¿½ï¿½?Œ·?‘¦ï¿½ï¿½"	);
		model.addRow(userRow);
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JTable t = (JTable)arg0.getSource();
				if(arg0.getClickCount()==2) {
					TableModel m = t.getModel();
                    Point pt = arg0.getPoint();
                    int i = t.rowAtPoint(pt);
                    if(i>=0) {
                        int row = t.convertRowIndexToModel(i);
                        removeAll();
        			LoginView.contentPane.add(new StoreInformation());
        				revalidate();
        				repaint();
        				LoginView.cards.next(LoginView.contentPane);
//                        String s = String.format("%s (%s)", m.getValueAt(row, 0), m.getValueAt(row, 1));
//                        JOptionPane.showMessageDialog(t, s, "title", JOptionPane.INFORMATION_MESSAGE);
                    }
				}
			}
		});
	}
}

