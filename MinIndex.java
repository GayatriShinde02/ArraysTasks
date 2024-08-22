package Array_Task9_MinIndex;

public class MinIndex {

	public static void main(String[] args) 
	{
		int a[]= {100,67,89,699,987};
        int min=a[0];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
        	if(min>a[i])
        	{
        		min=a[i];
        		index=i;
        	}
        }
        System.out.println("Manimum number:"+min);
		System.out.println("Position of min number:"+index);
	}

}
