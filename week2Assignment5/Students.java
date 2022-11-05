package week2Assignment5;

public class Students {

	public void getStudentInfo(int userId) {
		String uID = "00"+userId;
		System.out.println("Updated User id of the student is " + uID);
		}
	
	public void getStudentInfo(int userId, String name) {
		String uID = "00"+userId;
		System.out.println("Updated User id of the student is " + uID +" and name is "+name);
		}
	
	public void getStudentInfo(String phoneNum, String emailAddress) {
		String countrycode = "+91 "+phoneNum;
		System.out.println("phone number of the student is " + countrycode +" and email address is "+emailAddress);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
	obj.getStudentInfo(1);
	obj.getStudentInfo(1, "Testname");
	obj.getStudentInfo("123456489", null);
	
		
	}

}
