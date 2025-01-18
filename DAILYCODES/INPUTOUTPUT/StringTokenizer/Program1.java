import java.io.*;

class InputDemo{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name");
		String name=br.readLine();

		System.out.println("Enter your society name");
		String socName=br.readLine();

		System.out.println("Enter Wing");
		String wing=br.readLine();

		System.out.println("Enter Flat No");
		String flatNo=br.readLine();

		
	}
}

