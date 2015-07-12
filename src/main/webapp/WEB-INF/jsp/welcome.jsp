<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html lang="en">

<jsp:include page="fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="fragments/bodyHeader.jsp"/>
    <ul>
    <li><h2><fmt:message key="welcome"/></h2>
    <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
<<<<<<< HEAD
    <img src="${petsImage}"/>
=======
    <img src="${petsImage}"/></li>
    <li><h2><fmt:message key="rozrywka"/></h2>
    <spring:url value="/resources/images/rozrywka.jpg" htmlEscape="true" var="rozrywkaImage"/>
    <img src="${rozrywkaImage}"/></li>
    <li><h2><fmt:message key="gastronomia"/></h2>
    <spring:url value="/resources/images/gastronomia.jpg" htmlEscape="true" var="gastronomiaImage"/>
    <img src="${gastronomiaImage}"/></li>
    </ul>

>>>>>>> 78cf820c71ca187853ea34bd99cb6bfa3d4ece2d
    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>

</html>
