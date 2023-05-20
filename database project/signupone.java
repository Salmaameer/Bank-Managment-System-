import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

import java.util.*;

public class signupone extends JFrame 
{
    signupone()
    {
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno  = new JLabel("APPLICATION FORM NO " +random );
        formno.setFont(new Font("Raleway" ,Font.BOLD , 38 ));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetail  = new JLabel("Page 1: Personal Details");
        personDetail.setFont(new Font("Raleway" ,Font.BOLD , 22 ));
        personDetail.setBounds(290,80,400,30);
        add(personDetail);

        add(formno);

        JLabel name  = new JLabel("Name: ");
        name.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        name.setBounds(100,140,200,30);
        add(name);
        
        JTextField nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.BOLD , 14));
        nametextfield.setBounds(300,140,400,30);
        add(nametextfield);

        JLabel SSN  = new JLabel("SSN: ");
        SSN.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        SSN.setBounds(100,190,200,30);
        add(SSN);

        JTextField ssn = new JTextField();
        ssn.setFont(new Font("Raleway", Font.BOLD , 14));
        ssn.setBounds(300,190,400,30);
        add(ssn);


        JLabel phonenum  = new JLabel("PHONE NUMBER: ");
        phonenum.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        phonenum.setBounds(100,240,200,30);
        add(phonenum);

        JTextField phnum = new JTextField();
        phnum.setFont(new Font("Raleway", Font.BOLD , 14));
        phnum.setBounds(300,240,400,30);
        add(phnum);

        JLabel city  = new JLabel("CITY: ");
        city.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        city.setBounds(100,290,200,30);
        add(city);

        JTextField citytext = new JTextField();
        citytext.setFont(new Font("Raleway", Font.BOLD , 14));
        citytext.setBounds(300,290,400,30);
        add(citytext);

        JLabel street  = new JLabel("STREET: ");
        street.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        street.setBounds(100,340,200,30);
        add(street);

        JTextField streettext = new JTextField();
        streettext.setFont(new Font("Raleway", Font.BOLD , 14));
        streettext.setBounds(300,340,400,30);
        add(streettext);

        JLabel buildingNO  = new JLabel("BUILDINGNO: ");
        buildingNO.setFont(new Font("Raleway" ,Font.BOLD , 20 ));
        buildingNO.setBounds(100,390,200,30);
        add(buildingNO);

        JTextField buildingtext = new JTextField();
        buildingtext.setFont(new Font("Raleway", Font.BOLD , 14));
        buildingtext.setBounds(300,390,400,30);
        add(buildingtext);

        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway" ,Font.BOLD , 14 ));
        next.setBounds(620,550,80,30);
        add(next);

        getContentPane().setBackground(Color.white);
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new signupone();
    }
}