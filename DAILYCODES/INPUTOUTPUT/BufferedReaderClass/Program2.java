import java.io.*;

class Company{
	public static void main(String[] args)throws IOException{

	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	 System.out.println("Enter Employee Name:");
	 String empName=br.readLine();
	
	 System.out.println("Enter Company Name:" );
	 String compName=br.readLine();

	 System.out.println("Enter Employee Salary:");
	 float sal=Float.parseFloat(br.readLine());

	 System.out.println("Enter Employee ID:");
	 int id=Integer.parseInt(br.readLine());


	 System.out.println("Employee Name:" +empName);
	 System.out.println("Company Name:" +compName);
	 System.out.println("Employee Salary:" +sal);
	 System.out.println("Employee Id:" +id);
	}
}



