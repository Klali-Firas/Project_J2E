package org.example.demo.Controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.demo.Entity.User;
import org.example.demo.Model.UserModel;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class ServletAuth extends HttpServlet {
    private UserModel userModel = new UserModel();

    public void init() {
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        userModel.setUser(new User(name, password));
    }
    public void destroy() {
    }
}
