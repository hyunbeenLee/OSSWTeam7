<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
    <title>회원가입 화면</title>
</head>
<body>
        <form action="joinProcess.jsp" method="post">
            <table border="2">
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="id" /></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pw" /></td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td><input type="text" size="20" name="addr"/></td>
                </tr>
                <tr>
                    <td>전화</td>
                    <td><input type="text" name="tel"/></td>
                </tr>
            </table>
            <br><br><input type="submit" value="회원가입">
        </form>    
</body>
</html>
