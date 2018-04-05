package kosta.matchat.view.manager;

import java.awt.Color;
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

public class ManagerJTableView extends JFrame implements ActionListener{
	JMenu m = new JMenu("����");//�޴��ٿ� �÷����ִ°�, �޴���
	JMenuItem  insert=new JMenuItem("�߰�"); //�޴�������: ������ ����Ǵ°�
	JMenuItem  update=new JMenuItem("����");
	JMenuItem  delete=new JMenuItem("����");
	JMenuBar mb=new JMenuBar();
		
	String [] name={"kind","name","addr","phone","deliver","point"};
	
	DefaultTableModel dt= new DefaultTableModel(name,0);
	JTable jt=new JTable(dt);
	JScrollPane jsp=new JScrollPane(jt);
	
	/*
		South ������ �߰��� Componet��
	*/
	JPanel p= new JPanel();
	String [] comboName={"  ALL  ","  kind  "," name "};
	
	JComboBox combo = new JComboBox(comboName); //�޺��ڽ�
	JTextField jtf = new JTextField(20);
	JButton search = new JButton("�˻�");


	
/**
	ȭ�鱸�� �� �̺�Ʈ���

*/
	public ManagerJTableView(){
		super("DB����");
		
		m.add(insert);
		m.add(update);
		m.add(delete);
		mb.add(m);

		setJMenuBar(mb);//�޴��ٸ� Frame�����ø���
		
		//South����
		
		p.setBackground(Color.yellow);
		p.add(combo);
		p.add(jtf);
		p.add(search);

		add(jsp, "Center");
		add(p, "South");

		setSize(500,400);
		setLocationRelativeTo(null); //�����
		setVisible(true);

	
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�̺�Ʈ ���->�̺�Ʈ��ü.addXxxListener(�̺�Ʈ����Ŭ����);
		insert.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		//jtable ���� ���ڵ�(���̺�) �߰�
		List<Restaurant> list = AdminController.searchTotalList();
		if(list!=null && list.size()!=0) {
			this.addRowTable(list);
			
			//ù��° ���� �켱 �����ص�. 
			jt.setRowSelectionInterval(0, 0);
		}			
	}//�����ڳ�

	/**
	 * �˻��� ���ڵ�(List<Restaurant>)�� defaultTableModel�� �߰��ϴ� �޼ҵ�
	 */
	public void addRowTable(List<Restaurant> list) {
		//DB���� ������ List<Restaurant>�� List<Vector<Object>>���� ��ȯ
		List<Vector<Object>> vList = this.convertRestaurantToVector(list);
		
		//���� ���ڵ� ���� �� �ű��߰�
		dt.setNumRows(0);  //lowcount(���� ��)�� 0���� ����� (��λ���)
		
		for(Vector<Object> v :vList) {
			dt.addRow(v);  //���� �߰� (������)
		}
	}//addRowTable ��  
	
	/**
	 * �˻��� ���ڵ�(List<Restaurant>)�� List<Vector<Object>>�� ��ȯ�ϴ� �޼ҵ� (���� : dt.addRow() �� �� �Ű������� �迭 Ȥ�� Vector<>�� ���� ����)
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
		Object obj = e.getSource();//�̺�Ʈ�߻���Ű�� ��ü
		if(obj==insert) {//����
				new ManagerJDialogView(this, "�߰�");
		}else if(obj==update) {//����
				new ManagerJDialogView(this, "����");
		}else if(obj==delete) {//����
				int re=JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?");
					
		}else if(obj==search) {  //�˻�
			
			
			
			
		}
				
	}
}
