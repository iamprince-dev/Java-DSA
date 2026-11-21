package Arrays;

public class Wave_array {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		
		int n = arr.length;
		int temp=0;
		
		for(int i=0;i<n-1;i+=2) {
			
			
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
							
		}

				for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
	}
}
