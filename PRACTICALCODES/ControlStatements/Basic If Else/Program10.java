import java.util.Scanner;

class monthName{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the month(1-12): ");
	
	int monthNumber=sc.nextInt();
	if(monthNumber==1){
		System.out.println("January");
	}else if(monthNumber==2){
		System.out.println("February");
	}else if(monthNumber==3){
		System.out.println("March");
	}else if(monthNumber==4){
		System.out.println("April");
	}else if(monthNumber==5){
		System.out.println("May");
	}else if(monthNumber==6){
		System.out.println("June");
	}else if(monthNumber==7){
		System.out.println("July");
	}else if(monthNumber==8){
		System.out.println("August");
	}else if(monthNumber==9){
		System.out.println("Septmber");
	}else if(monthNumber==10){
		System.out.println("October");
	}else if(monthNumber==11){
		System.out.println("November");
	}else if(monthNumber==12){
		System.out.println("December");
	}else {
		System.out.println("Invalid input for month");
		}
	}
}
		
	