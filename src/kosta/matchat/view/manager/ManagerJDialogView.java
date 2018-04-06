package kosta.matchat.view.manager;

	import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
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
		private JTextField AMatchatKind;
		private JTextField AMatchatPhone;
		private JTextField AMatchatName;
		private JTextField AMenuName1;
		private JTextField AMatchatDeliver;
		private JTextField AMatchatAddr;
		private JTextField AMenuPrice1;
		private JTextField AMenuKcal1;
		private JTextField AMenuSp1;
		private JTextField AMenuSource1;
		private JTextField AMenuName2;
		private JTextField AMenuPrice2;
		private JTextField AMenuKcal2;
		private JTextField AMenuSp2;
		private JTextField AMenuSource2;
		private JTextField AMenuName3;
		private JTextField AMenuPrice3;
		private JTextField AMenuKcal3;
		private JTextField AMenuSp3;
		private JTextField AMenuSource3;


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
			
			JLabel label = new JLabel("\uB9DB\uC9D1 \uC815\uBCF4");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 19));
			label.setBounds(112, 1, 100, 40);
			panel.add(label);
			
			JLabel label_1 = new JLabel("\uB9DB\uC9D1 \uC5F0\uB77D\uCC98 : ");
			label_1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_1.setBounds(48, 109, 110, 20);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("\uB9DB\uC9D1 \uC885\uB958  : ");
			label_2.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_2.setBounds(48, 34, 110, 20);
			panel.add(label_2);
			
			AMatchatKind = new JTextField();
			AMatchatKind.setColumns(10);
			AMatchatKind.setBounds(150, 34, 135, 20);
			panel.add(AMatchatKind);
			
			JLabel label_3 = new JLabel("\uB9DB\uC9D1 \uC774\uB984  : ");
			label_3.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_3.setBounds(48, 59, 110, 20);
			panel.add(label_3);
			
			AMatchatPhone = new JTextField();
			AMatchatPhone.setColumns(10);
			AMatchatPhone.setBounds(150, 109, 136, 21);
			panel.add(AMatchatPhone);
			
			AMatchatName = new JTextField();
			AMatchatName.setColumns(10);
			AMatchatName.setBounds(150, 59, 135, 20);
			panel.add(AMatchatName);
			
			JLabel label_4 = new JLabel("\uBCC4\uC810  : ");
			label_4.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_4.setBounds(48, 160, 110, 20);
			panel.add(label_4);
			
			AMenuName1 = new JTextField();
			AMenuName1.setColumns(10);
			AMenuName1.setBounds(67, 190, 65, 20);
			panel.add(AMenuName1);
			
			AMatchatDeliver = new JTextField();
			AMatchatDeliver.setColumns(10);
			AMatchatDeliver.setBounds(150, 134, 135, 21);
			panel.add(AMatchatDeliver);
			
			JLabel label_5 = new JLabel("\uBC30\uB2EC \uC5EC\uBD80  : ");
			label_5.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_5.setBounds(48, 134, 110, 20);
			panel.add(label_5);
			
			JLabel label_6 = new JLabel("\uB9DB\uC9D1 \uC8FC\uC18C  : ");
			label_6.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 14));
			label_6.setBounds(48, 84, 110, 20);
			panel.add(label_6);
			
			AMatchatAddr = new JTextField();
			AMatchatAddr.setColumns(10);
			AMatchatAddr.setBounds(150, 84, 135, 21);
			panel.add(AMatchatAddr);
			
			JLabel label_7 = new JLabel("\uBA54\uB274\uC774\uB984 :");
			label_7.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_7.setBounds(13, 190, 50, 20);
			panel.add(label_7);
			
			JLabel label_8 = new JLabel("\uAC00 \uACA9 :");
			label_8.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_8.setBounds(134, 190, 39, 20);
			panel.add(label_8);
			
			AMenuPrice1 = new JTextField();
			AMenuPrice1.setColumns(10);
			AMenuPrice1.setBounds(172, 190, 44, 20);
			panel.add(AMenuPrice1);
			
			JLabel label_9 = new JLabel("\uCE7C\uB85C\uB9AC :");
			label_9.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_9.setBounds(223, 190, 50, 20);
			panel.add(label_9);
			
			AMenuKcal1 = new JTextField();
			AMenuKcal1.setColumns(10);
			AMenuKcal1.setBounds(265, 190, 55, 20);
			panel.add(AMenuKcal1);
			
			JLabel label_10 = new JLabel("\uBA54\uB274\uC124\uBA85 :");
			label_10.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_10.setBounds(13, 220, 50, 20);
			panel.add(label_10);
			
			AMenuSp1 = new JTextField();
			AMenuSp1.setColumns(10);
			AMenuSp1.setBounds(67, 220, 151, 20);
			panel.add(AMenuSp1);
			
			JLabel label_11 = new JLabel("¿ø»êÁö :");
			label_11.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_11.setBounds(223, 220, 50, 20);
			panel.add(label_11);
			
			AMenuSource1 = new JTextField();
			AMenuSource1.setColumns(10);
			AMenuSource1.setBounds(265, 220, 55, 20);
			panel.add(AMenuSource1);
			
			JLabel label_12 = new JLabel("New label");
			label_12.setIcon(new ImageIcon("C:\\Users\\Xiyeon\\Desktop\\Edu\\JavaWorkSpace\\GUI\\src\\\uC774\uBBF8\uC9C0.png"));
			label_12.setBounds(239, 369, 81, 52);
			panel.add(label_12);
			
			JLabel label_13 = new JLabel("¸Þ´ºÀÌ¸§ :");
			label_13.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_13.setBounds(13, 250, 50, 20);
			panel.add(label_13);
			
			AMenuName2 = new JTextField();
			AMenuName2.setColumns(10);
			AMenuName2.setBounds(67, 250, 65, 20);
			panel.add(AMenuName2);
			
			JLabel label_14 = new JLabel("°¡ °Ý :");
			label_14.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_14.setBounds(134, 250, 39, 20);
			panel.add(label_14);
			
			AMenuPrice2 = new JTextField();
			AMenuPrice2.setColumns(10);
			AMenuPrice2.setBounds(172, 250, 44, 20);
			panel.add(AMenuPrice2);
			
			JLabel label_15 = new JLabel("Ä®·Î¸® :");
			label_15.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_15.setBounds(223, 250, 50, 20);
			panel.add(label_15);
			
			AMenuKcal2 = new JTextField();
			AMenuKcal2.setColumns(10);
			AMenuKcal2.setBounds(265, 250, 55, 20);
			panel.add(AMenuKcal2);
			
			JLabel label_16 = new JLabel("¸Þ´º¼³¸í :");
			label_16.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_16.setBounds(13, 282, 50, 20);
			panel.add(label_16);
			
			AMenuSp2 = new JTextField();
			AMenuSp2.setColumns(10);
			AMenuSp2.setBounds(67, 282, 151, 20);
			panel.add(AMenuSp2);
			
			JLabel label_17 = new JLabel("¿ø»êÁö :");
			label_17.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_17.setBounds(223, 282, 50, 20);
			panel.add(label_17);
			
			AMenuSource2 = new JTextField();
			AMenuSource2.setColumns(10);
			AMenuSource2.setBounds(265, 280, 55, 20);
			panel.add(AMenuSource2);
			
			JLabel label_18 = new JLabel("¸Þ´ºÀÌ¸§ :");
			label_18.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_18.setBounds(13, 312, 50, 20);
			panel.add(label_18);
			
			AMenuName3 = new JTextField();
			AMenuName3.setColumns(10);
			AMenuName3.setBounds(67, 312, 65, 20);
			panel.add(AMenuName3);
			
			JLabel label_19 = new JLabel("°¡ °Ý :");
			label_19.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_19.setBounds(134, 312, 39, 20);
			panel.add(label_19);
			
			AMenuPrice3 = new JTextField();
			AMenuPrice3.setColumns(10);
			AMenuPrice3.setBounds(172, 312, 44, 20);
			panel.add(AMenuPrice3);
			
			JLabel label_20 = new JLabel("Ä®·Î¸® :");
			label_20.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_20.setBounds(223, 312, 50, 20);
			panel.add(label_20);
			
			AMenuKcal3 = new JTextField();
			AMenuKcal3.setColumns(10);
			AMenuKcal3.setBounds(265, 312, 55, 20);
			panel.add(AMenuKcal3);
			
			JLabel label_21 = new JLabel("¸Þ´º¼³¸í :");
			label_21.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_21.setBounds(13, 345, 50, 20);
			panel.add(label_21);
			
			AMenuSp3 = new JTextField();
			AMenuSp3.setColumns(10);
			AMenuSp3.setBounds(67, 345, 151, 20);
			panel.add(AMenuSp3);
			
			JLabel label_22 = new JLabel("¿ø»êÁö :");
			label_22.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 10));
			label_22.setBounds(223, 345, 50, 20);
			panel.add(label_22);
			
			AMenuSource3 = new JTextField();
			AMenuSource3.setColumns(10);
			AMenuSource3.setBounds(265, 343, 55, 20);
			panel.add(AMenuSource3);
			
			//JButton button = new JButton("\uCD94  \uAC00");
			
			
			JButton button;
			if(string.equals("Ãß°¡")) {
				 button = new JButton("Ãß   °¡");
			}else{
				 button = new JButton("¼ö   Á¤");
				 List<Menu> menuList = UserController.searchMenuList(restaurant.getResId());
				 /**¸ÀÁý Á¤º¸ load*/
				 AMatchatKind.setText(restaurant.getResKind());
				 AMatchatName.setText(restaurant.getResName());
				 AMatchatAddr.setText(restaurant.getResAddr());
				 AMatchatPhone.setText(restaurant.getResPhone());
				 AMatchatDeliver.setText(restaurant.getResDeliv());
				 
				 if(menuList ==null) {
					 
				 }else	 if(menuList.size() > 0) {
					 AMenuName1.setText(menuList.get(0).getName());
					 AMenuKcal1.setText(menuList.get(0).getKcal()+"");
					 AMenuPrice1.setText(menuList.get(0).getPrice()+"");
					 AMenuSource1.setText(menuList.get(0).getSource()+"");
					 AMenuSp1.setText(menuList.get(0).getDesc()+"");
				 }else	 if(menuList.size() > 1) {
					 AMenuName2.setText(menuList.get(1).getName());
					 AMenuKcal2.setText(menuList.get(1).getKcal()+"");
					 AMenuPrice2.setText(menuList.get(1).getPrice()+"");
					 AMenuSource2.setText(menuList.get(1).getSource()+"");
					 AMenuSp2.setText(menuList.get(1).getDesc()+"");
				 }else	 if(menuList.size() > 2) {
					 AMenuName3.setText(menuList.get(2).getName());
					 AMenuKcal3.setText(menuList.get(2).getKcal()+"");
					 AMenuPrice3.setText(menuList.get(2).getPrice()+"");
					 AMenuSource3.setText(menuList.get(2).getSource()+"");
					 AMenuSp3.setText(menuList.get(2).getDesc()+"");
				 }
				 
				 JButton btnMenuDelete1 = new JButton("DELETE");
					btnMenuDelete1.setHorizontalAlignment(SwingConstants.LEFT);
					btnMenuDelete1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 13));
					btnMenuDelete1.setBounds(341, 210, 80, 29);
					
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
								menuTextFieldDelete(AMenuName1, AMenuKcal1, AMenuPrice1, AMenuSource1, AMenuSp1);
						};
				});
					
				btnMenuDelete2.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e) {
							AdminController.deleteMenu(restaurant.getResId(), menuList.get(1).getMenuId());
							menuTextFieldDelete(AMenuName2, AMenuKcal2, AMenuPrice2, AMenuSource2, AMenuSp2);
						};
					});
					
				btnMenuDelete3.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent e) {
						AdminController.deleteMenu(restaurant.getResId(), menuList.get(2).getMenuId());
						menuTextFieldDelete(AMenuName3, AMenuKcal3, AMenuPrice3, AMenuSource3, AMenuSp3);
						};
					});
	
			}
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String labelText = e.getActionCommand(); //¹öÆ°ÀÇ ±Û¾¾
					if(labelText.equals("Ãß   °¡")) {
						
						String matKind = AMatchatKind.getText();
						String matName = AMatchatName.getText();
						String matAddr = AMatchatAddr.getText();
						String matPhone = AMatchatPhone.getText();
						String matDeliver = AMatchatDeliver.getText();
						//System.out.println(matKind +matName+matAddr+matPhone+matDeliver+0);
						Restaurant restaurant = new Restaurant(matKind,matName,matAddr,matPhone,matDeliver,5);
						
						AdminController.insertStore(restaurant);
						
						
						String menuName = AMenuName1.getText();
						int menuPrice = Integer.parseInt(AMenuPrice1.getText());
						String menuDesc = AMenuSp1.getText();
						int menuKcal = Integer.parseInt(AMenuKcal1.getText());
						String menuSource = AMenuSource1.getText();
						
						String menuName2 = AMenuName2.getText();
						int menuPrice2 = Integer.parseInt(AMenuPrice2.getText());
						String menuDesc2 = AMenuSp2.getText();
						int menuKcal2 = Integer.parseInt(AMenuKcal2.getText());
						String menuSource2 = AMenuSource2.getText();
						
						String menuName3 = AMenuName3.getText();
						int menuPrice3 = Integer.parseInt(AMenuPrice3.getText());
						String menuDesc3 = AMenuSp3.getText();
						int menuKcal3 = Integer.parseInt(AMenuKcal3.getText());
						String menuSource3 = AMenuSource3.getText();
						
						Menu menu = new Menu(menuName,menuPrice,menuDesc,menuKcal,menuSource);
						int StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu);
						
						Menu menu2 = new Menu(menuName2,menuPrice2,menuDesc2,menuKcal2,menuSource2);
						StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu2);
						
						Menu menu3 = new Menu(menuName3,menuPrice3,menuDesc3,menuKcal3,menuSource3);
						StoreId = AdminController.SearchStoreId();
						AdminController.insertMenu(StoreId, menu3);
						
						 
					}else if(labelText.equals("¼ö   Á¤")) {
						String matKind = AMatchatKind.getText();
						String matName = AMatchatName.getText();
						String matAddr = AMatchatAddr.getText();
						String matPhone = AMatchatPhone.getText();
						String matDeliver = AMatchatDeliver.getText();
						
						Restaurant resDto = new Restaurant(restaurant.getResId(),matKind,matName,matAddr,matPhone,matDeliver,5);
						
						AdminController.updateStore(resDto);
						
						dispose();
						
					}else if(labelText.equals("Ãë¼Ò")) {
						dispose();//´ÙÀÌ¾î·Î±× Ã¢ ´Ý±â
					}
				}
			});
			button.setBounds(112, 375, 100, 40);
			panel.add(button);
			
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			 setVisible(true);//Ã¢º¸ÀÌ±â
		}

	public void menuTextFieldDelete(JTextField aMenuName32,JTextField aMenuKcal22,JTextField aMenuPrice22,JTextField aMenuSource22,JTextField aMenuSp22) {
		aMenuName32.setText("");
		aMenuKcal22.setText("");
		aMenuPrice22.setText("");
		aMenuSource22.setText("");
		aMenuSp22.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}//»ý¼ºÀÚ³¡
}
