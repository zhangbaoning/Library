package action;

import DAO.UserDAO;
import DAO.UserDAOImpl;
import entity.User;
import view.UserMain;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class LoginAction {
    UserDAO userDAO = new UserDAOImpl();
    private int username;
    private String password;
    public LoginAction(String username,String password) {
        this.username = Integer.parseInt(username);
        this.password = password;
    }
    public boolean hasUsername(){

        return true;
    }
    public boolean loginJudge(){
        User user = userDAO.get(username);
       // System.out.println(password);
        if (user.getPassword().equals(password)){
            new UserMain().run(username);
        return true;
        }else {
            return false;
        }
    }

}
