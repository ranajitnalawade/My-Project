//swaping of the number without using third variable
package NormalCode;

public class Swaping_without {
	public static void main(String args[]) {
		int a=10;
		int b=6;
		System.out.println("before a:"+a);
		System.out.println("before b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after a:"+a);
		System.out.println("after b:"+b);
		
		
	}

}
