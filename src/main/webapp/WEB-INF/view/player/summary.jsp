<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<main class="container-xxl">
	<div class="mb-5 pb-4">
		<img src="${pageContext.request.contextPath}/Mysterya/image/profile/${playerDetail.number}.jpg" class="rounded float-md-end img-thumbnail img-fluid" width="200" height="200" />
		 <img src="${pageContext.request.contextPath}/Mysterya/image/support/${playerDetail.support}.${playerDetail.numberr==29?'gif':'png'}" class="rounded float-md-end" width="240" height="200" style="object-fit : contain" />
		<p class="fs-3 pb-2 pt-4">${empty playerDetail.name?'저장된 번호가 없거나 잘못된 등번호입니다':playerDetail.name}</p>
<%-- 		<ul class="fs-5">
			<li>${playerDetail.birth_year}- ${playerDetail.birth_month} - ${playerDetail.birth_day}</li>
			<li>${playerDetail.element_school}- ${playerDetail.middle_school} - ${playerDetail.high_school} - ${playerDetail.university}</li>
			<li>${playerDetail.handed}</li>
		</ul> --%>
	</div>
	<h4 class="pb-4 mb-4 mt-4 fw-bold fst-italic border-bottom">통산 기록</h4>
	<div class="col-md-11 ms-auto me-auto">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>경기수</th>
					<th>타석</th>
					<th>타수</th>
					<th>타율</th>
					<th>안타</th>
					<th>2루타</th>
					<th>3루타</th>
					<th>홈런</th>
					<th>삼진</th>
					<th>4구</th>
					<th>사구</th>
					<th>장타율</th>
					<th>출루율</th>
					<th>OPS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ls" items="${listsummary}">
					<tr>
						<td>${ls["경기수"]}</td>
						<td>${ls["타석"]}</td>
						<td>${ls["타수"]}</td>
						<td>
							<fmt:formatNumber value="${ls['타율']}" pattern=".000" />
						</td>
						<td>${ls["안타"]}</td>
						<td>${ls["2루타"]}</td>
						<td>${ls["3루타"]}</td>
						<td>${ls["홈런"]}</td>
						<td>${ls["삼진"]}</td>
						<td>${ls["4구"]}</td>
						<td>${ls["사구"]}</td>
						<td>
							<fmt:formatNumber value="${ls['장타율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ls['출루율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ls['OPS']}" pattern=".000" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<h4 class="pt-4 mt-4 pb-4 mb-4 fw-bold fst-italic border-bottom">리그별 요약</h4>
	<div class="col-md-11 ms-auto me-auto">
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>리그</th>
					<th>분류</th>
					<th>경기수</th>
					<th>타석</th>
					<th>타수</th>
					<th>타율</th>
					<th>안타</th>
					<th>2루타</th>
					<th>3루타</th>
					<th>홈런</th>
					<th>삼진</th>
					<th>4구</th>
					<th>사구</th>
					<th>장타율</th>
					<th>출루율</th>
					<th>OPS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ll" items="${listLeague}">
					<tr>
						<th>${ll["리그"]}</th>
						<td>${ll["분류"]}</td>
						<td>${ll["경기수"]}</td>
						<td>${ll["타석"]}</td>
						<td>${ll["타수"]}</td>
						<td>
							<fmt:formatNumber value="${ll['타율']}" pattern=".000" />
						</td>
						<td>${ll["안타"]}</td>
						<td>${ll["2루타"]}</td>
						<td>${ll["3루타"]}</td>
						<td>${ll["홈런"]}</td>
						<td>${ll["삼진"]}</td>
						<td>${ll["4구"]}</td>
						<td>${ll["사구"]}</td>
						<td>
							<fmt:formatNumber value="${ll['장타율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ll['출루율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ll['OPS']}" pattern=".000" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<h4 class="pt-4 mt-4 pb-4 mb-4 fw-bold fst-italic border-bottom">연도별 요약</h4>
	<div class="col-md-11 ms-auto me-auto">
		<table class="table table-bordered table-striped ">
			<thead>
				<tr>
					<th>년도</th>
					<th>경기수</th>
					<th>타석</th>
					<th>타수</th>
					<th>타율</th>
					<th>안타</th>
					<th>2루타</th>
					<th>3루타</th>
					<th>홈런</th>
					<th>삼진</th>
					<th>4구</th>
					<th>사구</th>
					<th>장타율</th>
					<th>출루율</th>
					<th>OPS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ly" items="${listYear}">
					<tr>
						<th>${ly["년도"]}</th>
						<td>${ly["경기수"]}</td>
						<td>${ly["타석"]}</td>
						<td>${ly["타수"]}</td>
						<td>
							<fmt:formatNumber value="${ly['타율']}" pattern=".000" />
						</td>
						<td>${ly["안타"]}</td>
						<td>${ly["2루타"]}</td>
						<td>${ly["3루타"]}</td>
						<td>${ly["홈런"]}</td>
						<td>${ly["삼진"]}</td>
						<td>${ly["4구"]}</td>
						<td>${ly["사구"]}</td>
						<td>
							<fmt:formatNumber value="${ly['장타율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ly['출루율']}" pattern=".000" />
						</td>
						<td>
							<fmt:formatNumber value="${ly['OPS']}" pattern=".000" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<h4 class="pt-4 mt-4 pb-4 mb-4 fw-bold fst-italic border-bottom">타석 분석</h4>
	<div class="col-md-11 ms-auto me-auto">
		<nav>
			<div class="nav nav-tabs" id="nav-tab" role="tablist">
				<button class="nav-link fw-bold active" id="nav-home-tab" data-bs-toggle="tab" data-bs-target="#nav-padirection" type="button" role="tab" aria-selected="true">타구방향 비율</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-pahowbase" type="button" role="tab" aria-selected="false">주자상황별</button>
				<button class="nav-link fw-bold" id="nav-profile-tab" data-bs-toggle="tab" data-bs-target="#nav-paturn" type="button" role="tab" aria-selected="false">타석횟수별 타율</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-paballcount" type="button" role="tab" aria-selected="false">볼카운트별</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-paballtotal" type="button" role="tab" aria-selected="false">타석당 공 갯수</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-paout" type="button" role="tab" aria-selected="false">아웃 비율</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-patobase" type="button" role="tab" aria-selected="false">출루 비율</button>
				<button class="nav-link fw-bold" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-patetc" type="button" role="tab" aria-selected="false">기타 지표</button>
			</div>
		</nav>
		<div class="tab-content" id="nav-tabContent">
			<div class="tab-pane fade show active" id="nav-padirection" role="tabpanel">

				<div class="border border-2 mb-5" style="background-image: url('${pageContext.request.contextPath}/Mysterya/image/field.png'); height: 100%; background-position: center; background-repeat: no-repeat; background-size: cover;">
					<div class="row justify-content-center">
						<div class="col-3">
							<div id=chart8></div>
						</div>
					</div>
					<div class="row justify-content-between">
						<div class="col-3">
							<div id=chart7></div>
						</div>
						<div class="col-3">
							<div id=chart9></div>
						</div>
					</div>
					<div class="row justify-content-center">
						<div class="col-3">
							<div id=chart6></div>
						</div>
						<div class="col-3">
							<div id=chart4></div>
						</div>
					</div>
					<div class="row justify-content-center">
						<div class="col-3">
							<div id=chart5></div>
						</div>
						<div class="col-3" style="margin-right: -3rem; margin-left: -3rem">
							<div id=chart1></div>
						</div>
						<div class="col-3">
							<div id=chart3></div>
						</div>
					</div>
					<div class="row justify-content-center">
						<div class="col-3">
							<div id=chart2></div>
						</div>
					</div>
				</div>

			</div>
			<div class="tab-pane fade" id="nav-paturn" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>타석 횟수</th>
							<th>타석</th>
							<th>타수</th>
							<th>타율</th>
							<th>안타</th>
							<th>사사구</th>
							<th>삼진</th>
							<th>땅볼 및 뜬공</th>
							<th>상대방실책</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lpt" items="${listPaTurn}">
							<tr>
								<td>${lpt["타석 횟수"]}타석</td>
								<td>${lpt["타석"]}</td>
								<td>${lpt["타수"]}</td>
								<td>
									<fmt:formatNumber value="${lpt['타율']}" pattern=".000" />
								</td>
								<td>${lpt["안타"]}</td>
								<td>${lpt["사사구"]}</td>
								<td>${lpt["삼진"]}</td>
								<td>${lpt["땅볼 및 뜬공"]}</td>
								<td>${lpt["상대방실책"]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="tab-pane fade" id="nav-paballtotal" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>공 갯수</th>
							<th>타석</th>
							<th>타율</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lpbt" items="${listPaBalltotal}">
							<tr>
								<td>${lpbt["공 갯수"]}구</td>
								<td>${lpbt["타석"]}</td>
								<td>
									<fmt:formatNumber value="${lpbt['타율']}" pattern=".000" />
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="tab-pane fade" id="nav-paout" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>타수</th>
							<th>총 아웃</th>
							<th>루킹삼진</th>
							<th>스윙삼진</th>
							<th>땅볼</th>
							<th>뜬공</th>
							<th>직선타</th>
							<th>실책</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lpo" items="${listPaOut}">
							<tr>
								<td>${lpo["타수"]}</td>
								<td>${lpo["총 아웃"]}</td>
								<td>${lpo["루킹삼진"]}</td>
								<td>${lpo["스윙삼진"]}</td>
								<td>${lpo["땅볼"]}</td>
								<td>${lpo["뜬공"]}</td>
								<td>${lpo["직선타"]}</td>
								<td>${lpo["실책"]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div id=ochart class="col-8 ms-auto me-auto"></div>
			</div>
			<div class="tab-pane fade" id="nav-patobase" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>총 출루</th>
							<th>안타</th>
							<th>4구</th>
							<th>사구</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lptb" items="${listPaTobase}">
							<tr>
								<td>${lptb["총 출루"]}</td>
								<td>${lptb["안타"]}</td>
								<td>${lptb["4구"]}</td>
								<td>${lptb["사구"]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div id=obchart class="col-8 ms-auto me-auto"></div>
			</div>
			<div class="tab-pane fade" id="nav-patetc" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>K% : 타석당 삼진 개수</th>
							<th>BB% : 타석당 볼넷 개수</th>
							<th>K-BB% : 삼진-볼넷 비율 격차</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lpetc" items="${listPaETC}">
							<tr>
								<td>
									<fmt:formatNumber value="${lpetc['K% : 타석당 삼진 비율']}" pattern=".000" />
								</td>
								<td>
									<fmt:formatNumber value="${lpetc['BB% : 타석당 볼넷 비율']}" pattern=".000" />
								</td>
								<td>
									<fmt:formatNumber value="${lpetc['K-BB% : 삼진-볼넷 비율 격차']}" pattern=".000" />
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div class="tab-pane fade" id="nav-paballcount" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>볼카운트</th>
							<th>타석</th>
							<th>타수</th>
							<th>타율</th>
							<th>안타</th>
							<th>사사구</th>
							<th>삼진</th>
							<th>땅볼 및 뜬공</th>
							<th>상대방실책</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lpbc" items="${listPaBallcount}">
							<tr>
								<td>${lpbc["볼카운트"]}</td>
								<td>${lpbc["타석"]}</td>
								<td>${lpbc["타수"]}</td>
								<td>
									<fmt:formatNumber value="${lpbc['타율']}" pattern=".000" />
								</td>
								<td>${lpbc["안타"]}</td>
								<td>${lpbc["사사구"]}</td>
								<td>${lpbc["삼진"]}</td>
								<td>${lpbc["땅볼 및 뜬공"]}</td>
								<td>${lpbc["상대방실책"]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="tab-pane fade" id="nav-pahowbase" role="tabpanel">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>베이스</th>
							<th>타석</th>
							<th>타수</th>
							<th>타율</th>
							<th>단타</th>
							<th>장타</th>
							<th>사사구</th>
							<th>삼진</th>
							<th>땅볼 및 뜬공</th>
							<th>병살 및 삼중살</th>
							<th>상대방실책</th>
							<th>타점</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lphb" items="${listPaHowbase[0]}">
							<tr>
								<td>${lphb["베이스"]}</td>
								<td>${lphb["타석"]}</td>
								<td>${lphb["타수"]}</td>
								<td>
									<fmt:formatNumber value="${lphb['타율']}" pattern=".000" />
								</td>
								<td>${lphb["단타"]}</td>
								<td>${lphb["장타"]}</td>
								<td>${lphb["사사구"]}</td>
								<td>${lphb["삼진"]}</td>
								<td>${lphb["땅볼 및 뜬공"]}</td>
								<td>${lphb["병살 및 삼중살"]}</td>
								<td>${lphb["상대방실책"]}</td>
								<td>${lphb["타점"]}</td>
							</tr>
						</c:forEach>
					<tbody>
					<tbody>
						<c:forEach var="lphb" items="${listPaHowbase[1]}">
							<tr>
								<td>${lphb["베이스"]}</td>
								<td>${lphb["타석"]}</td>
								<td>${lphb["타수"]}</td>
								<td>
									<fmt:formatNumber value="${lphb['타율']}" pattern=".000" />
								</td>
								<td>${lphb["단타"]}</td>
								<td>${lphb["장타"]}</td>
								<td>${lphb["사사구"]}</td>
								<td>${lphb["삼진"]}</td>
								<td>${lphb["땅볼 및 뜬공"]}</td>
								<td>${lphb["병살 및 삼중살"]}</td>
								<td>${lphb["상대방실책"]}</td>
								<td>${lphb["타점"]}</td>
							</tr>
						</c:forEach>
					<tbody>
					<thead>
						<tr>
							<th>베이스</th>
							<th>타석</th>
							<th>타수</th>
							<th>타율</th>
							<th>단타</th>
							<th>장타</th>
							<th>사사구</th>
							<th>삼진</th>
							<th>땅볼 및 뜬공</th>
							<th>병살 및 삼중살</th>
							<th>상대방실책</th>
							<th>타점</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="lphb" items="${listPaHowbase[2]}">
							<tr>
								<td>${lphb["베이스"]}</td>
								<td>${lphb["타석"]}</td>
								<td>${lphb["타수"]}</td>
								<td>
									<fmt:formatNumber value="${lphb['타율']}" pattern=".000" />
								</td>
								<td>${lphb["단타"]}</td>
								<td>${lphb["장타"]}</td>
								<td>${lphb["사사구"]}</td>
								<td>${lphb["삼진"]}</td>
								<td>${lphb["땅볼 및 뜬공"]}</td>
								<td>${lphb["병살 및 삼중살"]}</td>
								<td>${lphb["상대방실책"]}</td>
								<td>${lphb["타점"]}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<script>
		function test(x, y, z, g) {
			var options = {
				chart : {
					// height: 280,
					type : "radialBar",
				},
				labels : x,
				series : y,
				colors : [ "#0cada8" ],
				plotOptions : {
					radialBar : {
					    startAngle: 0,
					    endAngle: 720,
						hollow : {
							margin : 0,
							size : "50%",
							background: "#0000007c",
						},
						dataLabels : {
							showOn : "always",
							name : {
								offsetY : -5,
								show : true,
								color : "#ffffff",
								fontSize : "18px",
								fontWeight : "bold"
							},
							value : {
								offsetY : 3,
								color : "#ffffff",
								fontSize : "22px",
								show : true,
								fontWeight : "bold"
							},
						},
					},
				},
				stroke : {
					lineCap : "round",
				},
				fill : {
					type : "gradient",
					gradient : {
						type : "diagonal1",
						gradientToColors : g,
						stops : [ 0, 100 ],
					},
				},
			};
			var chart = new ApexCharts(document.querySelector(z), options);
			return chart;
		};
  		<c:forEach var="tt" begin="1" end="9">
			var temp1 = ["기록없음"];
			var temp2 = [ 0 ];
			var temp3 = ["#00aeff"];
	 		<c:forEach var="lpd" items="${listPaDirection}">
				<c:choose>
					<c:when test="${tt == lpd['타구방향']}">
						temp1 = [ "${lpd['포지션']}" ];
						temp2 = [<fmt:formatNumber value="${lpd['비율']}" pattern=".0"/>];
						<c:if test="${lpd['비율']>30 || lpd['비율']<10}">
							temp3 = ["${lpd['비율']>30?'#ae00ff':'#ff8800'}"];
						</c:if>	
					</c:when>
				</c:choose>
			</c:forEach>
			var pp = test( temp1, temp2, "#chart" + ${tt}, temp3);
			pp.render()
		</c:forEach>
	
/* 		var p1 = test([ "투수" ], [ 67 ], "#chart1");
		var p2 = test([ "포수" ], [ 67 ], "#chart2");
		var p3 = test([ "1루" ], [ 67 ], "#chart3");
		var p4 = test([ "2루" ], [ 67 ], "#chart4");
		var p5 = test([ "3루" ], [ 67 ], "#chart5");
		var p6 = test([ "유격수" ], [ 67 ], "#chart6");
		var p7 = test([ "좌익수" ], [ 67 ], "#chart7");
		var p8 = test([ "중견수" ], [ 67 ], "#chart8");
		var p9 = test([ "우익수" ], [ 67 ], "#chart9"); */
		
/* 		p1.render()
		p2.render()
		p3.render()
		p4.render()
		p5.render()
		p6.render()
		p7.render()
		p8.render()
		p9.render() */
		function test2(x,y,z){
		 var ooptions = {
			  labels : x,
	          series: y,
	          chart: {
	          type: 'donut',
	        },
			plotOptions:{
				pie:{
				donut:{
					size : '70%',
					labels:{
					show:true,
					name : {
						offsetY : -15,
						show : true,
						color : "#ffffff",
						fontSize : "60px",
						fontWeight : "bold"
					},
					value : {
						offsetY : 13,
						color : "#ffffff",
						fontSize : "45px",
						show : true,
						fontWeight : "bold",
					},
					total : {
						label : '총합',
						offsetY : -15,
						color : "#ffffff",
						fontSize : "45px",
						show : true,
						fontWeight : "bold",
					},
					}
				}
			}
			},
			legend:{
				show : false
			},
			dataLabels:{
				style: {
				      fontSize: '20px',
				      fontFamily: 'Helvetica, Arial, sans-serif',
				      fontWeight: 'bold',
				},          
				  formatter(val, opts) {
				    const name = opts.w.globals.labels[opts.seriesIndex]
				    return name +" " + val.toFixed(1)+"%"
		        }
			}
	        };
		 	var chart = new ApexCharts(document.querySelector(z), ooptions);
	        return chart
		};

		<c:forEach var="lpo" items="${listPaOut}">
			var qq1 = test2( ["루킹삼진","스윙삼진","땅볼","뜬공","직선타"],[${lpo["루킹삼진"]},${lpo["스윙삼진"]}, ${lpo["땅볼"]}, ${lpo["뜬공"]}, ${lpo["직선타"]}],"#ochart");
	        qq1.render();
		</c:forEach>
		<c:forEach var="lptb" items="${listPaTobase}">
			var qq2 = test2( ["안타","4구","사구"],[${lptb["안타"]}, ${lptb["4구"]}, ${lptb["사구"]}],"#obchart");
	        qq2.render();
		</c:forEach>

		
	</script>

</main>
