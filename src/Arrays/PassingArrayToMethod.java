package Arrays;

public class PassingArrayToMethod {
 public static void main(String[] args) {
	int []x= {2,3,10,20};
	System.out.println(x[2]);
	
	change(x);
	System.out.println(x[2]);
 }
 
 
 public static void change(int []x)
 {
	 x[2]=100;
 }
}
