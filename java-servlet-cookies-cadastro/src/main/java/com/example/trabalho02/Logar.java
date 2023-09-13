package com.example.trabalho02;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "logar", value = "/logar")
public class Logar extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String login = request.getParameter("login");
        String senha=request.getParameter("senha");
        boolean exist = false;

            for (Usuario cadastro: Cadastro.usuarios) {
                if ((login.equals(cadastro.login)) && senha.equals(cadastro.senha)){
                    exist = true;
                     }
            }

        if (exist){
            HttpSession sessao = request.getSession();
            sessao.setAttribute("login", login);
            out.println("<h1> " + login + " logado com sucesso, seja bem-vindo a loja IFTO! </p>");
            out.print("<br>");
            out.println("<p> <a href=perfume> PERFUME </a> </p>");
            out.print("<br>");
            out.println("<p> <a href=computador> COMPUTADOR </a> </p>");
            out.print("<br>");
            out.print("<br>");
            out.print("<br>");
            out.println("<p> <a href=promocao> VERIFIQUE SE EXISTEM PROMOCOES PARA VOCÊ</a> </p> ");
        } else {
            out.println("<p> Login ou senha incorretos! </p>");
            out.println("<p><a href=formulario-cadastro.html> Clique aqui para criar uma nova conta </p>");
        }






















//        if(login!=null && login.length()>0 && senha!=null & senha.length()>0)
//        if(("jose".equals(login)&&"123".equals(senha)) || ("maria".equals(login)&&"321".equals(senha)) || ("erick".equals(login)&&"2023".equals(senha))) {
//            HttpSession sessao = request.getSession();
//            sessao.setAttribute("login", login);
//            out.println("<h1> " + login + " logado com sucesso, seja bem-vindo a loja IFTO! </p>");
//            out.print("<br>");
//            out.println("<p> <a href=perfume> PERFUME </a> </p>");
//            out.print("<br>");
//            out.println("<p> <a href=computador> COMPUTADOR </a> </p>");
//            out.print("<br>");
//            out.print("<br>");
//            out.print("<br>");
//            out.println("<p> <a href=promocao> VERIFIQUE SE EXISTEM PROMOCOES PARA VOCÊ</a> </p> ");
//
//
//        } else {
//            out.println("<p> Login ou senha incorretos! </p>");
//            out.println("<p><a href=cadastro> Clique aqui para criar uma nova conta </p>");
//            out.println("<p><a href=index.html> Voltar a tela inicial </p>");
//        }




        out.println("</body></html>");
    }
}
