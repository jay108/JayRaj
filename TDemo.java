package com.jay;
class TDemo2 extends Demo implements IntDemo
{
	@Override
	public void running(String str)
	{
		System.out.println("Super class Called.");
		super.running(str);
	}
}
public class TDemo 
{
	public static void main(String[] args)
	{
		TDemo2 td1=new TDemo2();
		td1.running("Hello How Are You?");
	}
}
class Demo
{
	public void running(String str)
	{
		System.out.println(str);
		for(int i=0;i<10;i++)
		{
			System.out.println(i*10);
		}
	}
	
}