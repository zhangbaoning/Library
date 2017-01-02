package view;

import action.Borrow;
import entity.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/22.
 */
public class borrow {
    private JTextPane BookList;
    private JTextField BookId;
    private JButton confirm;
    private JPanel panel;
    static JFrame frame = new JFrame("borrow");
    public borrow(int id) {
        Borrow borrow = new Borrow();
        Set set = borrow.getBook();
        Iterator it = set.iterator();
        String str = new String();
        str +="图书馆还有"+set.size()+"本书\n";
        while (it.hasNext()){
            Book book = new Book();
            book = (Book) it.next();
            str += "书序号"+book.getBid()+" 书名："+book.getBname()+"\n";
        }
        BookList.setText(str);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (borrow.borrowed(BookId.getText(),id)){
                    frame.dispose();
                }
            }
        });
    }
    public void run(){


        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  //设置居中
        frame.setSize(500,300);

    }
    public static void main(String[] args) {

    }
}
