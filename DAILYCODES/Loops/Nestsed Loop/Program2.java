class Pattern1{
	public static void main(String[] agrs){
	
	
	

	for(int i=1; i<=4; i++){
		char ch='A';
		char ch1='a';
		for(int j=1; j<=4; j++){
		
			if(i%2==1){
				System.out.print(ch++ + " ");
				}
else{
			System.out.print(ch1++ + " ");
				}
		
			}
			System.out.println();
		
		}
	}
}