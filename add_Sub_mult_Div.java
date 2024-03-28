package NormalCode;
import java.util.Scanner;
//using switch case Decision making statement

public class add_Sub_mult_Div {

	public static void main(String[] args) {
		System.out.println("Enter the number to perform mathematical operations:");
		Scanner Sc=new Scanner(System.in);
		int n1=Sc.nextInt();
		int n2=Sc.nextInt();
		int n4;
		
		System.out.println("Choose the options belows:");
		System.out.println(" 1.Addition\n 2.Substraction \n 3.Multiplication \n 4.Division");
		
		int option=Sc.nextInt();
		
		switch(option) {
		
		case 1:{
			System.out.println("addition="+(n1+n2));
			break;
		}
		
		case 2:{
			System.out.println("Susbtraction="+(n1-n2));
			break;
		}
		
		case 3:{
			System.out.println("Multi="+(n1*n2));
			break;
		}
		
		case 4:{
			if(n2==0) {
				System.out.println("Enter the Valid input:");
			}
			
			else {
				System.out.println("Division="+(n1/n2));
				break;
			}
			
		}
	
		}
		
		// TODO Auto-generated method stub

	}

}
