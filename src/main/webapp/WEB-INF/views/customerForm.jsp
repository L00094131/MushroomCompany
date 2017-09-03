<title>Manage Customers</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<h1>Manage Customers</h1>
		<p>Below is a list of all customers signed up for the website. Here you and edit/delete customers.</p>
		<p>To add a customer to the database click <a href="newCustomer">here</a>.</p>
			<table class="table1">
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Password</th>
				<th>Postcode</th>
				<th>Type</th>
				<th>Action</th>

				<c:forEach var="customer" items="${listCustomer}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${customer.customer_first_name}</td>
						<td>${customer.customer_last_name}</td>
						<td>${customer.customer_email}</td>
						<td>${customer.customer_address}</td>
						<td>${customer.customer_phone_number}</td>
						<td>${customer.customer_password}</td>
						<td>${customer.customer_postcode}</td>
						<td>${customer.customer_type}</td>
						<td><a href="editCustomer?id=${customer.customer_id}">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="deleteCustomer?id=${customer.customer_id}">Delete</a></td>

					</tr>
				</c:forEach>
			</table>
			<br><br>
		</div>
	<jsp:include page="_footer.jsp" />
</div>