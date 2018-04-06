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
	JMenu m = new JMenu("����");//�޴��ٿ� �÷����ִ°�, �޴���
	JMenuItem  insert=new JMenuItem("�߰�"); //�޴�������: ������ ����Ǵ°�
	JMenuItem  update=new JMenuItem("����");
	JMenuItem  delete=new JMenuItem("����");
	JMenuBar mb=new JMenuBar();
	
	List<Restaurant> list = null;
	
	String [] name={"StoreId","kind","name","addr","phone","deliver","point"};  //�ٿ�:�÷��߰�(StoreId)
	
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
		setLayout(new BorderLayout(0, 0));
		menu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		menu.add(mb);
		mb.add(m);
		//super("DB����");
		m.add(insert);
		m.add(update);
		m.add(delete);
	

		//setJMenuBar(mb);//�޴��ٸ� Frame�����ø���
		add(menu, BorderLayout.NORTH);
		//South����
		
		p.setBackground(Color.yellow);
		p.add(combo);
		p.add(jtf);
		p.add(search);

		add(jsp);
		add(p, BorderLayout.SOUTH);

		setSize(500,400);
		setVisible(true);

	
		
		//�̺�Ʈ ���->�̺�Ʈ��ü.addXxxListener(�̺�Ʈ����Ŭ����);
		insert.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		search.addActionListener(this);
		
		
		//jtable ���� ���ڵ�(���̺�) �߰�
		List<Restaurant> list = AdminController.searchTotalList();
		if(list!=null && list.size()!=0) {
			this.addRowTable(list);
			jt.setRowSelectionInterval(0, 0); //ù��° �࿡ Ŀ�� �ø�
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
		Object obj = e.getSource();//�̺�Ʈ�߻���Ű�� ��ü
		if(obj==insert) {//����
			new ManagerJDialogView(this, "�߰�",null);
		}else if(obj==update) {//����
			new ManagerJDialogView(this, "����",null);
		}else if(obj==delete) {//����
			int re=JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?");		
			//yes�� Ŭ������ ���
			//resId�� ����� menuId�� �����ǰԲ� menu���̺��� SEQ_RESTAUR_ID�� �������� �ֱ�
			//FOREIGN KEY (SEQ_RESTAUR_ID) REFERENCES RESTAURANT(SEQ_RESTAUR_ID) on delete cascade;
			if(re==JOptionPane.YES_OPTION) {
				//���õ� �� ��ȣ ��������
				int row [] = jt.getSelectedRows();
				int StoreIds [] = new int[row.length];
				for(int i=0; i<row.length; i++) {
					StoreIds[i] = (int) jt.getValueAt(row[i], 0); //StoreId �迭�� ����
				}
				re = AdminController.deleteStore(StoreIds);
				if(re>0) {
					List<Restaurant> list = AdminController.searchTotalList();
					if(list!=null && list.size()>0) {
						addRowTable(list);
						jt.setRowSelectionInterval(0, 0); // 1�࿡ Ŀ�� �ø�
					}
				}
			}
		}else if(obj==search) {  //�˻�
			String keyField = combo.getSelectedItem().toString(); //object return > toString���� ���ڷκ���
			if(keyField.trim().equals("ALL")) {  //��ü �˻�â
				List<Restaurant> list = AdminController.searchTotalList();
				if(list!=null && list.size()!=0) {
					this.addRowTable(list);
					jt.setRowSelectionInterval(0, 0);  //ù��° �࿡ Ŀ�� �ø�
				}
			}else if(keyField.trim().equals("kind")) {  //������ �˻�â
				//text�ڽ��� �� �Է����� üũ
				String keyWord = jtf.getText();
				if(keyWord.equals("")) {
					kosta.matchat.view.start.FailView.errorMessage("�˻��� �ܾ �Է����ּ���.");
					jtf.requestFocus();
					return;
				}
				List<Restaurant> list = UserController.searchByStoreKind(keyWord);
				if(list!=null && list.size()>0) {
					addRowTable(list);
					jt.setRowSelectionInterval(0, 0);
				}
			}else if(keyField.trim().equals("name")) {  //�̸��� �˻�â
				String keyWord = jtf.getText();
				if(keyWord.equals("")) {
					kosta.matchat.view.start.FailView.errorMessage("�˻��� �ܾ �Է����ּ���.");
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
