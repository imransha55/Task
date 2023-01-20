package com.test.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class LinkedHashMa 
{
	public static void main(String[] args) 
	{
		java.util.LinkedHashMap<String, Integer> lm=new java.util.LinkedHashMap<String , Integer>();
		lm.put("hero",55);
		lm.put("ktm",88);
		lm.put("bajaj",101);
		lm.put("itm",66);
		//converting map to list using entrySet()
		List<Map.Entry<String,Integer>> li=new ArrayList<Map.Entry<String,Integer>>(lm.entrySet());
		//using Collections sort()
		Collections.sort(li,new Comparator<Map.Entry<String,Integer>>()
				{
					//comparing two entries by values
					public int compare(
							Map.Entry<String,Integer> entry1,
							Map.Entry<String,Integer> entry2)
					{
						return entry1.getValue() 
								- entry2.getValue();
					}
				
				
				});
		//printing using foreach loop
		for(Map.Entry<String,Integer>l:li)
		{
			
			System.out.println(" keys==> "+l.getValue()+"   values==> "+ l.getKey());
		}
		{
			
		}
	}

}
