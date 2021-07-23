package com.company;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Chat implements ActionListener {
    final JFrame mainFrame;
    JTextArea textAreaChat = new JTextArea(" ");
    JTextField textAreaMessage = new JTextField(40);

    public Chat () {
        this.mainFrame = new JFrame();
        mainFrame.setTitle("Chat for communication");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(new Rectangle(700, 1000));
        BorderLayout borderLayout = new BorderLayout();
        mainFrame.setLayout(borderLayout);
        textAreaChat.setSize(700, 700);
        mainFrame.add(textAreaChat, BorderLayout.CENTER);

        JScrollPane scrollPaneChat = new JScrollPane(textAreaChat);
        scrollPaneChat.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mainFrame.add(scrollPaneChat);

        final JPanel south = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JLabel jlab = new JLabel("  Enter your message  ");
        south.add(jlab);

        textAreaMessage.addActionListener(this);
        south.add(textAreaMessage);

        JButton btnSendMessage = new JButton("Send");
        btnSendMessage.addActionListener(this);
        south.add(btnSendMessage);

        mainFrame.add(south, BorderLayout.SOUTH);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder resStr = new StringBuilder(" ");
        if (e.getActionCommand().equals("Send")) {
            String orgStr = textAreaMessage.getText();
            for (int i = orgStr.length() - 1; i > 0; i--)
                resStr.append(orgStr.charAt(i));
            textAreaMessage.setText(resStr.toString());
        } else {
            String orgStr = textAreaMessage.getText();
            for (int i = orgStr.length() - 1; i > 0; i--)
                resStr.append(orgStr.charAt(i));
            textAreaMessage.setText(resStr.toString());
        }
        textAreaChat.append(resStr.toString());
        textAreaChat.append("\n");
        textAreaMessage.setText(null);
    }
}
