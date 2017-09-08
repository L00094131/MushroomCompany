<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Add/Edit Inventory</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="customerMenu.jsp" />

	<div id="content-wrapper">
		<div id="editadd-content">
			<div id="signup-box">

				<h1>New Order</h1>
				<form:form action="orderConfirmation" method="post" modelAttribute="order">
					<table>
						<form:hidden path="order_id" />
						<tr>
							<td>Mushroom Type:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="mushroom_type">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Button Mushroom" label="Button Mushroom" />
									<form:option value="Oyster Mushroom" label="Oyster Mushroom" />
									<form:option value="Crimini Mushroom" label="Crimini Mushroom" />
									<form:option value="Winter Black Truffles"
										label="Winter Black Truffles" />
									<form:option value="Winter White Truffles"
										label="Winter White Truffles" />
								</form:select></td>
						</tr>
						<tr>
							<td>Jar Size:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="jar_size">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Small" label="Small" />
									<form:option value="Medium" label="Medium" />
									<form:option value="Large" label="Large" />
								</form:select></td>
						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="quantity">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="10" label="10" />
									<form:option value="25" label="25" />
									<form:option value="50" label="50" />
									<form:option value="100" label="100" />
									<form:option value="200" label="200" />
								</form:select></td>
						</tr>
						<tr>
							<td>Name:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;" path="name" /></td>
						</tr>
						<tr>
							<td>Delivery Address:</td>
							<td><form:textarea style="width:230px; font-size:13pt;"
								path="address" rows="5" cols="30" />
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