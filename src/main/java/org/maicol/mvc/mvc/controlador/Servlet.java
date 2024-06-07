package org.maicol.mvc.mvc.controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.maicol.mvc.mvc.modelo.Rectangulo;

import java.io.IOException;

@WebServlet("/ServletControlador")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //creamos un objeto de JavaBeans
        //instanciamos el objeti
        Rectangulo rectangulo = new Rectangulo(6,5);
        req.setAttribute("rectangulo", rectangulo);

        //Capturamos las sesiones
        HttpSession session= req.getSession();
        session.setAttribute("rectangulo", rectangulo);
        //la informacion del servlet se despliega en un jsp
        // RequestDispacher despliegue la informacion del servlet
        RequestDispatcher rd = req.getRequestDispatcher("vistas/desplegarVariables.jsp");
        rd.forward(req,resp);
        resp.setContentType("text/html");


    }
}

