<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<title>Products</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="content">
			<h1>products page</h1>

			<p>This is the range of mushrooms and truffle's we at the
				Mushroom Company provide We strive to provide the best in quality
				and freshness to our customers.
			<h2>Mushrooms</h2>

			<div id="buttonmushroom">
				<img src="<c:url value="/resources/images/buttonmushroom.jpg"/>">
			</div>
			<div id="button_mushroom_text">
				<p>Button mushrooms for sale Button mushrooms for sale Button
					mushrooms for sale Button mushrooms for sale Button mushrooms for
					sale Button mushrooms for sale</p>

			</div>


		</div>
		<jsp:include page="_footer.jsp" />

	</div>
</div>
</html>