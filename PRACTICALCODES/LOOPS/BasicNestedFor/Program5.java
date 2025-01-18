class Pattern5{
	public static void main(String[] args){

		int ch=1;
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if(ch%2==0){
				System.out.println((char)ch++ + " ");
				}else{
					System.out.print(ch + " ");
				}

		
			}
			System.out.println();
		}
	}
}
