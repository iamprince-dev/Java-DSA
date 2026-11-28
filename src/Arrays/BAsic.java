package Arrays;

public class BAsic {

	public static void main(String[] args) {
		
		int[]arr= {-1,-3,-4};
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i] *(-1)*arr[i]*(-1);
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
