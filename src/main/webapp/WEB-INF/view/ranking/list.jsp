<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<main class="container-xxl" style="height : auto; min-height : 100%">
	<div class="row mb-5">
		<h1 class="pb-4 mb-4 mt-4 fw-bold fst-italic border-bottom">랭킹</h1>
		<div class="col-11 ms-auto me-auto">
			<h2 class="pb-4 mb-4 mt-4 fw-bold fst-italic border-bottom">리그별</h2>
			<ul class="list-group">
				<c:forEach var="ll" items="${listLeague}">
				<li class="list-group-item"><a href="/Mysterya/ranking/detail?l=${ll.g}" class="alert-link">${ll.name}</a></li>
				</c:forEach>
			</ul>
			<h2 class="pb-4 mb-4 mt-4 fw-bold fst-italic border-bottom">년도별</h2>
			<ul class="list-group">
				<c:forEach var="ly" items="${listyear}">
				<li class="list-group-item"><a href="/Mysterya/ranking/detail?y=${ly.g}" class="alert-link">${ly.g}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</main>
