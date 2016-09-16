<%-- 
    Document   : testing
    Created on : 02.03.2016, 14:32:20
    Author     : Lenovo13
--%>

<%@page import="entity.Courselections"%>
<%@page import="enums.PageType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="middle">
    <%    
        Courselections c = (Courselections) request.getSession(false).getAttribute("courseLection");
        
    %>
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1>Модуль №<%=(c.getLectionNumber()-1)%>. <%=c.getLectionNameRu()%></h1>
            <div>
                <strong>Проверка полученных знаний</strong>
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
