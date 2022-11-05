package week2Assignment4;

public class AxisBank {
	
	public static String Deposit(String a) {		
		return a;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = BankInfo.Deposit(1234, 4321);
		System.out.println("This is a Deposit account from Bankifo class with id as "+id);
		String name =AxisBank.Deposit("Test name");
		System.out.println("This is a Deposit account from AxisBank class with name as "+name);
	}

}
