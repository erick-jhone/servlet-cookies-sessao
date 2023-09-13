package com.example.trabalho02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "perfume", value = "/perfume")
public class Perfume extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession sessao=request.getSession(false);

        out.print("<h1>Perfume - O Boticário: ZAAD </h1>");
        out.print("<img src=https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/products/B47950/ZAAD_EDP_95ml-V6_B47950.jpg>");
        out.print("<h2>Por: R$279,90<h2>");



        if(sessao==null){
            Cookie cookie = new Cookie("perfume", "produto");
            cookie.setMaxAge(30*24*3600);
            response.addCookie(cookie);
        }





    }
}
