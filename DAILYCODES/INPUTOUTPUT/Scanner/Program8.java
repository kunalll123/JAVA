import java.util.*;

class NoPresentTable{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num=sc.nextInt();

		if(num%16==0){
			System.out.println(num + "Number is present in the table of 16");
		}else{
			System.out.println(num + "Number is not present in the table of 16");
		}
	}
}
