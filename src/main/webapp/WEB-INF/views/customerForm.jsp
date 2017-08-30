<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="content">
				<h1>Customer List</h1>
				<h3>AKIAI624FRSFUWRGIINAAKIAI624FRSFUWRGIINA
					<a href="newCustomer">Add A New Customer</a>
				</h3>
				<table border="1">
					<th>No</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Telephone</th>
					<th>Action</th>

					<c:forEach var="customer" items="${listCustomer}"
						varStatus="status">
						<tr>
							<td>${status.index + 1}</td>
							<td>${customer.name}</td>
							<td>${customer.email}</td>
							<td>${customer.address}</td>
							<td>${customer.telephone}</td>
							<td><a href="editCustomer?id=${customer.id}">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="deleteCustomer?id=${customer.id}">Delete</a></td>

						</tr>
					</c:forEach>
				</table>
			</div>
			<jsp:include page="_footer.jsp" />
	</div>
</div>