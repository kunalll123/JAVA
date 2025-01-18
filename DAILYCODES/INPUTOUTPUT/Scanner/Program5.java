import java.util.*;

class VoterAge{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Voter age:");
		int age=sc.nextInt();

		if(age>=18){
			System.out.println("Voter is eligible for voting");
		}else if(age<18){
			System.out.println("Voter is not eligible for voting");
		}else{
			System.out.println("Invalid Age");
		}
	}
}
