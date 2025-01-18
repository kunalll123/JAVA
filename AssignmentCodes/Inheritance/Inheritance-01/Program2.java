class CountryLaw{
	void Gst(){
		System.out.println("New GSt foe Country");
	}
}

class Statelaw extends CountryLaw{

}

class Citizen{
	public static void main(String[] args){

		Statelaw sl=new Statelaw();
		sl.Gst();
	}
}

