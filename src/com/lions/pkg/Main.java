package com.lions.pkg;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//from w w w . j  av a 2 s  .c o  m
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        com.lions.pkg.ImagePanel imagePanel = new ImagePanel();
        frame.getContentPane().add(imagePanel, BorderLayout.CENTER);
        
        JLayeredPane layeredPane = new JLayeredPane();
        imagePanel.add(layeredPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(563,400);
        frame.setVisible(true);
      }
    });
  }
}

class ImagePanel extends JPanel {

  Image image;

  public ImagePanel() {
    image = Toolkit.getDefaultToolkit().createImage("C:/Users/dell/Downloads/expressive-businesswoman-character-collection_23-214760672536363636360025362536.gif");
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (image != null) {
      g.drawImage(image, 0, 0, this);
    }
  }
}