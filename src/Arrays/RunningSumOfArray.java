package Arrays;

public class RunningSumOfArray {
	public static void main(String[] args) {
		
		int []arr= {1,3,7,15};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<i;j++) {
				sum=sum+arr[j];
			}
			
			// arr[i]=arr[i]+sum;
		
			 System.out.print(arr[i]+sum+" ");
		}
		

	}

}
