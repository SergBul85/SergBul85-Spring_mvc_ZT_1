<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>

<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br><br>


<%--@elvariable id="employee" type="com.hstn.spring.mvc.Employee"--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    <%--    Name <form:input path="department"/>--%>
    <input type="submit" value="Ok">
</form:form>


<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name">--%>
<%--    <input type="submit">--%>
<%--</form>--%>

</body>
</html>
