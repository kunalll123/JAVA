import java.io.*;
	
class Numberrange{
	public static void main(String[] args)throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the number :");
	String input=br.readLine();
	int num=Integer.parseInt(input);
	
	if(num>=1 && num<=1000){
		System.out.println("Number is in range 1 to 1000: " + num);
		}else{
			System.out.println("Number is not in range 1 to 1000: " + num);
			}
		}
	} 