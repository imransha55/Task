package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Std implements Comparable<Std>
{
	String name;
	public Std(String name)
	{
		this.name=name;
	}
	public int compareTo(Std std)
	{
		return std.name.compareTo(this.name);
	}
	public String toString()
	{
		return this.name;
	}
}

public class LsitA 
{
	public static void main(String[] args) 
	{
		Set<Std> set= new TreeSet<Std>();
		set.add(new Std("ismart"));
		set.add(new Std("pawan"));
		set.add(new Std("sarasu"));
		set.add(new Std("raidurg"));
		
		List<Std> list = new ArrayList<Std>();
		list.addAll(set);
		//Collections.reverse(list); // in order
		Collections.sort(list);//in reverse
		list.forEach(System.out::println);
		
		
	}

}
