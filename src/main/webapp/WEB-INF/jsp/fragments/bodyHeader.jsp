<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<spring:url value="/resources/images/baner.jpg" var="banner"/>
<img class="banner" src="${banner}"/>

<div class="navbar" style="width: 100%;">
    <div class="navbar-inner">
        <ul class="nav">
            <li style="width: 120px;"><a href="<spring:url value="/" htmlEscape="true" />"><i class="icon-home"></i>
                Home</a></li>
            <li style="width: 170px;"><a href="<spring:url value="/sopot/find.html" htmlEscape="true" />"><i
                    class="icon-search"></i> Szukaj pomyslow</a></li>
            <li style="width: 160px;"><a href="<spring:url value="/vets.html" htmlEscape="true" />"><i
                    class="icon-th-list"></i> Top 10 pomyslow</a></li>
        </ul>
    </div>
</div>
	
