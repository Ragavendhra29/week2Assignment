package week2Assignment1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,6,8};
Arrays.sort(arr);
		for (int i=1;i<=arr.length-1;i++)
		{
			
				if(arr[i-1]!=i)
				{
					System.out.println("Missing value is "+ i);
					break;
				}
			}
			
		}
	}


