<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no" />
<title>펫키지 :: 반려동물의 모든 것</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	<div id="wrapper">
		<!-- 상단 고정 내용 시작 -->
		<div class="container fixTop">
			<!-- 로고 및 검색 바 시작 -->
			<div class="row">
				<div class="col-sm-4 col-md-4">
					<a href="${pageContext.request.contextPath}/index.jsp"><img
						src="${pageContext.request.contextPath}/resources/image/logov2.png"
						style="width: 15em" /></a>
				</div>
				<!-- 검색 시작 -->


				<form class="col-sm-4 col-md-5 searchPart" method="post"
					action="/backendMiniProject/productFind.do">
					<input class="d-xl-flex search" type="search" name="pdName" />
					<button class="btn btn-light" type="submit">

						<!-- 검색 아이콘 -->
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
							fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                <path
								d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z" />
              </svg>
					</button>
				</form>

				<!-- 검색 끝 -->
				<!-- 마이페이지 파트 시작 -->
				<div class="col mypage">
					<!-- 마이페이지 -->
					<c:set var="id" value="${vo.getId()}"></c:set>
					<c:choose>
						<c:when test="${!empty id}">
							<c:set var="myPage" value="detailUserData.do" />
							<c:set var="basket" value="basket.do" />
						</c:when>
						<c:when test="${empty id}">
							<c:set var="myPage" value="login.jsp" />
							<c:set var="basket" value="login.jsp" />
						</c:when>

					</c:choose>
					<a href="${myPage}"> <svg xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
                <path
								d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z" />
              </svg>
					</a>
					<!-- 장바구니 -->
					<a href="${basket}"> <svg xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" class="bi bi-cart4" viewBox="0 0 16 16">
                <path
								d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z" />
              </svg>
					</a>
				</div>
				<!-- 마이페이지 파트 끝 -->
			</div>
			<!-- 로고 및 검색 바 끝 -->

			<!-- 네비게이션 바 시작 -->
			<div class="navbarPart">
				<div class="navi">
					<ul>
						<li><a href="showProductList.do">BEST</a></li>
						<li><a href="showProductList.do">NEW</a></li>
						<li><a href="showProductList.do">간식</a></li>
						<li><a href="showProductList.do">건강</a></li>
						<li><a href="showProductList.do">패션</a></li>
						<li><a href="showProductList.do">기타</a></li>
					</ul>
				</div>
				<div class="login">
					<a href="${pageContext.request.contextPath}/login.jsp">로그인</a> <a
						href="${pageContext.request.contextPath}/signup.jsp">회원가입</a>
				</div>
			</div>

			<!-- 네비게이션 바 끝 -->
		</div>
		<!-- 상단 고정 내용 끝 -->

		<!-- 배너 슬라이드 시작 -->
		<div id="carouselExampleIndicators" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleIndicators"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img
						src="${pageContext.request.contextPath}/resources/image/banner1.png"
						class="d-block w-100" alt="banner1" />
				</div>
				<div class="carousel-item">
					<img
						src="${pageContext.request.contextPath}/resources/image/banner2.png"
						class="d-block w-100" alt="banner2" />
				</div>
				<div class="carousel-item">
					<img
						src="${pageContext.request.contextPath}/resources/image/banner3.png"
						class="d-block w-100" alt="banner3" />
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">이전</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">다음</span>
			</button>
		</div>
		<!-- 배너 슬라이드 끝 -->

		<!-- 상품 코너 시작 -->
		<section class="article-list">
			<div class="container">
				<div class="intro">
					<h2 class="text-center">Not Products</h2>
					<p class="text-center">이 곳은 보여주기용 상품들입니다.<br>
					 구현된 DB 상품은 위 네비게이션 바를 눌러주세요.</p>
				</div>
				<div class="row articles">
					<div class="col-sm-6 col-md-4 item">
						<a href="detailProductData.do"><img class="img-fluid"
							src="${pageContext.request.contextPath}/resources/image/dogfood.jpg" /></a>
						<h3 class="name">강아지 사료</h3>
						<p class="description">35000원</p>
					</div>
					<div class="col-sm-6 col-md-4 item">
						<a href="detailProductData.do"><img class="img-fluid"
							src="${pageContext.request.contextPath}/resources/image/dogshampoo.jpg" /></a>
						<h3 class="name">강아지 샴푸</h3>
						<p class="description">26500원</p>
					</div>
					<div class="col-sm-6 col-md-4 item">
						<a href="detailProductData.do"><img class="img-fluid"
							src="${pageContext.request.contextPath}/resources/image/churu.jpg" /></a>
						<h3 class="name">고양이 츄르</h3>
						<p class="description">3000원</p>
					</div>
				</div>
				<div class="intro mt-5">
					<h2 class="text-center">백엔드 구현한 내용들</h2>
					<p class="text-center">
					1. 로그인 (DB에 있는 아이디로 조회) <br>
					1-1. 로그인 실패 시 해당 페이지로 이동<br>
					2. 회원가입 (DB에 유저 아이디(필수키)로 저장) <br>
					2-1. 회원가입 성공/실패(1페이지) 페이지 이동<br>
					3. 회원 정보 수정 (관리자가 아닌 일반 회원이 로그인하면 자신의 정보가 나오는 수정 창으로 이동) <br>
					4. 관리자 로그인 (id: admin, pw: admin) -> 상품 추가 가능 (DB에 상품 추가) <br>
					4-1. 상품 추가 가능 (DB에 상품 추가) <br>
					5. 상품 조회 (DB에 저장되어 있는 모든 상품 조회) <br>
					6. 상품 검색 (검색 창에 상품 이름을 검색하면 해당 상품이 전부 나옴) <br>
					7. 그 외에 로그인 세션 유지, 상품 상세 페이지, 유저 탈퇴, 상품 삭제, 장바구니를 개발중에 있음. <br>
					 -> 과제 제출 후에 추가 예정. <br>
					 #. 상품 추가에 이미지 업로드를 추가하고 싶었으나 실패함. <br><br>
					- 작성자: 최윤정 -
					 </p>
				</div>
			</div>
		</section>
		<!-- 상품 코너 끝 -->
	</div>

	<!-- footer 시작 -->
	<footer class="footer-clean">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-4 item">
					<h3>펫키지 고객센터</h3>
					<strong>1234-5678</strong>
					<p>
						평일: 오전 9:00 ~ 오후 6:00<br /> 점심시간: PM 12:00 ~ 1:00<br /> 주말 및
						공휴일은 휴무입니다.<br />
					</p>
				</div>
				<div class="col-4 item">
					<p>
						상호: 땅이가나라다 주식회사<br /> 대표: 최윤정<br /> 주소: 서울특별시 강남구<br />
						사업자등록번호: 123-45-67890<br /> 통신판매업신고: 1111-서울강남-2222<br />
					</p>
				</div>
				<div class="col-4 item">
					<p>
						건강기능식품 판매업 신고: 제 1111-2222222호<br /> 개인정보보호책임자: 성춘향<br />
					</p>
					<p class="copyright">
						copyright 2022. www.cyjcod.shop. <br />All rights reserved.
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- footer 끝 -->

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
