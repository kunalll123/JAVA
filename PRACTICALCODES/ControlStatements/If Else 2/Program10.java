import java.util.Scanner;
	
class TicketDiscountChecker{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age: ");
	
	int age=sc.nextInt();
	
	if(age < 18){
		System.out.println("Eligible for the Discount of ticket Price" + age);
		}else if(age >=18 && age <=25){
				System.out.println("Eligible for 10% Discount of ticket Price" + age);
		}else{
			System.out.println("Sorry,no discount is available for your age group" + age);
		}
	}
}