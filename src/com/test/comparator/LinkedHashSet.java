package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Town
{
	double area;
	String tName;
	Town(double area,String tName)
	{
		this.area=area;
		this.tName=tName;
	}
}
class AreaCom implements Comparator<Town>
{
	public int compare(Town t1,Town t2)
	{
		if(t1.area==t2.area) return 0;
		else if(t1.area>t2.area) return 1;
		else return -1;
		
			
	}
}
public class LinkedHashSet
{
	public static void main(String[] args) 
	{
		java.util.LinkedHashSet<Town> lh=new java.util.LinkedHashSet<Town>();
		lh.add(new Town(8855.23, "bpt"));
		lh.add(new Town(9955.6, "ong"));
		lh.add(new Town(7894.9, "up"));
		lh.add(new Town(6589.8, "mp"));
		lh.add(new Town(78945.5, "mh"));
		//Converting linkedHashSet to Arraylist
		ArrayList<Town> al= new ArrayList<Town>(lh);
		Collections.sort(al,new AreaCom());
		for(Town t: al)
		{
			System.out.println(t.area+" "+t.tName);
			
		}
		
		
	}

}
