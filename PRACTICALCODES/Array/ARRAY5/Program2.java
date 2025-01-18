import java.io.*;

class Question2{
	public static void main(String []args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even=even+arr[i];
			}
			else{
				odd=odd+arr[i];
			}
		}
		System.out.println("The sum of ODD is "+odd);
		System.out.println("The sum of EVEN is "+even);
	}
}

