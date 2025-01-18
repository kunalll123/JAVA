import java.io.*;

class FileDemo{
	public static void main(String[] args)throws IOException{

		File fobj=new File("Incubator.txt");
		fobj.createNewFile();

		File dirobj=new File("JAVA 2024");
		dirobj.mkdir();

		File fobj2=new File(dirobj,"Core2web.txt");
		fobj2.createNewFile();
	}
}
