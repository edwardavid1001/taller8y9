<!DOCTYPE html>
<html>
<head>
    <meta name="author" content="Edwar Fernandez">
    <meta name="description" content="formulario de registro de Productos ">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Billar G8</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boostrap-icons@1.10.3/font/boostrap-icons.css">
    <link rel="stylesheet" href="css/styles.css">
    <title>Registro de Productos</title>

</head>
<body background="img/tacos.jfif">
    <div class="container">
        <h1>Registro de Productos</h1>

        <form action="guardar_producto.php" method="POST">
            <label for="product_name">Nombre del Producto:</label>
            <input type="text" id="product_name" name="product_name" required>

            <label for="product_value">Valor del Producto:</label>
            <input type="number" id="product_value" name="product_value" step="0.01" required>

            <label for="category">Categoría del Producto:</label>
            <select id="category" name="category" required>
                <option value="perecedero">Productos Perecederos</option>
                <option value="no_perecedero">Productos No Perecederos</option>
            </select>

            <input type="submit" value="Guardar Producto">
        </form>
    </div>
</body>
</html>
