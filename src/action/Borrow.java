package action;

import DAO.BookDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import entity.Book;
import entity.User;
import view.UserMain;

import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/22.
 */
public class Borrow {
    public boolean borrowed(String bId,int id){
        Book book = new BookDAOImpl().get(Integer.parseInt(bId));
        UserDAO dao = new UserDAOImpl();
        User user = dao.get(id);
        user.getSet().add(book);
        dao.update(user);
        new UserMain().run(id);
        return true;
    }
    public Set getBook(){
        UserDAO dao = new UserDAOImpl();
        Set set = dao.get(0).getSet();
        return set;
    }
}
