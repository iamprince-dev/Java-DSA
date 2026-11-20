package Arrays;

public class Wave_array {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		
		int n = arr.length;
		int i=0;
		int j=1;
		int temp=0;
		
		while(i<n) {
			if(arr[i]%2==0) {
			 
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;

							}
		}

				for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
	}
}
