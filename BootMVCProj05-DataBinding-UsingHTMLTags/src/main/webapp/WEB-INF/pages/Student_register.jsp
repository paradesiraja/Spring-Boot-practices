<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1 style="color:red;text-align: center">Student register page</h1>
<form action="register" method="post">
<table align="center" bgcolor="cyan">
<tr>
<td> Student number::</td>
<td><input type="text" name="sno"></td>
</tr>
<tr>
<td> Student name::</td>
<td><input type="text" name="sname"></td>
</tr>
<tr>
<td> Student address::</td>
<td><input type="text" name="sadd"></td>
</tr>
<tr>
<td> Student Average::</td>
<td><input type="text" name="avg"></td>
</tr>
<tr>
<td colspan="1"><input type="submit" name="register"></td>
</tr>
</table>
</form>