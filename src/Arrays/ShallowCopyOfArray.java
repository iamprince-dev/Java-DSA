package Arrays;
import java.util.Arrays;

public class ShallowCopyOfArray {
 public static void main(String[] args) {
	
	 int[]arr= {1,2,3,4,5};
	 
	 int []x=arr;
//	  
//	 x[2]=30;
//	 System.out.println(arr[2]);//   s
	 
	 
	 int []deep=Arrays.copyOf(arr,arr.length);
	 
	 deep[1]=20;
	 System.out.println(arr[1]);
	 System.out.println(deep[1]);
}
}
