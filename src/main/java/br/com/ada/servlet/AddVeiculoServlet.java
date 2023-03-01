package br.com.ada.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/veiculos")
public class AddVeiculoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipo = req.getParameter("tipo-veiculo");
        String modelo = req.getParameter("modelo");
        String marca = req.getParameter("marca");
        String ano = req.getParameter("ano");
        String placa = req.getParameter("placa");
        Double quilometragem;
        try {
            quilometragem = Double.parseDouble(req.getParameter("quilometragem"));
        } catch (NumberFormatException e) {
            quilometragem = 0.0d;
            System.out.println(e);
        }
        Boolean disponivel = Boolean.parseBoolean(req.getParameter("disponivel"));

        req.setAttribute("tipo",tipo);
        req.setAttribute("modelo",modelo);
        req.setAttribute("marca",marca);
        req.setAttribute("ano",ano);
        req.setAttribute("placa",placa);
        req.setAttribute("quilometragem",quilometragem);
        req.setAttribute("disponivel",disponivel);

        req.getRequestDispatcher("/resumo.jsp").forward(req, resp);
    }
}
