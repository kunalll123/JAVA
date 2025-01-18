
import java.io.*;
class Question4{
	public static void main(String []args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter a number You want");

		int num=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				cnt++;
			}
		}
		if(cnt<=2){
			System.out.println(num+" occurs"+cnt+"Times in array");
		}
		else{
			System.out.println(num+" occurs more than 2 times");
		}
	}
}
