import java.util.*;
class P8{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int space=0;
		int num=0;
		int temp=0;
		for(int i=1;i<row*2;i++){
			if(i<=row){
				space=row-i;
				num=i*2-1;
				temp=i;
			}
			else{
				space=i-row;
				num=num-2;
				temp=temp-2;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=num;j++){
				if(j<=num/2){
					System.out.print((char)(64+temp)+"\t");
					temp--;
				}
				else{
					System.out.print((char)(64+temp)+"\t");
					temp++;
				}
			}
			System.out.println();
		}
	}
}

