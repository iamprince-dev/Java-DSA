package Basics;

import Basics.ClassE1;

public class ClassE1 {
	 int meth1(int a, String s)
	 {
		 System.out.println(a);
		 ClassE1 aobj= new ClassE1();
		 aobj.meth2(10,10);
		 return 10;
		 
	 }
	 String meth2(int a,int b)
	 {
		 System.out.println(a+b);
		 ClassE1 aobj=new ClassE1();
		 aobj.meth3("java", 10);
		 return "java";
	 }
	 
	 int meth3(String s,int a)
	 {
		 System.out.println(s);
		 ClassE1 aobj=new ClassE1();
		 aobj.meth4( 10,20);
		 return 10;

}
	 int meth4(int x,int y)
	 {
		 System.out.println(x+y);
		 return x;
	 }
	 public static void main(String[] args) {
		System.out.println("stsrt");
		ClassE1 aobj=new ClassE1();
		int s= aobj.meth1(10,"hii");
		System.out.println(s);
		 

	}
}