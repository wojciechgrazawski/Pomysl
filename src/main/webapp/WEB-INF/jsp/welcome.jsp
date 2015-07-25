<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html lang="en">

<jsp:include page="fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="fragments/bodyHeader.jsp"/>
    <ul>
    <li>

    <a href="<spring:url value="/sopot/eventy.html"  />" >
             <h2><fmt:message key="eventy"/></h2>
             </a>
             <a href="<spring:url value="/sopot/eventy.html"  />" >
             <spring:url value="/resources/images/event.png" htmlEscape="true" var="eventImage"/>
             <img src="${eventImage}"/>
             </a>
             </li>

             <li><h2><fmt:message key="rozrywka"/></h2>
             <spring:url value="/resources/images/rozrywka.jpg" htmlEscape="true" var="rozrywkaImage"/>
             <img src="${rozrywkaImage}"/></li>
             <li><h2><fmt:message key="gastronomia"/></h2>
             <spring:url value="/resources/images/gastronomia.jpg" htmlEscape="true" var="gastronomiaImage"/>
             <img src="${gastronomiaImage}"/></li>
             <li><h2><fmt:message key="atrakcje"/></h2>
             <spring:url value="/resources/images/atrakcje.jpeg" htmlEscape="true" var="atrakcjeImage"/>
             <img src="${atrakcjeImage}"/></li>
             <li>
             <h2><fmt:message key="kultura"/></h2>
             <spring:url value="/resources/images/transport.png" htmlEscape="true" var="transportImage"/>
                 <img src="${transportImage}"/></li>
    </ul>
    <select>
        <option value="sopot"><fmt:message key="sopot"/></option>
        <option value="gdańsk"><fmt:message key="gdańsk"/></option>
        <option value="gdynia"><fmt:message key="gdynia"/></option>
    </select>
    <jsp:include page="fragments/footer.jsp"/>
</div>
</body>

</html>
