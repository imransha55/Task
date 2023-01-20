package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHahMaper 
{
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm= new LinkedHashMap<String, Integer>();
		lhm.put("dec", 5);
		lhm.put("mech",3);
		lhm.put("cse", 1);
		lhm.put("civil", 2);
		System.out.println("list without sorting: "+lhm);
		//linkedhashmap to list by entrySet()
		List<Map.Entry<String,Integer>> list= new ArrayList<Map.Entry<String,Integer>>(lhm.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
				{
					//comparing entries
					public int compare
					(
						Entry<String,Integer> entry1,
						Entry<String,Integer>entry2)
					{
					return entry1.getValue()-entry2.getValue();
					}
				});
		lhm.clear();
		//iterating
		for(Map.Entry<String, Integer>entry : list)
		{
			//putting sorted values back to the list 
			lhm.put(entry.getKey(),entry.getValue());
		}
		System.out.println("List after Sorting: "+lhm);
	System.out.println("Sorting is done as per key values");
	}

}
