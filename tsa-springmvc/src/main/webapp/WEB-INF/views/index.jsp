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
        <h3><a href="${pageContext.request.contextPath}/paramtype/edit" target="_blank">类型转换测试</a></h3>
        <pre>
            进行日期转换，自定义类型PhoneNumber转换
        </pre>
    </div>
    <div>
        <h3><a href="${pageContext.request.contextPath}/paramtype/edit" target="_blank">@ControllerAdvice注解测试</a></h3>
        <pre>
            ControllerAdviceController中注入了PhoneNumber类型转换器
            但是在ParamTypeConvertController中save方法进了转换
            由此可验证@ControllerAdvice中涉及的方法可以应用于所有@RequestMapping注解的方法
        </pre>
    </div>
    <div>
        <h3><a href="${pageContext.request.contextPath}/paramtype/edit" target="_blank">RedirectAttributes测试</a></h3>
        <pre>
            实现将值带入到重定向的方法中,而不是通过url后添加key=value带入
        </pre>
    </div>
    <div>
        <h3><a href="${pageContext.request.contextPath}/matrixvar/info/44/pets/55;q=22,33;s=23" target="_blank">MatrixVariable注解测试1</a></h3>
        <h3><a href="${pageContext.request.contextPath}/matrixvar/info/42;q=11;r=12/pets/55;q=22,33;s=23" target="_blank">MatrixVariable注解测试2</a></h3>
        <pre>
            开启MatrixVariable注解，参考<mvc:annotation-driven/>中的enable-matrix-variables配置
            MatrixVariable注解测试1请求地址：/matrixvar/info/44/pets/55;q=22,33;s=23
            MatrixVariable注解测试2请求地址：/matrixvar/info/42;q=11;r=12/pets/55;q=22,33;s=23
        </pre>
    </div>

</body>
</html>
