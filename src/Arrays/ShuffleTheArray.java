package Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int []arr= {2,5,1,3,4,7};
		
		int n=arr.length;
		int []arr2=new int[n];
		int j=0;
		int i=0;
	     while(i<n/2) {
	    	 arr2[j++]=arr[i];
	    	 arr2[j++]=arr[n/2+i];
	    	 i++;
	     }
	     for(int ele:arr2) {
	    	 System.out.print(ele+" ");
	     }
	}
}
