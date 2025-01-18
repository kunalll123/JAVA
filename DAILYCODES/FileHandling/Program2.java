import java.io.*;

class FileList{
	public static void main(String[] args){

		File obj=new File("/home/kunal152/kunal_core2web_152_java/JAVA_C2W/DAILYCODES/FileHandling");

		String names[]=obj.list();

		for(int i=0; i<=names.length; i++){
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}
}
