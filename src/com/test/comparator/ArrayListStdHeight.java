package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StdDetails
{
	int rollno;
	String name;
	double height;
	StdDetails(int rollno,String name,double height)
	{
		this.rollno=rollno;
		this.name=name;
		this.height=height;
	}
}

//stdheight comparision
class StdHeight implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		StdDetails sd1= (StdDetails)o1;
		StdDetails sd2=(StdDetails)o2;
		if (sd1.height==sd2.height) return 0;
		else if (sd1.height>sd2.height) return 1;
		else return -1;
	}
}

//stdName comparision
class StdName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		StdDetails sd1=(StdDetails)o1;
		StdDetails sd2=(StdDetails)o2;
		return sd1.name.compareTo(sd2.name); //compareTo() String class
	}
}

class ArrayListStdHeight
{
public static void main(String[] args) 
{
	//Using ArrayList
	ArrayList<StdDetails> al= new ArrayList<StdDetails>();
	al.add(new StdDetails(101,"ismart",5.5));
	al.add(new StdDetails(102,"pawan",5.8));
	al.add(new StdDetails(103,"hari",6.9));
	al.add(new StdDetails(104,"gopal",5.99));
	al.add(new StdDetails(105,"veeraB",6.0));
	System.out.println("Sorting BY Name");
	Collections.sort(al,new StdName());
	for(StdDetails std : al) //for each loop for iterating al 
	{
		System.out.println(std.name+" "+std.rollno+" "+std.height);
		
	}
	
	System.out.println();
	System.out.println("Sorting by Height");
	Collections.sort(al,new StdHeight());
	for(StdDetails std:al)
	{
		System.out.println(std.height+" "+std.name+" "+std.rollno);
	}
	
	
	
}
	
}

