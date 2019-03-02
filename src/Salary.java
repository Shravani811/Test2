import java.util.Scanner;

public class Salary {
void salaryDetails() {
	Scanner input=new Scanner(System.in);
	System.out.println("enter basic salary");
    double  basic=input.nextDouble();
    double hra=basic/2;
    double pf=0.12*basic;
    double allowance=0.75*basic;
    double total=hra+allowance-pf;
    System.out.println(total);
    
}
	public static void main(String[] args) {
		Salary salary=new Salary();
		salary.salaryDetails();
	}

}
