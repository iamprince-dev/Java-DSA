package Arrays;

public class EvenNumberOfDigit {

	public static void main(String[] args) {
		int []arr= {12,345,2,6,7896 ,10,28,23,251};
				int digit=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int count =0;
             int num=arr[i];
			while(num!=0) {
				num=num/10;
				count++;
			}
			if(count%2==0) digit++;
		}
		System.out.println(digit);
	}
}
