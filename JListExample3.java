import javax.swing.*;  
import java.awt.event.*;  
public class JListExample3
{  
     JListExample3(){  
        JFrame f= new JFrame();  
        final JLabel label = new JLabel();          
        label.setSize(500,100);  
        JButton b=new JButton("Show");  
        b.setBounds(200,150,80,30);  
        final DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Visual Basic");  
          l1.addElement("C++");  
          l1.addElement("Java");  
          l1.addElement("HTML");  
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  
          DefaultListModel<String> l2 = new DefaultListModel<>();  
          l2.addElement("cool");  
          l2.addElement("hard");  
          l2.addElement("fun");  
          l2.addElement("challenging");  
          final JList<String> list2 = new JList<>(l2);  
          list2.setBounds(100,200, 75,75);  
          f.add(list1); f.add(list2); f.add(b); f.add(label);  
          f.setSize(450,450);  
          f.setLayout(null);  
          f.setVisible(true);  
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = "You selected " + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
                 if(list2.getSelectedIndex() != -1){  
                    data += " and it is ";  
                    for(Object frame :list2.getSelectedValues()){  
                       data += frame + " ";  
                    }  
                 }  
                 label.setText(data);  
              }  
           });   
     }
}  