package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="MainServlet", urlPatterns={"/MainServlet"})
public class MainServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //1
        String nombre = request.getParameter("nombre");
        String[] lenguaje = request.getParameterValues("lenguaje");
        // 2
        Encuesta objenc = new Encuesta();
        // 3
        objenc.setNombre(nombre);
        objenc.setLenguaje(lenguaje);
        // 4
        request.setAttribute("encu", objenc);
        // 5
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

}
