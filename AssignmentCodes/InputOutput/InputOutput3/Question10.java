import java.util.*;

class ScannerDemo10{
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter float value");
		float fNum=sc.nextFloat();

		System.out.println("Enter int value");
		int iNum=sc.nextInt();

		System.out.println("Enter boolean value");
		boolean bool=sc.nextBoolean();

		for(int i=1; i<=3; i++){
			if(i==1){
				System.out.println(fNum+" ");
			}
			if(i==2){
				System.out.println(iNum+" ");
			}
			if(i==3){
				System.out.println(bool+" ");
			}
		

		}
	}
}

