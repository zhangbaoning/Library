import DAO.BookDAO;
import DAO.BookDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import entity.Book;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User(2014021060,"大飞哥","123456");
     //   UserDAO dao = new UserDAOImpl();
 //       BookDAO bookDAO = new BookDAOImpl();
        Book book1 = new Book(1,"计算机","人民出版社");
        Book book2 = new Book(2,"多媒体","清华大学出版社");
        Book book3 = new Book(3,"编译原理","北京大学出版社");
        user.getSet().add(book1);
        user.getSet().add(book2);
        book1.setUser(user);
        book2.setUser(user);
//        bookDAO.save(book1);
//        bookDAO.save(book2);
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
      /*  session.save(book1);
        session.save(book2);
        session.save(user);
        */
      session.save(book3);
        transaction.commit();

    }
}
