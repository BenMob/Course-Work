package AppPortal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;


import javax.swing.*;

public class MainFrame extends JFrame{
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("Please enter your name: ");
    JLabel label2 = new JLabel();
    JTextField textfield = new JTextField(30);

    JButton chromeBtn = new JButton("Google Chrome");
    JButton submitBtn = new JButton("Submit");
    JButton callBtn = new JButton("Call");
    JButton alertBtn = new JButton("Alert");
    JButton turnOffBtn = new JButton("Off");
    JButton chatBtn = new JButton("Chat");

    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu open = new JMenu("Open");
    JMenu source = new JMenu("Source");
    JMenu delete = new JMenu("Delete");
    JMenu connect = new JMenu("Connect");
    JMenu callSupervisor = new JMenu("Call Supervisor");

    JMenuItem fileItem = new JMenuItem("Open file ...");
    JMenuItem openItem = new JMenuItem("Open something ...");
    JMenuItem locateItem = new JMenuItem("Locate something ...");
    JMenuItem deleteItem = new JMenuItem("Which file to delete ...");
    JMenuItem databaseItem = new JMenuItem("Which database to connect to ...");

    public MainFrame(){
        frame.setTitle("Application Portal");
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel();
        JPanel subHeaderPanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel imagePanel = new JPanel();

        headerPanel.add(label1);
        headerPanel.add(textfield);
        headerPanel.add(label2);
        headerPanel.add(chromeBtn);
        headerPanel.add(submitBtn);
        headerPanel.add(callBtn);
        headerPanel.add(turnOffBtn);
        headerPanel.add(chatBtn);


        frame.add(headerPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
