package com.capgemini1;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("Vijaya","Bharathi","F");
		if (p1.getFn().isEmpty() == true || p1.getLn().isEmpty() == true) {
			try {
				throw new NoNameException();
			}catch(NoNameException e) {
				e.printStackTrace();
			}
		}
		System.out.println("first Name:"+p1.getFn());
		System.out.println("last Name:"+p1.getLn());
		System.out.println("gender:"+p1.getGender());
		
	}
}
