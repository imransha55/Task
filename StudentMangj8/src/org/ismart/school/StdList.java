package org.ismart.school;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class StdList
{
	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();
        
		stdList.add(new Student(111, "ismartsha", 21, "Male", "mechanical", 2017));
		stdList.add(new Student(155, "Roypal", 27, "Male", "cse", 2013));
		stdList.add(new Student(133, "getpal", 19, "Male", "IT", 2014));
		stdList.add(new Student(222,  "modipal", 23, "Male", "aeroplane", 2016));
		stdList.add(new Student(144, "K.A.pal", 24, "Male", "MT", 2016));
		stdList.add(new Student(211, "ppal", 20, "Female", "hdfc", 2014));
		stdList.add(new Student(266, "cowpal", 16, "Female", "Pr", 2015));
		stdList.add(new Student(177, "Manupal", 25, "Female", "mechanical", 2018));
		stdList.add(new Student(199, "wetpal", 24, "Female", "cse", 2013));
		stdList.add(new Student(200, "drypal", 20, "Male", "automobile", 2015));
		stdList.add(new Student(188, "T.A.pal", 21, "Male", "civil", 2015));
		stdList.add(new Student(166, "Ipal", 23, "Male", "ece", 2016));
		stdList.add(new Student(233, "babupal", 29, "Male", "sun", 2013));
		stdList.add(new Student(244, "henpal", 24, "Male", "cse", 2017));
		stdList.add(new Student(255, "Alipal", 23, "Male", "hkl", 2019));
		stdList.add(new Student(122, "setpal", 20, "Female", "Bio-tech", 2015));
		stdList.add(new Student(277, "catpal", 55, "Male", "mechanic", 2012));
		 //---------------------------------
		Scanner scan = new Scanner(System.in);
		System.err.println("1--no.of male & female");
		System.err.println("2--NumberOfDepartments");
		System.err.println("55-Students YOP");
		System.err.println("75--no. of Student in Each department");
		System.err.println("88--Youngest Male in Mechanical");
		System.err.println("7555--Students as per age");
		System.err.println("7--Oldest Student");
		System.err.println("Enter Your Option...!");
		int opt=scan.nextInt();
		switch(opt) {
		  case 1:
			  //Collectors.groupingBy()
			  Map<String, Long> noOfMaleAndFemaleEmployees=
					  stdList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
			   System.out.println("----Collectors.groupingBy() used to group male and female----");        
			  System.out.println(noOfMaleAndFemaleEmployees);
			  
		    break;
		  case 2: 
			  //distinct()
			  System.out.println("---distinct()---");
			  stdList.stream()
	            .map(Student::getDepartment)
	            .distinct()
	            .forEach(System.out::println);
			 
		    break;
		  case 55: //Stream.filter()
			  System.out.println("Enter the DOJ..!");
			  int year=scan.nextInt();
			  if (year<2023)
			  {
				  System.out.println("Studnet joined after: "+year);
				  stdList.stream()
		            .filter(e -> e.getYearOfJoining() > year)
		            .map(Student::getName)
		            .forEach(System.out::println);
			  } 
			  else 
			  {
				  	System.err.println("Guru This Is 2023..!");
				  	System.out.println("check the entered year");
			  }
			
			  
			  break;
		  case 75 ://groupingBy using element
			  Map<String, Long> studentCountByDepartment=
					  stdList.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
			           
			  Set<Entry<String, Long>> entrySet = studentCountByDepartment.entrySet();
			           
			  for (Entry<String, Long> entry : entrySet)
			  {
			      System.out.println(entry.getKey()+" : "+entry.getValue());
			  }
			  
			  break;
		  case 88: //Stream.min(),Stream.filter()
			  Optional<Student> youngestMaleStudentInMechanicalWrapper=
					  stdList.stream()
			              .filter(e -> e.getGender()=="Male" && e.getDepartment()=="mechanical")
			              .min(Comparator.comparingInt(Student::getAge));
			           
			  Student youngestMaleStudentInMecahnical = youngestMaleStudentInMechanicalWrapper.get();
			           
			  System.out.println("Details Of Youngest Male Studnet In mechanical");
			           
			  System.out.println("----------------------------------------------");
			           
			  System.out.println("ID : "+youngestMaleStudentInMecahnical.getId());
			           
			  System.out.println("Name : "+youngestMaleStudentInMecahnical.getName());
			           
			  System.out.println("Age : "+youngestMaleStudentInMecahnical.getAge());
			           
			  System.out.println("Year Of Joinging : "+youngestMaleStudentInMecahnical.getYearOfJoining());
	  
			  break;
		  case 7555: //Collectors.partitioningBy()
			  System.out.println("Enter the age: ");
			  int age= scan.nextInt();
			  Map<Boolean, List<Student>> partitionStudentByAge=
					  stdList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > age));
			           
			  Set<Entry<Boolean, List<Student>>> entrySet1 = partitionStudentByAge.entrySet();
			           
			  for (Entry<Boolean, List<Student>> entry : entrySet1) 
			  {
			      System.out.println("----------------------------");
			               
			      if (entry.getKey()) 
			      {
			          System.out.println("Student older than "+age+" years :");
			      }
			      else
			      {
			          System.out.println("Student younger than or equal to "+age+" years :");
			      }
			               
			      System.out.println("----------------------------");
			               
			      List<Student> list = entry.getValue();
			               
			      for (Student e : list) 
			      {
			          System.out.println(e.getName());
			      }
			  }
			  break;
		  case 7 :
			  Optional<Student> oldestStudentWrapper = stdList.stream().max(Comparator.comparingInt(Student::getAge));
		         
			  Student oldestStudent = oldestStudentWrapper.get();
			           
			  System.out.println("Name : "+oldestStudent.getName());
			           
			  System.out.println("Age : "+oldestStudent.getAge());
			           
			  System.out.println("Department : "+oldestStudent.getDepartment());
			  break;
		
		  default:
		 System.err.println("Enter the correct Option...!");
	}
	
}
}
