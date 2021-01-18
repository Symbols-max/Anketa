<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>FirstProjectJavaPro</title>
</head>
<body>
<% String login = (String)session.getAttribute("user_login"); %>

<% if(login==null){%>

<form action="/login" method="post">
    Login:<input type="text" name="login"><br>
    Password:<input type="password" name="password"><br>
<input type="submit" value="OK">
</form>
<% } else {%>
<h1>Hi,<%=login%></h1><br>
<a href="/Quiz.jsp">Quiz</a><br><br>
<a href="/Statistic.jsp">Statistic</a>
<% }%>

</body>
</html>