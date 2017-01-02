package action;

import DAO.BookDAO;
import DAO.BookDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import entity.Book;
import entity.User;

/**
 * Created by zhangbaoning on 2016/12/26.
 */
public class BackAction {
    public boolean back(int b_id){
        BookDAO bookDAO = new BookDAOImpl();
        Book book = bookDAO.get(b_id);
        UserDAO userDAO = new UserDAOImpl();
        User user = userDAO.get(0);
        user.getSet().add(book);
        //System.out.println(user.getPassword());
        userDAO.update(user);
        return true;
    }
}
