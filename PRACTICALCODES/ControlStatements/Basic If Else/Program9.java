import java.util.Scanner;

class DayofWeek{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number(1-7): ");
	
	int dayNumber=sc.nextInt();
	if(dayNumber==1){
		System.out.println("Monday");
	}else if(dayNumber==2){
		System.out.println("Tuesday");
	}else if(dayNumber==3){
		System.out.println("wednesday");
	}else if(dayNumber==4){
		System.out.println("Thursday");
	}else if(dayNumber==5){
		System.out.println("Friday");
	}else if(dayNumber==6){
		System.out.println("Saturday");
	}else if(dayNumber==7){
		System.out.println("Sunday");
	}else{
		System.out.println("day number must be between 1 to 7!!!");
		}
	}
}
	