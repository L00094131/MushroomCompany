<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<title>Home</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/menustyles.css" />"
	rel="stylesheet">

</head>

<body>
	<div id="wrapper">
		<jsp:include page="_header.jsp" />
		<jsp:include page="_menu.jsp" />



		<div id="content-wrapper">
			<div id="content">
				<h1>Welcome</h1>
				<p>Welcome to the Mushroom Company. We are an organic locally grown 
				mushroom farm who provide a range of mushrooms and truffle's</p>
				<h2>What we provide</h2>
				<p>We specialise in a vast amount of unique and exciting mushroom and truffle
				 delicacies. </p>

				<div id="box1">
					<img src="<c:url value="/resources/images/box1.jpg"/>">
					<h2>Mushrooms</h2>
					<p>Our mushrooms are produced to the highest quality and taste 
					of any others in the region of Pennsylvania.From button to oysters we offer
					an exciting range of tasteful delicacies to satisfy any food lover.</p>
				</div>

				<div id="box2">
					<img src="<c:url value="/resources/images/box2.png"/>">
					<h2>Truffles</h2>
					<p>At the right time of the year, our farmers source locally grown truffle's
					which deliver an exotic and desirable taste for our customers.Hand picked from 
					or local gardens and traditionally picked by our very own pigs.Our range of truffles
					are the ideal treat for any food enthusiast. </p>
				</div>
			</div>

			<div id="right-side">
				<h2>Our Address</h2>
				<ul id="addressList">
					<li>123 Main Street</li>
					<li>Letterkenny</li>
					<li>Co. Donegal</li>
					<li>Ireland</li>
					<li>Tel: (074) 91 058123</li>
				</ul>
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2291.280075589289!2d-7.739189584363695!3d54.95064778034645!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x485f94ccc1511609%3A0x94ae4d838a4b6d17!2sMain+Street!5e0!3m2!1sen!2sie!4v1502550701292"
					width="300" height="225" frameborder="0" style="border: 0" allowfullscreen> </iframe>
				<br>
				<h2>Why choose us?</h2>
				<ul>
					<li>Professional service</li>
					<li>Fast delivery</li>
					<li>Competitive prices</li>
					<li>V.A.T registered. Tax compliant</li>
					<li>Friendly staff</li>
				</ul>


			</div>
		</div>
		<jsp:include page="_footer.jsp" />

	</div>
</body>

</html>