<%-- 
    Document   : coursePage
    Created on : 03.04.2016, 19:50:40
    Author     : Администратор
--%>

<%@page import="entity.Courselections"%>
<%@page import="service.CourseLectionsService"%>
<%@page import="service.CourseService"%>
<%@page import="entity.Courses"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <div id="middle">
        <div id='textArea'>
            <%                int courseID = 0;
                Courses c = new Courses();
                if (request.getParameter("courseID") != null) {
                    courseID = Integer.valueOf(request.getParameter("courseID"));
                    CourseService courseService = new CourseService();
                    c = courseService.getCourseById(courseID);
                }
                //User user = (User) session.getAttribute("user");
                session.setAttribute("courseID", courseID);
            %>
            <h1><%=c.getCourseNameRu()%></h1>
            <table>
                <tr>
                    <td>
                        <%=c.getCourseDescriptionRu()%>
                    </td>
                </tr>
                <tr>
                    <td align="center"><strong>Модули курса</strong></td>
                </tr>
                <tr>
                    <%
                        CourseLectionsService courseLectionsService = new CourseLectionsService();
                        List<Courselections> courseLections = courseLectionsService.getListOfCourseLectionsByCourse(c);

                    %>
                <div>
                    <table>
                        <thead border="1" color="black">
                            <tr>
                                <th align="center">Номер модуля</th>
                                <th align="center">Название модуля</th>
                                <th align="center">Описание модуля</th>         
                            </tr>
                        </thead>
                        <% for (Courselections cl : courseLections) {%>
                        <tr>
                            <td align="center">
                                <%=(cl.getLectionNumber()-1)%>
                            </td>
                            <td>
                                <a href=<%=getServletContext().getContextPath()%>/course/modulePage.jsp?lectionID=<%=cl.getLectionId()%>>
                                   <%=cl.getLectionNameRu()%>
                            </a>
                        </td>
                        <td>
                            <%=cl.getLectionDescriptionRu()%>
                        </td>
                    </tr>
                    <%}%>
                </table>
                <%
            if (true) {
        %>
        <div class="menuButton">
            <a href="<%=request.getServletContext().getContextPath()%>/EnrolToCourse?courseID=<%=request.getParameter("courseID")%>">
                <span class="categoryLabelText">Записаться на курс  </span>
            </a>
        </div>
        <%}%>
            </div>
            </tr>
        </table>
        

    </div>
</div>