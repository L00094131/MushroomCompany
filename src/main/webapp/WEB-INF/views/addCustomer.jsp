<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Add/Edit Customer</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<div id="editadd-content">
			<div id="signup-box">

				<h1>New/Edit Customer</h1>
				<form:form action="saveCustomer" method="post"
					modelAttribute="customer">
					<table>
						<form:hidden path="customer_id" />
						<tr>
							<td>Customer ID:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_ID" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_last_name" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_email" /></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_address" /></td>
						</tr>
						<tr>
							<td>Telephone:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_phone_number" /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_password" /></td>
						</tr>
						<tr>
							<td>Postcode:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_postcode" /></td>
						</tr>
						<tr>
							<td>Type:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="customer_type">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Primary Customer" label="Primary Customer" />
									<form:option value="Normal Customer" label="Normal Customer" />
								</form:select></td>
						</tr>
						<tr>
							<td colspan="2" align="right"><input type="submit"
								value="Save"></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>

		<jsp:include page="_footer.jsp" />
	</div>
</div>