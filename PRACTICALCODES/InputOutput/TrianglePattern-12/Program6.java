class Pattern6{
	public static void main(String[] argS){

		int rows=4;
		
		char ch='B';
		for(int i=0; i<=rows-1; i++){
			int num=1;
			for(int j=0; j<=i; j++){
				if(i % 2 == 0){
					System.out.print(num + " ");
					num=num+1;
				}else{
					System.out.print(ch + " ");
					ch=(char)(ch+1);
				}
			}
			System.out.println();
			
		}
	}
}
