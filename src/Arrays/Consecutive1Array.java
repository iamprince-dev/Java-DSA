package Arrays;

public class Consecutive1Array {

	public static void main(String[] args) {
		int[]arr= {1,1,0,1,1,1};
		int max=0;
		
		int n=arr.length;
		int count=0;

		for(int i=0;i<n;i++) {
	     		if(arr[i]==1) count++;
				else count=0;
				if(count>max) max=count;
			//	max = Math.max(max, count);
								 		
			
		}
		System.out.println(max);
	}
}
