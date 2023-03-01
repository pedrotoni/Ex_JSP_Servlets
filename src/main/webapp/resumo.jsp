<!DOCTYPE html>
<html lang="pt">
<html>
<head>
<title>Lista de Veiculos</title>
</head>
<body>
<h1>Lista de Veiculos</h1>
<table>
  <tr>
    <th>Tipo</th>
    <th>Modelo</th>
    <th>Marca</th>
    <th>Ano</th>
    <th>Placa</th>
    <th>Quilometragem</th>
    <th>Disponivel</th>
  </tr>
  <tr>
    <td><%= request.getAttribute("tipo") %></td>
    <td><%= request.getAttribute("modelo") %></td>
    <td><%= request.getAttribute("marca") %></td>
    <td><%= request.getAttribute("ano") %></td>
    <td><%= request.getAttribute("placa") %></td>
    <td><%= String.format("%.2f km", request.getAttribute("quilometragem")) %></td>
    <td><%= Boolean.parseBoolean(request.getAttribute("disponivel").toString()) ?
     "sim" : "nao" %></td>
  </tr>
</table>
</body>
</body>
</html>
