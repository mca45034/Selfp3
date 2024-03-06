package com.rays.inteface;

import java.util.List;


import com.rays.dto.EmployeDTO;

public interface EmployeInt {
	public void addEmployee(EmployeDTO emp);
	public void updateEmployee(EmployeDTO emp);
	//public void deleteEmployee(int empid);
	public List showEmpList(EmployeDTO bean);
	public EmployeDTO showEmployeeById(int empid);
	//public EmployeDTO showEmployeeByEmail(String emailid);
	void deleteEmployee(EmployeDTO dto);

}
