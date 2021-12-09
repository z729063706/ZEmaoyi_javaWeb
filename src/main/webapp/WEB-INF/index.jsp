<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@include file="./../header.jsp" %>
<%@include file="./../swipper.jsp" %>




<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<base href=".">

    <link rel="stylesheet" type="text/css" href="./css/bootstrap.css" />    
    <link rel="stylesheet" type="text/css" href="./css/base.css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>中俄贸易供需服务平台-首页</title>
</head>
<body style="background: transparent;">
    <!--平台简介-->
    <div class="container" id="platform">
        <div class="row">
        <div class="col-md-6">
            <img id="pic" src="${aboutus.pic}" class="img-responsive">
        </div>
        <div class="col-md-6">
            <h2 class="div-title">${aboutus.title} <span>ABOUT US</span></h2>
            <p id="aboutCon">${aboutus.intro}</p>
            <button type="button" onclick="">查看详情</button></div>           
        </div>
    </div>
    <div class="position">
    <!--服务内容-->
    <div id="service">
        <div class="container">
            <div class="row">                
                <div class="col-md-2  col-sm-6 col-xs-6">
                    <object data="./中俄贸易供需服务平台-首页_files/img1.png" width="200" height="336"></object>                   
                </div>
                <div class="col-md-2 col-sm-6 col-xs-6">
                     <object data="./中俄贸易供需服务平台-首页_files/img2.png" width="200" height="336"></object>                     
                </div>
                <div class="col-md-2 col-sm-4  col-xs-6">
                     <object data="./中俄贸易供需服务平台-首页_files/img3.png" width="200" height="336"></object>                    
                </div>
                <div class="col-md-2 col-sm-4  col-xs-6">
                     <object data="./中俄贸易供需服务平台-首页_files/img4.png" width="200" height="336"></object>                
                </div>     
                <div class="col-md-2 col-sm-4  col-xs-6">
                     <object data="./中俄贸易供需服务平台-首页_files/img5.png" width="200" height="336"></object>                    
                </div>
                  <div class="col-md-2 col-sm-4  col-xs-6">
                    <object data="./中俄贸易供需服务平台-首页_files/img6.png" width="200" height="336"></object>                     
                </div>
                
            </div>
        </div>
    </div>
    <!--供需信息-->
    <div class="container" id="goods">       
        <h2 class="div-title">供需信息 <span>PICK OF THE WEEK</span></h2>
        <div id="gjcgdd" class="row good1 good">
        <c:forEach var="onegou" items="${gong}">
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div>
                <img src="${onegou.img1}" class="img-responsive">
                <h4 onclick="">${onegou.ordernamech}</h4>
                <p>${onegou.ordernameen}</p>
                <button onclick="">国际采购订单</button>
            </div>
        </div>
        </c:forEach>
        <div id="gjgydd" class="row good2 good">
        <c:forEach var="onecai" items="${cai}">
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div>
                <img src="${onecai.img1}" class="img-responsive">
                <h4 onclick="">${onecai.ordernamech}</h4>
                <p>${onecai.ordernameen}</p>
                <button onclick="">国际供应订单</button>
            </div>
        </div>
        </c:forEach>
    </div>
    </div>
    
    <!--合作伙伴-->
    <div class="container tabs" id="partner">   
        <div class="row">   
            <div class="col-md-5 ">
                <h2 class="div-title">合作伙伴 <span>COOPERATIVE PARTHER</span></h2>
            </div>
            <div class="col-md-7">
                <ul class="nav nav-pills nav-justified btn-group" role="group" aria-label="">
                    <li class="btn btn-default" style="background-color: rgb(51, 102, 204); color: white; border: 0px;">中国入驻企业</li>
                    <li class="btn btn-default">俄罗斯入驻企业</li>
                    <li class="btn btn-default">事业合作企业</li>
                </ul>
            </div> 
        </div>
        <div class="partner-wrap"> 
            <div class="row partner tab text" id="div_com1"> 
                <c:forEach var ="one" items="${cn}">              
                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div>
                    <img src="${one.mainpic}" class="img-responsive">
                    <h5 title="${one.comname}">${one.comname}</h5>
                    </div>
                </div>
                </c:forEach>
            </div>
            <div class="row partner tab" id="div_com2">  
                <c:forEach var ="one" items="${rs}">              
                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div>
                    <img src="${one.mainpic}" class="img-responsive">
                    <h5 title="${one.comname}">${one.comname}</h5>
                    </div>
                </div>
                </c:forEach> 
            </div>                            
            <div class="row partner tab" id="div_com3">
                <c:forEach var ="one" items="${zf}">              
                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div>
                    <img src="${one.mainpic}" class="img-responsive">
                    <h5 title="${one.comname}">${one.comname}</h5>
                    </div>
                </div>
                </c:forEach>      
            </div>           
        </div>
    </div>
    <%@include file="./../footer.jsp" %>




    <script type="text/javascript" src="./js/base.js"></script>
    <script type="text/javascript" src="./js/bootstrap.js"></script>
    <%-- <script type="text/javascript" src="./js/jquery-1.10.2.js"></script> --%>
    <script type="text/javascript" src="./js/jquery.min.js"></script>

</body>

</html>
