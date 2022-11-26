package assignment;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {2,4,5,8,4,2,5,8,5,3,1};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 1; j < a.length-i; j++) 
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
