<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="content">
				<h1>New/Edit Customer</h1>
				<form:form action="saveCustomer" method="post"
					modelAttribute="customer">
					<table>
						<form:hidden path="id" />
						<tr>
							<td>Name:</td>
							<td><form:input path="name" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input path="email" /></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><form:input path="address" /></td>
						</tr>
						<tr>
							<td>Telephone:</td>
							<td><form:input path="telephone" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Save"></td>
						</tr>
					</table>
				</form:form>
			</div>
			<jsp:include page="_footer.jsp" />
	</div>
</div>