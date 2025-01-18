class World{
	World(){
		System.out.println("In World");
	}
}

class Continents extends World{
	Continents(){
		System.out.println("7-Continents");
	}

	public void farming(){
		System.out.println("Farming");
	}
}

class Country extends Continents{
	 Country(){
		 System.out.println("BHARAT");
	 }
	 public void living(){
		 System.out.println("Living in Bharat");
	 }
}

class States extends Country {
	States(){
		System.out.println("28 States-8 UTs");
	}
}

class People extends States {
	public static void main(String[] args){
		World obj=new People();
	}
}
