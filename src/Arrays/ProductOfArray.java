package Arrays;

public class ProductOfArray {
  public static void main(String[] args) {
	
	  int []arr= {1,2,3,4};
	  int n=arr.length;
	  int max=arr[0];
	  
	  int sum=0;
	  for(int i=0;i<arr.length;i++) {
		  {
			  int product=1;

			  for(int j=0;j<n;j++) {
				  
				 if(i!=j) { 
				 product =product*arr[j]; 
				 }
				 
		  }
			  System.out.println(product);

			  

		  }
		 
		 	  }
	  
	  
	  	 }
}
