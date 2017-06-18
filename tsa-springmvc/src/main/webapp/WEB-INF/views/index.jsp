<%--
  Created by IntelliJ IDEA.
  User: LS
  Date: 2017-6-18
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMvc功能目录索引</title>
</head>
<body>
    <div>
        <h3><a href="${pageContext.request.contextPath}/tcc/edit">类型转换测试</a></h3>
        <pre>
            进行日期转换，自定义类型PhoneNumber转换
        </pre>
    </div>
    <div>
        <h3><a href="${pageContext.request.contextPath}/tcc/edit">@ControllerAdvice注解测试</a></h3>
        <pre>
            ControllerAdviceController中注入了PhoneNumber类型转换器
            但是在ParamTypeConvertController中save方法进了转换
            由此可验证@ControllerAdvice中涉及的方法可以应用于所有@RequestMapping注解的方法
        </pre>
    </div>
    <a></a>
</body>
</html>
