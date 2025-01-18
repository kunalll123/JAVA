import java.util.*;

class TotalMarks{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the marks of Math:");
		int math=sc.nextInt();

		System.out.println("Enter the marks of English:");
		int english=sc.nextInt();

		System.out.println("Enter the marks of Science:");
		int science=sc.nextInt();

		System.out.println("Enter the marks of Marathi:");
		int marathi=sc.nextInt();

		int totalMarks = math + english + science + marathi;

		System.out.println("Total Obtained Marks : " + totalMarks + "/100");
	}
}
