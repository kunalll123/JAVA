class SwitchDemo1{
	public static void main(String[] args){	
	
	char data='B';
	System.out.println("Before Switch");
	
	switch(data){
		
		case 'A':
			System.out.println('A');
			break;
		case 'B':
			System.out.println('B');
			break;
		case 'C':
			System.out.println('C');
			break;
		default:
			System.out.println("In Default State");
		}
		System.out.println("After Switch");
	}
}