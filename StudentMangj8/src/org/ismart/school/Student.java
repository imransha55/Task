package org.ismart.school;

public class Student {
	 int id;
     
	    String name;
	     
	    int age;
	     
	    String gender;
	     
	    String department;
	     
	    int yearOfJoining;
	
	     
	    public Student(int id, String name, int age, String gender, String department, int yearOfJoining) 
	    {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.department = department;
	        this.yearOfJoining = yearOfJoining;
	       
	    }
	     
	    public int getId() 
	    {
	        return id;
	    }
	     
	    public String getName() 
	    {
	        return name;
	    }
	     
	    public int getAge() 
	    {
	        return age;
	    }
	     
	    public String getGender() 
	    {
	        return gender;
	    }
	     
	    public String getDepartment() 
	    {
	        return department;
	    }
	     
	    public int getYearOfJoining() 
	    {
	        return yearOfJoining;
	    }
	     
	 
	    @Override
	    public String toString() 
	    {
	        return "Id : "+id
	                +", Name : "+name
	                +", age : "+age
	                +", Gender : "+gender
	                +", Department : "+department
	                +", Year Of Joining : "+yearOfJoining;
	    }
}
