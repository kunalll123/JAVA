import java.io.*;
class Question6{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine().charAt(0);
		}
		int cnt=0;
		int cnt2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u' ||arr[i]=='A'||arr[i]=='E' ||arr[i]=='I'||arr[i]=='O' ||arr[i]=='U'){		
			cnt++;
		}
		else{
			cnt2++;
		}
	}
	System.out.println("Count of vowel :"+ cnt);
	System.out.println("Count of consonent :"+ cnt2);

}
}

