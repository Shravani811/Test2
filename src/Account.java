
import java.util.Scanner;
class FixedAccount {
	Scanner sc=new Scanner(System.in);
	
	void calculateInterest() {
		float p=sc.nextFloat();
		float t=sc.nextFloat();
		float r=sc.nextFloat();
		double total=p*t*r/100;
		System.out.println(total);
	}
}
class SavingsAccount extends FixedAccount{
	
	
	void calculateInterest() {
		float p=sc.nextFloat();
		float t=sc.nextFloat();
		float r=sc.nextFloat();
		double total=p*t*r/100;
		System.out.println(total);
	}
}
class Account{
public static void main(String[] args) {
	
	FixedAccount f=new FixedAccount();
	f.calculateInterest();
		SavingsAccount s=new SavingsAccount();
		s.calculateInterest();

}

}
