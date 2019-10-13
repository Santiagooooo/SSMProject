<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/10/13
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>main</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
</head>

<body>
<table class="table" align="center" style="border-radius: 3px;">
    <tr class="trTop">
        <td colspan="2" class="tdTop">
            <iframe frameborder="0"
                    src="${pageContext.request.contextPath}/view/top.jsp" name="top"></iframe>
        </td>
    </tr>
    <tr>
        <td class="tdLeft" rowspan="2">
            <iframe frameborder="0"
                    src="${pageContext.request.contextPath}/category/findAll.do" name="left"></iframe>
        </td>
        <td class="tdSearch" style="border-bottom-width: 0px;">
            <iframe frameborder="0"
                    src="${pageContext.request.contextPath}/view/search.jsp" name="search"></iframe>
        </td>
    </tr>
    <tr>
        <td style="border-top-width: 0px;">
            <iframe frameborder="0"
                    src="${pageContext.request.contextPath}/view/body.jsp" name="body"></iframe>
        </td>
    </tr>
</table>
</body>
</html>

