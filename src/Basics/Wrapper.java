package Basics;

public class Wrapper {
	public class WrapperDemo {

	    public static void main(String[] args) {

	        // Primitive
	        int a = 10;

	        // Auto-Boxing
	        Integer b = a;

	        // Auto-Unboxing
	        int c = b;

	        // Manual Boxing
	        Integer d = Integer.valueOf(50);

	        // Manual Unboxing
	        int e = d.intValue();

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        System.out.println(e);
	    }
	}

}
