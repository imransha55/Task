package com.test.comparable;

import java.util.LinkedHashSet;
import java.util.TreeSet;

class Empy implements Comparable<Empy>
{
	Integer sal;
	Empy(Integer sal)
	{
		this.sal=sal;
	}
	public String toString()
	{
		return (" "+ this.sal);
	}
	public int compareTo(Empy e)
	{
		return e.sal.compareTo(this.sal); //descending order
		//return this.sal.compareTo(e.sal); //ascending order
	}
}
public class LinkedHashSeter 
{
	public static void main(String[] args)
	{
	LinkedHashSet<Empy> eset=new LinkedHashSet<Empy>();
	eset.add(new Empy(8855));
	eset.add(new Empy(5588));
	eset.add(new Empy(8558));
	eset.add(new Empy(124));
	System.out.println("Before Sorting: "+eset);
	
	
	TreeSet<Empy> ts=new TreeSet<>(eset);
	System.out.println("After Sorting in ascending: "+ts);
	System.out.println("After Sorting in descending order: "+ts);
	}
}
