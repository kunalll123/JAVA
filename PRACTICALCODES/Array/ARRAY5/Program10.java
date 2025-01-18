import java.io.*;
class Question10{
	public static void main(String []args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr.length;i++){
			int fact=1;
			int num=arr[i];
			while(num<=1){
			
			fact=fact*num;
			num--;	
			}
			System.out.println(fact);
		}
	}
}

