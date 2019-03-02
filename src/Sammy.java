import java.util.Scanner;

public class Sammy {
 void details() throws InvalidEmployeeException {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	if(age>20 && age<55) {
	
	String name=sc.next();
	long phoneNo=sc.nextLong();
	System.out.println("valid");
	
	}
	else {
		throw new InvalidEmployeeException("does not accept this age");
	}
	
}
	public static void main(String[] args) throws InvalidEmployeeException{
		Sammy s=new Sammy();
		s.details();

	}

}
class InvalidEmployeeException extends Exception{
	InvalidEmployeeException(String s){
		System.out.println(s);
	}
}
