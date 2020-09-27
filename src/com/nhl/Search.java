package com.nhl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search {
    private JPanel searchPanel;
    private JTextArea outputPanel;
    private JButton searchButton;
    private JPanel inputPanel;
    private JLabel playerLabel;
    private JComboBox teamDropdown;

    public Search() {

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Look up players on a Team
            }
        });
    }

    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Select a Team and Player");
        frame.setContentPane(new Search().searchPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
