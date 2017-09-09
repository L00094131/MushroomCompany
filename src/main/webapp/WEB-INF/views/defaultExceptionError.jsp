<title>404 Not Found</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />


	<div id="content-wrapper">
		<div id="confirmation">
			<h1>Whoops - Something went wrong</h1>

			<img src="<c:url value="/resources/images/error.jpg"/>">
			<p>Looks like something went wrong. But don't worry, it can
				happen to the best of us - and it just happened to you.</p>
			<p>
				Click <a href="home">here</a> if you would like to go to our home
				page or if you're feeling generous report what just happened <a
					href="contact">here</a>.
			</p>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>