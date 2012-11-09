<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page session="false" %>
<html>
<head>
	<title>My HTML View</title>
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
<div class="success">
	<h3>foo: "${foo}"</h3>
	<h3>fruit: "${fruit}"</h3>
	<h3>message: "<c:out value="${message}"/>"</h3>
	<h3>principal: "<sec:authentication property="name"/>"</h3>
</div>
</body>
</html>