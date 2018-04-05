package kosta.matchat.view.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import kosta.matchat.controller.AdminController;
import kosta.matchat.model.dto.Restaurant;

public class ManagerJTableView extends JPanel implements ActionListener {
	JPanel menu = new JPanel();
	JMenu m = new JMenu("관리");//메뉴바에 올려져있는것, 메뉴들
	JMenuItem  insert=new JMenuItem("추가"); //메뉴아이템: 누르면 실행되는것
	JMenuItem  update=new JMenuItem("수정");
	JMenuItem  delete=new JMenuItem("삭제");
	JMenuBar mb=new JMenuBar();
		
	String [] name={"kind","name","addr","phone","deliver","point"};
	
	DefaultTableModel dt= new DefaultTableModel(name,0);
	JTable jt=new JTable(dt);
	JScrollPane jsp=new JScrollPane(jt);
	
	/*
		South 영역에 추가할 Componet들
	*/
	JPanel p= new JPanel();
	String [] comboName={"  ALL  ","  kind  "," name "};
	
	JComboBox combo = new JComboBox(comboName); //콤보박스
	JTextField jtf = new JTextField(20);
	JButton search = new JButton("검색");


	
/**
	화면구성 및 이벤트등록

*/
	public ManagerJTableView(){
		setLayout(new BorderLayout(0, 0));
		menu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		menu.add(mb);
		mb.add(m);
		//super("DB연동");
		m.add(insert);
		m.add(update);
		m.add(delete);
	

		//setJMenuBar(mb);//메뉴바를 Frame위에올리기
		add(menu, BorderLayout.NORTH);
		//South영역
		
		p.setBackground(Color.yellow);
		p.add(combo);
		p.add(jtf);
		p.add(search);

		add(jsp);
		add(p, BorderLayout.SOUTH);

		setSize(500,400);
		setVisible(true);

	
		
		//이벤트 등록->이벤트주체.addXxxListener(이벤트구현클래스);
		insert.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		
		
		//jtable 위에 레코드(테이블) 추가
		List<Restaurant> list = AdminController.searchTotalList();
		if(list!=null && list.size()!=0) {
			this.addRowTable(list);
			
			//첫번째 행을 우선 선택해둠. 
			jt.setRowSelectionInterval(0, 0);
		}			
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();//이벤트발생시키는 주체
		if(obj==insert) {//가입
				new ManagerJDialogView(this, "추가");
		}else if(obj==update) {//수정
				new ManagerJDialogView(this, "수정");
		}else if(obj==delete) {//삭제
				int re=JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");
					
		}else if(obj==search) {  //검색
			
			
			
			
		}
				
	}
}
