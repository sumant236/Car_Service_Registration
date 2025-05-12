<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <h1>This is the signup page</h1>
    <form:form action="done" modelAttribute="registerCar">
        Car Number: <form:input path="RegisterationNumber"/>
        <br/>
        <br/>
        Car Name: <form:select path="CarName">
                    <form:option value="Sonet"/>
                    <form:option value="Carens"/>
                    <form:option value="Seltos"/>
                    <form:option value="Carnival"/>
                   </form:select>
        <br/>
        <br/>
        Covered In Warranty: <form:select path="CarDetails">
                                 <form:option value="YES"/>
                                 <form:option value="NO"/>
                             </form:select>
        <br/>
        <br/>
        Any Remarks: <form:input path="CarWork"/>
        <br/>
        <br/>
        <input type="submit"/>
    </form:form>
</html>
