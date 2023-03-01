<!DOCTYPE html>
<html lang="pt">
<html>
<body>
<form action="add-veiculo" method="post">
    <label for="tipo-veiculo">Tipo do Veiculo: </label>
        <select name="tipo-veiculo">
            <option value="carro">Carro</option>
            <option value="moto">Moto</option>
            <option value="caminhao">Caminhao</option>
        </select>
        <br>
    <label for="modelo">Modelo: </label>
    <input type="text" id="modelo" name="modelo">
    <br>
    <label for="marca">Marca: </label>
    <input type="text" id="marca" name="marca">
    <br>
    <label for="ano">Ano: </label>
    <input type="text" id="ano" name="ano">
    <br>
    <label for="placa">Placa: </label>
    <input type="text" id="placa" name="placa">
    <br>
    <label for="quilometragem">Quilometragem: </label>
    <input type="text" id="quilometragem" name="quilometragem">
    <br>
    <label for="disponivel">Disponivel: </label>
        <select name="disponivel">
            <option value="true">Sim</option>
            <option value="false">Nao</option>
        </select>
        <br>
    <button type="submit">Adicionar Veiculo!</button>
</form>
</body>
</html>
