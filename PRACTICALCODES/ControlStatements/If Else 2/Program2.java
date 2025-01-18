import java.io.*;
	
class TableNum{
	public static void main(String[] args)throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the number :");
	String input=br.readLine();
	int num=Integer.parseInt(input);
	
	if(num%13==0){
		System.out.println("Number is in table of 13: " + num);
		}else{
			System.out.println("Number is not in table of 13: " + num);
			}
		}
	} 