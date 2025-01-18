import java.util.*;

class Pattern7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		
		for(int i=1; i<=row; i++){
			int num=1;
			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");
			}
		
			for(int j=1; j<=(i*2)-1; j++){
				if(i%2 == 1){
					if(j<((i*2)-i)){

						System.out.print(num++ + "\t");
					}else{
						System.out.print(num-- + "\t");
					}
				}else{
					if(j<((i*2)-i)){

						System.out.print(num++ +"\t");
					}else{
						System.out.print(num-- +"\t");
					}
				}
				
			}
		
			System.out.println();
	
		}
	}
}

