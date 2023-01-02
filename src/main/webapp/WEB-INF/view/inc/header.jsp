<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<header class="position-sticky" style="top: 0; z-index: 100">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-3">
		<div class="container-fluid">
			<a class="navbar-brand fs-3 fw-bold" href="${pageContext.request.contextPath}"> <img
				src="${pageContext.request.contextPath}/Mysterya/image/favicon.png"
				alt="" 
				width="40" 
				height="40" />
				Mysterya
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="${pageContext.request.contextPath}">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/player/list">선수단</a></li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/player/summary/${mynum}">내정보</a></li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ranking/list">랭킹</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							기타 </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">리그별</a></li>
							<li><a class="dropdown-item" href="#">년도별</a></li>
							<li><hr class="dropdown-divider" /></li>
							<li><a class="dropdown-item" href="#">추가정보</a></li>
						</ul></li>
				</ul>
				<form class="d-flex" action="${pageContext.request.contextPath}/player/list" method="get">
					<select class="form-select-sm" id="autoSizingSelect" name="cat">
						<option ${(param.cat == "num")?"selected":""} value="num">등번호</option>
						<option ${(param.cat == "name")?"selected":""} value="name">이름</option>
					</select> <input class="form-control me-2" type="search"
						placeholder="Search" aria-label="Search" name="input" value="${param.input}" />
					<button class="btn btn-outline-success" type="submit">
						Search</button>
				</form>
			</div>
		</div>
	</nav>
</header>