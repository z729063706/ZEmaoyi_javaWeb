<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<link rel="stylesheet" type="text/css" href="./js/swiper/swiper-bundle.min.css" />

<script type="text/javascript" src="./js/swiper/swiper-bundle.min.js"></script>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>Swiper demo</title>
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1"
    />

    <!-- Demo styles -->
    <style>
      html,
      body {
        position: relative;
        height: 100%;
      }

      body {
        background: #eee;
        font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
        font-size: 14px;
        color: #000;
        margin: 0;
        padding: 0;
      }

      .swiper {
        width: 100%;
        height: auto;
      }

      .swiper-slide {
        text-align: center;
        font-size: 18px;
        background: #fff;

        /* Center slide text vertically */
        display: -webkit-box;
        display: -ms-flexbox;
        display: -webkit-flex;
        display: flex;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
      }

      .swiper-slide img {
        display: block;
        width: 100%;
        height: 100%;
        object-fit: cover;
      }
    </style>
  </head>

  <body>
    <!-- Swiper -->
    <div class="swiper mySwiper">
      <div class="swiper-wrapper">
        <div class="swiper-slide">
            <img src="./中俄贸易供需服务平台-首页_files/1614237814580h.png">
        </div>
        <div class="swiper-slide">
            <img src="./中俄贸易供需服务平台-首页_files/1614237833364h.png">
        </div>
        <div class="swiper-slide">
            <img src="./中俄贸易供需服务平台-首页_files/1614237827475h.png">
        </div>
      </div>
      <div class="swiper-pagination"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-button-next"></div>
    </div>


    <!-- Initialize Swiper -->
    <script>
      var swiper = new Swiper(".mySwiper", {


        pagination: {
          el: ".swiper-pagination",
          dynamicBullets: true,
        },
        speed : 1000,
        freeMode : true,
        loop : true,
        autoplay: true,
        autoplay : {
            delay : 3000, //自动切换的时间间隔，单位ms
            disableOnInteraction : false //用户操作swiper之后，是否禁止autoplay
        },
        //autoplayDisableOnInteraction : false,
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
      });
    </script>
  </body>
</html>
