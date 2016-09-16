<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html begin middle>

<div id="middle">
    <div id='textArea'>
        <div id="indexLeftColumnForUser">
            <h1>Мои данные</h1>
            <form>
                <b>Фамилия: </b><%= u.getUserSurname()%><br>
                <b>Имя: </b><%= u.getUserName()%><br>
                <b>Отчество: </b><%= u.getUserMiddlename()%><br>
                <b>E-mail: </b><%= u.getEmail()%><br>
            </form>
        </div>
        <div id="indexRightColumnForUser">
            <%@include file="../WEB-INF/jspf/rightMenu.jspf" %>
        </div>
    </div>
         <br>

</div>
       
<!DOCTYPE html end middle>