import java.util.*;

class Pattern10{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		int num=(row*row)-2;

		for(int i=1; i<=row; i++){
			int num2=row*(row-i+1);
			for(int j=1; j<=row; j++){

				if(i==j){
					System.out.print("$"+" ");
				}else{
					System.out.print(num2+" ");
					num2=num2+num;
					num-=2;
				}
				
			}
			num+=4;
			System.out.println();
		}	
	}
}


