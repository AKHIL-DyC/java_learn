import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui{
    gui(){
        JFrame frame=new JFrame("divider");
        frame.setSize(1700,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,3));
        JPanel p1=new JPanel();
        frame.add(p1);
        JTextField t1= new JTextField("enter the number");
        JButton bt1=new JButton();
        p1.add(t1);
        p1.add(bt1);
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String inp=t1.getText();
                try{
                    int data=Integer.parseInt(inp);
                }
                catch(Exception ex){
                        JOptionPane.showMessageDialog(frame,ex.toString());
                    
                }

            }
        });
    }
}
class divisor{
    public static void main(String[] args) {
       new gui();
    }
}