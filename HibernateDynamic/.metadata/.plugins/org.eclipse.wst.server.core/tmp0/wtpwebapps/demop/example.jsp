<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
<table>
<tr>	
			 <td> <input type="hidden" name="id" ></td>
			</tr>
				<tr>
					<th>First Name<font color="red">*</font></th>
					<td><input type="text" name="fName"></td>
				</tr>
				<tr>
					<th>Last Name<font color="red">*</font></th>
					<td><input type="text" name="lName"></td>
				</tr>
				<tr>
					<th>Login<font color="red">*</font></th>
					<td><input type="text" name="login"></td>
				</tr>
				<tr>
					<th>Password<font color="red">*</font></th>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<th>DOB<font color="red">*</font></th>
					<td><input type="text" name="dob"></td>
				</tr>
				<tr>
					<th>Address<font color="red">*</font></th>
					<td><input type="text" name="address"></td>
				</tr>
				
				<%-- <tr>
					<td align="center"><input type="submit" name="operation"
				value="<%=UserRegistrationCtl.OP_SAVE%>"></td>
				</tr> --%>
</table>
</form>
</body>
</html>