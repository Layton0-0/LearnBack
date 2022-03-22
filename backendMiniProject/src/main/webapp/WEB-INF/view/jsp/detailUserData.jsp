<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원가입</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="/css/style.css" />
  </head>

  <body>
    <div id="wrapper">
      <!-- 상단 고정 내용 시작 -->
      <div class="container fixTop">
        <!-- 로고 및 검색 바 시작 -->
        <div class="row">
          <div class="col-4">
            <a href="/index.html"><img src="/src/logov2.png" style="width: 15em" /></a>
          </div>
          <!-- 검색 시작 -->
          <div class="col-sm-4 col-md-6 searchPart">
            <input class="d-xl-flex search" type="search" /><button
              class="btn btn-light"
              type="button"
            >
              <!-- 검색 아이콘 -->
              <svg
                xmlns="http://www.w3.org/2000/svg"
                width="16"
                height="16"
                fill="currentColor"
                class="bi bi-search"
                viewBox="0 0 16 16"
              >
                <path
                  d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"
                />
              </svg>
            </button>
          </div>
          <!-- 검색 끝 -->
          <div class="col mypage">
            <!-- 마이페이지 -->
            <a href="/html/detailUserData.html">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="currentColor"
                class="bi bi-person"
                viewBox="0 0 16 16"
              >
                <path
                  d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"
                />
              </svg>
            </a>
            <!-- 장바구니 -->
            <a href="/html/basket.html">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="currentColor"
                class="bi bi-cart4"
                viewBox="0 0 16 16"
              >
                <path
                  d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"
                />
              </svg>
            </a>
          </div>
        </div>
        <!-- 로고 및 검색 바 끝 -->

        <!-- 네비게이션 바 시작 -->
        <div class="row navbarPart">
          <div class="col-sm-6 col-md-9 navi">
            <ul>
              <li>
                <a href="/html/showProductData.html">BEST</a>
              </li>
              <li>
                <a href="/html/showProductData.html">NEW</a>
              </li>
              <li>
                <a href="/html/showProductData.html">간식</a>
              </li>
              <li>
                <a href="/html/showProductData.html">건강</a>
              </li>
              <li>
                <a href="/html/showProductData.html">패션</a>
              </li>
              <li>
                <a href="/html/showProductData.html">기타</a>
              </li>
            </ul>
          </div>
          <div class="col-sm-2 col-md-3 login">
            <a href="/html/login.html">로그인</a>
            <a href="/html/signup.html">회원가입</a>
          </div>
        </div>

        <!-- 네비게이션 바 끝 -->
      </div>
      <!-- 상단 고정 내용 끝 -->

      <form class="container loginForm needs-validation" action="" method="get" novalidate>
        <h1 class="title">회원정보</h1>

        <div class="signUp">
          <div class="row">
            <div class="col">
              <label>이름</label>
            </div>
            <div class="col">
              <input name="name" type="text" required />
              <div class="invalid-feedback">이름을 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col">
              <label>아이디</label>
            </div>
            <div class="col">
              <input name="id" class="col" type="text" required />
              <div class="invalid-feedback">아이디를 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col">
              <label>비밀번호</label>
            </div>
            <div class="col">
              <input name="pw" type="password" required />
              <div class="invalid-feedback">비밀번호를 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col">
              <label>전화번호</label>
            </div>
            <div class="col">
              <input name="tel" type="tel" required />
              <div class="invalid-feedback">전화번호를 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col">
              <label>주소</label>
            </div>
            <div class="col">
              <input name="address" type="text" required />
              <div class="invalid-feedback">주소를 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col"><label>이메일</label></div>
            <div class="col">
              <input name="email" type="email" required />
              <div class="invalid-feedback">이메일을 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col"><label>생년월일</label></div>
            <div class="col">
              <input name="birth" type="date" required />
              <div class="invalid-feedback">생년월일을 입력하세요.</div>
            </div>
          </div>

          <div class="row">
            <div class="col"><label>나이</label></div>
            <div class="col">
              <input name="age" type="text" />
            </div>
          </div>

          <div class="row">
            <div class="col"><label>성별</label></div>
            <div class="col">
              <input name="sex" type="text" />
            </div>
          </div>
        </div>

        <div class="buttons">
          <button type="submit">수정</button>
          <button type="reset">삭제</button>
        </div>
      </form>
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
