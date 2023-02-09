package accessment;

import java.util.Arrays;

public class Qustion_Sort {

	public static void main(String[] args) {
int ar[]= {70,50,60,20,10};
System.out.println("ar "+Arrays.toString(ar));

for(int i=0;i<ar.length;i++) {
	
for( int j=i;j>0;j--) {
	

	int temp=ar[j];

	ar[j]=ar[j-1];
	ar[j-1]=temp;
}

}
	System.out.println("array sort"+Arrays.toString(ar));

}
}	


