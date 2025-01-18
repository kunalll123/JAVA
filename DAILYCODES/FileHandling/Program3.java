import java.io.*;

class FileWrite{
	public static void main(String[] args)throws Exception{

		FileWriter obj=new FileWriter("Incubator.txt");

		obj.write("kunal\n");
		obj.write("Somanath\n");
		obj.write("Sonawane\n");

		obj.close();
	}
}
