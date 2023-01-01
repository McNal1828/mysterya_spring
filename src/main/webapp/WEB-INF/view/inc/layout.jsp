<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Mysterya</title>
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.js"></script>
<link rel="stylesheet" href="/Mysterya/css/bootstrap-dark.css" type="text/css" />
<link rel="icon" type="image/png" sizes="96x96" href="/Mysterya/image/favicon.png">
<link rel="shortcut icon" type="image/png" sizes="96x96" href="/Mysterya/image/favicon.png">

</head>
<body class="d-flex flex-column min-vh-100">

	<!-- header ----------------------------------------------- -->
	<tiles:insertAttribute name="header" />
	<!-- main ----------------------------------------------- -->
	<tiles:insertAttribute name="main" />
	<!-- footer ----------------------------------------------- -->
	<tiles:insertAttribute name="footer" />
</body>
</html>