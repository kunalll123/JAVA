import java.io.*;
class Question3{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int num=0;
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>=3){
				num=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				arr[i]=arr[i]*arr[i]*arr[i];
			}
			System.out.println("Array will be like: "+ arr[i]+" ");
		}
	}
}


