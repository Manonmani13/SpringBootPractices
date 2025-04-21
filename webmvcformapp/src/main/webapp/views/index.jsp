<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h2> User Form  </h2>
<form action="user" method="post">
    <table>

        <tr>
            <td>Name :</td>
            <td><input type="text"name="name"/></td>
        </tr>


        <tr>
            <td>Email :</td>
            <td><input type="email"name="email"/></td>
        </tr>

        <tr>
            <td>Phno :</td>
            <td><input type="text"name="phno"/></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit"name="sumbit"/></td>
        </tr>
    </table>
</form>
</body>
</html>