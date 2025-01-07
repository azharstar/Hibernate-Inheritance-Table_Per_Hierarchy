package com.database.employee_hibernate;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Specifying Inheritance property and Strategy using single table only as requirement
/*----------Specifying First Table Type may be 'int , char or String'---------------*/
@DiscriminatorColumn(name= "Employee_Type",discriminatorType = DiscriminatorType.STRING) //No use in remaining child classes
@DiscriminatorValue(value = "Normal_Employee") //Specifying First Table name
public class EmployeeBaseClass 
{
	/*Here we creating 3 Different table includes Base class and 2 Derived classes*/
	
	@Id
	private String empId;
	private String empname;
	/*-----------------------Parameterised constructor---------------------------*/
	public EmployeeBaseClass(String empId, String empname) 
	{
		super();
		this.empId = empId;
		this.empname = empname;
	}
	/*--------------------------------------------------------------------------*/
	public EmployeeBaseClass() 
	{
		super(); // TODO Auto-generated constructor stub	
	}
	/*------------------------Getter and Setters----------------------------*/
	public String getEmpId() {return empId;}

	public void setEmpId(String empId) {this.empId = empId;}

	public String getEmpname() {return empname;}

	public void setEmpname(String empname) {this.empname = empname;}
	/*--------------------------------------------------------------------------*/
	@Override
	public String toString() 
	{
		return "\n ------EmployeeBaseClass-------"
				+ "\n Employee Id: " + empId + 
				"\n Employee name: " + empname 
				+"-------------------------------";
	}	
}
