package Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7};
		int n= arr.length;
		int k=3;
		reverse(arr,0,k);
		reverse(arr,k+1,n-1);
		reverse(arr,0,n-1);

		
	for(int ele:arr) {
		System.out.print(ele +" ");
	}
		
		
	}
	
	static void reverse(int []arr,int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
