<title>404 Not Found</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="confirmation">
			<h1>404 - Page not found</h1>

			<img src="<c:url value="/resources/images/404mush.png"/>">
			<p>
				The page you are looking for doesn't exist. Click <a href="home">here</a>
				if you would like to go to our home page.
			</p>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>