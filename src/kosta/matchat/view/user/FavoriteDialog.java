package kosta.matchat.view.user;

import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class FavoriteDialog extends JDialog{
   public FavoriteDialog() {
      setTitle("�����߰�");
      getContentPane().setLayout(null);
      
      JRadioButton rdbtnNewRadioButton = new JRadioButton("");
      rdbtnNewRadioButton.setBounds(85, 56, 20, 20);
      getContentPane().add(rdbtnNewRadioButton);
      
      JRadioButton radioButton = new JRadioButton("");
      radioButton.setBounds(23, 56, 20, 20);
      getContentPane().add(radioButton);
      
      JRadioButton radioButton_1 = new JRadioButton("");
      radioButton_1.setBounds(55, 56, 20, 20);
      getContentPane().add(radioButton_1);
      
      JRadioButton radioButton_2 = new JRadioButton("");
      radioButton_2.setBounds(115, 56, 20, 20);
      getContentPane().add(radioButton_2);
      
      JRadioButton radioButton_3 = new JRadioButton("");
      radioButton_3.setBounds(145, 56, 20, 20);
      getContentPane().add(radioButton_3);
      
      JButton btnNewButton = new JButton("Ȯ  ��");
      btnNewButton.setBounds(46, 124, 105, 38);
      getContentPane().add(btnNewButton);
      
      JLabel lblNewLabel = new JLabel("������ �Է����ּ���");
      lblNewLabel.setFont(new Font("��������ڵ�", Font.PLAIN, 17));
      lblNewLabel.setBounds(23, 10, 168, 40);
      getContentPane().add(lblNewLabel);
      
      JLabel label = new JLabel("1��");
      label.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
      label.setBounds(25, 82, 18, 15);
      getContentPane().add(label);
      
      JLabel label_1 = new JLabel("2��");
      label_1.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
      label_1.setBounds(58, 82, 18, 15);
      getContentPane().add(label_1);
      
      JLabel label_2 = new JLabel("3��");
      label_2.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
      label_2.setBounds(87, 82, 18, 15);
      getContentPane().add(label_2);
      
      JLabel label_3 = new JLabel("4��");
      label_3.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
      label_3.setBounds(117, 82, 18, 15);
      getContentPane().add(label_3);
      
      JLabel label_4 = new JLabel("5��");
      label_4.setFont(new Font("��������ڵ�", Font.PLAIN, 12));
      label_4.setBounds(147, 81, 18, 15);
      getContentPane().add(label_4);
      
      setSize(220,210);
      setLocationRelativeTo(null); //�����
      setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);//���̾�α� xŬ��
      setVisible(true);//â���̱�
   }
}