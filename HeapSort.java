package com.jay;
import java.util.*;
public class HeapSort
{	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int t,n,job;
		System.out.println("Test Case :");
		t=in.nextInt();
		while(t>0)
		{
			System.out.println("Enter Number of Employee:");
			n=in.nextInt();
			job=n;
			int al[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					al[i][j]=in.nextInt();
				}
			}
			int min=al[0][0],min_cnt[]=new int[n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(al[j][i]<min)
					{
						min=al[j][i];
					}
				}
				min_cnt[i]=min;
			}
			System.out.println("Optimized output is:");
			int opt=0;
			for(int i=0;i<n;i++)
			{
				opt=opt+min_cnt[i];
			}
			System.out.println(opt);			
			t--;
		}
	}
}
