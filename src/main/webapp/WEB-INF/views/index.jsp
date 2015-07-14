<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>

<html>
<head>
<meta charset="UTF-8">
<title>Supper Calculator</title>
</head>

<body>

<h1>Supper Calculator</h1>

<form:form method="POST" action="calculate" modelAttribute="calculator">
  <form:input path="firstNumber" />
  <form:input path="operation" size="2" maxlength="1"/>
  <form:input path="secondNumber" />
  <button type="submit">calculate</button>
  <p>This is the result: <div id="result">${result}</div></p>
</form:form>

</body>
</html>