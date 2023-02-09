package accessment;

import java.util.Scanner;

public class Patten {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   for(int i=1;i<=num;i++) {
	   for(int j=1;j<=num;j++) {
		   if(i==1||i==num||j==1||j==num) {
		   System.out.print("1");
		   
		   }
		   else if(i==3&&j==3) {
			   System.out.print("1");
		   }
		   
		   else {
			   System.out.print("0");
		   }
			  
		   
	   }
	   System.out.println();
   }
	}
}
	


