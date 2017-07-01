package com.jay;
import java.util.*;
public class SelectionSort 
{
	public void selectionSorting(int arr[])
	{
		int temp;
		for(int i=0;i<(arr.length-1);i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] >arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		SelectionSort ss=new SelectionSort();
		System.out.println("Enter Array Size:");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		ss.selectionSorting(arr);
	}

}
