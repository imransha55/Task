package com.test.comparable;

import java.util.TreeSet;

class Stdt implements Comparable<Stdt>
{
	String grade;
	Stdt(String grade)
	{
		this.grade=grade;
	}
	public String toString()
	{
		return(" "+this.grade);
	}
	public int compareTo(Stdt s)
	{
		//return this.grade.compareTo(s.grade);
		return s.grade.compareTo(this.grade);
	}
}

public class TreeSeter 
{
	public static void main(String[] args) 
	{
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("A");
		tset.add("C");
		tset.add("D");
		tset.add("B");
		//System.out.println("Sorting in Ascending: "+tset);
		System.out.println("Sorting in Descending order: "+tset);
		
	}

}
