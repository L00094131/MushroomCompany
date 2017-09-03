<title>Manage Orders</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--hello-->
<!-- hello 2 -->
<!-- hello 3 -->
<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />
	

	<div id="content-wrapper">
		<div id="content">
				<h1>Order Form</h1>
				
					
				</h3>
				<table border="1">
					<th>Product type</th>
					<th>Quantity</th>
					<th>Preferences</th>
					
					<c:forEach var="order" items="${listOrder}"
						varStatus="status">
						<tr>	
						<td>${status.index + 1}</td>
							<td>${customer.productType}</td>
							<td>${customer.quantity}</td>
							<td>${customer.preference}</td>
							
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
					