<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="confirmation">
			<h1>Order confirmation</h1>
			<img src="<c:url value="/resources/images/mushconfirm.jpg"/>">
			<h3>Your order has been received. Please check your order page to view order details.</h3>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>