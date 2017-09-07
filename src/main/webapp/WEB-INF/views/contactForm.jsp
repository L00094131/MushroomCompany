<title>Manage Customers</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<h1>Manage Contact Messages</h1>
		<p>Below is a list of all customers contact messages from the website. Here you can note the messages and remove if necessary.</p>
		<p>If you wish to reply to the message you can open outlook <a href='https://outlook.live.com/owa/' target="_blank">here</a>.</p>
			<table class="table1">
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Message</th>
				<th>Action</th>

				<c:forEach var="contact" items="${listContact}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${contact.contact_name}</td>
						<td>${contact.contact_email}</td>
						<td>${contact.contact_telephone}</td>
						<td>${contact.contact_message}</td>
						<td><a href="deleteContact?id=${contact.contact_id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br><br>
		</div>
	<jsp:include page="_footer.jsp" />
</div>