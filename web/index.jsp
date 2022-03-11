<%-- 
    Document   : index
    Created on : 10/03/2022, 10:00:00
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
        
        <form action="SvPersona"  method="POST">
            <p><label>DNI : </label><input type="text" name = "dni"></p>
            <p><label>NOMBRE : </label><input type="text" name = "nombre"></p>
            <p><label>APELLIDO : </label><input type="text" name = "apellido"></p>
            <p><label>TELEFONO : </label><input type="text" name = "telefono"></p>
            <button type="submit">Enviar</button>   
            
        </form>
        
        <h1>Ver Lista de Personas</h1>
        <p>Para ver el listado hacer click</p>
        
        <form action="" method="">
            <button type="submit">Mostrar</button>
        </form>
        
        <h1>Eliminar Persona</h1>
        <p>Ingrese el DNI de las persona a borrar</p>
        <p><label>DNI :</label><input type="text" name="dni_elim"</p>
        <button type="submit">Eliminar</button>
               
    </body>
</html>
