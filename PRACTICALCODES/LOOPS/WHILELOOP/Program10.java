class Question10{
	public static void main(String[] args){

		long num=9307922405L;
		int sum=0;

		while(num > 0){
			long digit=num%10;
			sum += digit;
			num /= 10;
			}
		System.out.println("sum of digits in 9307922405 is : " + sum);
	}
}
