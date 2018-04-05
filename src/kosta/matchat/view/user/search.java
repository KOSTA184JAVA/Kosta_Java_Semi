package kosta.matchat.view.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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

import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.view.start.LoginView;

import javax.swing.ListSelectionModel;

public class search extends JPanel {

	//private CardLayout cards = new CardLayout();
	private JTable table;
	
	Vector<String> userColumn = new Vector<String>();
	DefaultTableModel model;
	Vector<String> userRow;
	private String kind;

	/**
	 * Create the panel.
	 */
	public search(String kind) {
		this.kind = kind;
		setLayout(null);

		setBounds(0,0, 394, 600);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 394, 600);
		add(panel);
		
		JLabel subject = new JLabel(""); //?젣紐? ?뱾?뼱媛?湲?
		subject.setFont(new Font("援대┝", Font.PLAIN, 20));
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
		userColumn.addElement("맛집종류");
		userColumn.addElement("맛집이름");
		userColumn.addElement("맛집주소");
		userColumn.addElement("연락처");
		model = new DefaultTableModel(userColumn, 0){
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 53, 353, 436);
		panel.add(scrollPane);
		
		table = new JTable(model);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setReorderingAllowed(false);
//		table.getTableHeader().setResizingAllowed(false);
		scrollPane.setViewportView(table);

		/**
		 * JTable 위의 DTM에 addRow 하고 View 하기		
		 */
		viewRowTable(kind);
		
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
	public void viewRowTable(String resKind) {
		List<Restaurant> rList = UserController.searchByStoreKind(resKind);
		List<Vector<Object>>vlist = convertRestaurantToVector(rList);
		if(vlist != null && !vlist.isEmpty()) {
			this.addRowTable(vlist);
			//첫번째 행을 선택 => 아무것도 선택하지 않고 시나리오를 실행할시 발생하는 오류 대처
			table.setRowSelectionInterval(0, 0);
			table.getTableHeader().setReorderingAllowed(false);
			//table.getTableHeader().setResizingAllowed(false);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
	}
	
	public void addRowTable(List<Vector<Object>>list) {
		//기존 레코드 삭제
		//model.setNumRows(0);
		for(Vector<Object> v : list) {
			System.out.println(v);
			model.addRow(v);
		}
	}
	
	public List<Vector<Object>> convertRestaurantToVector(List<Restaurant> resList){
		List<Vector<Object>> vList = new ArrayList<>();
		
		for(Restaurant r : resList) {
			Vector<Object> v = new Vector<>();
			v.add(r.getResId());
			v.add(r.getResKind());
			v.add(r.getResName());
			v.add(r.getResAddr());
			v.add(r.getResPhone());
			vList.add(v);
		}
		return vList;
	}
}

