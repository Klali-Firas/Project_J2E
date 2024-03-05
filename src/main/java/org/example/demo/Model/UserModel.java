package org.example.demo.Model;

import org.example.demo.Entity.User;
import org.example.demo.dao.daoUSER;

public class UserModel {
    private User user;
    private daoUSER daoUser = new daoUSER();

    public UserModel(){}

    public void setUser(User user) {
        this.user = user;
    }



    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        userModel.setUser(new User("firasklali@gmail.com", "test"));
    }
}
