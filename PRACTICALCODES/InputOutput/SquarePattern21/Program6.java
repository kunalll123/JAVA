import java.io.*;

class Pattern6{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row");
		int row=Integer.parseInt(br.readLine());

		int num=row;
		int mul=1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(num%2 != 0){
				mul=num*num;
				System.out.print(mul + " ");
				num++;
			}else{
				System.out.print(num + " ");
				num++;
			}
			}
			System.out.println();
		}
	}
}

