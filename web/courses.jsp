<%@page import="java.util.List"%>
<%@page import="entity.Courses"%>
<%@page import="service.CourseService"%>

<%
    CourseService courseService = new CourseService();
    List<Courses> list = list = courseService.getListOfCourses();
    session.setAttribute("currentCourseList", list);
%>
<div id="middle">
    <div id="textArea">
        <h1>Курсы</h1>

        <div class="courseList">
            <% list = courseService.getListOfCourses();
                for (Courses c : list) {
            %>

            <div class="courseInfo">
                <p class="courseTitle"> <a href="<%=getServletContext().getContextPath()%>/course/coursePage.jsp?courseID=<%=c.getCourseId()%>"><%=c.getCourseNameRu()%></a></p>
                <div class="courseImage">
                    <a href="<%=request.getServletContext().getContextPath()%>/course/coursePage.jsp?courseID=<%=c.getCourseId()%>">
                        <img src="<%=request.getContextPath()%>/ShowImage?index=<%=list.indexOf(c)%>" height="200" width="300" alt="Обложка"/>
                    </a>
                    <p></p>
                </div>
                <div class="courseDetails">
                    <br><strong>Описание курса:</strong> <%=c.getCourseDescriptionRu()%>
                    <br><strong>Количество модулей</strong> <%=c.getCourseLections()%>
                </div>
            </div> 

            <%}%>

        </div>
    </div>
</div>
