<title>Manage Orders</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<h1>Manage Orders</h1>
		<p>Below is a list of all orders made on the website. You can edit
			the orders here. You can also delete the order once processed.</p>
		<p>
			To add orders to the database click <a href="newOrder">here</a>.
		</p>
		<table class="table1">
			<th>ID</th>
			<th>Mushroom Type</th>
			<th>Jar Size</th>
			<th>Quantity</th>
			<th>Name</th>
			<th>Address</th>
			<th>Price</th>
			<th>Action</th>

			<c:forEach var="order" items="${listOrder}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${order.mushroom_type}</td>
					<td>${order.jar_size}</td>
					<td>${order.quantity}</td>
					<td>${order.name}</td>
					<td>${order.address}</td>
					<td>${order.price}</td>
					<td><a href="editOrder?id=${order.order_id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteOrder?id=${order.order_id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<br> <br>
	</div>
	<jsp:include page="_footer.jsp" />
</div>