<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>

<html lang="en">

<jsp:include page="../fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>
    <h2>Pomysly</h2>
    
    <datatables:table id="sopot" data="${selections}" row="sopot" theme="bootstrap2"
                      cssClass="table table-striped" pageable="false" info="false" export="pdf">
        <datatables:column title="Nazwa" cssStyle="width: 150px;" display="html">
            <spring:url value="/sopot/{sopotId}.html" var="sopotUrl">
                <spring:param name="sopotId" value="${sopot.id}"/>
            </spring:url>
            <a href="${fn:escapeXml(sopotUrl)}"><c:out value="${sopot.nazwa}"/></a>
        </datatables:column>
        <datatables:column title="Nazwa" display="pdf">
            <c:out value="${sopot.nazwa}"/>
        </datatables:column>
        <datatables:column title="Adres" property="adres" cssStyle="width: 200px;"/>
        <datatables:column title="Rodzaj" property="rodzaj"/>
        <datatables:column title="Telefon" property="telefon"/>
        <datatables:export type="pdf" cssClass="btn" cssStyle="height: 25px;" />
    </datatables:table>
    
    <jsp:include page="../fragments/footer.jsp"/>

</div>
</body>

</html>
