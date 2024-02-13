import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gui{
    gui(){
        JFrame frame=new JFrame("palindrome_checker");
        frame.setSize(1800,600);
        frame.setLayout(new GridLayout(1,3));
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p0=new JPanel();
        JTextField tf=new JTextField("enter sentence",50);
       // tf.setPreferredSize(new Dimension(100,300));
        JButton submit=new JButton("submit");
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String sentence=tf.getText();
                int flag=0;
                //JOptionPane.showMessageDialog(frame, sentence);
                for(int i=0;i<sentence.length()/2;i++){
                    if(sentence.charAt(i)!=sentence.charAt(sentence.length()-i-1)){
                        //JOptionPane.showMessageDialog(frame,"not palindrome");
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    JOptionPane.showMessageDialog(frame,"not palindrome");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"palindrome");
                }
                
            }
        });
        frame.add(p0);
        frame.add(p1);
        frame.add(p2);
        p1.add(tf);
        p1.add(submit);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class palindrome{

    public static void main(String[] args) {
       new gui(); 
    }
}