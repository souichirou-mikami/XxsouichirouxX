<%-- 
    Document   : homepage_manage
    Created on : 2020/07/17, 18:52:12
    Author     : owner
--%>

<%-- 
    Document   : homepage_user
    Created on : 2020/07/17, 18:49:50
    Author     : owner
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    /* layout */
    body,p,form,input{margin: 0}
    #form{
        width: 400px;
        margin: 30px auto;
        padding: 20px;
        border: 1px solid #FF5F17;
    }

    form p{
        font-size: 14px;
    }

    .form-title{
        text-align: center;
    }

    #first_box{
      padding-top:30px;
      padding-bottom:50px;
      margin-right:auto;
      margin-left:auto;
      width:18em;
    }

    #second_box{
      padding-top:50px;
      margin-right:auto;
      margin-left:auto;
      width:18em;
    }

    #right_box{
      float:right;
    }

    #left_box{
      float:left;
    }

    /* font */
    #form p{
        color: #077685;
        font-weight: bold;
    }

    #form .form-title{
        font-family: Arial;
        font-size: 30px;
        color: #FF5F17;
    }

    /* skin */
    #form{
        -webkit-border-radius: 6px;
        -moz-border-radius: 6px;
        border-radius: 6px;
        -webkit-box-shadow: 0px 1px 10px #FF9872;
        -moz-box-shadow: 0px 1px 10px #FF9872;
        box-shadow: 0px 1px 10px #FF9872;
        border: solid #FF5F17 2px;
        background: #fafafa;
        padding-bottom:100px;
    }

    #form .form-title{
        padding-bottom: 6px;
        border-bottom: 3px solid #440000;
        margin-bottom: 20px;
    }

    .btn-gradient-3d-simple {
  display: inline-block;
  padding: 0.5em 1em;
  text-decoration: none;
  border-radius: 4px;
  color: #440000;
  font-weight:bold;
  background-image: linear-gradient(#FFC7AF 0%, #FFD5EC 100%);
  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.29);
  border-bottom: solid 3px #440000;
}

.btn-gradient-3d-simple:active {
  -webkit-transform: translateY(4px);
  transform: translateY(4px);
  box-shadow: 0px 0px 1px rgba(0, 0, 0, 0.2);
  border-bottom: none;
}

</style>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <title>ユーザホームページ</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    </head>
    <body>
        <div id="form">
            <p class="form-title">OOさんのホームページ</p>
            <div id="first_box">
            <div id="left_box">
                <a href="#" class="btn-gradient-3d-simple">　予約確認　</a>
            </div>
            <div id="right_box">
              <a href="#" class="btn-gradient-3d-simple">　記録閲覧　</a>
            </div>
          </div>

          <div id="second_box">
            <div id="left_box">
              <a href="#" class="btn-gradient-3d-simple">　献立追加　</a>
            </div>
            <div id="right_box">
              <a href="#" class="btn-gradient-3d-simple">利用状況追加</a>
            </div>
          </div>
        </div>
    </body>
</html>