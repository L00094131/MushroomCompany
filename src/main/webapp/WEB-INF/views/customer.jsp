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
			
			<p>This is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text, this is sample
				text, this is sample textThis is sample text, this is sample text.</p>
			<h2>Enjoy your stay</h2>

			
		</div>
		
		<div id="mushroom-group">
			<img src="<c:url value="/resources/images/mushroom-group.png"/>" height="300" width="700">

		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>