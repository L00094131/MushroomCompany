<title>Manage Orders</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />
	
        <div id="content-wrapper">
		  <div id="editadd-content">
		   <div id="signup-box">

				<h1>Order</h1>
				<form:form action="saveOrder" method="post"
					modelAttribute="order">
					<table>
						<form:hidden path="Order_ID" />
						<form:hidden path="Inventory_ID" />
						<form:hidden path="Customer_ID" />
						<tr>
							
							<td>Mushroom Type:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="mushroom_Type" /></td>
						</tr>
						<tr>
							<td>Jar Size:</td>
							<td><form:select
									style="height:25px; width:230px; font-size:13pt;"
									path="jar_size">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Small" label="Small" />
									<form:option value="Medium" label="Medium" />
									<form:option value="Large" label="Large" />
								</form:select></td>
						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="quantity" /></td>
						</tr>
						<tr>
							<td>Sell_By_Date:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="sell_By_Date" /></td>
						</tr>
						<tr>
							<td>Delivery:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;"
									path="deliver_Date" /></td>
								
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
					