<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="highlow.model.HighLow" %>
<%@ page import="highlow.model.GameCard" %>
<%   
      HighLow highlow = (HighLow)request.getAttribute("highlow");
      String firstimag = (String)request.getAttribute("firstimag");
      String secondimag = (String)request.getAttribute("secondimag");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>High & Low Game</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    
    <div id="title">
    
    <button id="questionbutton">?</button>
    <div id="modal" class="modal">
        <div class="modal-content">
        <div align="right">
        <button id="closebutton">×</button>
        </div >
        <div id="modal-text">
          <h2>High & Low Gameの遊び方</h2>
           <p class="modal-sentence"> 一枚目のカードの数字より、二枚目のカードの数字が大きい(High)か、小さいか(Low)を当てるゲームです。</p>
           <p class="modal-sentence">一枚目のカードの数字と二枚目のカードの数字が同じ場合、負けになります。</p>
        </div>
        </div>
    </div>
    
    <h1>High & Low Game</h1>
    </div>
    
    <div id="imgCard">
    <div><img src="img/<%= firstimag %>.png"  alt="<%=GameCard.getFirstCard() %>"></div>
    <div><img src="img/backside.png"  alt="伏せたカード"></div>
    </div>
    
    <form action="ResultServlet" method="post">
        <button class="button" type="submit" name="choice" value="high">High</button>
        <p class="formfont">or</p>
        <button class="button" type="submit" name="choice" value="low">Low</button>
        <p class="formfont">?</p>
    </form>
    
    <script src="js/index.js"></script>
</body>
</html>