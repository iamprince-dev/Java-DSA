package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]arr= {0,1,2,2,3,4,4};
		int n=arr.length;
		int count=0;
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j+1]=arr[i+1];
				j++;
			}
		}
		 for(int i=0;i<n-1;i++) {
			 if(arr[i]!=arr[i+1]) count++;
		 }
		 System.out.println(count);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
