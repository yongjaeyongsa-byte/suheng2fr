<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/master/header.jsp"></jsp:include>
<h2>스포츠 선수 입력</h2>
<form action="${pageContext.request.contextPath}/SportsInput" onsubmit="return checkSports()">
	<table>
		<tr>
			<th>선수번호</th>
			<td>
				<input type="text" name="sno" class="sno">
			</td>
		</tr>
		<tr>
			<th>선수이름</th>
			<td>
				<input type="text" name="sname" class="sname">
			</td>
		</tr>
		<tr>
			<th>선수종목</th>
			<td>
				<input type="text" name="smajor" class="smajor">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="reset" value="다시 입력">
				<input type="submit" value="저장 하기">
			</td>
		</tr>
	</table>
</form>
<jsp:include page="/master/footer.jsp"></jsp:include>