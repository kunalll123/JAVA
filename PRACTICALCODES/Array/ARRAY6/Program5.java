import java.io.*;
class Question5{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Entere a First Array Size");
		int size1=Integer.parseInt(br.readLine());
	
		int arr1[]=new int[size1];
	
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
	
		}
	
		System.out.println("Enter a Second Array Size");
		int size2=Integer.parseInt(br.readLine());
	
		int arr2[]=new int[size2];
	
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		int num=size1+size2;
		int temp=0;
	
		int arr3[]=new int[num];
			while(temp<num){
				for(int j=0;j<arr1.length;j++){
					arr3[temp]=arr1[j];
					temp++;
				}
				for(int k=0;k<arr2.length;k++){
					arr3[temp]=arr2[k];
					temp++;
				}
			}
		for(int z=0;z<num;z++){
			System.out.print(arr3[z]+" ");
		}
	}
}
		

