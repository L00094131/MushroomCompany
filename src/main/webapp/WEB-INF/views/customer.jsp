<title>Customer Home</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="customerMenu.jsp" />

	<div id="content-wrapper">
		<div id="content">
			<h1>Welcome to the Customer page</h1>
			
			<p>Here at the Mushroom Company, we cater our products to a vast range of customers. From high
			end restaurants to local food lover , supply only the best quality of fresh produce to all customers.
			 we encourage new customers of all types and will strive to do our best to satisfy our customers.
			 To register to become a free member of the mushroom Company , please follow the link below to gain one 
			 step closer to locally produced mushrooms and truffle's.
			inquiry </p>
			<a href="newCustomer"> New Customer ?</a>
			<h2>Enjoy your stay</h2>

			
		</div>
		
		<div id="mushroom-group">
			<img src="<c:url value="/resources/images/mushroom-group.png"/>" height="300" width="700">

		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>