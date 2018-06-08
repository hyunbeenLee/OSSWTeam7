<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입</title>
<style type="text/css">
body { background-image:url("images/login_background.png");
	          background-attachment: fixed;
	          background-repeat: yes-repeat;
	          background-position:bottom right;}
	          table { background-color: transparent; }
	          td { background-color: transparent; }

body{text-align:center;}

</style>

<script language="JavaScript">

	
	function CANCEL() {

		
		location.replace("MainLogin.jsp");


	}

</script>



</head>
<body>
 <table>
  <tr>
  <br>
   <br><br>
 <div class="col-md-6 col-md-offset-3">
            <div class="form-group">
            	<input type="text" class="form-control" id="Id" placeholder="아이디">
            </div>
			
            <div class="form-group">
            	<input type="password" class="form-control" id="Password" placeholder="비밀번호">
            </div>
            <div class="form-group">
              <input type="password" class="form-control" id="Password2" placeholder="비밀번호 확인">
            </div>

            <div class="form-group">
              <input type="text" class="form-control" id="Name" placeholder="이름을 입력해 주세요">
            </div>
             <div class="form-group">
              <input type="text" class="form-control" id="NickName" placeholder="닉네임을 입력해 주세요">
            </div>

            <div class="form-group">
              <input type="email" class="form-control" id="Email" placeholder="이메일 주소를 입력해 주세요">
            </div>

 </tr>

  <tr>
   
   <br>
    <input type="submit" value="CHECK" onClick="CHECK()"/>&nbsp; <!--가입신청-->
    <input type="button" value="CANCEL" onClick="CANCEL()"/> <!--취소-->
  </div>
  </tr>
</table>
</body>
</html>
