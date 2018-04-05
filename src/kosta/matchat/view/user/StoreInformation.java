package kosta.matchat.view.user;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kosta.matchat.controller.UserController;
import kosta.matchat.model.dto.Menu;
import kosta.matchat.model.dto.Restaurant;
import kosta.matchat.view.start.LoginView;

public class StoreInformation extends JPanel {
   private JTextField resKind;
   private JTextField restAddr;
   private JTextField restName;
   private JTextField restPhone;
   private JTextField Menu1Exa;
   private JTextField Menu1Stuff;
   private JTextField restDeliver;
   private JTextField Menu1Name;
   private JTextField Menu1Kcal;
   private JTextField restStar;
   private JTextField Menu1Price;
   private JTextField Menu2Exa;
   private JTextField Menu2Name;
   private JTextField Menu2Kcal;
   private JTextField Menu2Price;
   private JTextField Menu2Stuff;
   private JTextField Menu3Exa;
   private JTextField Menu3Name;
   private JTextField Menu3Kcal;
   private JTextField Menu3Price;
   private JTextField Menu3Stuff;
   int resNum = 0;
   /**
    * Create the panel.
    */
   public StoreInformation(String name) {
	   Restaurant res=null;
	   List<Menu> menu =null;
	   
	   List<Restaurant> user = UserController.searchByStoreName(name);
	   if(user != null) {
		   resNum= user.get(0).getResId();
		    res = user.get(0);
		   int resid = res.getResId();
		   menu =  UserController.searchMenuList(resid);
		   
	   }
	   
      //setBackground(UIManager.getColor("Button.background"));
      setBounds(0, 0, 394, 600);
      setLayout(null);
      setBackground(new Color(135, 206, 250));
      
      
      JLabel lbresinfo = new JLabel("¸ÀÁý Á¤º¸");
      lbresinfo.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.BOLD, 17));
      lbresinfo.setBounds(159, 5, 77, 32);
      add(lbresinfo);
     
      
      JLabel lbreskind = new JLabel("\uB9DB\uC9D1\uC885\uB958");
      lbreskind.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbreskind.setBounds(14, 53, 56, 15);
      add(lbreskind);
      
      JLabel lbresname = new JLabel("\uB9DB\uC9D1\uC774\uB984");
      lbresname.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbresname.setBounds(198, 53, 54, 15);
      add(lbresname);
      
      JLabel lbresaddr = new JLabel("\uC8FC\uC18C");
      lbresaddr.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbresaddr.setBounds(14, 84, 31, 15);
      add(lbresaddr);
      
      JLabel lbrescontact = new JLabel("\uC5F0\uB77D\uCC98");
      lbrescontact.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbrescontact.setBounds(14, 115, 45, 15);
      add(lbrescontact);
      
      JLabel lbresdeliver = new JLabel("\uBC30\uB2EC\uC5EC\uBD80");
      lbresdeliver.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbresdeliver.setBounds(14, 145, 56, 15);
      add(lbresdeliver);
      
      JLabel lbresstar = new JLabel("\uBCC4\uC810");
      lbresstar.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbresstar.setBounds(198, 145, 38, 15);
      add(lbresstar);
      
      JLabel lbMenuName = new JLabel("\uBA54\uB274\uC774\uB984");
      lbMenuName.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbMenuName.setBounds(14, 204, 56, 15);
      add(lbMenuName);
      
      JLabel lbMenuKcal = new JLabel("\uCE7C\uB85C\uB9AC");
      lbMenuKcal.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbMenuKcal.setBounds(14, 254, 50, 15);
      add(lbMenuKcal);
      
      JLabel lbMenuExa = new JLabel("\uC124\uBA85");
      lbMenuExa.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbMenuExa.setBounds(14, 229, 45, 15);
      add(lbMenuExa);
      
      JLabel lbMenuStuff = new JLabel("\uC6D0\uC7AC\uB8CC");
      lbMenuStuff.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbMenuStuff.setBounds(198, 254, 50, 15);
      add(lbMenuStuff);
      
      JLabel lbMenuPrice = new JLabel("\uAC00\uACA9");
      lbMenuPrice.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      lbMenuPrice.setBounds(198, 204, 50, 15);
      add(lbMenuPrice);
      
      resKind = new JTextField();
      resKind.setEditable(false);
      resKind.setBounds(64, 49, 123, 21);
      add(resKind);
      resKind.setColumns(10);
      
      restAddr = new JTextField();
      restAddr.setEditable(false);
      restAddr.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      restAddr.setColumns(10);
      restAddr.setBounds(64, 80, 309, 21);
      add(restAddr);
      
      restName = new JTextField();
      restName.setEditable(false);
      restName.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      restName.setColumns(10);
      restName.setBounds(250, 50, 123, 21);
      add(restName);
      
      restPhone = new JTextField();
      restPhone.setEditable(false);
      restPhone.setColumns(10);
      restPhone.setBounds(64, 111, 123, 21);
      add(restPhone);
      
      Menu1Exa = new JTextField();
      Menu1Exa.setEditable(false);
      Menu1Exa.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      Menu1Exa.setColumns(10);
      Menu1Exa.setBounds(64, 226, 309, 21);
      add(Menu1Exa);
      
      Menu1Stuff = new JTextField();
      Menu1Stuff.setEditable(false);
      Menu1Stuff.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      Menu1Stuff.setColumns(10);
      Menu1Stuff.setBounds(250, 251, 123, 21);
      add(Menu1Stuff);
      
      JButton btnNewButton = new JButton("\uC990\uACA8\uCC3E\uAE30");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            JOptionPane.showConfirmDialog(btnNewButton, "ì¶”ê??•˜?‹œê² ìŠµ?‹ˆê¹??");
         }
      });
      btnNewButton.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.setBounds(14, 477, 173, 23);
      add(btnNewButton);
      
      JButton BtnGetStar = new JButton("\uBCC4\uC810\uC8FC\uAE30");
      BtnGetStar.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            Dialog frame =new FavoriteDialog(resNum);
            frame.setVisible(true);
              
         }
      });
      
      BtnGetStar.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      BtnGetStar.setBackground(Color.WHITE);
      BtnGetStar.setBounds(199, 477, 174, 23);
      add(BtnGetStar);
      
      JButton button_1 = new JButton("\uC774\uC804\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
      button_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		LoginView.contentPane.add(new UserKindSerachView());
      		LoginView.cards.next(LoginView.contentPane);
      	}
      });
      button_1.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      button_1.setBackground(Color.WHITE);
      button_1.setBounds(114, 568, 167, 23);
      add(button_1);
      
      JLabel label_12 = new JLabel("");
      label_12.setIcon(new ImageIcon("C:\\Edu\\JavaWorkSpace\\GUI\\src\\\uC774\uBBF8\uC9C0\uB77C\uBCA8.png"));
      label_12.setFont(new Font("³ª´®°íµñÄÚµù", Font.PLAIN, 12));
      label_12.setBounds(296, 539, 77, 52);
      add(label_12);
      
      restDeliver = new JTextField();
      restDeliver.setEditable(false);
      restDeliver.setColumns(10);
      restDeliver.setBounds(64, 141, 123, 21);
      add(restDeliver);
      
      Menu1Name = new JTextField();
      Menu1Name.setEditable(false);
      Menu1Name.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu1Name.setColumns(10);
      Menu1Name.setBounds(64, 200, 123, 21);
      add(Menu1Name);
      
      Menu1Kcal = new JTextField();
      Menu1Kcal.setEditable(false);
      Menu1Kcal.setColumns(10);
      Menu1Kcal.setBounds(64, 251, 123, 21);
      add(Menu1Kcal);
      
      restStar = new JTextField();
      restStar.setEditable(false);
      restStar.setColumns(10);
      restStar.setBounds(250, 141, 123, 21);
      add(restStar);
      
      Menu1Price = new JTextField();
      Menu1Price.setEditable(false);
      Menu1Price.setColumns(10);
      Menu1Price.setBounds(250, 200, 123, 21);
      add(Menu1Price);
      
      JLabel label_1 = new JLabel("\uBA54\uB274\uC774\uB984");
      label_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_1.setBounds(14, 295, 56, 15);
      add(label_1);
      
      JLabel label_2 = new JLabel("\uC124\uBA85");
      label_2.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_2.setBounds(14, 320, 45, 15);
      add(label_2);
      
      Menu2Exa = new JTextField();
      Menu2Exa.setEditable(false);
      Menu2Exa.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu2Exa.setColumns(10);
      Menu2Exa.setBounds(64, 317, 309, 21);
      add(Menu2Exa);
      
      Menu2Name = new JTextField();
      Menu2Name.setEditable(false);
      Menu2Name.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu2Name.setColumns(10);
      Menu2Name.setBounds(64, 291, 123, 21);
      add(Menu2Name);
      
      JLabel label_3 = new JLabel("\uCE7C\uB85C\uB9AC");
      label_3.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_3.setBounds(14, 345, 50, 15);
      add(label_3);
      
      Menu2Kcal = new JTextField();
      Menu2Kcal.setEditable(false);
      Menu2Kcal.setColumns(10);
      Menu2Kcal.setBounds(64, 342, 123, 21);
      add(Menu2Kcal);
      
      Menu2Price = new JTextField();
      Menu2Price.setEnabled(false);
      Menu2Price.setColumns(10);
      Menu2Price.setBounds(250, 291, 123, 21);
      add(Menu2Price);
      
      Menu2Stuff = new JTextField();
      Menu2Stuff.setEditable(false);
      Menu2Stuff.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu2Stuff.setColumns(10);
      Menu2Stuff.setBounds(250, 342, 123, 21);
      add(Menu2Stuff);
      
      JLabel label_4 = new JLabel("\uC6D0\uC7AC\uB8CC");
      label_4.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_4.setBounds(198, 345, 50, 15);
      add(label_4);
      
      JLabel label_5 = new JLabel("\uAC00\uACA9");
      label_5.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_5.setBounds(198, 295, 50, 15);
      add(label_5);
      
      JLabel label_6 = new JLabel("\uBA54\uB274\uC774\uB984");
      label_6.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_6.setBounds(14, 388, 56, 15);
      add(label_6);
      
      JLabel label_7 = new JLabel("\uC124\uBA85");
      label_7.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_7.setBounds(14, 413, 45, 15);
      add(label_7);
      
      Menu3Exa = new JTextField();
      Menu3Exa.setEditable(false);
      Menu3Exa.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu3Exa.setColumns(10);
      Menu3Exa.setBounds(64, 410, 309, 21);
      add(Menu3Exa);
      
      Menu3Name = new JTextField();
      Menu3Name.setEditable(false);
      Menu3Name.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu3Name.setColumns(10);
      Menu3Name.setBounds(64, 384, 123, 21);
      add(Menu3Name);
      
      JLabel label_8 = new JLabel("\uCE7C\uB85C\uB9AC");
      label_8.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_8.setBounds(14, 438, 50, 15);
      add(label_8);
      
      Menu3Kcal = new JTextField();
      Menu3Kcal.setEditable(false);
      Menu3Kcal.setColumns(10);
      Menu3Kcal.setBounds(64, 435, 123, 21);
      add(Menu3Kcal);
      
      Menu3Price = new JTextField();
      Menu3Price.setEnabled(false);
      Menu3Price.setColumns(10);
      Menu3Price.setBounds(250, 384, 123, 21);
      add(Menu3Price);
      
      Menu3Stuff = new JTextField();
      Menu3Stuff.setEditable(false);
      Menu3Stuff.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      Menu3Stuff.setColumns(10);
      Menu3Stuff.setBounds(250, 435, 123, 21);
      add(Menu3Stuff);
      
      JLabel label_9 = new JLabel("\uC6D0\uC7AC\uB8CC");
      label_9.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_9.setBounds(198, 438, 50, 15);
      add(label_9);
      
      JLabel label_10 = new JLabel("\uAC00\uACA9");
      label_10.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_10.setBounds(198, 388, 50, 15);
      add(label_10);
      
      JLabel label_11 = new JLabel("");
      label_11.setIcon(new ImageIcon(StoreInformation.class.getResource("/images/previousIcon.png")));
      label_11.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            LoginView.contentPane.add(new UserKindSerachView());
            LoginView.cards.next(LoginView.contentPane);
         }
      });
      label_11.setBounds(5, 5, 54, 35);
      add(label_11);
      
      
	   resKind.setText(res.getResKind());
	   restName.setText(res.getResName());
	   restAddr.setText(res.getResAddr());
	   restPhone.setText(res.getResPhone());
	   restDeliver.setText(res.getResDeliv());
	   restStar.setText(Integer.toString(res.getResSp()));
	   
	   Menu1Name.setText(menu.get(0).getName());
	   Menu1Price.setText(Integer.toString(menu.get(0).getPrice()));
	   Menu1Kcal.setText(Integer.toString(menu.get(0).getKcal()));
	   Menu1Exa.setText(menu.get(0).getDesc());
	   Menu1Stuff.setText(menu.get(0).getSource());
	   
	   Menu2Name.setText(menu.get(1).getName());
	   Menu2Price.setText(Integer.toString(menu.get(1).getPrice()));
	   Menu2Kcal.setText(Integer.toString(menu.get(1).getKcal()));
	   Menu2Exa.setText(menu.get(1).getDesc());
	   Menu2Stuff.setText(menu.get(1).getSource());
	   
	   Menu3Name.setText(menu.get(2).getName());
	   Menu3Price.setText(Integer.toString(menu.get(2).getPrice()));
	   Menu3Kcal.setText(Integer.toString(menu.get(2).getKcal()));
	   Menu3Exa.setText(menu.get(2).getDesc());
	   Menu3Stuff.setText(menu.get(2).getSource());
   }
}