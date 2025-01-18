import java.io.*;
class P4{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		int space=0;
		int num=0;
		for(int i=1;i<row*2;i++){
			int temp=1;
			if(i<=row){
				space=row-i;
				num=i*2-1;
			}
			else{
				space=i-row;
				num=num-2;
			}
			for(int sp=1;sp<=space;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=num;j++){
				if(j<=num/2){
					System.out.print(temp+"\t");
					temp++;
				}
				else{
					System.out.print(temp+"\t");
					temp--;
				}
			}
			System.out.println();
		}
	}
}


