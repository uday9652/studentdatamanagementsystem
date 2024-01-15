<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>roolLno</th> 
    <th>name</th> 
    <th>course</th> 
    <th>hibernate</th> 
    <th>spring</th> 
    <th>springboot</th> 
    <th>total</th> 
    <th>percentage</th> 
    <th>result</th> 
    <th>grade</th> 
</tr> 
<c:forEach var="ser" items="${service}"> 
    <tr>   
        <td>${ser.rollno}</td>   
        <td>${ser.name}</td>    
        <td>${ser.course}</td>  
        <td>${ser.hibernate}</td>  
        <td>${ser.spring}</td>  
        <td>${ser.springboot}</td>  
        <td>${ser.total}</td>  
        <td>${ser.result}</td>  
        <td>${ser.grade}</td>  
        <td>${ser.percentage}</td>  
        v
        <td> 
            <a href="/delete/${ser.rollno}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${ser.rollno}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>