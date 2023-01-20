package com.test.comparable;

import java.util.HashSet;
import java.util.TreeSet;

class Stded implements Comparable<Stded>
{
	Integer marks;
	Stded(Integer marks)
	{
		this.marks=marks;
	}
	public String toString() //override toString
	{
		return (" "+this.marks);
	}
	public int compareTo(Stded st)
	{
		return this.marks.compareTo(st.marks);
	}
	
}

public class HashSeter 
{
	public static void main(String[] args) 
	{
	HashSet<Stded> hs= new HashSet<>();
	hs.add(new Stded(88));
	hs.add(new Stded(55));
	hs.add(new Stded(35));
	hs.add(new Stded(57));
	hs.add(new Stded(99));
	System.out.println("Before Sorting: "+hs);
	//Treset to sort hashset using comparable(I)
	TreeSet<Stded> ts= new TreeSet<Stded>(hs);
	System.out.println("After Sorting in ascending: "+ts);
	
	}
}
