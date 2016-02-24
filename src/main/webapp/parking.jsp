<%@ page import="java.util.List" %>
<%@ page import="com.nclab.ejb.Car" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Cars</title>
</head>
<body>

<%
    List<Car> cars = (List<Car>)request.getAttribute("parking");
%>
<h3>Cars in the parking:</h3>
<table>
    <tr>
        <td>Mark</td>
        <td>Model</td>
        <td>0-100km/h</td>
        <td>Weight</td>
    </tr>
    <%
        for(Car car : cars) {
    %>
    <tr>

        <td><%=car.getMark()%></td>
        <td><%=car.getModel()%></td>
        <td><%=car.getTimeTo100()%></td>
        <td><%=car.getWeight()%></td>
    </tr>

    <%
        }
    %>
</table>
<br>
<p></p>
<p>
    <%=request.getAttribute("fastcar")%>
</p>
<p></p>
<p>
    <%=request.getAttribute("heavycar")%>
</p>

</body>
</html>