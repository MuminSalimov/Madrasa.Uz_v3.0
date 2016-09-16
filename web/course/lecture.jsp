<%-- 
    Document   : lecture
    Created on : 02.03.2016, 14:33:32
    Author     : Lenovo13
--%>

<%@page import="entity.Courselections"%>
<%@page import="service.CourseLectionsService"%>
<%@page import="enums.PageType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="middle">
    <%    
        Courselections c = (Courselections) request.getSession(false).getAttribute("courseLection");
        
    %>
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1> Модуль №<%=(c.getLectionNumber()-1)%>. <%=c.getLectionNameRu()%></h1>
            <div>
                <%session.setAttribute("typeID", PageType.LECTURE);%>
                <iframe src="<%=request.getContextPath()%>/PdfContent?lectionID=<%=request.getSession(false).getAttribute("lectionID")%>&typeID='<%=PageType.LECTURE%>'" width="850" height="500"></iframe>
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
