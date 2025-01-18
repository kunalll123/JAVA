import java.util.*;

class DivisibleBy8{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num=sc.nextInt();

		if(num%8==0){
			System.out.println(num + "Number is divisible by 8 ");
		}else{
			System.out.println(num + "Number is not divisible by 8");
		}
	}
}
