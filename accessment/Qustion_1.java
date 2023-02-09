package accessment;

import java.util.Scanner;

public class Qustion_1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int search=sc.nextInt();
System.out.println("Enter the limit");
int num=sc.nextInt();
int []ar=new int[num];
for(int i=0;i<ar.length;i++) {
	System.out.println("Enter the number");
	ar[i]=sc.nextInt();
}
for(int i=0;i<ar.length;i++) {
	for(int j=i+1;j<ar.length;j++) {
		if(ar[i]+ar[j]==search) 
			System.out.print(ar[i]+" "+ar[j]);
		
	}
	System.out.println();
}
	}

}
