import java.io.*;
class fibonacci{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());

		int num1=0;
		int num2=1;
		int add=0;
		int cnt=0;
		System.out.println(num1);
		System.out.println(num2);
		while(size-2>0){
			add=num1+num2;
			System.out.println(add);
			if(cnt==0){
				num1=add;
				cnt++;
			}
			else{
				num2=add;
				cnt--;
			}
		size--;
		}
	}
}




