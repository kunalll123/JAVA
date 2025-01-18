class Pattern5{
	public static void main(String[] args){

		int rows=4;
		
		for(int i=1; i<=rows; i++){
			char ch='a';
				for(int j=1; j<=i; j++){
					System.out.println(j);

					if(j > 1){
						System.out.print(" " + ch);
						ch++;
					}

					if(j < 1){
						System.out.print("   ");
					}
				}
				System.out.println();
		}
	}
}
