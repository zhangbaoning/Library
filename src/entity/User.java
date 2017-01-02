package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class User {
    int uid;
    String uname;
    String password;
    Set set = new HashSet();

    public User() {
    }

    public User(int uid, String uname, String password, Set set) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.set = set;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public User(int uid, String uname, String password) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
