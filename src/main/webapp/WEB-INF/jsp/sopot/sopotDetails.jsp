<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<html lang="en">

<jsp:include page="../fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>

    <h2>Sopot Information</h2>

    <table class="table table-striped" style="width:600px;">
        <tr>
            <th>Nazwa</th>
            <td><b><c:out value="${sopot.nazwa}"/></b></td>
        </tr>
        <tr>
            <th>Adres</th>
            <td><c:out value="${sopot.adres}"/></td>
        </tr>
        <tr>
            <th>Telefon</th>
            <td><c:out value="${sopot.telefon}"/></td>
        </tr>
    </table>

    <jsp:include page="../fragments/footer.jsp"/>

</div>

</body>

</html>
