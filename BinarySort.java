package com.jay.enterprise;
import java.util.*;
public class BinarySort
{
	public void Binary(int arr[],int first,int last)
	{
		int temp;
		if(first<last)
		{
			int i=first;
			int j=last;
			int mid=(first+last)/2;
			int pivot=arr[mid];
			while(i<j)
			{
				while(arr[i]<= pivot && i<last)
				{
					i++;
				}
				while(arr[j] >= pivot && i<j)
				{
					j--;
				}
				if(i<j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			Binary(arr,first,mid);
			Binary(arr,mid+1,last);
		}
		else
		{
			System.out.println("Can not be sorted.");
		}
	}
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		BinarySort bs=new BinarySort();
		System.out.println("Enter Size of array:");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in Array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		if(min==max)
		{
			System.out.println("No need to be sorted.");	
		}
		else
		{
			bs.Binary(arr,0,n-1);
			System.out.println("Sorted Elements are:....");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
