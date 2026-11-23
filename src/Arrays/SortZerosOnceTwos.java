package Arrays;

public class SortZerosOnceTwos {

	public static void main(String[] args) {
		
		int []arr= {0,1,1,0,2,2,0,1,1};
		
		int zeros=0;
		int once=0;
		int twos=0;
		
		for(int i=0; i<arr.length;i++) {
		if(arr[i]==0) zeros++;
		else if(arr[i]==1) once++;
		else twos++;
		}
	  
		for(int i=0;i<zeros;i++) {
			arr[i]=0;
		}
		for(int i=zeros;i<zeros+once;i++) {
			arr[i]=1;
		}

		for(int i=zeros+once;i<arr.length;i++) {
			arr[i]=2;
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}
}
