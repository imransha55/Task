package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>
{
	int empid;
	String name;
	int age;
	Emp(int empid,String name,int age)
	{
		this.empid=empid;
		this.name= name;
		this.age=age;
	}
	public int compareTo(Emp e)
	{
		if (age==e.age)return 0;
		else if (age<e.age) return 1; //To reverse the list
		//else if(age>e.age) return 1; // in order
		else return -1;
	}
}


public class ArrayLister 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(101,"ismart",21));
		al.add(new Emp(102,"pawan",19));
		al.add(new Emp(103,"estri",18));
		al.add(new Emp(104,"srinu",27));
		al.add(new Emp(105,"sastri",25));
		Collections.sort(al);
		System.out.println("Sorting list by Age");
		for(Emp emp :al)
		{
			System.out.println(emp.empid+" "+emp.name+" "+emp.age);
		}
	}

}
