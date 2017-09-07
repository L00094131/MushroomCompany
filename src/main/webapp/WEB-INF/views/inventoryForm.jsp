<title>Manage Inventory</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<h1>Manage Inventory</h1>
		<p>Below is a list of all Inventory. Here you and edit/delete Inventory.</p>
		<p>To add a Inventory to the database click <a href="newInventory">here</a>.</p>
			<table class="table1">
				<th>ID</th>
				<th>Vendor</th>
				<th>Cost</th>
				<th>Quantity</th>
				<th>Jar Size</th>
				<th>Sell By Date</th>
				<th>Mushroom Type</th>
				<th>Action</th>

				<c:forEach var="inventory" items="${listInventory}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${inventory.vendor}</td>
						<td>${inventory.cost}</td>
						<td>${inventory.quantity}</td>
						<td>${inventory.jar_size}</td>
						<td>${inventory.sell_by_date}</td>
						<td>${inventory.mushroom_type}</td>
						<td><a href="editInventory?id=${inventory.inventory_id}">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="deleteInventory?id=${inventory.inventory_id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br><br>
		</div>
	<jsp:include page="_footer.jsp" />
</div>