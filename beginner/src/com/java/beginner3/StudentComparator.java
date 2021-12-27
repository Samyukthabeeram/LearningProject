package com.java.beginner3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
String propertyName;
String order;
	StudentComparator(String propertyName, String order){
		this.propertyName = propertyName;
		this.order = order;
	}
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		 if (propertyName.equals("firstName")){
			 if(order.equals("asc")){
				 return s1.getFirstName().compareTo(s2.getFirstName());
			 }else{
				 return s2.getFirstName().compareTo(s1.getFirstName());
			 }
		 }else if(propertyName.equals("lastName")){
			if(order.equals("asc")){
				return s1.getLastName().compareTo(s2.getLastName());
			}else{
				return s2.getLastName().compareTo(s1.getLastName());
			}
		 }else if(propertyName.equals("middleName")){
			 if(order.equals("asc")){
				 return s1.getMiddleName().compareTo(s2.getMiddleName());
			 }else{
				 return s2.getMiddleName().compareTo(s1.getMiddleName());
			 }
		 }else {
			 return 0;
		 }
	}

}