class Question9{
	public static void main(String[] args){

		long num=214367689L;
		int oddCount=0;
		int evenCount=0;

		while (num > 0){
			long digit=num % 10;
			if (digit % 2==0){
				evenCount++;
		}
		else{
			oddCount++;
		}
		num /= 10;
		}
		System.out.println("Odd Count: " + oddCount);
		System.out.println("Even Count: " + evenCount);
	}
}

