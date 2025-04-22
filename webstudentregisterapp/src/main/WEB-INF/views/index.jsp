<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Student Registration</title>
</head>
<body>

<h2>Student Registration Form</h2>

<!-- Spring form tag bound to 'student' model attribute -->
<form:form action="save" modelAttribute="student" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name" /></td>
        </tr>

        <tr>
            <td>Email:</td>
            <td><form:input path="email" /></td>
        </tr>

        <tr>
            <td>Gender:</td>
            <td>
                <form:radiobutton path="gender" value="Male" /> Male
                <form:radiobutton path="gender" value="Female" /> Female
            </td>
        </tr>

        <tr>
            <td>Course:</td>
            <td>
                <form:select path="course">
                    <form:option value="">-Select-</form:option>
                    <form:options items="${courses}" />
                </form:select>
            </td>
        </tr>

        <tr>
            <td>Timings:</td>
            <td>
                <form:select path="timings" multiple="true">
                    <form:options items="${timings}" />
                </form:select>
            </td>
        </tr>

        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="Submit" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
