package com.database.employee_hibernate;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "Regular_Employee") //Specifying Second Table name
/*Value must should be different as we mentioned Single table in in inheritance type in BaseClass*/
public class RegularEmployee extends EmployeeBaseClass
{
	private float salary;
	private int bonus;
	
	/*----------------Parameterised constructor along with Base class Fields-----------------*/
	public RegularEmployee(String empId, String empname, float salary, int bonus) 
	{
		super(empId, empname);
		this.salary = salary;
		this.bonus = bonus;
	}
	/*--------------------------------------------------------------------*/
	public RegularEmployee() 
	{
		super();
	}
	/*--------------------------------------------------------------------*/
	/*-----------------------Parameterised constructor---------------------------*/
	public RegularEmployee(String empId, String empname) 
	{
		super(empId, empname);
	}
	/*------------------------Getter and Setters----------------------------*/
	public float getSalary() {return salary;}
	public void setSalary(float salary) {this.salary = salary;}
	public int getBonus() {return bonus;}
	public void setBonus(int bonus) {this.bonus = bonus;}
	/*--------------------------------------------------------------------*/
	/*-----------------------------To String ---------------------------------*/
	@Override
	public String toString() 
	{
		return "\n ------Regular Employee-----" +
				"\n Employee ID: "+ super.getEmpId()+
				"\n Employee Name: " + super.getEmpname() +
				"\n Salary: " + salary +
				"\n Bonus: " + bonus +
				"\n --------------------------------";
	}	
}
