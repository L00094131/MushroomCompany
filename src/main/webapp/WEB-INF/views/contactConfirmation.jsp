<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="confirmation">
			<h1>Contact confirmation</h1>
			<img src="<c:url value="/resources/images/speedmail.png"/>">
			<p>
				Your message has been received. We will contact you back promptly.
			</p>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>