<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<script src="<c:url value="/resources/js/pomysl.js" />"></script>

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


    <button class="btn btn-default" onclick="wyswietlFormularz()">Dodaj pomysl</button>
    </br>
   <spring:url value="/sopot/addPomysl.html" var="formUrl"/>
       <form:form modelAttribute="sopot" action="${fn:escapeXml(formUrl)}" method="get" class="form-horizontal"
                      id="inputform" style="display: none;">
           <fieldset>

               <div class="control-group" id="nazwa">
                  <label class="control-label">Nazwa </label>
                  <form:input path="nazwa" size="30" maxlength="80"/>
                  <span class="help-inline"><form:errors path="*"/></span><br>
               </div>

               <div class="control-group" id="adres">
                   <label class="control-label">Adres </label>
                   <form:input path="adres" size="30" maxlength="80"/>
               </div>

               <div class="control-group" id="rodzaj">
                   <label class="control-label">Rodzaj </label>
                   <form:input path="rodzaj" size="30" maxlength="80"/>
               </div>

              <div class="control-group" id="telefon">
                   <label class="control-label">Telefon </label>
                   <form:input path="telefon" size="30" maxlength="80"/>
              </div>

              <div class="form-actions">
                   <button class="btn btn-default" type="submit">Dodaj</button>
              </div>

           </fieldset>
       </form:form>
    <jsp:include page="../fragments/footer.jsp"/>

</div>
</body>

</html>


