<%--
  Created by IntelliJ IDEA.
  User: LS
  Date: 2017-6-17
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>新增或修改用户</title>
</head>
<body>
    <c:if test="${pageTipMessageCode != null}">
        ${pageTipMessageCode}
    </c:if>
    <br/>
    <form:form action="${pageContext.request.contextPath}/paramtype/save" method="post" commandName="user">
        姓名：<form:input path="name" /><br/>
        年龄：<form:input path="age" /><br/>
        生日：<form:input path="birthDay" /><br/>
        手机号码：<form:input path="phoneNumber" /><br/>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
