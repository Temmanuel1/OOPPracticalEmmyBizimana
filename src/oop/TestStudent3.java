package oop;

public class TestStudent3 {
		public static void main(String args[]){
			Student S1=new Student();
			Student S2=new Student();
			Student S3=new Student();
			S1.id=101;
			S1.name="Peter";
			S2.id=102;
			S2.name="Jack";
			S3.id=103;
			S3.name="Vicky";
			System.out.println(S1.id+"  "+S1.name);
			System.out.println(S2.id+"  "+S2.name);
			System.out.println(S3.id+"  "+S3.name);
		}
}