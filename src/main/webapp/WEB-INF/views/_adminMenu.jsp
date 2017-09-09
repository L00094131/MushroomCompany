<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="<c:url value="/resources/css/menustyles.css" />"
	rel="stylesheet">

<div class="menu-container">
	<div id="topnav">
		<ul>
			<li><a href="admin">Admin Home</a></li>
			<li><a href="customerForm">Manage Customers</a></li>
			<li><a href="orderForm">Manage Orders</a></li>
			<li><a href="inventoryForm">Manage Inventory</a></li>
			<li><a href="contactForm">Contact Messages</a></li>
			<li style="float: right"><a href='login'>Logout</a></li>

		</ul>
	</div>
</div>