import java.util.Scanner;
class P9{
	public static void main(String []aRgs){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int space=0;
		int num=0;
		int temp=row+1;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				space=row-i;
				num=i*2-1;
				temp--;
			}
			else{
				space=i-row;
				num=num-2;
				temp++;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=num;j++){
				System.out.print((char)(64+temp)+"\t");
			}
			System.out.println();
		}
	}
}


