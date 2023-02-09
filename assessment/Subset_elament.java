package accessment;

import java.util.Scanner;

public class Subset_elament {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the input");
String input=sc.nextLine();

System.out.print("{}");
for(int i=0;i<input.length();i++) {
	char car=input.charAt(i);
	
	System.out.print("{"+car+"}");
}
int i=0,j;
for( i=1;i<=input.length();i++) {
	for( j=i+1;j<=input.length();j=j+2) {
		System.out.print("{"+i+j+"}");

	}
}
System.out.print("{"+input+"}");

}
	

	}

	


