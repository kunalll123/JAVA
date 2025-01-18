class SwitchDemo{
	public static void main(String[] args){	
	
	int num=2;
	System.out.println("Before Switch");
	
	switch(num){
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("No Match");
		}
		System.out.println("After Switch");
	}
}