package Array_Task8_MaxIndex;

public class MaxEleIndex {

	public static void main(String[] args)
	{
		int a[]= {10,100,60,80,900};
		int max=a[0];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				index=i;
			}
		}
		System.out.println("Maximum number :"+max);
		System.out.println("Position of max number:"+index);
	}
}
