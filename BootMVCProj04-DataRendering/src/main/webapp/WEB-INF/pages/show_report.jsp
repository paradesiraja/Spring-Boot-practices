<%@page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <h1 style="color:red">model attributes are::</h1>
<b>fav colors are::</b>
<c:forEach var="color" items="${favColors}">
  ${color},
</c:forEach>
<br><br>
<b>nick Names are::</b>
<c:forEach var="nick" items="${nickNames}">
  ${nick},
</c:forEach><br><br>
<b>phoneNumbers are::</b>
<c:forEach var="ph" items="${phoneNumbers}">
  ${ph},
</c:forEach><br><br>
<b>Id details are::</b>
<c:forEach var="id" items="${idDetails}">
  ${id},
</c:forEach><br><br> --%>

<%-- <c:if test="${!empty empInfo}">
<b>emp Information::${empInfo.eno},${empInfo.ename},${empInfo.salary},${empInfo.isVaccinated}</b>
</c:if> --%>

<c:choose>
<c:when test="${!empty empInfo}">
<table border="1" bgcolor="cyan" align="center">
<tr><th>eno</th><th>ename</th><th>salary</th><th>isvaccinated</th></tr>
<c:forEach var="emp" items="${empInfo}">
<tr>
<th>${emp.eno}</th>
<th>${emp.ename}</th>
<th>${emp.salary}</th>
<th>${emp.isVaccinated}</th>
</tr>
</c:forEach>
</table>
</c:when>

<c:otherwise>
<h1 style="color: red;text-align: center">Employees are not Found</h1>
</c:otherwise>
</c:choose>


