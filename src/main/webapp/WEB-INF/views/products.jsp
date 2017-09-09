<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<title>Products</title>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<div id="content">
			<h2>Our Products</h2>
			<p>This is the range of mushrooms and truffle's we at the
				Mushroom Company provide We strive to provide the best in quality
				and freshness to our customers.</p>

			<TABLE width="850" >
				<TR>
					<TD><h3>Button Mushrooms</h3></TD>
				</TR>

				<TR>
					<TD><img
						src="<c:url value="/resources/images/buttonmushroom.jpg"/>"></TD>

					<TD><p>White Button mushrooms are tiny thumbnail sized
							mushrooms with smooth rounded caps and short truncated
							stems.Depending on when they are harvested they are either stark
							white in color or earthen brown like a Crimini mushroom. Their
							flavor is mild when raw and more fragrant and meaty when cooked.
							</p></TD>
					<TD><p><b> Small: 3 
					           Medium: 5
					           Large: 6.50 </b></p></TD>

				</TR>

				<TR>
					<TD>
							<a href="addOrderCustomer">Order Button Mushrooms</a>
					</TD>
				</TR>

				<TR>
					<TD><h3>Oyster Mushrooms</h3></TD>
				</TR>

				<TR>

					<TD><img
						src="<c:url value="/resources/images/oystermushroom.png"/>"></TD>

					<TD><p>The oyster mushroom, is a common edible mushroom.
							It was first cultivated in Germany as a subsistence measure
							during World War I and is now grown commercially around the world
							for food.It is related to the similarly cultivated king oyster
							mushroom.</p></TD>
							
					<TD><p><b> Small: 4 
					           Medium: 6 
					           Large: 7  </b></p></TD>

				</TR>

				<TR>
					<TD>
							<a href="addOrderCustomer">Order Oyster Mushrooms</a>
					</TD>
				</TR>

				<TR>
					<TD><h3>Crimini Mushrooms</h3></TD>
				</TR>

				<TR>
					<TD><img
						src="<c:url value="/resources/images/crimini_mushroom.jpg"/>"></TD>
					<TD><p>Crimini mushroom's are commonly known as "baby
							bella" or ""baby portobello".These mushrooms are dak brown and
							firmer than the common white button mushroom.They have a smooth,
							rounded cap and a sheath of skin that covers their gills.They
							have a similar taste to button mushrooms.</p></TD>
							
					<TD><p><b> Small: 4.50 
					           Medium: 7 
					           Large: 9  </b></p></TD>
				</TR>

				<TR>
					<TD>
						<a href="addOrderCustomer">Order Crimini Mushrooms</a>
					</TD>
				</TR>

				<TR>
					<TD><h2>Truffles</h2></TD>
				</TR>

				<TR>
					<TD><h3>Winter Black Truffle</h3></TD>
				</TR>

				<TR>
					<TD><img
						src="<c:url value="/resources/images/winter-black-truffle.jpg"/>"></TD>
					<TD><p>The winter black truffle is the second-most
							commercially valuable species, is named after the Périgord region
							in France and grows with oak and hazelnut trees. Black truffle's
							are harvested in late autumn and winter This truffle is
							celebrated for its garlicky flavor, reminiscent of shallots, and
							also an intense earthy and musky aroma.</p></TD>
							
					<TD><p><b> Small: 6 
					           Medium: 9 
					           Large: 11  </b></p></TD>

				</TR>

				<TR>
					<TD>
							<a href="addOrderCustomer">Order Black Truffle Mushrooms</a>
					</TD>
				</TR>

				<TR>
					<TD><h3>Winter White Truffle</h3></TD>
				</TR>

				<TR>
					<TD><img
						src="<c:url value="/resources/images/winter-white-truffle.jpg"/>"></TD>
					<TD><p>The winter white truffle is harvested in the
							summer.This truffle is celebrated for its garlicky flavor,
							reminiscent of shallots, and also an intense earthy and musky
							aroma. Fresh white truffles are not a pure white, but more of a
							yellowish color, with a smooth exterior.</p></TD>
							
					<TD><p><b> Small: 7  
					        Medium: 9 
					        Large: 12  </b></p></TD>

				</TR>

				<TR>
					<TD>
					   <a href="addOrderCustomer">Order White Mushrooms</a>
					</TD>
				</TR>


			</TABLE>


		</div>
		<jsp:include page="_footer.jsp" />

	</div>
</div>
</html>