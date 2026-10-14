package Basics;

public class CharDataType {
  public static void main(String[] args) {
	
	  char ch= 'A';
	  
	  int x= ch;
	  System.out.println(x); // implicit typecasting
	  
	  
	  char ch1 = 'b';    //  explicit typecasting
	  
	  int y= (int) ch1;
	  
	  System.out.println(y);
	  
	  
	  char ch2= 'c';
	  
	  System.out.println(ch2+0);
	  
	  
	  
	  
	  // interger to char
	  
	  int a= 55;
	  
	  char ch3= (char)a;
	  
	  System.out.println(ch3);
	  
			 
}
}
