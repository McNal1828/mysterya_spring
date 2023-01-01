<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="container">
		<div class="mb-5 pb-4">
		<img src="${pageContext.request.contextPath}/Mysterya/image/MysteryaLogo.png" class="rounded img-thumbnail img-fluid mx-auto d-block" width="500" />
		</div>
		
		<div class="row">
			<div class="col-md-6 ms-auto me-auto">
			<h4 class="text-center">내 번호 저장하기</h4>
			<form class="input-group mb-3" action="/Mysterya/" method="get">
			  <input type="text" class="form-control" placeholder="등번호를 입력해주세요" aria-describedby="button-addon2" name="mynum"/>
			  <input class="btn btn-outline-secondary" type="submit" id="button-addon2" onclick="alert(mynum.value + '번 저장완료!')" />
			</form>
			</div>
		</div>
	
</main>