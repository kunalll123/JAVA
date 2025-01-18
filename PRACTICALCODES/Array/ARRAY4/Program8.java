import java.io.*;

class Question8{
	public static void main(String []args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the array size: ");
		int size=Integer.parseInt(br.readLine());

		char ch[]=new char[size];

		for(int i=0;i<ch.length;i++){
			ch[i]=br.readLine().charAt(0);
		}
		int count=0;
		char shabd=br.readLine().charAt(0);
		for(int i=0;i<ch.length;i++){
			if(shabd==ch[i]){
				count++;
			}
		}
		if(count<=2){
			System.out.println(shabd+" is occurance "+count+" times");
		}
		else{
			System.out.println(shabd+" is occurce more than two times");
		}
	}
}

