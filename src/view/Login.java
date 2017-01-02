package view;

import action.LoginAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class Login {
    private JPanel jPanel;
    private JTextField usernameJF;
    private JTextField passwordJF;
    private JButton login;
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Login");
        frame.setContentPane(new Login().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  //设置居中
        frame.setSize(500,300);
    }

    public Login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameJF.getText();
                String password = passwordJF.getText();
                LoginAction action =new LoginAction(username,password);
                if (action.loginJudge()){
                    frame.dispose();
                }

            }
        });
    }
}
