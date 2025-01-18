import java.io.*;
	
class VoterAge{
	public static void main(String[] args)throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the Voter age: ");
	String vote=br.readLine();
	int age=Integer.parseInt(vote);
	
	if(age>=21){
		System.out.println("Valid age for voting");
		}else{
			System.out.println("Invalid age");
		}
	}
}