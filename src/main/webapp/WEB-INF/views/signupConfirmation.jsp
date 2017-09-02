<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="confirmation">
			<h1>Sign up confirmation</h1>
			<img src="<c:url value="/resources/images/greentick.png"/>">
			<p>
				Your account has been created. To sign in, click <a href="login">here</a>.
			</p>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>