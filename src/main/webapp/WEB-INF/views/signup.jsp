<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Sign Up</title>
<script type="text/javascript">

<!--
	function validateFirstName() {
		//first name 
		if (document.signupform.customer_first_name.value == "") {
			document.getElementById('firstname_error').innerHTML = "*First name cannot be empty.*";
			return false;
		} else {
			document.getElementById('firstname_error').innerHTML = "";
			return true;
		}
	}

	function validateLastName() {
		//second name
		if (document.signupform.customer_last_name.value == "") {
			document.getElementById('lastname_error').innerHTML = "*Last name cannot be empty.*";
			return false;
		} else {
			document.getElementById('lastname_error').innerHTML = "";
			return true;
		}
	}
	
	function validatePassword() {
		//password
		if (document.signupform.customer_password.value == "") {
			document.getElementById('password_error').innerHTML = "*Password cannot be empty.*";
			return false;
		} else {
			document.getElementById('password_error').innerHTML = "";
			return true;
		}
	}
	
	function validateAddress() {
		//address
		if (document.signupform.customer_address.value == "") {
			document.getElementById('address_error').innerHTML = "*Address cannot be empty.*";
			return false;
		} else {
			document.getElementById('address_error').innerHTML = "";
			return true;
		}
	}
	
	function validatePostcode() {
		//postcode
		if (document.signupform.customer_postcode.value == "") {
			document.getElementById('postcode_error').innerHTML = "*Postcode cannot be empty.*";
			return false;
		} else {
			document.getElementById('postcode_error').innerHTML = "";
			return true;
		}
	}
	function validatePhoneNumber() {
		//phone number
		if (document.signupform.customer_phone_number.value == "") {
			document.getElementById('phone_error').innerHTML = "*Telephone cannot be empty.*";
			return false;
		} else {
			document.getElementById('phone_error').innerHTML = "";
			return true;
		}

	}

	function validateEmail(mail) {
		var regex = /^(([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5}){1,25})+([;.](([a-zA-Z0-9_\-\.]+)@{[a-zA-Z0-9_\-\.]+0\.([a-zA-Z]{2,5}){1,25})+)*$/;
		if (regex.test(mail.customer_email.value)) {
			document.getElementById('email_error').innerHTML = "";
			return true;
		} else {
			document.getElementById('email_error').innerHTML = "*Please enter a valid email address.*";
			return false;
		}
	}

	function validateForm() {
		var isFormValid = true;
		isFormValid &= validateFirstName();
		isFormValid &= validateLastName();
		isFormValid &= validateEmail(this);
		isFormValid &= validateAddress();
		isFormValid &= validatePostcode();
		isFormValid &= validatePassword();
		isFormValid &= validatePhoneNumber();
		return isFormValid ? true : false;
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
			onsubmit="return validateForm();" method="post"
			modelAttribute="customer">
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
					<td><form:input path="customer_address" />
						<div id="address_error"></div></td>
				</tr>
				<tr>
					<td>Postcode:</td>
					<td><form:input path="customer_postcode" />
						<div id="postcode_error"></div></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><form:input path="customer_phone_number" />
						<div id="phone_error"></div></td>
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