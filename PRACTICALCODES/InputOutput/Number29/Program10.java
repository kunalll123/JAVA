import java.io.*;
class P10{
	public static void main(String []args)throws IOException{
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int temp=num;
		int rem=0;
		int count=0;
		while(temp>0){
			temp/=10;
			count++;
		}
		temp=num;
		int sum2=0;
		while(temp>0){
			int sum=1;
			rem=temp%10;
			int z=count;
			while(z>0){
				sum=rem*sum;
				z--;
			}
			sum2=sum2+sum;
			temp/=10;
		}
		if(num==sum2){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("NOt");
		}
	}
}


