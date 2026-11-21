package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasics {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(25);
		arr.add(30);
		arr.add(35);
		arr.add(2);
		arr.add(5);
		
				System.out.println(arr.get(0));
		System.out.println(arr.get(4));
		arr.set(2, 40);
		
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
		    System.out.print(arr.get(i)+" ");	
		}
		System.out.println();
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		arr.add(1, 100);
		
		System.out.println(arr);
		
		System.out.println();
		
		

		arr.remove(arr.size()-1);
		System.out.println(arr);
		
	//	Collections.reverse(arr);
		int i=0,j=arr.size()-1;
		
		while(i<j) {
			int temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			i++;
			j--;
		}
		
		System.out.println(arr);
	}

}
