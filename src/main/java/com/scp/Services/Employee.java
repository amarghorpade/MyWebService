package com.scp.Services;

public class Employee {
	int empid;
	int sal;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Employee(int empid, int sal) {
		super();
		this.empid = empid;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", sal=" + sal + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
