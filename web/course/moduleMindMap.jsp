<%-- 
    Document   : moduleMindMap
    Created on : 02.03.2016, 14:34:24
    Author     : Lenovo13
--%>

<%@page import="entity.Courselections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="enums.PageType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="middle">
    <%    
        Courselections c = (Courselections) request.getSession(false).getAttribute("courseLection");
                       // List<Courselections> courseLections = courseLectionsService.getListOfCourseLectionsByCourse(c);
        
    %>
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1>Модуль №<%=(c.getLectionNumber()-1)%>. <%=c.getLectionNameRu()%></h1>
            <div>
                <strong>Дополнительные материалы</strong>
            </div>

            <div>
                <%session.setAttribute("typeID", PageType.AddMaterial);%>
                <iframe src="<%=request.getContextPath()%>/PdfContent?lectionID=<%=request.getSession(false).getAttribute("lectionID")%>&typeID='<%=PageType.AddMaterial%>'" width="850" height="500"></iframe>
            </div>
            
           
        </div>


        <div id="indexRightColumnForUser" >
            <%@include file="../WEB-INF/jspf/courseRightMenu.jspf" %>
        </div>



    </div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</div>
