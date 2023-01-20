package com.test.comparable;

import java.util.Collections;
import java.util.Vector;

class Student implements Comparable<Student>
{
	String name;
	int id;
	public Student (String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public int getId() { return this.id;}
	
	public int compareTo(Student otrStudent)
	{
		return this.getId()-otrStudent.getId();
	}
}
public class Vectorr 
{
	public static void main(String[] args) {
		Vector<Student> vs = new Vector();
		vs.add(new Student("ismart",101));
		vs.add(new Student("fanter",103));
		vs.add(new Student("estri",102));
		vs.add(new Student("heater",105));
		Collections.sort(vs);
		//iterating
		for(Student s : vs)
		{
			System.out.println(s.name+" "+s.id);
		}
		
	}
}
