<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>재시작</title>

<head>
<style type="text/css">
body{
  background-image: url(images/ReplayBackground.png);
  background-color: black;
  background-attachment: fixed;
  background-repeat: no-repeat;
  background-position:bottom right;
}


</style>
</head>

<script launguage="JAVASCRIPT">
  function Replay(){

      location.replace("MainLogin.jsp");

      }

</script>


<body>

<form>
  <INPUT type='image' src="images/ReplayIcon.png" value='Replay' onClick="Replay()" />
</form>

</body>

</html>
