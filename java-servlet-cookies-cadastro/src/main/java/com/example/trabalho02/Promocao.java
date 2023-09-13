package com.example.trabalho02;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "promocao", value = "/promocao")
public class Promocao extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        Cookie[] cookies=request.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals("perfume") && c.getValue().equals("produto"))
            {
                out.print("<h1>VOCÊ RECEBEU UMA OPORTUNIDADE ÚNICA - PERFUME O BOTICARIO ZAAD COM 60% DE DESCONTO </h1>");
                out.print("<img src=https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/products/B47950/ZAAD_EDP_95ml-V6_B47950.jpg>");
                out.print("<h2><b>DE:</b> R$279,90<h2>");
                out.print("<h2><b>POR:</b> R$111,96<h2>");
            } else if (c.getName().equals("computador") && c.getValue().equals("produto"))
            {
                out.print("<h1>VOCÊ RECEBEU UMA OPORTUNIDADE ÚNICA - PC GAMER -  Intel Core I7 COM 10% DE DESCONTO </h1>");
                out.print("<img src=https://images.kabum.com.br/produtos/fotos/sync_mirakl/368424/Pc-Gamer-F-cil-Intel-Core-I7-3-4GHz-16GB-Geforce-GTX-1660-Super-6GB-SSD-480GB-Windows-10-Trial-Preto_1687873695_g.jpg>");
                out.print("<h2><b>DE:</b> R$3.279,90<h2>");
                out.print("<h2><b>POR:</b> R$2.951,10<h2>");
            } else {
                out.print("<h1> NÃO EXISTEM MAIS PROMOÇÕES PARA VOCÊ NO MOMENTO </h1>");


            }
        }
        out.println("</body></html>");
    }



}
