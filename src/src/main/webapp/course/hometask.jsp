<%-- 
    Document   : coursePage
    Created on : 03.04.2016, 19:50:40
    Author     : Администратор
--%>

<%@page import="entity.Courselections"%>
<%@page import="enums.PageType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="middle">
    <%        Courselections c = (Courselections) request.getSession(false).getAttribute("courseLection");

    %>
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1>Модуль №<%=(c.getLectionNumber() - 1)%>. <%=c.getLectionNameRu()%></h1>
            <div>
                <strong>Домашнее задание</strong>
            </div>
            <div>
                <%session.setAttribute("typeID", PageType.HOMETASK);%>
                <iframe src="<%=request.getContextPath()%>/PdfContent?lectionID=<%=request.getSession(false).getAttribute("lectionID")%>&typeID='<%=PageType.HOMETASK%>'" width="850" height="500"></iframe>
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