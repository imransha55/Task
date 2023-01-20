package com.test.comparator;

import java.util.Collections;
import java.util.Comparator;

class EmpDetails
{
	int empid;
	String name;
	double sal;
	EmpDetails(int empid,String name,double sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}
}

//stdheight comparision
class EmpSal implements Comparator<EmpDetails>
{
	public int compare(EmpDetails e1,EmpDetails e2)
	{
		EmpDetails ed1= (EmpDetails)e1;
		EmpDetails ed2=(EmpDetails)e2;
		if (ed1.sal==ed2.sal) return 0;
		else if (ed1.sal>ed2.sal) return 1;
		else return -1;
	}
}

class LinkedList
{
public static void main(String[] args) 
{
	java.util.LinkedList<EmpDetails> ll= new java.util.LinkedList<EmpDetails>();
	ll.add(new EmpDetails(101,"ismart",8855.35));
	ll.add(new EmpDetails(202,"pawan",8888.25));
	ll.add(new EmpDetails(808,"sha",8888.55));
	ll.add(new EmpDetails(404,"gopal",9999.9));
	ll.add(new EmpDetails(505,"hari",88.55));
	
	System.out.println("Sorting Emp's by Sal");
	Collections.sort(ll,new EmpSal());
	System.out.println("Sorting Emp's by Sal");
	System.out.println("Salary  Name sal");
	for(EmpDetails s: ll)
	{	
		System.out.println(s.sal+" "+s.name+" "+s.empid);
	}
	
	
}

















}
