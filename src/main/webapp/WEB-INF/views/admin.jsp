<title>Admin Home</title>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_adminMenu.jsp" />

	<div id="content-wrapper">
		<div id="content">
			<p>
			<h1>Welcome Admin</h1>
			<p>This is the admin section. Here the admin manage the various
				tasks on the website. These tasks include: adding/editing customers
				signed up the the database, setting the customer type, managing
				(viewing/removing) orders, adding/editing/removing inventory from
				the site, and viewing/removing any contact messages made by users of
				the website.</p>
			<br>
			<p>- Keep an eye on prices with the following currceny converter:</p>
			<!-- Currency Converter Script - EXCHANGERATEWIDGET.COM -->
			<div
				style="width: 550px; border: 3px solid #C0A172; border-radius: 5px;">
				<div
					style="text-align: center; background-color: #C0A172; height: 18px; width: 100%; font-size: 13px; font-weight: bold; padding-top: 0px;">
					<a href="https://www.exchangeratewidget.com/"
						style="color: #FFFFFF; text-decoration: none;" rel="nofollow">Currency
						Converter</a>
				</div>
				<script type="text/javascript"
					src="//www.exchangeratewidget.com/converter.php?l=en&f=EUR&t=GBP&a=1&d=F0F0F0&n=FFFFFF&o=000000&v=4"></script>
			</div>
			<!-- End of Currency Converter Script -->
					<br>
		<br> 
		</div>

		<div id="right-side-admin">
			<h2>Our Mailing Address</h2>
			<ul id="addressList">
				<li>123 Main Street</li>
				<li>Letterkenny</li>
				<li>Co. Donegal</li>
				<li>Ireland</li>
				<li>Tel: (074) 91 058123</li>
			</ul>

			<h2>Quick links</h2>
			<ul>
				<li><a href='https://outlook.live.com/owa/' target="_blank">Outlook</a></li>
				<li><a href="https://www.eirphonebook.ie/" target="_blank">Eircom
						Phone Book</a></li>
				<li><a href="http://www.ise.ie/" target="_blank">Mushroom
						Stock Exchange</a></li>
				<li><a href="https://www.google.ie/" target="_blank">Google</a></li>
			</ul>
		</div>


		<jsp:include page="_footer.jsp" />
	</div>
</div>