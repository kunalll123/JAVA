class College{
	College(){
		System.out.println("In College Cinst");
	}
}

class Department extends College{
	Department(String str){
		System.out.println("In"+str+"Department");
	}
}

class Year extends Department{
	Year(int yr){
		super("Comp");
		System.out.println("In "+yr+" year");
	}
}

class Division extends Year{
	Division(char div,int yr){
		super(3);
		System.out.println("In "+yr+"-"+div);
	}
}
class Student{
	public static void main(String[] args){
		College s1=new Division('A',3);
	}
}

