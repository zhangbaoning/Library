package action;


import DAO.UserDAO;
import DAO.UserDAOImpl;
import entity.User;

import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/22.
 */
public class GetAllBook {
    public  Set getAllBook(int id){
        UserDAO dao = new UserDAOImpl();
        User user = dao.get(id);
        return user.getSet();
    }
}
