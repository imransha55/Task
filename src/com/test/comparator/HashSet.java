package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CmDetails
{
	String name;
	String state;
	int exp;
	CmDetails(String name,String state,int exp)
	{
		this.name=name;
		this.state=state;
		this.exp=exp;
	}
}

class ExpCom implements Comparator<CmDetails>
{
	public int compare(CmDetails c1,CmDetails c2)
	{
		if(c1.exp==c2.exp) return 0; // if c1 & c2 are equal
		else if(c1.exp>c2.exp) return 1; // if c1 has to come after c2
		else return-1; //if c1 has to come before c2
		
		
	}
}

class HashSet 
{
	public static void main(String[] args) {
		java.util.HashSet<CmDetails> hs= new java.util.HashSet<CmDetails>();
		hs.add(new CmDetails("kcr","ts",12));
		hs.add(new CmDetails("ysj","ap",5));
		hs.add(new CmDetails("cbn","ap",39));
		hs.add(new CmDetails("kwall","delhi",30));
		hs.add(new CmDetails("kapaul","ap",0));
		System.out.println("converting hashset to arraylist as set(I) dont have sorting methods");
		
		ArrayList<CmDetails> al=new ArrayList<CmDetails>(hs);
		System.out.println("HashSet Sorted using By exp");
		Collections.sort(al,new ExpCom());//here sorting need to be done to 'al' 
		for(CmDetails c:al)
		{
			System.out.println(c.exp+" "+c.name+" "+c.state);
		}
		
	}

}
