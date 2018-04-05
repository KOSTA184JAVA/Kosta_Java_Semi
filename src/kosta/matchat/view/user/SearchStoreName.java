package kosta.matchat.view.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kosta.matchat.view.start.LoginView;

public class SearchStoreName extends JPanel {
	private JTextField textField;
	private JTable table;
	
	Vector<String> userColumn = new Vector<String>();
	DefaultTableModel model;
	Vector<String> userRow;
	/**
	 * Create the panel.
	 */
	public SearchStoreName() {
		setBounds(0, 0, 394, 600);
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		textField = new JTextField();
		textField.setText("\uC720\uB178\uCD94\uBCF4 \uD604\uB300\uBC31\uD654\uC810\uD310\uAD50\uC810");
		textField.setBounds(14, 52, 293, 21);
		textField.setColumns(10);
		add(textField);
		
		JLabel label = new JLabel("\uB9DB\uC9D1 \uC774\uB984 \uAC80\uC0C9");
		label.setBounds(123, 13, 155, 29);
		label.setFont(new Font("?‚˜?ˆ”ê³ ë”•ì½”ë”©", Font.BOLD, 17));
		add(label);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.setBounds(305, 51, 68, 23);
		add(btnNewButton);
		
		JButton button = new JButton("\uC774\uC804\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.add(new UserMainView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		button.setFont(new Font("? ?™?˜™? ?™?˜™? ?™?˜™? ?™?˜™æ¹„å ï¿?", Font.PLAIN, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(123, 520, 167, 23);
		add(button);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon("/Users/jieunpark/eclipse-workspace/GUI/src/project/ï¿½ï¿½ï¿½â’°ï¿½ï¿½ï¿½ï¿½_ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ë“„ï¿½ï¿½ï¿½â’°ï¿½ï¿½ï¿½â– ï¿½ì†½ï¿½ï¿½ï¿½ë“„ï¿½ï¿½ï¿½ï¿½.3png.png"));
		label_19.setFont(new Font("? ?™?˜™? ?™?˜™? ?™?˜™? ?™?˜™æ¹„å ï¿?", Font.PLAIN, 15));
		label_19.setBounds(296, 504, 77, 52);
		add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("/Users/jieunpark/eclipse-workspace/Project/bin/ï¿½ï¿½ï¿½ë“„ï¿½ï¿½ï¿½Î±ï¿½?ƒ¡ï¿½ï¿½ï¿½â– ï¿½ï¿½ï¿½ë“„ï¿½ï¿½ï¿½â’°ï¿½ï¿½.png"));
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.add(new UserMainView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		label_20.setBounds(5, 13, 54, 35);
		add(label_20);
		
		userColumn.addElement("no");
		userColumn.addElement("ï§ï¿½ï¿½ï¿½ ï¿½ë?ï¿?");
		userColumn.addElement("åª›ï¿½ å¯ƒï¿½");
		userColumn.addElement("ç§»ì‡°ï¿½ç”±ï¿?");
		userColumn.addElement("ï¿½ã…»ï¿?");
		model = new DefaultTableModel(userColumn, 0);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 86, 353, 422);
		this.add(scrollPane);
		
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
