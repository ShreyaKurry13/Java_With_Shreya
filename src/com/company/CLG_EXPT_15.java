package com.company;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTree;
public class CLG_EXPT_15 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CLG_EXPT_15 window = new CLG_EXPT_15();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public CLG_EXPT_15() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1033, 808);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton MyJButton = new JButton("ThisIsJButton");
        MyJButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        MyJButton.setBounds(25, 35, 158, 38);
        frame.getContentPane().add(MyJButton);

        JLabel MyJLabel = new JLabel("ThisIsJLabel\r\n");
        MyJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MyJLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        MyJLabel.setBounds(438, 35, 158, 38);
        frame.getContentPane().add(MyJLabel);

        JCheckBox MyCheckBox = new JCheckBox("ThisIsCheckBox\r\n");
        MyCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        MyCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        MyCheckBox.setBounds(792, 35, 158, 32);
        frame.getContentPane().add(MyCheckBox);

        JRadioButton MyRadioButton = new JRadioButton("ThisIsRadioButton");
        MyRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        MyRadioButton.setBounds(25, 195, 158, 38);
        frame.getContentPane().add(MyRadioButton);

        JScrollPane MyScrollPane = new JScrollPane();
        MyScrollPane.setBounds(301, 195, 189, 49);
        frame.getContentPane().add(MyScrollPane);

        JList MyJList = new JList();
        MyJList.setBounds(598, 325, 270, -157);
        frame.getContentPane().add(MyJList);

        JComboBox MyComboBox = new JComboBox();
        MyComboBox.setBounds(25, 325, 176, 62);
        frame.getContentPane().add(MyComboBox);

        JTree tree = new JTree();
        tree.setBounds(301, 323, 149, 105);
        frame.getContentPane().add(tree);
    }
}