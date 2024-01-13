package oop;

public class Student4b {
		int id;
		String name;
		Student4b(int i,String n){
		id = i;
		name = n;
		}
		void display(){System.out.println(id+" "+name);}
		public static void main(String args[]){
		Student4b s1 = new Student4b(111,"Karan");
		Student4b s2 = new Student4b(222,"Aryan");
		s1.display();
		s2.display();
		}


}
