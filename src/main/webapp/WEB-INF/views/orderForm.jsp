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
		
		<table class="table1">
		<th>Order ID</th>
		<th>Mushroom Type</th>
		<th>Jar Size</th>
		<th>Quantity</th>
		<th>Sell By Date</th>
		<th>Deliver Date</th>
		
		<c:forEach var="order" items="${listOrder}" varStatus="status">
		<tr>
		    <td>${status.index + 1}</td>
		    <td>${order.mushroom_Type}</td>
			<td>${order.jar_size}</td>
			<td>${order.quantity}</td>
			<td>${order.sell_By_Date}</td>
			<td>${order.deliver_Date}</td>
			
			
			

		</tr>
		</c:forEach>
		</table>
		<br><br>
		</div>
	<jsp:include page="_footer.jsp" />
</div>
				