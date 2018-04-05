package kosta.matchat.view.user;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kosta.matchat.view.start.LoginView;

public class StoreInformation extends JPanel {
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_4;
   private JTextField textField_8;
   private JTextField textField_10;
   private JTextField textField_3;
   private JTextField textField_5;
   private JTextField textField_9;
   private JTextField textField_6;
   private JTextField textField_7;
   private JTextField textField_11;
   private JTextField textField_12;
   private JTextField textField_13;
   private JTextField textField_14;
   private JTextField textField_15;
   private JTextField textField_16;
   private JTextField textField_17;
   private JTextField textField_18;
   private JTextField textField_19;
   private JTextField textField_20;

   /**
    * Create the panel.
    */
   public StoreInformation() {
      //setBackground(UIManager.getColor("Button.background"));
      setBounds(0, 0, 394, 600);
      setLayout(null);
      setBackground(new Color(135, 206, 250));
      
      
      JLabel label = new JLabel("¸ÀÁı Á¤º¸");
      label.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.BOLD, 17));
      label.setBounds(159, 5, 77, 32);
      add(label);
      
      JLabel lblNewLabel = new JLabel("\uB9DB\uC9D1\uC885\uB958");
      lblNewLabel.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel.setBounds(14, 53, 56, 15);
      add(lblNewLabel);
      
      JLabel lblNewLabel_5 = new JLabel("\uB9DB\uC9D1\uC774\uB984");
      lblNewLabel_5.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_5.setBounds(198, 53, 54, 15);
      add(lblNewLabel_5);
      
      JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
      lblNewLabel_2.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_2.setBounds(14, 84, 31, 15);
      add(lblNewLabel_2);
      
      JLabel lblNewLabel_1 = new JLabel("\uC5F0\uB77D\uCC98");
      lblNewLabel_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_1.setBounds(14, 115, 45, 15);
      add(lblNewLabel_1);
      
      JLabel lblNewLabel_4 = new JLabel("\uBC30\uB2EC\uC5EC\uBD80");
      lblNewLabel_4.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_4.setBounds(14, 145, 56, 15);
      add(lblNewLabel_4);
      
      JLabel lblNewLabel_6 = new JLabel("\uBCC4\uC810");
      lblNewLabel_6.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_6.setBounds(198, 145, 38, 15);
      add(lblNewLabel_6);
      
      JLabel lblNewLabel_3 = new JLabel("\uBA54\uB274\uC774\uB984");
      lblNewLabel_3.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_3.setBounds(14, 204, 56, 15);
      add(lblNewLabel_3);
      
      JLabel lblNewLabel_7 = new JLabel("\uCE7C\uB85C\uB9AC");
      lblNewLabel_7.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_7.setBounds(14, 254, 50, 15);
      add(lblNewLabel_7);
      
      JLabel lblNewLabel_8 = new JLabel("\uC124\uBA85");
      lblNewLabel_8.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_8.setBounds(14, 229, 45, 15);
      add(lblNewLabel_8);
      
      JLabel lblNewLabel_9 = new JLabel("\uC6D0\uC7AC\uB8CC");
      lblNewLabel_9.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_9.setBounds(198, 254, 50, 15);
      add(lblNewLabel_9);
      
      JLabel lblNewLabel_10 = new JLabel("\uAC00\uACA9");
      lblNewLabel_10.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      lblNewLabel_10.setBounds(198, 204, 50, 15);
      add(lblNewLabel_10);
      
      textField = new JTextField();
      textField.setBounds(64, 49, 123, 21);
      add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_1.setText("\uACBD\uAE30 \uC131\uB0A8\uC2DC \uBD84\uB2F9\uAD6C \uB300\uC655\uD310\uAD50\uB85C 660,\uC720\uC2A4\uD398\uC774\uC2A41 A\uB3D9 \uC9C0\uD5581\uCE35 128-2\uD638");
      textField_1.setColumns(10);
      textField_1.setBounds(64, 80, 309, 21);
      add(textField_1);
      
      textField_2 = new JTextField();
      textField_2.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_2.setText("\uC720\uB178\uCD94\uBCF4 \uD604\uB300\uBC31\uD654\uC810\uD310\uAD50\uC810");
      textField_2.setColumns(10);
      textField_2.setBounds(250, 50, 123, 21);
      add(textField_2);
      
      textField_4 = new JTextField();
      textField_4.setColumns(10);
      textField_4.setBounds(64, 111, 123, 21);
      add(textField_4);
      
      textField_8 = new JTextField();
      textField_8.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_8.setText("\uC77C\uBCF8\uC2DD \uAC04\uC7A5\uC5D0 \uC591\uD30C\uB97C \uC870\uB824\uB0B8 \uC18C\uC2A4\uB97C \uC5B9\uC740 \uAC00\uCE20\uB3D9");
      textField_8.setColumns(10);
      textField_8.setBounds(64, 226, 309, 21);
      add(textField_8);
      
      textField_10 = new JTextField();
      textField_10.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_10.setText("\uC120\uC9C0: \uAD6D\uB0B4\uC0B0, \uB3FC\uC9C0\uACE0\uAE30: \uAD6D\uB0B4\uC0B0");
      textField_10.setColumns(10);
      textField_10.setBounds(250, 251, 123, 21);
      add(textField_10);
      
      JButton btnNewButton = new JButton("\uC990\uACA8\uCC3E\uAE30");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            JOptionPane.showConfirmDialog(btnNewButton, "ì¶”ê??•˜?‹œê² ìŠµ?‹ˆê¹??");
         }
      });
      btnNewButton.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.setBounds(14, 477, 173, 23);
      add(btnNewButton);
      
      JButton button = new JButton("\uBCC4\uC810\uC8FC\uAE30");
      button.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            Dialog frame =new FavoriteDialog();
            frame.setVisible(true);
              
         }
      });
      
      button.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      button.setBackground(Color.WHITE);
      button.setBounds(199, 477, 174, 23);
      add(button);
      
      JButton button_1 = new JButton("\uC774\uC804\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
      button_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      button_1.setBackground(Color.WHITE);
      button_1.setBounds(114, 568, 167, 23);
      add(button_1);
      
      JLabel label_12 = new JLabel("");
      label_12.setIcon(new ImageIcon("C:\\Edu\\JavaWorkSpace\\GUI\\src\\\uC774\uBBF8\uC9C0\uB77C\uBCA8.png"));
      label_12.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 15));
      label_12.setBounds(296, 539, 77, 52);
      add(label_12);
      
      textField_3 = new JTextField();
      textField_3.setColumns(10);
      textField_3.setBounds(64, 141, 123, 21);
      add(textField_3);
      
      textField_5 = new JTextField();
      textField_5.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_5.setText("\uBC18\uBC18\uB77C\uC774\uC2A4(\uCE74\uB808,\uD558\uC57C\uC2DC)");
      textField_5.setColumns(10);
      textField_5.setBounds(64, 200, 123, 21);
      add(textField_5);
      
      textField_9 = new JTextField();
      textField_9.setColumns(10);
      textField_9.setBounds(64, 251, 123, 21);
      add(textField_9);
      
      textField_6 = new JTextField();
      textField_6.setColumns(10);
      textField_6.setBounds(250, 141, 123, 21);
      add(textField_6);
      
      textField_7 = new JTextField();
      textField_7.setColumns(10);
      textField_7.setBounds(250, 200, 123, 21);
      add(textField_7);
      
      JLabel label_1 = new JLabel("\uBA54\uB274\uC774\uB984");
      label_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_1.setBounds(14, 295, 56, 15);
      add(label_1);
      
      JLabel label_2 = new JLabel("\uC124\uBA85");
      label_2.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_2.setBounds(14, 320, 45, 15);
      add(label_2);
      
      textField_11 = new JTextField();
      textField_11.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_11.setColumns(10);
      textField_11.setBounds(64, 317, 309, 21);
      add(textField_11);
      
      textField_12 = new JTextField();
      textField_12.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_12.setColumns(10);
      textField_12.setBounds(64, 291, 123, 21);
      add(textField_12);
      
      JLabel label_3 = new JLabel("\uCE7C\uB85C\uB9AC");
      label_3.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_3.setBounds(14, 345, 50, 15);
      add(label_3);
      
      textField_13 = new JTextField();
      textField_13.setColumns(10);
      textField_13.setBounds(64, 342, 123, 21);
      add(textField_13);
      
      textField_14 = new JTextField();
      textField_14.setColumns(10);
      textField_14.setBounds(250, 291, 123, 21);
      add(textField_14);
      
      textField_15 = new JTextField();
      textField_15.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_15.setColumns(10);
      textField_15.setBounds(250, 342, 123, 21);
      add(textField_15);
      
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
      
      textField_16 = new JTextField();
      textField_16.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_16.setColumns(10);
      textField_16.setBounds(64, 410, 309, 21);
      add(textField_16);
      
      textField_17 = new JTextField();
      textField_17.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_17.setColumns(10);
      textField_17.setBounds(64, 384, 123, 21);
      add(textField_17);
      
      JLabel label_8 = new JLabel("\uCE7C\uB85C\uB9AC");
      label_8.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_8.setBounds(14, 438, 50, 15);
      add(label_8);
      
      textField_18 = new JTextField();
      textField_18.setColumns(10);
      textField_18.setBounds(64, 435, 123, 21);
      add(textField_18);
      
      textField_19 = new JTextField();
      textField_19.setColumns(10);
      textField_19.setBounds(250, 384, 123, 21);
      add(textField_19);
      
      textField_20 = new JTextField();
      textField_20.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 9));
      textField_20.setColumns(10);
      textField_20.setBounds(250, 435, 123, 21);
      add(textField_20);
      
      JLabel label_9 = new JLabel("\uC6D0\uC7AC\uB8CC");
      label_9.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_9.setBounds(198, 438, 50, 15);
      add(label_9);
      
      JLabel label_10 = new JLabel("\uAC00\uACA9");
      label_10.setFont(new Font("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Úµï¿?", Font.PLAIN, 12));
      label_10.setBounds(198, 388, 50, 15);
      add(label_10);
      
      JLabel label_11 = new JLabel("");
      label_11.setIcon(new ImageIcon("/Users/jieunpark/eclipse-workspace/Project/bin/?„‹?…µ?„Œ?…¥?†«?„‹?…¡?„‹?…µ?„?…©?†«.png"));
      label_11.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            LoginView.contentPane.add(new search());
            LoginView.cards.next(LoginView.contentPane);
         }
      });
      label_11.setBounds(5, 5, 54, 35);
      add(label_11);
   
   }
}