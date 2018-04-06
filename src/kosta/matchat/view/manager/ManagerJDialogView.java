package kosta.matchat.view.manager;

	import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import kosta.matchat.controller.AdminController;
import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ManagerJDialogView extends JDialog implements ActionListener{
		private JPanel contentPane;
		private JTextField aMatchatKindTextField;
		private JTextField aMatchatPhoneTextField;
		private JTextField aMatchatNameTextField;
		private JTextField aMenuNameTextField1;
		private JTextField aMatchatDeliverTextField;
		private JTextField aMatchatAddrTextField;
		private JTextField aMenuPriceTextField1;
		private JTextField aMenuKcalTextField1;
		private JTextField aMenuDescTextField1;
		private JTextField aMenuSourceTextField1;
		private JTextField aMenuNameTextField2;
		private JTextField aMenuPriceTextField2;
		private JTextField aMenuKcalTextField2;
		private JTextField aMenuDescTextField2;
		private JTextField aMenuSourceTextField2;
		private JTextField aMenuNameTextField3;
		private JTextField aMenuPriceTextField3;
		private JTextField aMenuKcalTextField3;
		private JTextField aMenuDescTextField3;
		private JTextField aMenuSourceTextField3;

		/**
		 * Create the frame.
		 */
		public ManagerJDialogView(ManagerJTableView managerJTableView2, String string, Restaurant restaurant) {
			setTitle("\uB9DB\uC9D1\uC815\uBCF4 \uCD94\uAC00");
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 471,470);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			panel.setBounds(0, 10, 324, 431);
			contentPane.add(panel);
			
			JLabel SubjectLabel = new JLabel("\uB9DB\uC9D1 \uC815\uBCF4");
			SubjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
			SubjectLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 19));
			SubjectLabel.setBounds(112, 1, 100, 40);
			panel.add(SubjectLabel);
			
			JLabel aMatchatPhoneLabel = new JLabel("\uB9DB\uC9D1 \uC5F0\uB77D\uCC98 : ");
			aMatchatPhoneLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatPhoneLabel.setBounds(48, 109, 110, 20);
			panel.add(aMatchatPhoneLabel);
			
			JLabel aMatchatKindLabel = new JLabel("\uB9DB\uC9D1 \uC885\uB958  : ");
			aMatchatKindLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatKindLabel.setBounds(48, 34, 110, 20);
			panel.add(aMatchatKindLabel);
			
			aMatchatKindTextField = new JTextField();
			aMatchatKindTextField.setColumns(10);
			aMatchatKindTextField.setBounds(150, 34, 135, 20);
			panel.add(aMatchatKindTextField);
			
			JLabel aMatchatNameLabel = new JLabel("\uB9DB\uC9D1 \uC774\uB984  : ");
			aMatchatNameLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatNameLabel.setBounds(48, 59, 110, 20);
			panel.add(aMatchatNameLabel);
			
			aMatchatPhoneTextField = new JTextField();
			aMatchatPhoneTextField.setColumns(10);
			aMatchatPhoneTextField.setBounds(150, 109, 136, 21);
			panel.add(aMatchatPhoneTextField);
			
			aMatchatNameTextField = new JTextField();
			aMatchatNameTextField.setColumns(10);
			aMatchatNameTextField.setBounds(150, 59, 135, 20);
			panel.add(aMatchatNameTextField);
			
			JLabel aMatchatSpLabel = new JLabel("\uBCC4\uC810  : ");
			aMatchatSpLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatSpLabel.setBounds(48, 160, 110, 20);
			panel.add(aMatchatSpLabel);
			
			aMenuNameTextField1 = new JTextField();
			aMenuNameTextField1.setColumns(10);
			aMenuNameTextField1.setBounds(67, 190, 65, 20);
			panel.add(aMenuNameTextField1);
			
			aMatchatDeliverTextField = new JTextField();
			aMatchatDeliverTextField.setColumns(10);
			aMatchatDeliverTextField.setBounds(150, 134, 135, 21);
			panel.add(aMatchatDeliverTextField);
			
			JLabel aMatchatDeliverLabel = new JLabel("\uBC30\uB2EC \uC5EC\uBD80  : ");
			aMatchatDeliverLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatDeliverLabel.setBounds(48, 134, 110, 20);
			panel.add(aMatchatDeliverLabel);
			
			JLabel aMatchatAddrLabel = new JLabel("\uB9DB\uC9D1 \uC8FC\uC18C  : ");
			aMatchatAddrLabel.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			aMatchatAddrLabel.setBounds(48, 84, 110, 20);
			panel.add(aMatchatAddrLabel);
			
			aMatchatAddrTextField = new JTextField();
			aMatchatAddrTextField.setColumns(10);
			aMatchatAddrTextField.setBounds(150, 84, 135, 21);
			panel.add(aMatchatAddrTextField);
			
			JLabel aMenuNameLabel1 = new JLabel("\uBA54\uB274\uC774\uB984 :");
			aMenuNameLabel1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuNameLabel1.setBounds(13, 190, 50, 20);
			panel.add(aMenuNameLabel1);
			
			JLabel aMenuPriceLabel1 = new JLabel("\uAC00 \uACA9 :");
			aMenuPriceLabel1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuPriceLabel1.setBounds(134, 190, 39, 20);
			panel.add(aMenuPriceLabel1);
			
			aMenuPriceTextField1 = new JTextField();
			aMenuPriceTextField1.setColumns(10);
			aMenuPriceTextField1.setBounds(172, 190, 44, 20);
			panel.add(aMenuPriceTextField1);
			
			JLabel aMenuKcalLabel1 = new JLabel("\uCE7C\uB85C\uB9AC :");
			aMenuKcalLabel1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuKcalLabel1.setBounds(223, 190, 50, 20);
			panel.add(aMenuKcalLabel1);
			
			aMenuKcalTextField1 = new JTextField();
			aMenuKcalTextField1.setColumns(10);
			aMenuKcalTextField1.setBounds(265, 190, 55, 20);
			panel.add(aMenuKcalTextField1);
			
			JLabel aMenuDescLabel1 = new JLabel("\uBA54\uB274\uC124\uBA85 :");
			aMenuDescLabel1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuDescLabel1.setBounds(13, 220, 50, 20);
			panel.add(aMenuDescLabel1);
			
			aMenuDescTextField1 = new JTextField();
			aMenuDescTextField1.setColumns(10);
			aMenuDescTextField1.setBounds(67, 220, 151, 20);
			panel.add(aMenuDescTextField1);
			
			JLabel aMenuSourceLabel1 = new JLabel("¿ø»êÁö :");
			aMenuSourceLabel1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuSourceLabel1.setBounds(223, 220, 50, 20);
			panel.add(aMenuSourceLabel1);
			
			aMenuSourceTextField1 = new JTextField();
			aMenuSourceTextField1.setColumns(10);
			aMenuSourceTextField1.setBounds(265, 220, 55, 20);
			panel.add(aMenuSourceTextField1);
			
			JLabel label_12 = new JLabel("New label");
			label_12.setIcon(new ImageIcon("C:\\Users\\Xiyeon\\Desktop\\Edu\\JavaWorkSpace\\GUI\\src\\\uC774\uBBF8\uC9C0.png"));
			label_12.setBounds(239, 369, 81, 52);
			panel.add(label_12);
			
			JLabel aMenuNameLabel2 = new JLabel("¸Þ´ºÀÌ¸§ :");
			aMenuNameLabel2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuNameLabel2.setBounds(13, 250, 50, 20);
			panel.add(aMenuNameLabel2);
			
			aMenuNameTextField2 = new JTextField();
			aMenuNameTextField2.setColumns(10);
			aMenuNameTextField2.setBounds(67, 250, 65, 20);
			panel.add(aMenuNameTextField2);
			
			JLabel aMenuPriceLabel2 = new JLabel("°¡ °Ý :");
			aMenuPriceLabel2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuPriceLabel2.setBounds(134, 250, 39, 20);
			panel.add(aMenuPriceLabel2);
			
			aMenuPriceTextField2 = new JTextField();
			aMenuPriceTextField2.setColumns(10);
			aMenuPriceTextField2.setBounds(172, 250, 44, 20);
			panel.add(aMenuPriceTextField2);
			
			JLabel aMenuKcalLabel2 = new JLabel("Ä®·Î¸® :");
			aMenuKcalLabel2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuKcalLabel2.setBounds(223, 250, 50, 20);
			panel.add(aMenuKcalLabel2);
			
			aMenuKcalTextField2 = new JTextField();
			aMenuKcalTextField2.setColumns(10);
			aMenuKcalTextField2.setBounds(265, 250, 55, 20);
			panel.add(aMenuKcalTextField2);
			
			JLabel aMenuDescLabel2 = new JLabel("¸Þ´º¼³¸í :");
			aMenuDescLabel2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuDescLabel2.setBounds(13, 282, 50, 20);
			panel.add(aMenuDescLabel2);
			
			aMenuDescTextField2 = new JTextField();
			aMenuDescTextField2.setColumns(10);
			aMenuDescTextField2.setBounds(67, 282, 151, 20);
			panel.add(aMenuDescTextField2);
			
			JLabel aMenuSourceLabel2 = new JLabel("¿ø»êÁö :");
			aMenuSourceLabel2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuSourceLabel2.setBounds(223, 282, 50, 20);
			panel.add(aMenuSourceLabel2);
			
			aMenuSourceTextField2 = new JTextField();
			aMenuSourceTextField2.setColumns(10);
			aMenuSourceTextField2.setBounds(265, 280, 55, 20);
			panel.add(aMenuSourceTextField2);
			
			JLabel aMenuNameLabel3 = new JLabel("¸Þ´ºÀÌ¸§ :");
			aMenuNameLabel3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuNameLabel3.setBounds(13, 312, 50, 20);
			panel.add(aMenuNameLabel3);
			
			aMenuNameTextField3 = new JTextField();
			aMenuNameTextField3.setColumns(10);
			aMenuNameTextField3.setBounds(67, 312, 65, 20);
			panel.add(aMenuNameTextField3);
			
			JLabel aMenuPriceLabel3 = new JLabel("°¡ °Ý :");
			aMenuPriceLabel3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuPriceLabel3.setBounds(134, 312, 39, 20);
			panel.add(aMenuPriceLabel3);
			
			aMenuPriceTextField3 = new JTextField();
			aMenuPriceTextField3.setColumns(10);
			aMenuPriceTextField3.setBounds(172, 312, 44, 20);
			panel.add(aMenuPriceTextField3);
			
			JLabel aMenuKcalLabel3 = new JLabel("Ä®·Î¸® :");
			aMenuKcalLabel3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuKcalLabel3.setBounds(223, 312, 50, 20);
			panel.add(aMenuKcalLabel3);
			
			aMenuKcalTextField3 = new JTextField();
			aMenuKcalTextField3.setColumns(10);
			aMenuKcalTextField3.setBounds(265, 312, 55, 20);
			panel.add(aMenuKcalTextField3);
			
			JLabel aMenuDescLabel3 = new JLabel("¸Þ´º¼³¸í :");
			aMenuDescLabel3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuDescLabel3.setBounds(13, 345, 50, 20);
			panel.add(aMenuDescLabel3);
			
			aMenuDescTextField3 = new JTextField();
			aMenuDescTextField3.setColumns(10);
			aMenuDescTextField3.setBounds(67, 345, 151, 20);
			panel.add(aMenuDescTextField3);
			
			JLabel aMenuSourceLabel3 = new JLabel("¿ø»êÁö :");
			aMenuSourceLabel3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			aMenuSourceLabel3.setBounds(223, 345, 50, 20);
			panel.add(aMenuSourceLabel3);
			
			aMenuSourceTextField3 = new JTextField();
			aMenuSourceTextField3.setColumns(10);
			aMenuSourceTextField3.setBounds(265, 343, 55, 20);
			panel.add(aMenuSourceTextField3);
			
			//JButton button = new JButton("\uCD94  \uAC00");

			JButton button;
			if(string.equals("Ãß°¡")) {
				 button = new JButton("Ãß   °¡");
			}else{
				 button = new JButton("¼ö   Á¤");
				 List<Menu> menuList = UserController.searchMenuList(restaurant.getResId());
				 /**¸ÀÁý Á¤º¸ load*/
				 aMatchatKindTextField.setText(restaurant.getResKind());
				 aMatchatNameTextField.setText(restaurant.getResName());
				 aMatchatAddrTextField.setText(restaurant.getResAddr());
				 aMatchatPhoneTextField.setText(restaurant.getResPhone());
				 aMatchatDeliverTextField.setText(restaurant.getResDeliv());
				 
				 if(menuList ==null) {
					 
				 }else	 if(menuList.size() > 0) {
					 aMenuNameTextField1.setText(menuList.get(0).getName());
					 aMenuKcalTextField1.setText(menuList.get(0).getKcal()+"");
					 aMenuPriceTextField1.setText(menuList.get(0).getPrice()+"");
					 aMenuSourceTextField1.setText(menuList.get(0).getSource()+"");
					 aMenuDescTextField1.setText(menuList.get(0).getDesc()+"");
				 }else	 if(menuList.size() > 1) {
					 aMenuNameTextField2.setText(menuList.get(1).getName());
					 aMenuKcalTextField2.setText(menuList.get(1).getKcal()+"");
					 aMenuPriceTextField2.setText(menuList.get(1).getPrice()+"");
					 aMenuSourceTextField2.setText(menuList.get(1).getSource()+"");
					 aMenuDescTextField2.setText(menuList.get(1).getDesc()+"");
				 }else	 if(menuList.size() > 2) {
					 aMenuNameTextField3.setText(menuList.get(2).getName());
					 aMenuKcalTextField3.setText(menuList.get(2).getKcal()+"");
					 aMenuPriceTextField3.setText(menuList.get(2).getPrice()+"");
					 aMenuSourceTextField3.setText(menuList.get(2).getSource()+"");
					 aMenuDescTextField3.setText(menuList.get(2).getDesc()+"");
				 }
				 
				 	JButton btnMenuDelete1 = new JButton("DELETE");
				 	btnMenuDelete1.setHorizontalAlignment(SwingConstants.LEFT);
					btnMenuDelete1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 13));
					btnMenuDelete1.setBounds(341, 274, 80, 29);
					
					JButton btnMenuDelete2 = new JButton("DELETE");
					btnMenuDelete2.setHorizontalAlignment(SwingConstants.LEFT);
					btnMenuDelete2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 13));
					btnMenuDelete2.setBounds(341, 274, 80, 29);
					
					JButton btnMenuDelete3 = new JButton("DELETE");
					btnMenuDelete3.setHorizontalAlignment(SwingConstants.LEFT);
					btnMenuDelete3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 13));
					btnMenuDelete3.setBounds(341, 330, 80, 29);
			 	
				if(menuList != null) {
				 switch(menuList.size()) { 
				 	case 1:{
				 		contentPane.add(btnMenuDelete1);
				 		break;
				 	}
				 	case 2: {
				 		contentPane.add(btnMenuDelete1);
						contentPane.add(btnMenuDelete2);
						break;
				 	}
				 	case 3: {
				 		contentPane.add(btnMenuDelete1);
						contentPane.add(btnMenuDelete2);
						contentPane.add(btnMenuDelete3);
						break;
				 	}
				 	default : break;
				 }
				}
				btnMenuDelete1.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e) {
								AdminController.deleteMenu(restaurant.getResId(), menuList.get(0).getMenuId());
								menuTextFieldDelete(aMenuNameTextField1,aMenuKcalTextField1,aMenuPriceTextField1, aMenuSourceTextField1, aMenuSourceTextField1);
						};
				});
					
				btnMenuDelete2.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e) {
							AdminController.deleteMenu(restaurant.getResId(), menuList.get(1).getMenuId());
							menuTextFieldDelete(aMenuNameTextField2,aMenuKcalTextField2,aMenuPriceTextField2, aMenuSourceTextField2, aMenuSourceTextField2);
							};
					});
					
				btnMenuDelete3.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e) {
						AdminController.deleteMenu(restaurant.getResId(), menuList.get(2).getMenuId());
						menuTextFieldDelete(aMenuNameTextField3,aMenuKcalTextField3,aMenuPriceTextField3, aMenuSourceTextField3, aMenuSourceTextField3);
						};
					});
			}
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String labelText = e.getActionCommand(); //¹öÆ°ÀÇ ±Û¾¾
					if(labelText.equals("Ãß   °¡")) {
						
						String matKind = aMatchatKindTextField.getText();
						String matName = aMatchatNameTextField.getText();
						String matAddr = aMatchatAddrTextField.getText();
						String matPhone = aMatchatPhoneTextField.getText();
						String matDeliver = aMatchatDeliverTextField.getText();
						//System.out.println(matKind +matName+matAddr+matPhone+matDeliver+0);
						Restaurant restaurant = new Restaurant(matKind,matName,matAddr,matPhone,matDeliver,5);
						
						AdminController.insertStore(restaurant);
						
						String menuName = aMenuNameTextField1.getText();
						int menuPrice = Integer.parseInt(aMenuPriceTextField1.getText());
						String menuDesc = aMenuDescTextField1.getText();
						int menuKcal = Integer.parseInt(aMenuKcalTextField1.getText());
						String menuSource = aMenuSourceTextField1.getText();
						
						String menuName2 = aMenuNameTextField2.getText();
						int menuPrice2 = Integer.parseInt(aMenuPriceTextField2.getText());
						String menuDesc2 = aMenuDescTextField2.getText();
						int menuKcal2 = Integer.parseInt(aMenuKcalTextField2.getText());
						String menuSource2 = aMenuSourceTextField2.getText();
						
						String menuName3 = aMenuNameTextField3.getText();
						int menuPrice3 = Integer.parseInt(aMenuPriceTextField3.getText());
						String menuDesc3 = aMenuDescTextField3.getText();
						int menuKcal3 = Integer.parseInt(aMenuKcalTextField3.getText());
						String menuSource3 = aMenuSourceTextField3.getText();
						
						Menu menu = new Menu(menuName,menuPrice,menuDesc,menuKcal,menuSource);
						int StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu);
						
						Menu menu2 = new Menu(menuName2,menuPrice2,menuDesc2,menuKcal2,menuSource2);
						StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu2);
						
						Menu menu3 = new Menu(menuName3,menuPrice3,menuDesc3,menuKcal3,menuSource3);
						StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu3);
						
						JOptionPane.showMessageDialog(null, "Ãß°¡µÇ¾ú½À´Ï´Ù");
						
					}else if(labelText.equals("¼ö   Á¤")) {
						String matKind = aMatchatKindTextField.getText();
						String matName = aMatchatNameTextField.getText();
						String matAddr = aMatchatAddrTextField.getText();
						String matPhone = aMatchatPhoneTextField.getText();
						String matDeliver = aMatchatDeliverTextField.getText();
						
						Restaurant resDto = new Restaurant(restaurant.getResId(),matKind,matName,matAddr,matPhone,matDeliver,5);
						
						AdminController.updateStore(resDto);
						
						//JOptionPane.showMessageDialog(null, "¼öÁ¤µÇ¾ú½À´Ï´Ù");
						
						dispose();
						
					}
				}
			});
			button.setBounds(112, 375, 100, 40);
			panel.add(button);
			
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			 setVisible(true);//Ã¢º¸ÀÌ±â
		}

	public void menuTextFieldDelete(JTextField name ,JTextField kcal,JTextField price,JTextField source,JTextField desc) {
		name.setText("");
		kcal.setText("");
		price.setText("");
		source.setText("");
		desc.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}//»ý¼ºÀÚ³¡
}
