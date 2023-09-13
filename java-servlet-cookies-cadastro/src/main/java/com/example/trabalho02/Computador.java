package com.example.trabalho02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "computador", value = "/computador")
public class Computador extends HttpServlet  {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession sessao=request.getSession(false);

        out.print("<h1>PC GAMER -  Intel Core I7 3.4GHz, 16GB, Geforce GTX 1660 Super 6GB, SSD 480GB, Windows 10 Trial, Preto </h1>");
        out.print("<img src=https://images.kabum.com.br/produtos/fotos/sync_mirakl/368424/Pc-Gamer-F-cil-Intel-Core-I7-3-4GHz-16GB-Geforce-GTX-1660-Super-6GB-SSD-480GB-Windows-10-Trial-Preto_1687873695_g.jpg>");
        out.print("<h2>Por: R$3.279,90<h2>");



        if(sessao==null){
            Cookie cookie = new Cookie("computador", "produto");
            cookie.setMaxAge(30*24*3600);
            response.addCookie(cookie);
        }





    }

}
