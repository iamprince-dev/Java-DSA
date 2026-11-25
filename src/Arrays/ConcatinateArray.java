package Arrays;

public class ConcatinateArray {

	public static void main(String[] args) {
		
		int []nums= {1,2,1};
		int n=nums.length;
		int []ans=new int[2*n];
		int j=0;
		
		for(int i=0;i<n;i++) {
			   ans[i]=nums[i];
			   ans[i+n]=nums[i];
		}

		
//		for(int i=0;i<n;i++) {
//		   ans[j++]=nums[i];	
//		}
//		for(int i=0;i<n;i++) {
//			ans[j++]=nums[i];
//		}
		
		for(int ele:ans) {
			System.out.print(ele+" ");
		}
	}
}
