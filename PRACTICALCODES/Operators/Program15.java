class RealTime{
	public static void main(String[] args){
	
	int customerAge = 28;
	boolean isMember = true;
	
	boolean isEligibleForDiscount = (customerAge >= 25) && isMember;
	
	System.out.println("Customer Age: " + customerAge);
	System.out.println("Is a Member: " + isMember);
	System.out.println("Is eligible for discount : " + isEligibleForDiscount);
	}
}