import java.util.*;
class Pattern9{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();

		int col=0;
		

		for(int i=1;i<row*2;i++){
			int num=row;
			if(i<=row){
				col=row-i;
				num=row-i;
			}
			else{
				col=i-row;
				num=i-row;
			}
			for(int sp=1;sp<=col;sp++){
				System.out.print("\t");
			}

			if(i<=row){
				col=i;
			
			}
			else{
				col=row*2-i;
		
			}
			for(int j=1;j<=col;j++){
				System.out.print(num+++"\t");
			}
			System.out.println();
		}
	}
}


