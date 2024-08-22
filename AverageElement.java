package Array_Ex;

public class AverageElement {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		int average=0;
		int sum=0;
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[1]+a[2]+a[3];
			average=sum/4;
		}
        System.out.println(average);
	}

	}
/*import java.util.Scanner;
public class AverageElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		int average = 0;
		for(int i=0;i<a.length;i++)//use for value insert
	     {
	     	System.out.println("Enter value :");
	     	a[i]=sc.nextInt();
	     	sum=a[i]+sum;
	     	average=sum/a.length;
	     	//average=sum/5;
	     }
		System.out.println("Average of Elements :"+average);
	}
		
}*/


