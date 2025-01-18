class Am{
	Am(String str){
	}

	if(this.str == "Morning"){

		void greet(){
			System.out.println("Good Morning");
		}
	}
}

class Pm extends Am{
	Pm(String str){
	}

	if(this.str == "Afternoon"){
		void greet(){
			System.out.println("Good Afternoon");
		}
	}
}

class Machine{
	public static void main(String[] args){
		Pm obj1=new Pm("Morning");

		Pm obj2=new Pm("Afternoon");
	}
}
