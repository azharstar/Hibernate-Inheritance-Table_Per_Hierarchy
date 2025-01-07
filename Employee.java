package com.database.employee_hibernate;

import jakarta.persistence.*;

@Entity
//Specifying Inheritance property and Strategy using single table only as requirement
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Hibernate Inheritance: Table Per Hierarchy 
// @Inheritance(strategy = InheritanceType.JOINED) // Hibernate Inheritance : Table Per Subclass
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  //Hibernate Inheritance : Table Per Concrete class
/*----------Specifying First Table Type may be 'int , char or String'---------------*/
@DiscriminatorColumn(name= "Employee_Type",discriminatorType = DiscriminatorType.STRING) //No use in remaining child classes
@DiscriminatorValue(value = "Normal_Employee") //Specifying First Table name
public class Employee 
{
	/*Here we creating 3 Different table includes Base class and 2 Derived classes*/
	
	@Id
	private String empId;
	private String empname;
	/*-----------------------Parameterised constructor---------------------------*/
	public Employee(String empId, String empname) 
	{
		super();
		this.empId = empId;
		this.empname = empname;
	}
	/*--------------------------------------------------------------------------*/
	public Employee() 
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
		return "\n ------Employee-------"
				+ "\n Employee Id: " + empId + 
				"\n Employee name: " + empname 
				+"-------------------------------";
	}	
}
