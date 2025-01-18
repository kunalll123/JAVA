
class Pattern15{
	public static void main(String[] args){

		int rows=3;

		for(int i=3; i >= 1; i--){
			
			for(int j=1; j<=rows-i; j++){
				System.out.print(j + " ");
	
			}
			System.out.println();
		}
	}
}
