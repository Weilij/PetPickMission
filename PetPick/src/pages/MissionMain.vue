<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm fixed-top">
    <div class="container-fluid">
      <a class="navbar-brand" href="/index.html">
        <img src="/pet-icon.png" width="36" height="36" class="d-inline-block align-top" alt="logo">
        PetPick
      </a>

      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarNav">
        <div class="d-flex flex-column flex-lg-row justify-content-between align-items-lg-center w-100">
          <ul class="navbar-nav mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link btn btn-login m-1" href="#">尋找領養</a></li>
            <li class="nav-item"><a class="nav-link btn btn-login m-1" href="missonMain.html">尋找任務</a></li>
            <li class="nav-item"><a class="nav-link btn btn-login m-1" href="#">寵物商城</a></li>
          </ul>

          <div class="position-fixed end-0 m-4">
            <a href="Chat.html" class="btn btn-material">
              <span class="material-icons">chat_bubble_outline</span>
            </a>
            <button class="btn btn-material">
              <span class="material-icons">shopping_cart</span>
            </button>
            <button class="btn btn-material">
              <span class="material-icons">account_circle</span>
            </button>
          </div>
        </div>
      </div>
    </div>
  </nav>

  <header>
    <div id="carouselWepet" class="carousel slide" data-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="/heroimage.png" class="d-block w-100" alt="廣告1">
        </div>
      </div>
      <a class="carousel-control-prev" href="#carouselWepet" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      </a>
      <a class="carousel-control-next" href="#carouselWepet" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
      </a>
    </div>
  </header>

  <div class="container py-5">
    <h3 class="text-center fw-bold mb-4">查看任務專區 🐾</h3>
    <div class="row mb-4">
      <div class="col-md-3 mb-2">
        <select class="form-select">
          <option selected>任務類型</option>
        </select>
      </div>
      <div class="col-md-3 mb-2">
        <select class="form-select">
          <option selected>地區</option>
        </select>
      </div>
      <div class="col-md-3 mb-2">
        <label for="search-input" class="search-bar">
          <form action="">
            <input type="search" id="search-input" placeholder="搜尋任務">
            <input type="submit" value="search" class="btn material-icons" style="background-color: burlywood;">
          </form>
        </label>
      </div>
      <div class="col-md-3 mb-2">
        <a href="missionUpload.html" class="text-black text-decoration-none">
          <button class="btn w-100" style="background-color: burlywood;">
            <span class="material-icons">add_comment</span>發佈任務!
          </button>
        </a>
      </div>
    </div>

    <div class="container">
      <button id="showAllBtn" class="btn active btn-recommend">全部任務</button>
      <button id="showRecommendBtn" class="btn btn-recommend">
        <span class="material-icons">local_fire_department</span>智慧推薦
      </button>
      <div class="row">
        <div class="col-md-8">
          <div id="all-missions">
            <div class="row" id="mission-list"></div>
          </div>
          <div id="recommend-list" class="row" style="display: none;"></div>
        </div>

        <div class="col-md-4">
          <div class="card p-4 mb-4 shadow-sm" style="border-radius: 15px;">
            <div class="d-flex justify-content-between align-items-center mb-3">
              <h5 class="mb-0 text-danger fw-bold">
                <i class="fa-solid fa-triangle-exclamation"></i> PetPick的防詐騙五大提醒
              </h5>
            </div>
            <ul class="list-unstyled">
              <li class="d-flex align-items-start mb-2">
                <i class="fa-solid fa-circle-xmark text-danger me-2 mt-1"></i>
                <span>保持警覺，小心「保證獲利」的誘惑</span>
              </li>
              <li class="d-flex align-items-start mb-2">
                <i class="fa-solid fa-circle-xmark text-danger me-2 mt-1"></i>
                <span>仔細查證，不輕信陌生訊息</span>
              </li>
              <li class="d-flex align-items-start mb-2">
                <i class="fa-solid fa-circle-xmark text-danger me-2 mt-1"></i>
                <span>保護個人隱私，不隨意提供敏感資訊</span>
              </li>
              <li class="d-flex align-items-start mb-2">
                <i class="fa-solid fa-circle-xmark text-danger me-2 mt-1"></i>
                <span>溝通使用平台，勿私下交易</span>
              </li>
              <li class="d-flex align-items-start mb-2">
                <i class="fa-solid fa-circle-xmark text-danger me-2 mt-1"></i>
                <span>發現可疑，立即檢舉</span>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="chat-selector" class="position-fixed bottom-0 end-0 m-4">
    <div class="chat-header d-flex justify-content-center align-items-center"><strong>對話清單</strong></div>
    <ul class="list-group" id="chatList"></ul>
  </div>

  <div id="chatWindows"></div>
  <button id="backToTop" class="btn btn-primary shadow">↑</button>

  <footer class="footer text-center mt-5">
    <div class="container">
      <p>快速連結：領養 / 商城 / 醫療回報 / 寵物救助</p>
      <p>email: ispan@gmail.com</p>
      <p>地址：台中市南屯區公益路二段51號</p>
      <p>本站所有資訊來自開放平台與會員自行刊登，若有侵權請聯繫移除。</p>
    </div>
    <ul class="navbar-nav mx-lg-auto text-center">
      <li class="nav-item"><a class="nav-link" href="#">關於我們</a></li>
      <li class="nav-item"><a class="nav-link" href="#">領養須知</a></li>
      <li class="nav-item"><a class="nav-link" href="#">認養服務</a></li>
      <li class="nav-item"><a class="nav-link" href="#">收養回報</a></li>
    </ul>
  </footer>
</template>

<script setup>
</script>