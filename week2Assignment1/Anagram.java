package week2Assignment1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potst";
		String converted1 = "";
		String converted2 = "";
				
		
		if (text1.length()==text2.length()) 
	{
		
		System.out.println("Length of given string is equal");
		
		char[] a=text1.toCharArray();
		Arrays.sort(a);
		for (int i=0;i<a.length;i++)
		{
			converted1=converted1+a[i];
		}
		
		System.out.println("Converted text1 is "+converted1);
		
		char[] b=text2.toCharArray();
		Arrays.sort(b);
		for (int j=0;j<b.length;j++)
		{
			converted2=converted2+b[j];
		}
		System.out.println("Converted text2 is "+converted2);
		
		if(converted1.equals(converted2)) 
		{
			System.out.println("Given strings are an anagram");
			
		}
		else 
		{
			System.out.println("Given strings are not an anagram");
		}
	}
	else 
	{
		System.out.println("Length of given string is not equal so given string is not an anagram");
	}
		
	}
	
	}

