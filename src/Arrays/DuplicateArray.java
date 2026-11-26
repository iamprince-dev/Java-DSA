package Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[]arr= {2,1,3,4,5,4};
		int n=arr.length;
		int ans=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=arr[i]+sum;
		}
		
		
		int sum2=n*(n-1)/2;
		
		int expectedsum =sum-sum2;

		System.out.println(expectedsum);
		
	}
}
