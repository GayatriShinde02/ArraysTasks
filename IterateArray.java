package Array_Ex;
import java.util.Scanner;
public class IterateArray {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     int a[]=new int[10];
     for(int i=0;i<a.length;i++)//use for value insert
     {
     	System.out.println("Enter value :");
     	a[i]=sc.nextInt();
     }
     for(int x:a)//use for print   forEach loop/EnhanceForLoop
     {
     	System.out.println(x);
     }
	}

}
