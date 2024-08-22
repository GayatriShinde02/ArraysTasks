package SimplePrograms;

import java.util.Scanner;

public class SquareCubeEle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter value:");
			a[i]=sc.nextInt();		
	    }
       for(int x:a)
       {
    	   System.out.println("Square of element:"+x*x);
    	   System.out.println("cube of element:"+x*x*x);
       }
}
}
