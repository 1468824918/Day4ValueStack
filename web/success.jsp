<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/26
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>成功啦!</h1><br>
书:<s:property value="#book"/><br>
名字:<s:property value="name"/><br>
username:<s:property value="username"/><br>
session:<s:property value="#session.author"/><br>
application:<s:property value="#application.price"/><br>
request:<s:property value="#request.attr"/>
</body>
</html>
