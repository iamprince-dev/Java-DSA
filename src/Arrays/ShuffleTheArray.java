package Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int []arr= {2,5,1,3,4,7};
		
		int n=arr.length;
		int []arr2=new int[2*n];
		int j=0;
		for(int i=0;i<2*n-1;i++) {
			arr2[j++]=arr[i];
			arr2[j++]=arr[n/2-i];
		}
		for(int ele:arr2) {
			System.out.println(ele+" ");
			
		}
	}
}
