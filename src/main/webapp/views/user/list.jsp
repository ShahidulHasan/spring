<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Being Java Guys | User Details</title>
</head>
<body>
		<div style="color: teal; font-size: 30px">Being Java Guys | User
			Details</div>

		<c:if test="${!empty users}">
			<table border="1" bgcolor="black" width="600px">
				<tr style="background-color: teal; color: white; text-align: center;" height="40px">
					<td>username</td>
					<td>password</td>
					<td>action</td>
				</tr>
				<c:forEach items="${users}" var="user">
					<tr style="background-color: white; color: black; text-align: center;" height="30px">
						<td><c:out value="${user.username}" /></td>
						<td><c:out value="${user.password}" /></td>
						<%--<td><a href="user-edit?id=${user.username}">Edit</a></td>--%>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<a href="user-create">Click Here to add new User</a>
</body>
</html>
