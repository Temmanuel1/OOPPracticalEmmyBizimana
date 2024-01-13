package oop1;

public class TestStaticMethod {
		public static void main(String args[]){
		Studenta.change();
		Studenta s1 = new Studenta(111,"Allen");
		Studenta s2 = new Studenta(222,"Aryan");
		Studenta s3 = new Studenta(333,"Nancy");
		s1.display();
		s2.display();
		s3.display();
		}

}
