package Arrays;

public class MoveZero {

	public static void main(String[] args) {
		int[]arr= {0,1,0,3,5};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
          for(int ele:arr) {
        	  System.out.print(ele +" ");
          }
	}
}
