package kosta.matchat.view.user;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.view.start.LoginView;

public class UserNameSearchListView extends JPanel {
	private JTextField searchTextField;

	String[] name = { "맛집종류", "맛집이름", "주소", "연락처", "배달여부", "별점" };

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

		searchTextField = new JTextField();
		searchTextField.setBounds(200, 52, 400, 21);
		searchTextField.setColumns(10);
		add(searchTextField);

		JLabel label = new JLabel("맛집 이름 검색");
		label.setBounds(310, 10, 155, 30);
		label.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		add(label);
		
		//검색버튼이 눌렸을 때 텍스트필드를 읽어와 
		//컨트롤러 호출 후 리턴받은 값을 table에 뿌려주세요!
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String storeName = searchTextField.getText();
				List<Restaurant> resList = UserController.searchByStoreName(storeName);
				viewRowTable(resList);
			}
		});
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
				LoginView.contentPane.add(new UserMainView());
				LoginView.cards.next(LoginView.contentPane);
			}
		});
		preIcon.setIcon(new ImageIcon(UserKindSerachView.class.getResource("/images/previousIcon.png")));
		preIcon.setBounds(12, 10, 76, 52);
		add(preIcon);
		
		
	}
	/***
	 * 검색된 레코드(List<Vector<Object>>)를 DefaultTableModel에 추가하는 메소드
	 */
	public void viewRowTable(List<Restaurant> rList) {
		List<Vector<Object>>vlist = convertRestaurantToVector(rList);
		if(vlist != null && !vlist.isEmpty()) {
			this.addRowTable(vlist);
			//첫번째 행을 선택 => 아무것도 선택하지 않고 시나리오를 실행할시 발생하는 오류 대처
			jt.setRowSelectionInterval(0, 0);
			jt.getTableHeader().setReorderingAllowed(false);
			//table.getTableHeader().setResizingAllowed(false);
			jt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
	}
	
	public void addRowTable(List<Vector<Object>>list) {
		//기존 레코드 삭제
		dt.setNumRows(0);
		for(Vector<Object> v : list) {
			//System.out.println(v);
			dt.addRow(v);
		}
	}
	
	public List<Vector<Object>> convertRestaurantToVector(List<Restaurant> resList){
		List<Vector<Object>> vList = new ArrayList<>();
		
		for(Restaurant r : resList) {
			Vector<Object> v = new Vector<>();
			v.add(r.getResKind());
			v.add(r.getResName());
			v.add(r.getResAddr());
			v.add(r.getResPhone());
			v.add(r.getResDeliv());
			v.add(r.getResSp());
			vList.add(v);
		}
		return vList;
	}
}
