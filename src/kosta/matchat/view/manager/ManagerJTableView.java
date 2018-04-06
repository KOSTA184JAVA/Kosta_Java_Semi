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
import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.view.start.LoginView;

public class ManagerJTableView extends JPanel implements ActionListener {
	JPanel menu = new JPanel();
	JMenu m = new JMenu("관리");//메뉴바에 올려져있는것, 메뉴들
	JMenuItem  insert=new JMenuItem("추가"); //메뉴아이템: 누르면 실행되는것
	JMenuItem  update=new JMenuItem("수정");
	JMenuItem  delete=new JMenuItem("삭제");
	JMenuBar mb=new JMenuBar();
	
	List<Restaurant> list = null;
	
	String [] name={"StoreId","kind","name","addr","phone","deliver","point"};  //다영:컬럼추가(StoreId)
	
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
			jt.setRowSelectionInterval(0, 0); //첫번째 행에 커서 올림
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
		     	 v.add(r.getResId());
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
			new ManagerJDialogView(this, "추가",null);
		}else if(obj==update) {//수정
			new ManagerJDialogView(this, "수정",null);
		}else if(obj==delete) {//삭제
			int re=JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");		
			//yes를 클릭했을 경우
			//resId와 연결된 menuId도 삭제되게끔 menu테이블의 SEQ_RESTAUR_ID에 제약조건 주기
			//FOREIGN KEY (SEQ_RESTAUR_ID) REFERENCES RESTAURANT(SEQ_RESTAUR_ID) on delete cascade;
			if(re==JOptionPane.YES_OPTION) {
				//선택된 행 번호 가져오기
				int row [] = jt.getSelectedRows();
				int StoreIds [] = new int[row.length];
				for(int i=0; i<row.length; i++) {
					StoreIds[i] = (int) jt.getValueAt(row[i], 0); //StoreId 배열로 받음
				}
				re = AdminController.deleteStore(StoreIds);
				if(re>0) {
					List<Restaurant> list = AdminController.searchTotalList();
					if(list!=null && list.size()>0) {
						addRowTable(list);
						jt.setRowSelectionInterval(0, 0); // 1행에 커서 올림
					}
				}
			}
		}else if(obj==search) {  //검색
			String keyField = combo.getSelectedItem().toString(); //object return > toString으로 문자로변경
			if(keyField.trim().equals("ALL")) {  //전체 검색창
				List<Restaurant> list = AdminController.searchTotalList();
				if(list!=null && list.size()!=0) {
					this.addRowTable(list);
					jt.setRowSelectionInterval(0, 0);  //첫번째 행에 커서 올림
				}
			}else if(keyField.trim().equals("kind")) {  //종류별 검색창
				//text박스의 값 입력유무 체크
				String keyWord = jtf.getText();
				if(keyWord.equals("")) {
					kosta.matchat.view.start.FailView.errorMessage("검색할 단어를 입력해주세요.");
					jtf.requestFocus();
					return;
				}
				List<Restaurant> list = UserController.searchByStoreKind(keyWord);
				if(list!=null && list.size()>0) {
					addRowTable(list);
					jt.setRowSelectionInterval(0, 0);
				}
			}else if(keyField.trim().equals("name")) {  //이름별 검색창
				String keyWord = jtf.getText();
				if(keyWord.equals("")) {
					kosta.matchat.view.start.FailView.errorMessage("검색할 단어를 입력해주세요.");
					jtf.requestFocus();
					return;
				}
				List<Restaurant> list = UserController.searchByStoreName(keyWord);
				if(list!=null && list.size()>0) {
					addRowTable(list);
					jt.setRowSelectionInterval(0, 0);
				}
			}
			//new ManagerJDialogView(this, "");

		}
				
	}
}
