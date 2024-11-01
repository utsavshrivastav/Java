<html>
<body>
<%out.print("welcometojsp");%>
</body>
</html>

<html>
<body>
<form action="welcome.jsp"> 
<input type="text" name="uname">
<input type="submit" value="go"><br/>
</form>
</body>
</html>
<html>
<body>
<%
String name=request.getParameter("uname");
out.print("welcome "+name);
%>
</form>
</body>
</html>
