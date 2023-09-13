package com.example.trabalho02;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="cadastro", value="/cadastro")
public class Cadastro extends HttpServlet {
    static ArrayList<Usuario> usuarios = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        usuarios.add(new Usuario(login, senha));
        response.sendRedirect("index.html");

    }


}


