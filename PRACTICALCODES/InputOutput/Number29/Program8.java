import java.io.*;
class duckNO{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int temp=num;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			if(rem==0){
				System.out.println("The number "+num+" is Duck Number");
				break;
			}
			temp/=10;
		}
	}
}



