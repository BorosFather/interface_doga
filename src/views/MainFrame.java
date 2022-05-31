package views;

import java.awt.FlowLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    public DefaultComboBoxModel<String> beosztasModel;
    public JComboBox<String> beosztasCombo;
    public DefaultComboBoxModel<String> dolgozoModel;
    public JList<String> dolgozoList;
    JScrollPane dolgozoScroll;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {

        this.beosztasModel = new DefaultComboBoxModel<>();
        this.beosztasCombo = new JComboBox<>(beosztasModel); 
        this.beosztasCombo.addItem("Beosztások");

        this.dolgozoModel = new DefaultComboBoxModel<>();
        this.dolgozoList = new JList<>(dolgozoModel);

        this.dolgozoScroll = new JScrollPane(dolgozoList);
        this.dolgozoScroll.setPreferredSize(new Dimension(200, 200));

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
    }
}
