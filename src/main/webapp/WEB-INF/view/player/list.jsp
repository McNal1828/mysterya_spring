<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<main class="container-xxl" style="height : auto; min-height : 100%">
	<div class="container">
	<h1 class="pb-4 mb-4 mt-4 fw-bold fst-italic border-bottom">선수단</h1>
	<div class="row row-cols-auto">
		<c:forEach var="li" items="${listPlayer}">
		<div class="col-6 col-md-3 col-sm-2 col-lg-3 col-xl-2">
			<div class="card mb-3" style="width: auto;">
				<img src="${pageContext.request.contextPath}/Mysterya/image/profile/${li.number}.jpg" class="card-img-top img-thumbnail">
				<div class="card-body">
					<img src="${pageContext.request.contextPath}/Mysterya/image/support/${li.support}.png" class="img-fluid float-end" width="60" height="60">
					<h5 class="card-title">No.${li.number}<br>${li.name}</h5>
					<a href="${pageContext.request.contextPath}/player/summary?n=${li.number}" class="btn btn-dark">선택</a>
				</div>
			</div>
			</div>
		</c:forEach>
	</div>
	</div>
</main>
