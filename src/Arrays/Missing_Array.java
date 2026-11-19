package Arrays;

public class Missing_Array {

	public static void main(String[] args) {
		
		int sum=0;
		int sum2=0;
		int []arr= {1,2,3,5};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			sum= sum+arr[i];
		}
		
		n = n+1;
		sum2=n*(n+1)/2;
		System.out.println(sum2-sum);
	   	    
					}
}
