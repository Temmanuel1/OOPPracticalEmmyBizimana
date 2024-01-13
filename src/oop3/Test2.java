package oop3;

public class Test2 {
  public static void main(String args[]){  
	  SBI s=new SBI(); 
	  ACICI i=new ACICI();  
	  //AXIS a=new AXIS();
	  System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
	  System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
	  System.out.println("AXIS Rate of Interest: "+i.getRateOfInterest());
  }  
}
