<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Contact</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="content">
			<form:form name="contactForm" action="contactConfirmation"
				method="post" modelAttribute="contact">
				<table>
					<form:hidden path="contact_id" />
					<tr>
						<td>Name:</td>
						<td><form:input
								style="height:25px; width:230px; font-size:13pt;"
								path="contact_name" />
					</tr>
					<tr>
						<td>Email:</td>
						<td><form:input
								style="height:25px; width:230px; font-size:13pt;"
								path="contact_email" />
					</tr>
					<tr>
						<td>Telephone (optional):</td>
						<td><form:input
								style="height:25px; width:230px; font-size:13pt;"
								path="contact_telephone" /></td>
					</tr>
					<tr>
						<td>Message:</td>
						<td><form:textarea style="width:230px; font-size:13pt;"
								path="contact_message" rows="5" cols="30" />
					</tr>
					<tr>
						<td colspan="2" align="right"><input id="submit"
							name="Submit" type="submit" value="Submit"></td>
					</tr>
				</table>

			</form:form>
		</div>
		<jsp:include page="_footer.jsp" />
	</div>
</div>