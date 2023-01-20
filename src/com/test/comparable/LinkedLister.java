package com.test.comparable;

import java.util.Collections;
import java.util.LinkedList;

class Std1 implements Comparable<Std1>
{
	String name;
	int id;
	int rank;
	Std1(String name,int id,int rank)
	{
		this.name=name;
		this.id= id;
		this.rank=rank;
	}
	public int compareTo(Std1 s)
	{
		if (rank==s.rank) return 0;
		else if(rank>s.rank)return 1; //in order
		//else if(rank<s.rank)return 1; //in reverse order
		else return -1;
	}
}

public class LinkedLister 
{
	public static void main(String[] args) {
		LinkedList<Std1> ll= new LinkedList<Std1>();
		ll.add(new Std1("ismart",101,1));
		ll.add(new Std1("fansa",102,5));
		ll.add(new Std1("heatersa",103,3));
		ll.add(new Std1("estrisa",104,2));
		Collections.sort(ll);
		System.out.println("Sorted list");
		System.out.println("Rank  Name Id");
		for(Std1 el: ll)
		{
			System.out.println(el.rank+" "+el.name+" "+el.id);
		}
		
	}

}
