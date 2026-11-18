package Arrays;

public class Reverse_Part_Array {

	public static void main(String[] args) {
		
		int []arr= {3,9,56,83,18,24,85,4};
		int n= arr.length;
		
		int i=2,j=5;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int ele :arr) {
			System.out.print(ele +" ");
		}
	}
}
