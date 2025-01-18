import java.io.*;

class Question5{
	public static void main(String []args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];

		System.out.println("Enter elements of an array: ");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			int rem=0;
			while(arr[i]>0){
				arr[i]/=10;
				count++;
			}
			System.out.print(count+",");
		}
	}
}

