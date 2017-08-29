<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>Login</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="login-box">

			<h3>Login with username and password</h3>

			<c:if test="${not empty error}">
				<div class="error">${error}</div>
			</c:if>
			<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
			</c:if>

			<form name='loginForm' action="<c:url value='/login' />"
				method='POST'>

				<table>
					<tr>
						<td>User:</td>
						<td><input type='text' name='username' value=''></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type='password' name='password' /></td>
					</tr>
					<tr>
						<td colspan='2'><input name="submit" type="submit"
							value="Submit" /></td>
					</tr>
				</table>
				<p>Don't have an account? Sign up <a href="signup">here</a>.</p>

				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />

			</form>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>