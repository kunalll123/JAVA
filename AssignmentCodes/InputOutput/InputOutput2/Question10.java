import java.util.*;

class ScannerDemo9{

	static int num=0;

	static void printNum(){

		for(int i=num*10;i>0; i-=10){
			System.out.println(i);
		}
	}
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the number :");
		num = sc.nextInt();
		printNum();
	}
}

