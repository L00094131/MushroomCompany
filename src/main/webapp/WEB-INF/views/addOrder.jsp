<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Add/Edit Orders</title>
<script type="text/javascript">
<!--
	function calculatePrice(orderForm) {

		//Get selected data  
		var elt1 = document.getElementById("mushroom_type");
		var mushroom_type = elt1.options[elt1.selectedIndex].value;

		var elt2 = document.getElementById("jar_size");
		var jar_size = elt2.options[elt2.selectedIndex].value;

		var elt3 = document.getElementById("quantity");
		var quantity = elt3.options[elt3.selectedIndex].value;

		//mushroom type
		if (mushroom_type == "Button Mushroom") {
			mushroom_type_total = 6.00;
		} else if (mushroom_type == "Oyster Mushroom") {
			mushroom_type_total = 7.50;
		} else if (mushroom_type == "Crimini Mushroom") {
			mushroom_type_total = 10.50;
		} else if (mushroom_type == "Winter Black Truffles") {
			mushroom_type_total = 35.00;
		} else if (mushroom_type == "Winter White Truffles") {
			mushroom_type_total = 49.00;
		}

		//jar size
		if (jar_size == "Small") {
			jar_size_total = 5.00;
		} else if (jar_size == "Medium") {
			jar_size_total = 8.50;
		} else if (jar_size == "Large") {
			jar_size_total = 10.00;
		}

		//quantity
		if (quantity == "10") {
			quantity_total = 15.00;
		} else if (quantity == "25") {
			quantity_total = 18.50;
		} else if (quantity == "50") {
			quantity_total = 45.00;
		} else if (quantity == "100") {
			quantity_total = 90.00;
		} else if (quantity == "200") {
			quantity_total = 180.00;
		}

		var total = mushroom_type_total + jar_size_total + quantity_total;
		//print value to  PicExtPrice 
		document.getElementById("PicExtPrice").value = total;
	}
//-->
</script>
<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<div id="editadd-content">
			<div id="signup-box">

				<h1>Edit/New Order</h1>
				<form:form name="orderForm" action="saveOrder" method="post"
					modelAttribute="order">
					<table>
						<form:hidden path="order_id" />
						<tr>
							<td>Mushroom Type:</td>
							<td><form:select name="mushroom_type"
									onChange="calculatePrice()" id="mushroom_type"
									style="height:25px; width:230px; font-size:13pt;"
									path="mushroom_type">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Button Mushroom" label="Button Mushroom" />
									<form:option value="Oyster Mushroom" label="Oyster Mushroom" />
									<form:option value="Crimini Mushroom" label="Crimini Mushroom" />
									<form:option value="Winter Black Truffles"
										label="Winter Black Truffles" />
									<form:option value="Winter White Truffles"
										label="Winter White Truffles" />
								</form:select></td>
						</tr>
						<tr>
							<td>Jar Size:</td>
							<td><form:select name="jar_size" onChange="calculatePrice()"
									id="jar_size" style="height:25px; width:230px; font-size:13pt;"
									path="jar_size">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="Small" label="Small" />
									<form:option value="Medium" label="Medium" />
									<form:option value="Large" label="Large" />
								</form:select></td>
						</tr>
						<tr>
							<td>Quantity:</td>
							<td><form:select name="quantity" onChange="calculatePrice()"
									id="quantity" style="height:25px; width:230px; font-size:13pt;"
									path="quantity">
									<form:option value="Not Selected">--SELECT--</form:option>
									<form:option value="10" label="10" />
									<form:option value="25" label="25" />
									<form:option value="50" label="50" />
									<form:option value="100" label="100" />
									<form:option value="200" label="200" />
								</form:select></td>
						</tr>
						<tr>
							<td>Name:</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt;" path="name" /></td>
						</tr>
						<tr>
							<td>Delivery Address:</td>
							<td><form:textarea style="width:230px; font-size:13pt;"
									path="address" rows="5" cols="30" />
						</tr>
						<tr>
							<td>Price (€):</td>
							<td><form:input
									style="height:25px; width:230px; font-size:13pt; text-align:right;"
									path="price" id="PicExtPrice" readonly="true" /></td>
						</tr>
						<tr>
							<td colspan="2" align="right"><input type="submit"
								value="Place Order"></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>

		<jsp:include page="_footer.jsp" />
	</div>
</div>