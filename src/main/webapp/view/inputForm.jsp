<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/master/header.jsp"></jsp:include>
<h2>자료입력</h2>
<form action="${pageContext.request.contextPath}/input" onsubmit="return checkInput()">
	<table>
		<tr>
			<td>학교번호</td>
			<td><input type="text" name="sno" class="sno"></td>
		</tr>
		<tr>
			<td>학교이름</td>
			<td><input type="text" name="sname" class="sname"></td>
		</tr>
		<tr>
			<td>학교주소</td>
			<td><input type="text" name="saddr" class="saddr"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="reset" value="다시입력">
				<input type="submit" value="저장하기">
			</td>
		</tr>
	</table>
</form>
<jsp:include page="/master/footer.jsp"></jsp:include>