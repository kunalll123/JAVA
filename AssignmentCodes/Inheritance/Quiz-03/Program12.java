public class PolyDemo{
	void printString(String str, String str1){

		System.out.println(str+"->"+str1);
	}

	void printString(String str1){
		System.out.println(str1);
	}
	public static void main(String[] args){
		PolyDemo demo=new PolyDemo();
		demo.printString("Core2Web","Incubators");
	}
}
