package Arrays;

public class SquarOfArrayandSort {

	public static void main(String[] args) {
		
		int[]arr= {-4,-1,0,3,10};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]*arr[i];
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
