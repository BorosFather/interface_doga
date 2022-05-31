/*
* File: MainFrame.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    public DefaultComboBoxModel<String> beosztasModel;
    public JComboBox<String> beosztasCombo;
    public DefaultListModel<String> dolgozoModel;
    public JList<String> dolgozoList;
    JScrollPane dolgozoScroll;
    JLabel by;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {

        this.beosztasModel = new DefaultComboBoxModel<>();
        this.beosztasCombo = new JComboBox<>(beosztasModel); 
        this.beosztasCombo.addItem("Beosztások");

        this.dolgozoModel = new DefaultListModel<>();
        this.dolgozoList = new JList<>(dolgozoModel);

        this.dolgozoScroll = new JScrollPane(dolgozoList);
        this.dolgozoScroll.setPreferredSize(new Dimension(200, 200));

        this.by = new JLabel("Create By BorosFather 2022-05-31");
        by.setBounds(30, 200, 200, 30);
        

    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(beosztasCombo, BorderLayout.NORTH);
        this.mainPanel.add(dolgozoScroll, BorderLayout.CENTER);
    
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
        this.add(this.by);
    }
}
