<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Add/Edit Inventory</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<div id="editadd-content">
			<div id="signup-box">

				<h1>New/Edit Inventory</h1>
				<form:form action="saveInventory" method="post"
					modelAttribute="inventory">
					<table>
						<form:hidden path="inventory_id" />
						<tr>
							<td>Vendor:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="vendor" /></td>
						</tr>
						<tr>
							<td>Cost:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="cost" /></td>
						</tr>
						<tr>
							<td>quantity:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="quantity" /></td>
						</tr>
						<tr>
							<td>jar_size:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="jar_size" /></td>
						</tr>
						<tr>
							<td>sell_by_date:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="sell_by_date" /></td>
						</tr>
						<tr>
							<td>mushroom_type:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="mushroom_type" /></td>
						</tr>
						<tr>
							<td colspan="2" align="right"><input type="submit"
								value="Save"></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>

		<jsp:include page="_footer.jsp" />
	</div>
</div>