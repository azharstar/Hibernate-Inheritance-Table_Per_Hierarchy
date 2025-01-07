package com.database.employee_hibernate;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "Contract_Employee") //Specifying Third Table name / Child class
public class ContractEmployee extends EmployeeBaseClass
{
	private float payPerHour;
	private int contractPeriod;
	/*----------------Parameterised constructor along with Base class Fields-----------------*/
	public ContractEmployee(String empId, String empname, float payPerHour, int contractPeriod) 
	{
		super(empId, empname);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}
	/*--------------------------------------------------------------------*/
	public ContractEmployee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/*-----------------------Parameterised constructor---------------------------*/
	public ContractEmployee(String empId, String empname) 
	{
		super(empId, empname);
		// TODO Auto-generated constructor stub
	}
	/*------------------------Getter and Setters----------------------------*/
	public float getPayPerhour() {return payPerHour;}

	public void setPayPerhour(float payPerhour) {this.payPerHour = payPerhour;}

	public int getContractPeriod() {return contractPeriod;}

	public void setContractPeriod(int contractPeriod) {this.contractPeriod = contractPeriod;}
	/*-----------------------------To String ---------------------------------*/
	@Override
	public String toString() 
	{ 
		return "\n ------Regular Employee-----" +
				"\n Employee ID: "+ super.getEmpId()+
				"\n Employee Name: " + super.getEmpname() +
				"\n Employee Pay Per Hour: " + payPerHour +
				"\n Employee Contract Period: " + contractPeriod;
	}
	
}
