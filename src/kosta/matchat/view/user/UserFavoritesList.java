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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import kosta.matchat.controller.AdminController;
import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.view.start.LoginView;

public class UserFavoritesList extends JPanel {

	String[] name = { "맛집종류", "맛집이름", "주소", "연락처", "배달여부", "별점" };
	
	DefaultTableModel dt = new DefaultTableModel(name, 0);
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);


	/**
	 * Create the panel.
	 */
	public UserFavoritesList() {
		String id = LoginView.id;

		setLayout(null);
		setBackground(new Color(135, 206, 250));
		setBounds(0, 0, 797, 643);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));

		panel.setBounds(110,120, 550, 300);

		panel.add(jsp, "Center");

		add(panel);
		

		JLabel label = new JLabel(id + "님의 즐겨찾기 리스트");
		label.setBounds(270, 50, 350, 30);
		label.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		add(label);

		
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

		//jtable 위에 레코드(테이블) 추가
		List<Restaurant> list = UserController.searchFavorites(id);
		if(list!=null && list.size()!=0) {
			this.addRowTable(list);
			
			//첫번째 행을 우선 선택해둠. 
			jt.setRowSelectionInterval(0, 0);
		}			
		
		jt.addMouseListener(new MouseAdapter() {
			
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
        			LoginView.contentPane.add(new StoreInformation((String) m.getValueAt(row, 1)));
        				revalidate();
        				repaint();
        				LoginView.cards.next(LoginView.contentPane);
        				
//                        String s = String.format("%s (%s)", m.getValueAt(row, 0), m.getValueAt(row, 1));
//                        JOptionPane.showMessageDialog(t, s, "title", JOptionPane.INFORMATION_MESSAGE);
                    }
				}
			}
		});
	}//생성자끝

	/**
	 * 검색된 레코드(List<Restaurant>)를 defaultTableModel에 추가하는 메소드
	 */
	public void addRowTable(List<Restaurant> list) {
		//DB에서 가져온 List<Restaurant>을 List<Vector<Object>>으로 변환
		List<Vector<Object>> vList = this.convertRestaurantToVector(list);
		
		//기존 레코드 리셋 후 신규추가
		dt.setNumRows(0);  //lowcount(행의 수)를 0으로 만든다 (모두삭제)
		for(Vector<Object> v :vList) {
			dt.addRow(v);  //끝에 추가 (누적됨)
		}
	}//addRowTable 끝  
	
	/**
	 * 검색된 레코드(List<Restaurant>)를 List<Vector<Object>>로 변환하는 메소드 (이유 : dt.addRow() 할 때 매개변수로 배열 혹은 Vector<>만 들어가기 때문)
	 */
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