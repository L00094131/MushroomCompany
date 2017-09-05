<title>Manage Orders</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--hello-->
<!-- hello 2 -->
<!-- hello 3 -->
<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />
	
        <div id="content-wrapper">
		<div id="editadd-content">
		<div id="signup-box">

				<h1>Order Form</h1>
				<form id="customer" action="saveCustomer" method="post">
					<table>
					<input id="customer_id" name="customer_id" type="hidden" value="0"/>
					    <tr>
							<td>Customer ID:</td>
							<td><input id="order_type" name="order_type" style="height:25px; width:230px; font-size:13pt;" type="text" value=""/></td>
						</tr>
						<tr>
							<td>Type:</td>
							<td><input id="order_type" name="order_type" style="height:25px; width:230px; font-size:13pt;" type="text" value=""/></td>
						</tr>
						<tr>
							<td>Size:</td>
							<td><select id="order_size" name="order_size" style="height:25px; width:230px; font-size:13pt;">
									<option value="Not Selected">--SELECT--</option>
									<option value="Small">Small</option>
									<option value="Medium">Medium</option>
									<option value="Large">Large</option>
								</select></td>
						</tr>

						<tr>
							<td>Quantity:</td>
							<td><input id="order_quantity" name="order_size" style="height:25px; width:230px; font-size:13pt;" type="text" value=""/></td>
						</tr>
						<tr>
							<td>Preferences:</td>
							<td><input id="order_preference" name="order_preference" style="height:25px; width:230px; font-size:13pt;" type="text" value=""/></td>
						</tr>
							<tr>
							<td colspan="2" align="right"><input type="submit"
								value="Confirm"></td>
						</tr>
					</table>
				</form>
							
			</div>			
			</div>
			<jsp:include page="_footer.jsp" />
	</div>
</div>				
					