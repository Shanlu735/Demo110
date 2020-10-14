package main;

import java.util.ArrayList;

public class Pj {
	public void pingjun(ArrayList arr) {
		int sum=0;
		int x;
		for(int i=0;i<arr.size();i++)
		{
		sum+=(int)arr.get(i);
		}
		x=sum/arr.size();
		System.out.println("平均数为："+x);
	}
	
}
