<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>

<html lang="en">

<jsp:include page="../fragments/staticFiles.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>

    <h2>Rozrywka</h2>

       <datatables:table id="rozrywka" data="${selections}" row="rozrywka" theme="bootstrap2"
                            cssClass="table table-striped" pageable="false" info="false" export="pdf">
              <datatables:column title="Nazwa" cssStyle="width: 150px;" display="html">
                  <spring:url value="/rozrywka/{rozrywkaId}.html" var="rozrywkaUrl">
                      <spring:param name="rozrywkaId" value="${rozrywka.id}"/>
                  </spring:url>
                  <a href="${fn:escapeXml(eventyUrl)}"><c:out value="${rozrywka.nazwa}"/></a>
              </datatables:column>
              <datatables:column title="Nazwa" display="pdf">
                  <c:out value="${rozrywka.nazwa}"/>
              </datatables:column>
              <datatables:column title="Rodzaj" property="rodzaj"/>
              <datatables:column title="Ilosc miejsc" property="ilosc_miejsc" cssStyle="width: 200px;"/>
              <datatables:column title="Cena biletu" property="cena_biletu" cssStyle="width: 200px;"/>
              <datatables:column title="Godzina" property="godzina" cssStyle="width: 200px;"/>
              <datatables:column title="Telefon" property="telefon"/>
              <datatables:export type="pdf" cssClass="btn" cssStyle="height: 25px;" />
          </datatables:table>

    <jsp:include page="../fragments/footer.jsp"/>

</div>
</body>

</html>
