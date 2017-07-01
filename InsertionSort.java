package com.jay.enterprise;
import java.util.*;
public class InsertionSort 
{
	public void Insertion(int arr[])
	{
		int temp,x=0;
		for(int i=1;i<arr.length;i++)
		{
			//x=arr[i];
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n;
		InsertionSort is=new InsertionSort();
		System.out.println("Enter Size of Array:");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements of Array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		is.Insertion(arr);
		System.out.println("Sorted Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}	

}
