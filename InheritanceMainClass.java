package com.database.employee_hibernate;

import org.hibernate.*;

import com.database.employee_hibernate.utils.EmployeeUtility;

public class InheritanceMainClass 
{
	public static void main(String[] jaya) 
	{
		/*---------------Creating Session----------------*/
		Session session = EmployeeUtility.getSessionFactory().openSession();
		/*-----------------Creating Transaction----------------*/
		Transaction transaction = session.beginTransaction();
		/*--------------------------Creating objects for Base Emp class to enter data into DB---------------------*/
		EmployeeBaseClass emp1 = new EmployeeBaseClass("emp01","Md Azhar");
		EmployeeBaseClass emp2 = new EmployeeBaseClass("emp02","Boina Shiva");
		/*--------------------------Creating objects for Regular class to enter data into DB---------------------*/
		RegularEmployee emp3 = new RegularEmployee("emp03","Donti Arun Kumar",50000 , 10);
		RegularEmployee emp4 = new RegularEmployee("emp04","Kavali Shiva",60000, 15);
		/*--------------------------Creating objects for Contract class to enter data into DB---------------------*/
		ContractEmployee emp5 = new ContractEmployee("emp05","Kammari Anuradha",500 , 8);
		ContractEmployee emp6 = new ContractEmployee("emp06","Kavali Mounika",600, 5);
		/*------------------------Saving Session with data with objects---------------------------*/
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		session.save(emp6);
		/*---------------------------Commit Transaction--------------------------------*/
		/*---------------------------Make commit in Data Base--------------------------------*/
		transaction.commit();
		/*---------------------------Closing Session--------------------------------*/
		EmployeeUtility.getSessionFactory().close();
		/*---------------------------------------------------------------------------*/
		System.out.println("-------------------------------------");
		System.out.println("Employee Data Inserted Succesfully.");
		System.out.println("-------------------------------------");
	}
}