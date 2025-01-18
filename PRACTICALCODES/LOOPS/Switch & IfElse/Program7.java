import java.util.*;
	
class TripPlanning{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Destination Name: ");
	
	String budget=sc.nextLine();
	
	switch(budget){
		
		case "Jammun&Kashmir":
					System.out.println("For budget 15000 destination is Jammu and Kashmir");
					break;
		
		case "Manali":
				System.out.println("For budget 10000 destination is Manali");
				break;
		
		case "Amritsar":
				System.out.println("For budget 6000 destination is Amritsar");
				break;
		
		case "Mahabaleshwar":
				System.out.println("For budget 2000 destination is Mahabaleshwar");
				break;
		
		default:
			System.out.println("For other budgets try next time");
			break;
		}
	}
}