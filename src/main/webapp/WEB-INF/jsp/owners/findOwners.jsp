<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html lang="en">

<jsp:include page="../fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>

    <h2>Szukaj pomyslow</h2>

    <spring:url value="/owners.html" var="formUrl"/>
    <form:form modelAttribute="owner" action="${fn:escapeXml(formUrl)}" method="get" class="form-horizontal"
               id="search-owner-form">
        <fieldset>
            <div class="control-group" id="lastName">
                <label class="control-label">Imie </label>
                <form:input path="lastName" size="30" maxlength="80"/>
                <span class="help-inline"><form:errors path="*"/></span><br>
            </div>
            <div id="gender">
                <label class="control-label">Plec </label>
                <select>
                    <option>Kobieta</option>
                    <option>Mezczyzna</option>
                </select>
            </div><br>
            <div id="city">
                 <label class="control-label">Miasto</label>
                 <form:input path="city" size="30" maxlength="80"/>
                 <br>
            </div>
            <div class="form-actions">
                <button class="btn btn-default" type="submit">Szukaj</button>
            </div>
        </fieldset>
    </form:form>

    <br/>
    <jsp:include page="../fragments/footer.jsp"/>

</div>
</body>

</html>
