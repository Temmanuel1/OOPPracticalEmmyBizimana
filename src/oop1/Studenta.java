package oop1;

public class Studenta{
		int rollno;
		String name;
		static String college = "ITS";
		static void change(){
		college = "BBDIT";
		}
		Studenta(int r, String n){
		rollno = r;
		name = n;
		}
		void display(){
			System.out.println(rollno+" "+name+" "+college);
			}
}
