package org.example.demo.dao;

import org.example.demo.Entity.User;
import org.example.demo.Utility.SingleTonConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class daoUSER {
    private final Connection con= SingleTonConnection.getConnection();
    public void searchUser() {

    }


    public User getUser(long id){
        try{
        PreparedStatement ps = con.prepareStatement("SELECT * FROM public.user WHERE id = ?");
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            return new User(rs.getString("nom"), rs.getString("password"));
        }
        return null;}
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        daoUSER daoUSER = new daoUSER();
//        daoUSER.getUser(1);
        User user = daoUSER.getUser(1);
        System.out.println(user.getName() +" "+ user.getPassword());
    }
}
