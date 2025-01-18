import java.io.*;
class Question2{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements: ");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
	
		}	
		
		int sum=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			int num=arr[i];
			while(num>0){
				if(arr[i]%num==0){
					cnt++;
				}
				num--;
			}
			if(cnt==2){
				sum=arr[i]+sum;
				count++;

			}
		}
		System.out.println("Sum of all prime numbers is "+sum+" and count of prime numbers in the given array is "+count);
	}
}


