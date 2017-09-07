<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Add/Edit Inventory Items</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<div id="editadd-content">
			<div id="signup-box">

				<h1>New/Edit Inventory</h1>
				<form:form action="saveInventory" method="post"
<<<<<<< HEAD
					modelAttribute="inventory">
=======
					modelAttribute="Inventory"> 
>>>>>>> branch 'master' of https://github.com/L00094131/MushroomCompany
					<table>
						<form:hidden path="Inventory_ID" />
						<tr>
							<td>Vendor ID:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="Vendor_ID" /></td>
						</tr>
						<tr>
							<td>Cost:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="Cost" /></td>
						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="Quantity" /></td>
						</tr>
						<tr>
							<td>Jar Size:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="Jar_size">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Small" label="Small" />
									<form:option value="Medium" label="Medium" />
									<form:option value="Large" label="Large" />
								</form:select></td>
						</tr>
						<tr>
							<td>Sell By Date:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="Sell_By_Date" /></td>
						</tr>
						<tr>
							<td>Mushroom Type:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="Mushroom_Type" /></td>
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