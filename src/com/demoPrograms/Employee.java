package com.demoPrograms;

public class Employee
{

	public static void main(String[] args)
	{
		 // creating an object of type Employee
        Employee emp = new Employee();
 
        // checking whether emp is an instance of type Employee
        if(emp instanceof Employee) {
            System.out.println("emp object is an instance of type Employee");
        }
        else{
            System.out.println("emp object is NOT an instance of type Employee");
        }
	}

}
