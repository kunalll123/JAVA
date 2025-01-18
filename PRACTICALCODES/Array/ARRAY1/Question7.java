import java.util.*;

class Question7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of Employees working at company: ");
		int empCount=sc.nextInt();

		int ages[]=new int[empCount];

		for(int i=0; i<empCount; i++){
			System.out.print("Enter age of employee: ");
			ages[i]=sc.nextInt();
		}

		System.out.println("ENter count of employees: ");
		for(int i=0; i<empCount; i++){
			System.out.println(empCount + " ");
		}
	}
}
