package com.test.comparator;

import java.util.Collections;
import java.util.Comparator;

import java.util.TreeSet;


public class TreeMap {

	public static void main(String[] args) {
	java.util.TreeMap<Integer, String> tm = new java.util.TreeMap<Integer, String>();
	tm.put(55,"hero");
	tm.put(66,"ktm");
	tm.put(101,"bajaj");
	tm.put(88,"itm");
	System.out.println("TreeMap : "+tm+"\n");
	Comparator<?> com=tm.comparator();
	
	

	//using COllections.reverse()
	java.util.TreeMap<Integer,String> rt=new java.util.TreeMap<Integer, String>(Collections.reverseOrder());
	rt.put(101, "ismart");
	rt.put(102, "sh");
	rt.put(55, "null");
	rt.put(88, "nuller");
	System.out.println("TreeMap Reverse order using Coll.revOdr(): "+rt);

}
}
class Bike implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		if(i1==i2) return 0;
		else if(i1>i2) return 1;
		else return -1;
		
	}
}
