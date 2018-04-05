package kosta.matchat.view.user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kosta.matchat.view.start.LoginView;

public class UserNameSearchListView extends JPanel {
	private JTextField textField;

	String[] name = { "��������", "�����̸�", "�ּ�", "����ó", "��޿���", "����" };

	DefaultTableModel dt = new DefaultTableModel(name, 0);
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);

	public UserNameSearchListView() {
		setLayout(null);

		setBackground(new Color(135, 206, 250));
		setBounds(0, 0, 797, 643);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));

		panel.setBounds(50, 100, 600, 450);

		panel.add(jsp, "Center");

		add(panel);

		textField = new JTextField();
		textField.setBounds(200, 52, 400, 21);
		textField.setColumns(10);
		add(textField);

		JLabel label = new JLabel("���� �̸� �˻�");
		label.setBounds(310, 10, 155, 30);
		label.setFont(new Font("��������ڵ�", Font.BOLD, 17));
		add(label);
		
		//�˻���ư�� ������ �� �ؽ�Ʈ�ʵ带 �о�� 
		//��Ʈ�ѷ� ȣ�� �� ���Ϲ��� ���� table�� �ѷ��ּ���!
		JButton btnNewButton = new JButton("�˻�");
		btnNewButton.setBounds(600, 51, 68, 23);
		add(btnNewButton);

		

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
						LoginView.contentPane.add(new StoreInformation(null));
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
				LoginView.contentPane.add(new UserMainView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		preIcon.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/previousIcon.png")));
		preIcon.setBounds(12, 10, 76, 52);
		add(preIcon);
		
		
	}
	/***
	 * �˻��� ���ڵ�(List<Vector<Object>>)�� DefaultTableModel�� �߰��ϴ� �޼ҵ�
	 */
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
