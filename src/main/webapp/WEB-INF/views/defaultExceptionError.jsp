<title>Page Error</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />


	<div id="content-wrapper">
		<div id="confirmation">
			<h1>Whoops - Something went wrong</h1>

			<img src="<c:url value="/resources/images/error.jpg"/>">
			<p>
				Click <a href="home">here</a> if you would like to go to our home
				page or if you're feeling generous report what just happened <a
					href="contact">here</a>.
			</p>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>