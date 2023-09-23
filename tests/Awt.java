import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Awt extends JApplet implements ActionListener {
   JPanel p;
   JLabel a, b;
   JTextField t1, t2;
   JButton bu, bu1;

   public void init() {
      p = new JPanel();
      a = new JLabel("Name");
      b = new JLabel("Password");
      t2 = new JPasswordField(10);
      bu = new JButton("Login");
      bu1 = new JButton("Submit");
      t1 = new JTextField(10);
   }

   public void start() {
      add(p);
      p.add(a);
      p.add(t1);
      p.add(b);
      p.add(t2);
      p.add(bu);
      p.add(bu1);
      bu.addActionListener(this);
      bu1.addActionListener(this);
   }

   public void actionPerformed(ActionEvent ae) {
      String name = t1.getText();
      String psw = t2.getText();
      int x = Integer.parseInt(name);
      int y = Integer.parseInt(psw);
      if (ae.getSource() == bu) {
         p.setBackground(Color.red);
         JOptionPane.showMessageDialog(null, "Sum of " + x + "and " + y + ":==" + (x + y));
      }
      if (ae.getSource() == bu1) {
         p.setBackground(Color.green);
         JOptionPane.showMessageDialog(null, "Product of " + x + "and " + y + ":==" + (x * y));
      }

   }
}
/*
 * <applet code = sample.class height=100 width=200></applet>
 */