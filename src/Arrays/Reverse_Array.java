package Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int []arr= {23,3,55,6,25,77,8};
		
		int n = arr.length;
		int i=0;
		int j=n-1;
		
//		for(i=0;i<2;i++) {
//			int swap= arr[i];
//			arr[i] = arr[n-1-i];
//			arr[n-1-i]=swap;
//			
//		}
			
		
		while(i<j) {
		 int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int ele :arr) {
			System.out.print(ele +" ");
		}
		}
	}

