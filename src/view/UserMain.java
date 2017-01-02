package view;

import action.GetAllBook;
import entity.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/22.
 */
public class UserMain {
    private JLabel hasNumber;
    private JTextPane bookList;
    private JPanel panel;
    private JButton borrow;
    private JButton retur;
    static private int id ;
    static JFrame frame;
    public UserMain() {
        GetAllBook allBook = new GetAllBook();
        Set list = allBook.getAllBook(id);
        Iterator it = list.iterator();
        String str = new String();
        hasNumber.setText("您借有"+list.size()+"本书");
        while (it.hasNext()){
            Book book = new Book();
            book = (Book) it.next();
            str += book.getBname()+"\n";
        }
        bookList.setText(str);
        borrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new borrow(id).run();

            }
        });
        retur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new BackView(id).run();
            }
        });
    }
    public void run(int id){
        UserMain.id = id;
        frame = new JFrame("UserMain");
        frame.setContentPane(new UserMain().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  //设置居中
        frame.setSize(500,300);
    }
    public static void main(String[] args) {
        new UserMain().run(2014021060);
    }
}
