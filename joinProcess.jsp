<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="test.model.MemberDAO" %>     
<html>
<head>
    <title>회원가입 처리 JSP</title>
</head>
<body>
        <%
            // 한글 인코딩 처리
            request.setCharacterEncoding("euc-kr");
        %>
        
        <b>회원가입 정보를 확인하세요.</b>
        <br/><br/>
        
        <!-- 자바빈 액션태그 사용 -->
        <jsp:useBean id="memberBean" class="test.bean.MemberBean" />
        <jsp:setProperty name="memberBean" property="*" />
 
        <%
            // 회원가입을 처리할 DAO클래스의 객체를 생성한다.
            MemberDAO dao = MemberDAO.getInstance();
        
            // 회원정보를 담고있는 memberBean 객체를 DAO클래스로 전달한다.
            dao.joinMember(memberBean);
        %>
        
        <b>회원가입이 되었습니다.</b><br>
        
        <b><%=memberBean.getId() %></b>님의 회원정보입니다. <br/><br/>
        
        <table border="2">
                <tr>
                    <td>아이디</td>
                    <td><%=memberBean.getId()%></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><%=memberBean.getPw()%></td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td><%=memberBean.getAddr()%></td>
                </tr>
                <tr>
                    <td>전화</td>
                    <td><%=memberBean.getTel()%></td>
                </tr>
            </table>
        </table>
</body>
</html>
