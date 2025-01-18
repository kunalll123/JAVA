import java.io.*;
class Question9{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			int rev=0;
			int rem=0;
			int temp=arr[i];
			while(temp>0){
				rem=temp%10;
				rev=rem+rev*10;
				temp/=10;
			}
			if(arr[i]==rev){
				count++;
			}
		}
		System.out.println("The palindrome numbers in array are "+count);

	}
}
			

