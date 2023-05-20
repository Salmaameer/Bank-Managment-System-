import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class bank extends JFrame implements ActionListener{
    
    JButton signup , clear, login;
    JTextField cardTextField;
    JPasswordField pinTextField;
    bank(){

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        getContentPane().setBackground(Color.white);

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardno=new JLabel("Card no:");
        cardno.setFont(new Font("Osward",Font.BOLD,38));
        cardno.setBounds(120, 150, 230, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150 ,230 ,30 );
        cardTextField.setFont(new Font("Arial",Font.BOLD ,14 ));
        add(cardTextField);

        JLabel pin=new JLabel("Pin:");
        pin.setFont(new Font("Osward",Font.BOLD,38));
        pin.setBounds(120, 220, 230, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220 ,230 ,30 );
        pinTextField.setFont(new Font("Arial",Font.BOLD ,14 ));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);

        add(signup);

        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
        
    }
    
        public static void main(String[] args) {
        new bank();
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == clear)
            {
                cardTextField.setText("");
                pinTextField.setText("");
            } 
            else if(e.getSource() == login)
            {

            } 
            else if(e.getSource() == signup)
            {

            } 
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
}