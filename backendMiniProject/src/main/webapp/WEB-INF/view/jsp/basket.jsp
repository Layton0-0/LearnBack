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

      <section class="article-list">
        <div class="container">
          <div class="intro">
            <h2 class="text-start">장바구니</h2>
          </div>
          <div class="row articles">
            <div class="col-sm-6 col-md-4 item">
              <a href="/html/detailProductData.html"
                ><img class="img-fluid" src="/src/dogfood.jpg"
              /></a>
              <h3 class="name">강아지 사료</h3>
              <p class="description">35000</p>
            </div>
            <div class="col-sm-6 col-md-4 item">
              <a href="/html/detailProductData.html"
                ><img class="img-fluid" src="/src/dogshampoo.jpg"
              /></a>
              <h3 class="name">강아지 샴푸</h3>
              <p class="description">26500</p>
            </div>
            <div class="col-sm-6 col-md-4 item">
              <a href="/html/detailProductData.html"
                ><img class="img-fluid" src="/src/churu.jpg"
              /></a>
              <h3 class="name">고양이 츄르</h3>
              <p class="description">3000</p>
            </div>
          </div>
        </div>
      </section>
    </div>

    <!-- footer 시작 -->
    <footer class="footer-clean">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-4 item">
            <h3>펫키지 고객센터</h3>
            <strong>1234-5678</strong>
            <p>
              평일: 오전 9:00 ~ 오후 6:00<br />
              점심시간: PM 12:00 ~ 1:00<br />
              주말 및 공휴일은 휴무입니다.<br />
            </p>
          </div>
          <div class="col-4 item">
            <p>
              상호: 땅이가나라다 주식회사<br />
              대표: 홍길동<br />
              주소: 서울특별시 강남구<br />
              사업자등록번호: 123-45-67890<br />
              통신판매업신고: 1111-서울강남-2222<br />
            </p>
          </div>
          <div class="col-4 item">
            <p>
              건강기능식품 판매업 신고: 제 1111-2222222호<br />
              개인정보보호책임자: 성춘향<br />
            </p>
            <p class="copyright">copyright 2022. www.cyjcod.shop. <br />All rights reserved.</p>
          </div>
        </div>
      </div>
    </footer>
    <!-- footer 끝 -->
  </body>
</html>
