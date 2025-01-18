import java.io.*;

class InputDemo3{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name");
		String name=br.readLine();

		System.out.println("Enter your society name");
		String socName=br.readLine();

		System.out.println("Enter Wing");
		char wing=(char)br.read();

		br.skip(1);

		System.out.println("Enter Flat No");
		int flatNo=Integer.parseInt(br.readLine());
	
		System.out.println("Name: "+ name);
		System.out.println("SocietyName: " + socName);
		System.out.println("Wing: " + wing);
		System.out.println("FlatNo: "+ flatNo);


		
	}
}

