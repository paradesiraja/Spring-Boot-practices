<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>

<h1 style="color:red;text-align: center">Student register page</h1>
<frm:form modelAttribute="stud">
<table align="center" bgcolor="cyan">
<tr>
<td> Student number::</td>
<td><frm:input path="sno"/></td>
</tr>
<tr>
<td> Student name::</td>
<td><frm:input path="sname"/></td>
</tr>
<tr>
<td> Student address::</td>
<td><frm:input path="sadd"/></td>
</tr>
<tr>
<td> Student Average::</td>
<td><frm:input path="avg"/></td>
</tr>
<tr>
<td colspan="0"><input type="submit" name="register"></td>
</tr>
</table>
</frm:form>