class Pattern10{
	public static void main(String[] args){

		int rows=4;
		int num=1;
		int ch='a';
		for(int i=1; i<=rows; i++){
			
			for(int j=1; j<=i; j++){
				if(i % 2 == 1){
					System.out.print(num + " ");
				}else{
					System.out.print((char)(ch)+ " ");
				}
			}
			num=num+3;
			ch=ch+3;
			
			System.out.println();
		}
	}
}
