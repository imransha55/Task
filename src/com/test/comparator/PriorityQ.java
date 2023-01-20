package com.test.comparator;

import java.util.Comparator;
import java.util.PriorityQueue;

class Cls implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		String fs=s1;
		String ss=s2;
		return ss.compareTo(fs);
	}
	
}
public class PriorityQ 
{
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(new Cls());
		pq.add("jj");
		pq.add("kj");
		pq.add("ij");
		pq.add("lj");
		pq.add("mj");
		pq.add("55");
		while(!pq.isEmpty())
		{
			System.out.println(" "+pq.poll());
		}
		
	}

}
