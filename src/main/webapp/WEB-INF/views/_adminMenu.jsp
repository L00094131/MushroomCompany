<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="<c:url value="/resources/css/menustyles.css" />"
	rel="stylesheet">

<div class="menu-container">
	<div id="topnav">
		<ul>
			<li><a href="home">Home</a></li>
			<li><a href="products">Products</a></li>
			<li><a href='contact'>Contact</a></li>
			<li><a href="about">About</a></li>
			<li class="has-sub"><a href="#">Manage</a>
				<ul>
					<li><a href="customerForm">Manage Customers</a></li>
					<li><a href="orderForm">Manage Orders</a></li>
					<li><a href="productForm">Manage Products</a></li>
				</ul></li>
			<li style="float: right"><a href='login'>Sign-In</a></li>
		</ul>
	</div>
</div>