<%@page pageEncoding="UTF-8" %>
<div id="middle">
    <h1>Регистрация</h1>
    <div id='textArea'>
        <div>
            <h3>Форма регистрации учащегося</h3>
            <form action="RegisterServlet" method="POST">
                <table align="center" cellpadding = "10">
                    <tr>
                        <td>Имя</td>
                        <td><input type="text" name="firstName" maxlength="30"/>
                            (max 30 characters a-z and A-Z)
                        </td>
                    </tr>
                    <tr>
                        <td>Отчество</td>
                        <td><input type="text" name="middleName" maxlength="30"/>
                            (max 30 characters a-z and A-Z)
                        </td>
                    </tr>
                    <tr>
                        <td>Фамилия</td>
                        <td><input type="text" name="lastName" maxlength="30"/>
                            (max 30 characters a-z and A-Z)
                        </td>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <td><input type="text" name="email" maxlength="100" /></td>
                    </tr>
                    <tr>
                        <td>Пароль</td>
                        <td><input type="password" name="password" maxlength="100" /></td>
                    </tr>
                    <tr>
                        <td>Повторите пароль</td>
                        <td><input type="password" name="passwordCheck" maxlength="100" /></td>
                    </tr>
                    <tr>
                        <td>Подсказка для пароля</td>
                        <td><input type="text" name="passwordHint" maxlength="100" /></td>
                    </tr>                
                    <tr>
                        <td colspan="2" align="right">
                            <input type="submit" value="Отправить">
                            <input type="reset" value="Очистить">
                        </td>
                    </tr>
                </table>
            </form>
        </div>    
    </div>
</div>