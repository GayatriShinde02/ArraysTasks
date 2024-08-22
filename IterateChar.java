package Array_Ex;
import java.util.Scanner;
public class IterateChar {

	public static void main(String[] args) {
		
	     Scanner sc=new Scanner(System.in);
	     char a[]=new char[10];
	     for(int i=0;i<a.length;i++)//use for value insert
	     {
	     	System.out.println("Enter character :");
	     	a[i]=sc.next().charAt(0);
	     }
	     for(char x:a)//use for print   forEach loop/EnhanceForLoop
	     {
	     	System.out.println(x);
	     }
		}
	/*
	  Scanner sc=new Scanner(System.in);
	     char a[]=new char[10];
	     for(int i=0;i<a.length;i++)//use for value insert
	     {
	     	System.out.println("Enter character :");
	     	a[i]=sc.next().charAt(0);
	     }
	     for(int j=0;j<a.length;j++)//use for print   forEach loop/EnhanceForLoop
	     {
	     	System.out.println(a[i]);
	     }
		}
	 */
}
