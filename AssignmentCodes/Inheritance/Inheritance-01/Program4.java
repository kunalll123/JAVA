class Vehicles{
	Vehicles(){
		System.out.println("In Vehicles");
	}
		protected int seatingCapacity=10;
		protected String carName="XYZ";
		protected float Cost=1800057.054f;
		}
	class newCar extends Vehicles{
		float Cost=2000000f;
	}

	class Client{
		public static void main(String[] args){
			newCar sedan=new newCar();

			System.out.println("Cost="+sedan.Cost);

			System.out.println("carName="+sedan.carName);

			System.out.println("SeatingCapacity="+sedan.seatingCapacity);
		}
	}
