
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<form action="" method="post">
		<center>
			<table>
				<h1>Add Employe</h1>
				<tr>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>Emp Name<font color="red">*</font></th>
					<td><input type="text" name="ename"></td>
				</tr>
				<tr>
					<th>Emp Email<font color="red">*</font></th>
					<td><input type="text" name="eemail"></td>
				</tr>
				<tr>
					<th>Emp Mob.<font color="red">*</font></th>
					<td><input type="text" name="econtect"></td>
				</tr>
				<tr>
					<th>Emp Desig<font color="red">*</font></th>
					<td><input type="text" name="edesignation"></td>
				</tr>
				<tr>
					<th>Emp Salary<font color="red">*</font></th>
					<td><input type="text" name="esal"></td>
				</tr>
				<tr>
					<th>Emp Password<font color="red">*</font></th>
					<td><input type="text" name="epass"></td>
				</tr>
				<%-- <tr>
					<td align="center"><input type="submit" name="operation"
						value="<%=EmployeCtl.OP_SAVE%>"></td>
				</tr>
				<tr>
					<td align="center"><input type="submit" name="operation"
						value="<%=EmployeCtl.OP_CANCEL%>"></td>
				</tr> --%>
				

			</table>
		</center>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</html>