package kosta.matchat.view.manager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class ManagerJTableView extends JFrame implements ActionListener{
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
		super("DB연동");
		
		m.add(insert);
		m.add(update);
		m.add(delete);
		mb.add(m);

		setJMenuBar(mb);//메뉴바를 Frame위에올리기
		
		//South영역
		
		p.setBackground(Color.yellow);
		p.add(combo);
		p.add(jtf);
		p.add(search);

		add(jsp, "Center");
		add(p, "South");

		setSize(500,400);
		setLocationRelativeTo(null); //정가운데
		setVisible(true);

	
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 등록->이벤트주체.addXxxListener(이벤트구현클래스);
		insert.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
	}//생성자끝



	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();//이벤트발생시키는 주체
		if(obj==insert) {//가입
				new ManagerJDialogView(this, "추가");
		}else if(obj==update) {//수정
				new ManagerJDialogView(this, "수정");
		}else if(obj==delete) {//삭제
				int re=JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");
					
		}
				
	}
}
