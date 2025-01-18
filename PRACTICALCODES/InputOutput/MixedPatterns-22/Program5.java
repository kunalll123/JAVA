import java.util.*;

class Pattern5{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		int num=3;
		int mul=0;

		for(int i=1; i<=row; i++){


			for(int j=1; j<=row; j++){

				if(i%2 == 1){
					mul=num*num;
					System.out.print(mul + " ");
					
			}else{
				System.out.print(num + " ");
			}
			num++;
			}
			System.out.println();
		}
	}
}


