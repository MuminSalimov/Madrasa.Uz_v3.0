<!DOCTYPE html begin middle>
<div id="middle">
    <div id='textArea'>
        <h1 align="right">Вход в кабинет</h1>
        <form method="post" action="LoginServlet">
            <div style="padding: 100px 0 0 250px;">
                <div id="login-box" align="right">
                    
                    <fieldset align="center">
                        <legend>Пожалуйста введите логин/пароль для входа в систему</legend>
                        <br><br>
                        <div id="login-box-name" style="margin-top:20px;">E-mail:</div>
                        <div id="login-box-field" style="margin-top:20px;">
                            <input name="email" class="form-login" title="E-mail" value="" size="30" maxlength="50" />
                        </div>
                        <div id="login-box-name">Пароль:</div>
                        <div id="login-box-field">
                            <input name="password" type="password" class="form-login" title="Пароль" value="" size="30" maxlength="48" />
                        </div>
                        <br>
                        <span class="login-box-options">
                            Вы новый пользователь?  <a href="registration.jsp" style="margin-left:20px;">Зарегистрироваться</a>
                        </span>
                        <br />
                        <br />
                        <input style="margin-left:250px;" type="submit" value="Вход" />
                </div>
            </div>
            </fieldset>
        </form>
    </div>
</div>

<!DOCTYPE html end middle>