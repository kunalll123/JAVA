import java.util.*;

class ScannerDemo2{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("ENter the number: ");
		int num=sc.nextInt();

		for(int i=num; num<=100; i++){
		System.out.println(num+=10);
	
		}
	}

}

