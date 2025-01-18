class SwitchDemo2{
	public static void main(String[] args){
	
	String friends="Kunal";
	System.out.println("Before Switch");
	
	switch(friends){
		
		case "Digu":
				System.out.println("DNV");
	break;
	
		case "Tight":
				System.out.println("Amazon");
	break;
	
		case "Bhavi":
				System.out.println("MicroSoft");
	break;
	
	default:
		System.out.println("Business Man");
	}
	System.out.println("After Switch");
	}
}