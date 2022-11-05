package week2Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="MAdam";
		String b="";
		
		for (int i = a.length()-1;i>=0;i--) {
			b= b+ a.charAt(i);
						
		}
		System.out.println("palindrome value of given string is "+b);
		if (b.equalsIgnoreCase(a)) {
			System.out.println("Given string is an palindrome");
		}
		else {
			System.out.println("Given string is not an palindrome");
		}

	}

}
