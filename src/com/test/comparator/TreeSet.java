package com.test.comparator;

import java.util.Comparator;

class TestH implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		String fs;
		String ss;
		fs=s1;
		ss=s2;
		//to ensure
		//return fs.compareTo(ss);//in order
		return ss.compareTo(fs);//Output in reverse order
		
	}
}

public class TreeSet 
{
	public static void main(String[] args) {
		java.util.TreeSet<String> ts= new java.util.TreeSet<String>(new TestH());
		ts.add("i");
		ts.add("m");
		ts.add("s");
		ts.add("a");
		ts.add("r");
		ts.add("t");
		System.out.println("Since the comparator value is: "+ts);
		
	}

}
