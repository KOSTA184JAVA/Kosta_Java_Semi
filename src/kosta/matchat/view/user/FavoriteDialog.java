package kosta.matchat.view.user;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import kosta.matchat.controller.UserController;
import kosta.matchat.view.start.LoginView;

public class FavoriteDialog extends JDialog{
   public FavoriteDialog(int resNum) {
      setTitle("별점추가");
      getContentPane().setLayout(null);
      
      JRadioButton radioBtn3 = new JRadioButton("3");
      radioBtn3.setBounds(85, 56, 20, 20);
      getContentPane().add(radioBtn3);
      
      
      JRadioButton radioBtn1 = new JRadioButton("1");
      radioBtn1.setBounds(23, 56, 20, 20);
      getContentPane().add(radioBtn1);
      
      JRadioButton radioBtn2 = new JRadioButton("2");
      radioBtn2.setBounds(55, 56, 20, 20);
      getContentPane().add(radioBtn2);
      
      JRadioButton radioBtn4 = new JRadioButton("4");
      radioBtn4.setBounds(115, 56, 20, 20);
      getContentPane().add(radioBtn4);
      
      JRadioButton radioBtn5 = new JRadioButton("5");
      radioBtn5.setBounds(145, 56, 20, 20);
      getContentPane().add(radioBtn5);
      
      ButtonGroup g = new ButtonGroup();
      g.add(radioBtn1);
      g.add(radioBtn2);
      g.add(radioBtn3);
      g.add(radioBtn4);
      g.add(radioBtn5);
      
      JButton btnNewButton = new JButton("확  인");
      btnNewButton.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		int star =0;
      		int re = JOptionPane.showConfirmDialog(LoginView.contentPane, "점수를 주시곘습니까?");
      		if(re==0) {
      		if(radioBtn1.isSelected()) {
      			UserController.insertStarPoint(resNum, 1);
      			star=1;
      		}
      		if(radioBtn2.isSelected()) {
      			UserController.insertStarPoint(resNum, 2);
      			star=2;
      		}
      		if(radioBtn3.isSelected()) {
      			UserController.insertStarPoint(resNum, 3);
      			star=3;
      		}
      		if(radioBtn4.isSelected()) {
      			UserController.insertStarPoint(resNum, 4);
      			star=4;
      		}
      		if(radioBtn5.isSelected()) {
      			UserController.insertStarPoint(resNum, 5);
      			star=5;
      		}
      		dispose();
      		}else { dispose();}
      		
      	}
      });
      btnNewButton.setBounds(46, 124, 105, 38);
      getContentPane().add(btnNewButton);
      
      JLabel lblNewLabel = new JLabel("별점을 입력해주세요");
      lblNewLabel.setFont(new Font("나눔고딕코딩", Font.PLAIN, 17));
      lblNewLabel.setBounds(23, 10, 168, 40);
      getContentPane().add(lblNewLabel);
      
      JLabel label = new JLabel("1점");
      label.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
      label.setBounds(25, 82, 18, 15);
      getContentPane().add(label);
      
      JLabel label_1 = new JLabel("2점");
      label_1.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
      label_1.setBounds(58, 82, 18, 15);
      getContentPane().add(label_1);
      
      JLabel label_2 = new JLabel("3점");
      label_2.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
      label_2.setBounds(87, 82, 18, 15);
      getContentPane().add(label_2);
      
      JLabel label_3 = new JLabel("4점");
      label_3.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
      label_3.setBounds(117, 82, 18, 15);
      getContentPane().add(label_3);
      
      JLabel label_4 = new JLabel("5점");
      label_4.setFont(new Font("나눔고딕코딩", Font.PLAIN, 12));
      label_4.setBounds(147, 81, 18, 15);
      getContentPane().add(label_4);
      
      setSize(220,210);
      setLocationRelativeTo(null); //정가운데
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//다이어로그 x클릭
      setVisible(true);//창보이기
   }
}