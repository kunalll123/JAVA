import java.io.*;
class P1{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		int space=0;
		int num=0;
		for(int i=1;i<row*2;i++){
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
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}


