import javax.swing.*;  
class JTextFieldExample1
{  
JTextFieldExample1() 
    {  
    JFrame f= new JFrame("TextField Example");  
    JTextField t1,t2;  
    t1=new JTextField("Hello, hello, hello");  
    t1.setBounds(50,100, 200,30);  
    // x coord, y, width, height
    t2=new JTextField("Good morning");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
}  