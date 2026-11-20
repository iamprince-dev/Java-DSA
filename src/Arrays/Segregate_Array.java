package Arrays;

public class Segregate_Array {

	public static void main(String[] args) {
		int []arr= {0,1,0,1,0,0,1};
		int zeros=0;
		int once=0;
		int n=arr.length;
		
		for(int ele:arr) {
			if(ele==0) zeros++;
			
			else once++;
		}
		for(int i=0;i<zeros;i++) {
			arr[i]=0;
		}
		for(int i=zeros;i<n;i++) {
			arr[i]=1;
		}

		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		}
}
