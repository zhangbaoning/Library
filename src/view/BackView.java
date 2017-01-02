package view;

import action.BackAction;
import action.GetAllBook;
import entity.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/26.
 */
public class BackView {
    private JTextPane bookList;
    private JButton submit;
    private JPanel panel;
    private JTextField textField1;
    static int id;
    static JFrame frame = new JFrame("BackView");
    public BackView(int id) {
        BackView.id = id;
        Set set = new GetAllBook().getAllBook(id);
        String str = "您现在借有以下的书：\n";
        Iterator it = set.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            str += "书号 "+book.getBid()+"  书名 "+book.getBname()+"\n";
        }
        bookList.setText(str);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            if (new BackAction().back(Integer.parseInt(textField1.getText()))){
                frame.dispose();
                new UserMain().run(id);
            }
            }
        });
    }
    public void run(){

        frame.setContentPane(new BackView(2014021060).panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  //设置居中
        frame.setSize(500,300);
    }
    public static void main(String[] args) {



    }
}
