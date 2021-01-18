<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <meta charset="utf-8">
    <title>FirstProjectJavaPro</title>
</head>
<body>
<table border="2">
    <tr><td>Female</td><td>Male</td></tr>
    <tr><td><%= request.getAttribute("female") %></td><td><%= request.getAttribute("male") %></td></tr>
</table><br>
<table border="2">
    <tr><td>Warm</td><td>Cold</td></tr>
    <tr><td><%=request.getAttribute("warm")%></td><td><%=request.getAttribute("cold")%></td></tr>
</table>
<p><a href="/login?a=exit">Logout</a></p>

</body>
</html>