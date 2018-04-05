package kosta.matchat.view.user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
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

public class UserFavoritesList extends JPanel {

	String[] name = { "��������", "�����̸�", "�ּ�", "����ó", "��޿���", "����" };

	DefaultTableModel dt = new DefaultTableModel(name, 0);
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);

	/**
	 * Create the panel.
	 */
	public UserFavoritesList() {

		setLayout(null);
		setBackground(new Color(135, 206, 250));
		setBounds(0, 0, 797, 643);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));

		panel.setBounds(100, 30, 400, 450);

		panel.add(jsp, "Center");

		add(panel);
		// ���ڵ� ����Ŭ�� �� ����Ǵ� �޼ҵ�
		jt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				JTable t = (JTable) arg0.getSource();
				if (arg0.getClickCount() == 2) {
					TableModel m = t.getModel();
					Point pt = arg0.getPoint();
					int i = t.rowAtPoint(pt);
					if (i >= 0) {
						int row = t.convertRowIndexToModel(i);
						removeAll();
						LoginView.contentPane.add(new StoreInformation());
						revalidate();
						repaint();
						LoginView.cards.next(LoginView.contentPane);
						// String s = String.format("%s (%s)", m.getValueAt(row, 0), m.getValueAt(row,
						// 1));
						// JOptionPane.showMessageDialog(t, s, "title",
						// JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});

		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/logo.png")));
		logo.setBounds(650, 500, 79, 60);
		add(logo);

		JLabel preIcon = new JLabel("");
		preIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginView.contentPane.add(new UserKindSerachView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		preIcon.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/previousIcon.png")));
		preIcon.setBounds(12, 10, 76, 52);
		add(preIcon);

		// Jtable���� ���ڵ� �߰�

		// DAO���� ����Ÿ�� ���ͷ� �ٲ۴��� ���� �ϼ���!! , �Ű������� �ϵ��ڵ��� �ƴ� ���õ� ������ ��ü!
		// List<Vector<Object>> list = UserController.searchByStoreKind("�ѽ�");
		// if(list!=null && list.size()!=0) {
		// this.addRowTable(list);
		// }

		// ù��° ���� ����!!
		jt.setColumnSelectionInterval(0, 0);

	}
	
	public void addRowTable(List<Vector<Object>> list) {
		// ���� ���ڵ� ����
		for(int i=0; i<dt.getRowCount(); i++) {
			dt.removeRow(0);
		}
		
		for (Vector<Object> v : list) {
			dt.addRow(v);// ���� �߰�
		}
	}
}
