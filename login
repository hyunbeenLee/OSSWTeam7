<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">


<title>메인 화면(로그인))</title>
<style>
	body { background-image:url("login_background.png");
	          background-attachment: fixed;
	          background-repeat: yes-repeat;
	          background-position:bottom right;}
	          table { background-color: transparent; }
	          td { background-color: transparent; }
</style>
<script language="JavaScript">

	function Login() {

		document.frm.submit();

	}



	function Join() {

		document.frm.reset();

	}


	function FindPassword() {

		location.href="/MVC_BBS/password.do?pageNumber=${pageNumber}";

	}

</script>

</head>

<body>
<span style="line-height:50%"><br></span>
	<form action="/MVC_BBS/Login_confirm.do" method="post" name="frm">
<div style="text-align:center">
		<br /><br /><br /><br /><br /><br />
		<input type="text" name="ID" /><br /><br />

		<input type="Password" name="password" /><br /><br />

		<input type="button" value="SIGN IN" onClick="Login()" /><br />

		<input type="button" value="Create an account" onClick="Join()" /><br />

		<input type="button" value="Forgot Password?" onClick="FindPassword()" />

</div>

		<input type="hidden" value="${articleNumber}" name="articleNumber" />

		<input type="hidden" value="${pageNumber}" name="pageNumber" />

		<input type="hidden" value="${state}" name="state" />

	</form>

</body>

</html>
