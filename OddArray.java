package Array_Ex;
import java.util.Scanner;
public class OddArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int a[]=new int[10];
	     for(int i=0;i<a.length;i++)//use for value insert
	     {
	     	System.out.println("Enter value :");
	     	a[i]=sc.nextInt();
	     }
         for(int x:a)
         {
        	 if(x%2!=0)
        	 {
        		 System.out.println(x);
        	 }
         }
	}

}
