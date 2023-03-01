package br.com.ada.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add-veiculo")
public class AddVeiculoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipo = req.getParameter("tipo-veiculo");
        String modelo = req.getParameter("modelo");
        String marca = req.getParameter("marca");
        String ano = req.getParameter("ano");
        String placa = req.getParameter("placa");
        Double quilometragem = null;
        try {
            quilometragem = Double.parseDouble(req.getParameter("quilometragem"));
        } catch (NumberFormatException e) {
            quilometragem = 0.0d;
            System.out.println(e);
        }
        Boolean disponivel = Boolean.parseBoolean(req.getParameter("disponivel"));

        System.out.println(tipo);
        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(ano);
        System.out.println(placa);
        System.out.println(quilometragem);
        System.out.println(disponivel);
    }
}
