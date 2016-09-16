<%-- 
    Document   : modulePage
    Created on : 13.03.2016, 17:38:37
    Author     : Lenovo13
--%>

<%@page import="service.CourseLectionsService"%>
<%@page import="entity.Courselections"%>
<%@page import="service.CourseService"%>
<%@page import="enums.PageType"%>
<%@page import="entity.Courses"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="middle">
    <%    Courselections c = new Courselections();
        int lectionID = 0;
        if (request.getParameter("lectionID") != null) {
            lectionID = Integer.valueOf(request.getParameter("lectionID"));
            CourseLectionsService courseLectionsService = new CourseLectionsService();
            c = courseLectionsService.getCourseLectionById(lectionID);
        }
        session.setAttribute("courseLection", c);
        session.setAttribute("lectionID", lectionID);
    %>
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1>Модуль №<%=(c.getLectionNumber()-1)%>. <%=c.getLectionNameRu()%></h1>
            <div>
                <h3 align="left"><%=c.getLectionDescriptionRu()%></h3>

                
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

