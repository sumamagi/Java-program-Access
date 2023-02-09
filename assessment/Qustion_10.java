package accessment;

import java.util.Scanner;

public class Qustion_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the limit");
	int num=sc.nextInt();
	int array[]=new int[num];
	
	for( int i=0;i<num;i++) {
		System.out.println("Enter the numbers");
		array[i]=sc.nextInt();
	}
		System.out.println("Enter the divisible key");
		int k=sc.nextInt();

		
for(int j=0;j<array.length;j++) {
	int sum=0;
	for(int l=j+1;l<array.length;l++) {
		
		if(j<l) { 
			sum=j+l;
		
		 if(sum%k==0) {
			System.out.print("par meet["+l+" "+j+"]");
		
	}
		 
		 }
}

	}

	

	
}
	}



	
	
		

	
	   






	

	


