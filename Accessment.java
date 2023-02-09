import java.io.*;
import java.util.*;
public class Accessment {

	public static void main(String[] args) {
		

 Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		char  s=sc.next().charAt(0);
		String str=s(char);

		int n= str.length();

		int openbracket =0;

		int closebracket =0;
int operator=0;
		 

	

		for(int i=0;i<n;i++) {

		if(str.charAt(i)==')')      

		{

		                openbracket++;

		}

		else if(str.charAt(i)==')') {

		                closebracket++;

		               

		}

		else if(str.charAt(n-2)=='*'||str.charAt(n-2)=='/'||str.charAt(n-2)=='+'||str.charAt(n-2)=='-');

		operator++;

		break;

		}

		if(openbracket==closebracket)

           System.out.println("valid");

	else 
           System.out.println("invalid");

		               
		 }

	private static String s(Class<Character> class1) {
		// TODO Auto-generated method stub
		return null;
	}

		}


