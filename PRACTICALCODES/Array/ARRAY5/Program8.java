import java.io.*;
class Question8{
	public static void main(String []args)throws IOException{
	
		BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter array size: ");
		int size=Integer.parseInt(dd.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(dd.readLine());
		
		}

		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
	//	System.out.println("min "+min);
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
	//	System.out.println("max "+max);
		int smin=max;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>min && arr[i]<smin){
				smin=arr[i];
			}
		}
			System.out.println("Second min array: "+smin);
		
	}
}

