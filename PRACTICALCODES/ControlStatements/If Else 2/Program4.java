import java.util.Scanner;

class Student{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the percentage: ");
	double percentage=sc.nextDouble();
	
	if(percentage>85.00){
		System.out.println("Medical");
		}else if(percentage<=85.00 && percentage>75.00){
			System.out.println("Engineering");
			}else if(percentage<=75.00 && percentage>=65.00){
				System.out.println("pharmacy or bachelor in science");
				}
		}
}