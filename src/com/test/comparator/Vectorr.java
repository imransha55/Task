package com.test.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Vectorr 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("a");
		v.add("k");
		v.add("m");
		v.add("z");
		v.add("n");
		System.out.println("Before Sorting");
		for (int i = 0; i < v.size(); i++) 
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		System.out.println("After Sorting by 'Collection.reverseOrdr");
		Comparator cmp = Collections.reverseOrder();
			Collections.sort(v,cmp);
		for (int i = 0; i < v.size(); i++) 
		{
			System.out.print(v.get(i)+" ");
		}
		
	}

}
