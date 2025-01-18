import java.util.*;

class InputDemo4{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String name=sc.next();

		System.out.println("Enter your society name");
		String socName=sc.next();

		System.out.println("Enter Wing");
		char wing=sc.next().charAt(0);


		System.out.println("Enter Flat No");
		int flatNo=sc.nextInt();
	
		System.out.println("Name: "+ name);
		System.out.println("SocietyName: " + socName);
		System.out.println("Wing: " + wing);
		System.out.println("FlatNo: "+ flatNo);


		
	}
}

