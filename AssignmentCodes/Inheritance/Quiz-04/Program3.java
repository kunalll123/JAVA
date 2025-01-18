class Subject{
	protected void method1(){
		System.out.println("60 % criteria");
	}

	protected void marks() {

	}

}

class Exams extends Subject{
	void marking(){
		System.out.println("Good marks");
	}
}

class Client{
	public static void main(String[] args){
		Subject obj=new Exams();
		obj.method1();
		obj.marks();
	}
}
