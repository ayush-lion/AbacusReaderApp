package com.lions.pkg;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class TestApplication extends JApplet {

private static final long serialVersionUID = 1L;

    JPanel p1,p2,p3;

    public void init(){         
        setLayout(new GridLayout(3,1));
        p1=new JPanel();
        p2=new JPanel();

        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.
        add(p1);
        add(p2);
    }   
}