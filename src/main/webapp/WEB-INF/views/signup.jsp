<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script type="text/javascript">
<!--
	function validate() {
		var name_regex = /^[a-zA-Z]+$/;

		//first name 
		if (document.signupform.customer_first_name.value == "") {
			document.getElementById('firstname_error').innerHTML = "*Please enter first name*";
			return false;
		} else {
			document.getElementById('firstname_error').innerHTML = "";
		}

		//second name
		if (document.signupform.customer_last_name.value == "") {
			document.getElementById('lastname_error').innerHTML = "*Please enter last name*";
			return false;
		} else {
			document.getElementById('lastname_error').innerHTML = "";
		}

		//email
		if (document.signupform.customer_email.value == "") {
			document.getElementById('email_error').innerHTML = "*Please enter email*";
			return false;
		} else {
			document.getElementById('email_error').innerHTML = "";
		}

		//password
		if (document.signupform.customer_password.value == "") {
			document.getElementById('password_error').innerHTML = "*Please enter password*";
			return false;
		} else {
			document.getElementById('password_error').innerHTML = "";
		}

		//address
		if (document.signupform.customer_address.value == "") {
			document.getElementById('address_error').innerHTML = "*Please enter address*";
			return false;
		} else {
			document.getElementById('address_error').innerHTML = "";
		}

		//address
		if (document.signupform.customer_address.value == "") {
			document.getElementById('address_error').innerHTML = "*Please enter address*";
			return false;
		} else {
			document.getElementById('address_error').innerHTML = "";
		}

		//postcode
		if (document.signupform.customer_postcode.value == "") {
			document.getElementById('postcode_error').innerHTML = "*Please enter postcode*";
			return false;
		} else {
			document.getElementById('postcode_error').innerHTML = "";
		}
		
		//phone number
		if (document.signupform.customer_phone_number.value == "") {
			document.getElementById('phone_error').innerHTML = "*Please enter telephone number*";
			return false;
		} else {
			document.getElementById('phone_error').innerHTML = "";
		}

	}
//-->
</script>

<div id="wrapper">
	<jsp:include page="_header.jsp" />
	<jsp:include page="_menu.jsp" />

	<div id="content-wrapper">
		<h1>Sign Up</h1>
		<p>In order to sign up, we just need a few details from you</p>

		<form:form name="signupform" action="signupConfirmation"
			onsubmit="return validate();" method="post" modelAttribute="customer">
			<table>
				<form:hidden path="customer_id" />
				<tr>
					<td>First Name:</td>
					<td><form:input path="customer_first_name"
							id="customer_first_name" />
						<div id="firstname_error"></div></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="customer_last_name" />
						<div id="lastname_error"></div></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="customer_email" type='text' />
						<div id="email_error"></div></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="customer_password" type='password' />
						<div id="password_error"></div></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="customer_address" /><div id="address_error"></div></td>
				</tr>
				<tr>
					<td>Postcode:</td>
					<td><form:input path="customer_postcode" /><div id="postcode_error"></div></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><form:input path="customer_phone_number" /><div id="phone_error"></div></td>
				</tr>
				<tr>
					<form:hidden path="customer_type" />
				</tr>
				<tr>
					<td colspan="2" align="center"><input id="submit"
						name="Submit" type="submit" value="Submit"></td>
				</tr>
			</table>

		</form:form>

	</div>
	<jsp:include page="_footer.jsp" />
</div>