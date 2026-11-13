<%@page import="java.util.ArrayList"%>
<%@page import="dto.SchoolDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ArrayList<SchoolDTO> list = (ArrayList<SchoolDTO>)request.getAttribute("list");
%>
<jsp:include page="/master/header.jsp"></jsp:include>
<h2>학교 목록조회 (신으로 시작하는 학교만)</h2>
<table>
	<tr>
		<td>학교번호</td>
		<td>학교이름</td>
		<td>학교주소</td>
	</tr>
	<tr>
	<%for(SchoolDTO dto:list) { %>
		<tr>
			<td><%=dto.getSno()%></td>
			<td><%=dto.getSname()%></td>
			<td><%=dto.getSaddr()%></td>
		</tr>
		<%} %>
</table>





<jsp:include page="/master/footer.jsp"></jsp:include>